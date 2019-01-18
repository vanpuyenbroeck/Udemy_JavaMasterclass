package Chapter9;

import java.util.List;

public interface ISaveable {
    List<String> writeState();

    void readState(List<String> data);
}
