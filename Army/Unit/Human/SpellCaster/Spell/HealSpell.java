package Unit.Human.SpellCaster.Spell;

import Exceptions.UnitIsDeadException;
import Unit.Unit;


public class HealSpell extends Spell{
    public HealSpell(int cost, int actionPoints)  {
        super(cost, actionPoints);
    }

    public void action(Unit target) throws UnitIsDeadException {
        target.restoreHp(this.actionPoints);
    }

}
