package Unit.Human.Fighter;

import Unit.Stats;
import Unit.Human.Human;

public class Fighter extends Human {
    public Fighter(String name, int maxHp, int damage){
        super(name);
        this.stats = new Stats(maxHp, damage);
    }
    public Fighter(){}
}