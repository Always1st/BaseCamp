package Unit.Human.Fighter;

import AutoAttack.RogueAttack;

public class Rogue extends Fighter {
    public Rogue(String name) {
        super(name, 90, 5);
        this.basicAttack = new RogueAttack(this);
    }
    public Rogue() {}
}
