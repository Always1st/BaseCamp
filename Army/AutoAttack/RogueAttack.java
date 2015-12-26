package AutoAttack;

import Exceptions.UnitIsDeadException;
import Unit.Unit;

public class RogueAttack extends AutoAttack{
    public RogueAttack(Unit unit) {
        super(unit);
    }
    public RogueAttack(){}

    public void action(Unit target) throws UnitIsDeadException {
        target.takeDamage(owner.getStats().damage);
    }
}
