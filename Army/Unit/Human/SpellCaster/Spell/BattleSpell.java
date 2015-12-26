package Unit.Human.SpellCaster.Spell;

import Exceptions.UnitIsDeadException;
import Unit.Unit;


public class BattleSpell extends Spell{
    public BattleSpell(int cost, int actionPoints)  {
        super(cost, actionPoints);
    }

    public void action(Unit target) throws UnitIsDeadException {
        target.takeMagicDamage(this.actionPoints);
    }
}
