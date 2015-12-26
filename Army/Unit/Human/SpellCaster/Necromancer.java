package Unit.Human.SpellCaster;


import Ability.Ability;
import Exceptions.CantCastException;
import Exceptions.OutOfManaException;
import Exceptions.UnitIsDeadException;
import Interface.Observer;
import Unit.Unit;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Necromancer extends SpellCaster implements Observer {
    private Set<Unit> observables;

    public void addObservable(Unit unit) {
        observables.add(unit);
    }
    public void removeObservable(Unit unit) {
        observables.remove(unit);
    }


    public Necromancer(String name) {
        super(name, 100, 5, 80);
        observables = new HashSet<>();
    }

    public void takeDamage(int dmg)throws UnitIsDeadException {
        super.takeDamage(dmg);
        if ( stats.hp == 0 ) {
            Unit current;
            for (Iterator<Unit> it = observables.iterator(); it.hasNext(); it.next()) {
                current = it.next();
                current.removeObserver(this);
                it.notify();
            }
        }
    }
    public void autoAttack(Unit enemy) throws UnitIsDeadException{
        super.autoAttack(enemy);
        addObservable(enemy);
        enemy.addObserver(this);
    }
}
