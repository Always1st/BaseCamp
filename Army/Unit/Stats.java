package Unit;

public class Stats {
    public int hp;
    public int maxHp;
    public int mp;
    public int maxMp;
    public int damage;
    public int movementSpeed;

    public boolean isFrozen;
    public boolean isMounted;
    public boolean isWerewolf;
    public boolean isUndead;
    public boolean isTransformed;

    public Stats(int maxHp, int damage) {
        this.maxHp = maxHp;
        this.hp = maxHp;
        this.maxMp = 0;
        this.mp = this.maxMp;
        this.damage = damage;
        this.movementSpeed = 2;

        this.isMounted = false;
        this.isWerewolf = false;
        this.isUndead = false;
        this.isFrozen = false;
        this.isTransformed = false;
    }

    public String toString() {
        String buffer = "HP: " + hp + "/" + maxHp + "\n" + "Damage:" + damage + "\n" + "Movement speed: " + movementSpeed;
        if ( maxMp > 0 ) {
            buffer += "\n" + "Mana: " + (int)mp + "/" + maxMp;
        }
        buffer += "\n";
        return buffer;
    }
}
