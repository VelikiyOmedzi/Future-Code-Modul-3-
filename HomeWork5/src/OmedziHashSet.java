public class OmedziHashSet<E> {
    private int CAPACITY = 10;
    private ElementBucket[] buckets;
    private int size = 0;

    public OmedziHashSet() {
        this.buckets = new ElementBucket[CAPACITY];
    }
    private int getHash(E elem) {
        return (elem.hashCode()) % CAPACITY;
    }
    private ElementEntry getEntry(E elem) {
        int hash = getHash(elem);
        for (int i = 0; i < buckets[hash].getEnt().size(); i++) {
            ElementEntry Ee = buckets[hash].getEnt().get(i);
            if (Ee.getElement().equals(elem)) return Ee;
        }
        return null;
    }
    public boolean containsElement(E element) {
        int hash = getHash(element);
        if (buckets[hash] == null) return false;
        if (getEntry(element) == null) return false;
        return true;
    }
    public void put(E elem) {
        if (!containsElement(elem)) {
            int hash = getHash(elem);
            if (buckets[hash] == null) {
                buckets[hash] = new ElementBucket();
            }
            buckets[hash].addEnt(new ElementEntry<>(elem));
            size++;
        } else System.out.println("Уже есть");
    }
    public E get(E elem) {
        if (containsElement(elem))  return (E) getEntry(elem).getElement();
        else return null;
    }
    public void delete(E e) {
        if (containsElement(e)) {
            int hash = getHash(e);
            buckets[hash].removeEnt(getEntry(e));
            size--;
        }
    }
    public void printOmedziHash() {
        for (int i = 0; i < CAPACITY; i++) {
            if (buckets[i] != null) {
                System.out.println("Bucket #" +i);
                for (int j = 0; j < buckets[i].getEnt().size(); j++) {
                    System.out.println(buckets[i].getEnt().get(j).getElement());
                }
            }
        }
    }
}
