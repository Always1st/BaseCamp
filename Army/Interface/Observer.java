package Interface;

import Unit.Unit;

public interface Observer {
    void addObservable(Unit unit);
    void removeObservable(Unit unit);
}
