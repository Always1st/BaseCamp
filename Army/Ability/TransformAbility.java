package Ability;

import Unit.Unit;
import Unit.Stats;

public class TransformAbility  extends Ability {
    private Unit owner;
    private Stats alternative;

    public TransformAbility(Unit unit) {
        owner = unit;
        owner.getStats().isWerewolf = true;
        alternative = new Stats(200,50);
        alternative.isWerewolf = true;
    }

    public final void action() {
        Stats temp = owner.getStats();
        double myCoef = (double)alternative.maxHp / (double)owner.getStats().maxHp;

        alternative.hp = (int)(owner.getStats().hp * myCoef);
        owner.setStats(alternative);
        alternative = temp;
        owner.getStats().isTransformed = !this.owner.getStats().isTransformed;
    }
}
