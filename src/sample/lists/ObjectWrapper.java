package sample.lists;

import sample.model.PrintedEdition;

import java.util.List;

public class ObjectWrapper {
    private List<PrintedEdition> allEditions;

    public ObjectWrapper() {
    }

    public List<PrintedEdition> getAllEditions() {
        return allEditions;
    }

    public void setAllEditions(List<PrintedEdition> allEditions) {
        this.allEditions = allEditions;
    }
}
