package Unit.Human;

import Exceptions.CantCastException;
import Exceptions.OutOfManaException;
import Exceptions.UnitIsDeadException;
import Unit.Unit;
import Unit.Weapon;
import Ability.Ability;
import Ability.TransformAbility;

public class Human extends Unit {
    protected Ability transformAbility;
    protected Weapon myWeapon;

    public Human(String name) {
        super(name);
    }
    public Human(){}

    public Weapon getWeapon() {
        return myWeapon;
    }

    public void setTransform() {
        transformAbility = new TransformAbility(this);
    }

    public void equipWeapon(Weapon weapon) {
        myWeapon = weapon;
        stats.damage += weapon.getDamage();
    }
    public void changeWeapon(Weapon weapon) {
        stats.damage -= weapon.getDamage();
        myWeapon = null;
        equipWeapon(weapon);
    }
    public void unequipWeapon() {
        stats.damage -= myWeapon.getDamage();
        myWeapon = null;
    }

    public void transform()throws CantCastException, UnitIsDeadException, OutOfManaException {
        transformAbility.action();
    }
}
