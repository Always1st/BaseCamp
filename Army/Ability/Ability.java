package Ability;

import Exceptions.CantCastException;
import Exceptions.OutOfManaException;
import Exceptions.UnitIsDeadException;

public abstract class Ability {
    public Ability() {}

    public void action()throws CantCastException, UnitIsDeadException, OutOfManaException {}
}
