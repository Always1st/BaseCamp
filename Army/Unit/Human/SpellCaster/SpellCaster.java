package Unit.Human.SpellCaster;

import Exceptions.*;
import Unit.Human.SpellCaster.Spell.Spell;
import Unit.Unit;
import Unit.Stats;
import Unit.Human.Human;
import Ability.Ability;
import Ability.CastAbility;
import Ability.NoCastAbility;


public class SpellCaster extends Human {
    protected Spell currentSpell;
    protected Ability castAbility;
    protected Ability noCastAbility;

    public SpellCaster(String name, int maxHp, int damage, int maxMp) {
        super(name);
        this.castAbility = new CastAbility(this);
        this.noCastAbility = new NoCastAbility();
        this.stats = new Stats(maxHp, damage);
        stats.maxMp = maxMp;
        stats.mp = maxMp;
    }
    public SpellCaster () {}



    public Spell getCurrentSpell() {
        return currentSpell;
    }
    public Ability getCastAbility() {
        return castAbility;
    }
    public Ability getNoCastAbility() {
        return noCastAbility;
    }

    public void setCurrentSpell(Spell newSpell) {
        currentSpell = newSpell;
    }
    public void setCastAbility(Ability newAbility) {
        castAbility = newAbility;
    }
    public void setNoCastAbility(Ability oldAbility) {
        noCastAbility = oldAbility;
    }

    public void useMana(int mana) throws UnitIsDeadException, OutOfManaException, CantCastException {
        ensureIsAlive();
        if ( mana > stats.mp ) {
            throw new OutOfManaException();
        }
        stats.mp -= mana;
    }
    public void restoreMana(int mana) throws UnitIsDeadException {
        ensureIsAlive();
        if ( stats.mp + mana > stats.maxMp ) {
            stats.mp = stats.maxMp;
            return;
        }
        stats.mp += mana;
    }

    public void castSpell(Unit target) throws CantCastException, UnitIsDeadException, OutOfManaException {
        getCastAbility().action();
        getCurrentSpell().action(target);
    }
    public void transform() throws CantCastException, UnitIsDeadException, OutOfManaException {
        Ability temp = this.getCastAbility();

        this.transformAbility.action();
        this.setCastAbility(this.getNoCastAbility());
        this.setNoCastAbility(temp);
    }
}
