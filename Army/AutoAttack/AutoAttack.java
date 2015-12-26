package AutoAttack;

import Exceptions.UnitIsDeadException;
import Unit.Unit;

public class AutoAttack {
    protected Unit owner;

    public AutoAttack(Unit unit) {
        this.owner = unit;
    }
    public AutoAttack(){}

    public void action(Unit target) throws UnitIsDeadException{
        target.takeDamage(owner.getStats().damage);
        if (target.getStats().hp > 0) {
            target.counterAttack(owner);
        }
    }
}
