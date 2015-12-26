package Unit.Human.Fighter;

import Unit.Unit;
import AutoAttack.VampireAttack;
import Exceptions.UnitIsVampireOrWerewolfException;


public class Vampire extends Fighter{
    public Vampire(String name) {
        super(name, 100, 5);
        this.stats.isUndead = true;
        this.basicAttack = new VampireAttack(this);
    }
    public void turnIntoVampire(Unit enemy) throws UnitIsVampireOrWerewolfException {
        if (enemy.getStats().isUndead || enemy.getStats().isWerewolf) {
            throw new UnitIsVampireOrWerewolfException();
        }
        enemy.getStats().isUndead = true;
        enemy.setName("[isVampire]");
        enemy.setAutoAttack(new VampireAttack(enemy));
}



        }