package Ability;


import Exceptions.CantCastException;


public class NoCastAbility extends Ability{
    public void action()throws CantCastException {
        throw new CantCastException();
    }
}
