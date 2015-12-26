package Unit;

public class Weapon {
    protected String name;
    protected  int dmg;

    public Weapon(String name, int dmg) {
        this.name = name;
        this.dmg = dmg;
    }
    public Weapon(){}


    public String getName() {
        return name;
    }
    public int getDamage(){
        return dmg;
    }
}
