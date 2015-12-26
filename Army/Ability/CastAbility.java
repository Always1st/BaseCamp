package Ability;

import Exceptions.CantCastException;
import Exceptions.OutOfManaException;
import Exceptions.UnitIsDeadException;
import Unit.Human.SpellCaster.SpellCaster;

public class CastAbility extends Ability {
    private SpellCaster caster;

    public CastAbility(SpellCaster spellCaster) {
        this.caster = spellCaster;
    }


    public void action() throws UnitIsDeadException, OutOfManaException, CantCastException{
        caster.useMana(caster.getCurrentSpell().getCost());
    }
}
