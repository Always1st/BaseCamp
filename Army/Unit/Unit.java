package Unit;

import Exceptions.UnitIsDeadException;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import AutoAttack.AutoAttack;

import Interface.Observable;
import Unit.Human.SpellCaster.Necromancer;

public class Unit implements Observable {
    protected String name;
    protected Stats stats;
    protected AutoAttack basicAttack;
    protected Set<Necromancer> observers;

    public void addObserver(Necromancer observer) {
        observers.add(observer);
    }
    public void removeObserver(Necromancer observer) {
        observers.remove(observer);
    }
    public void notifyObserver(Necromancer necromancer) {
        necromancer.removeObservable(this);
    }

    protected void ensureIsAlive() throws UnitIsDeadException {
        if (stats.hp == 0) {
            throw new UnitIsDeadException();
        }
    }

    public Unit(String name) {
        this.name = name;
        this.basicAttack = new AutoAttack(this);
        this.observers = new HashSet<>();
    }
    public Unit() {}

    public Stats getStats() {
        return stats;
    }

    public void setName(String addName) {
        name += addName;
    }

    public void setStats(Stats stats) {
        this.stats = stats;
    }

    public void setAutoAttack(AutoAttack basicAttack) {
        this.basicAttack = basicAttack;
    }

    public void takeDamage(int dmg) throws UnitIsDeadException {
        ensureIsAlive();

        if (dmg >= stats.hp) {
            stats.hp = 0;
            if (!observers.isEmpty()) {
                Necromancer current;
                for (Iterator<Necromancer> it = observers.iterator(); it.hasNext(); ) {
                    current = it.next();
                    current.restoreHp(stats.maxHp / 10);
                    notifyObserver(current);
                }
            }
        } else {
            stats.hp -= dmg;
        }
    }

    public void takeMagicDamage(int dmg) throws UnitIsDeadException {
        takeDamage(dmg);
    }

    public void restoreHp(int hp) throws UnitIsDeadException {
        ensureIsAlive();

        stats.hp += hp;
        if (stats.hp > stats.maxHp) {
            stats.hp = stats.maxHp;
        }
    }

    public void autoAttack(Unit enemy) throws UnitIsDeadException {
        ensureIsAlive();
        basicAttack.action(enemy);
    }

    public void counterAttack(Unit enemy) throws UnitIsDeadException {
        ensureIsAlive();
        enemy.takeDamage(stats.damage / 2);
    }


    public String toString() {
        String buffer = "Name: " + name + "\n" + stats;
        return buffer;
    }
}

