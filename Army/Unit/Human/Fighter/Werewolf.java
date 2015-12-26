package Unit.Human.Fighter;

import Exceptions.UnitIsVampireOrWerewolfException;
import Unit.Human.Human;

public class Werewolf extends Fighter {
    public Werewolf(String name) {
        super(name, 100, 5);
    }

    void infect(Human enemy) throws UnitIsVampireOrWerewolfException {
        if (enemy.getStats().isUndead || enemy.getStats().isWerewolf) {
            throw new UnitIsVampireOrWerewolfException();
        }
        enemy.setTransform();
        enemy.setName("[isWerewolf]");
        enemy.getStats().isWerewolf = true;
    }
}
