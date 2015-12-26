package Unit.Human.SpellCaster.Spell;

import Exceptions.UnitIsDeadException;
import Unit.Unit;

public class PriestBattleSpell extends BattleSpell{
    public PriestBattleSpell(int cost, int actionPoints)  {
        super(cost, actionPoints);
    }

    public void action(Unit target) throws UnitIsDeadException {
        super.action(target);
        if (target.getStats().isUndead){
            target.takeMagicDamage(getActionPoints());
        }
    }
}