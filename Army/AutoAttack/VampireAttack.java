package AutoAttack;

import Exceptions.UnitIsDeadException;
import Unit.Unit;

public class VampireAttack extends AutoAttack{
    public VampireAttack(Unit unit) {
        super(unit);
    }
    public VampireAttack(){}

    public void action(Unit target) throws UnitIsDeadException {
        owner.restoreHp(owner.getStats().damage);
        super.action(target);
    }
}
