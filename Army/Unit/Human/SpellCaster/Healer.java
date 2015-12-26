package Unit.Human.SpellCaster;


import Exceptions.CantCastException;
import Exceptions.OutOfManaException;
import Exceptions.UnitIsDeadException;
import Unit.Human.SpellCaster.Spell.BattleSpell;
import Unit.Human.SpellCaster.Spell.HealSpell;
import Unit.Human.SpellCaster.Spell.Spell;
import Unit.Unit;

public class Healer extends SpellCaster{
    private Spell heal;
    private Spell execution;


    public Healer(String name) {
        super(name, 90, 2, 120);
        this.heal = new HealSpell(30, 40);
        this.execution = new BattleSpell(20, 25);
    }

    public void castHeal(Unit target) throws CantCastException, UnitIsDeadException, OutOfManaException {
        setCurrentSpell(heal);
        castSpell(target);
    }

    public void castExecution(Unit target) throws CantCastException, UnitIsDeadException, OutOfManaException {
        setCurrentSpell(execution);
        super.castSpell(target);
    }
}