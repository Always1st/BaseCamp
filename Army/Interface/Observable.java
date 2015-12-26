package Interface;

import Unit.Human.SpellCaster.Necromancer;

public interface Observable {
    void addObserver(Necromancer observer);
    void removeObserver(Necromancer observer);
    void notifyObserver(Necromancer observer);

}
