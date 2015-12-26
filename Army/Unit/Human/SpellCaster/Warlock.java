package Unit.Human.SpellCaster;


import Ability.Ability;
import Unit.Unit;
import Unit.Demon;

import java.util.Set;

public class Warlock extends SpellCaster {
    private Ability summonUnit;
    private Set<Demon> minions;

    public Warlock(String name) {
        super(name, 80, 2, 100);
    }

    public Unit summonDeamon(){
        Demon summoned = new Demon();
        minions.add(summoned);
        return summoned;
    }
}
