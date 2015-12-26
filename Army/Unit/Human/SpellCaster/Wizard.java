package Unit.Human.SpellCaster;


import Unit.Human.SpellCaster.Spell.BattleSpell;
import Unit.Human.SpellCaster.Spell.Spell;

import java.util.HashSet;
import java.util.Set;


enum WizardSpell {FIREBALL, FROSTBOLT}

public class Wizard extends SpellCaster{
    private static Set<Spell> spellBook = new HashSet<>();

    public Wizard(String name) {
        super(name, 80, 2, 100);
        WizardSpell fireball = WizardSpell.FIREBALL;
        spellBook.add(new BattleSpell(25, 30));
    }

//    public void castFireBall(Unit target) {
//        Iterator<Spell> fireball = spellBook.iterator() + WizardSpell.FIREBALL;
//        setCurrentSpell(battleHeal);
//    }

}