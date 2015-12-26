package Unit.Human.SpellCaster.Spell;

import Exceptions.UnitIsDeadException;
import Unit.Unit;


public abstract class Spell {
    protected int cost;
    protected int actionPoints;

    public Spell(int cost, int actionPoints) {
        this.cost = cost;
        this.actionPoints = actionPoints;
    }

    public int getCost() {
        return cost;
    }
    public int getActionPoints() {
        return actionPoints;
    }

    public abstract void action(Unit target) throws UnitIsDeadException;
}
