import java.util.LinkedList;
import java.util.List;

public class ElementBucket {
    private List<ElementEntry> ent;

    public ElementBucket() {
        this.ent = new LinkedList<>();
    }

    public List<ElementEntry> getEnt() {
        return ent;
    }

    public void addEnt(ElementEntry entry) {
        ent.add(entry);
    }

    public void removeEnt(ElementEntry entry) {
        ent.remove(entry);
    }
}
