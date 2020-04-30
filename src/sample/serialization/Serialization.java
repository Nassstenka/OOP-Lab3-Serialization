package sample.serialization;

import javafx.collections.ObservableList;
import sample.model.PrintedEdition;

public interface Serialization {
    public String ext = "";

    void serialize(ObservableList<PrintedEdition> list, String fileName) throws Exception;
    ObservableList<PrintedEdition> deserialize(String fileName) throws Exception;
}
