package Unit.Human.SpellCaster;

import Exceptions.CantCastException;
import Exceptions.OutOfManaException;
import Exceptions.UnitIsDeadException;
import Unit.Human.SpellCaster.Spell.HealSpell;
import Unit.Human.SpellCaster.Spell.PriestBattleSpell;
import Unit.Human.SpellCaster.Spell.Spell;
import Unit.Unit;

public class Priest extends SpellCaster{
    private Spell battleHeal;
    private Spell execution;

    public Priest(String name, int hp, int damage, int mana)  {
        super(name, hp, damage, mana);
        this.battleHeal = new HealSpell(15, 25);
        this.execution = new PriestBattleSpell(10, 20);
    }

    public void castBattleHeal(Unit target) throws CantCastException, UnitIsDeadException, OutOfManaException {
        setCurrentSpell(battleHeal);
        super.castSpell(target);
    }
    public void castExecution(Unit target) throws CantCastException, UnitIsDeadException, OutOfManaException {
        setCurrentSpell(execution);
        super.castSpell(target);
    }
}