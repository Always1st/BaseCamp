import Exceptions.*;

import Unit.Human.Fighter.*;
import Unit.Human.SpellCaster.*;
import Unit.Weapon;



public class WarMain {
    public static void main(String args[]) throws CantCastException, UnitIsDeadException, OutOfManaException {
        Necromancer a = new Necromancer("Necromancer1");
        Necromancer b = new Necromancer("Necromancer2");
        Necromancer c = new Necromancer("Necromancer3");

        Rogue r = new Rogue("Rogue");

        a.equipWeapon(new Weapon("Weapon", 48));

        a.autoAttack(r);
        b.autoAttack(r);
        c.autoAttack(r);
        r.equipWeapon(new Weapon("Weapon", 45));
        r.autoAttack(r);

        System.out.println(a);
        System.out.println(b);

        System.out.println(c);

    }
}
