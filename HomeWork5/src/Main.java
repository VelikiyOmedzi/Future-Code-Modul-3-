public class Main {
    public static void main(String[] args) {
        OmedziHashSet<Integer> omedziHashSet = new OmedziHashSet<>();
        omedziHashSet.put(1);
        omedziHashSet.put(4);
        omedziHashSet.put(54);
        omedziHashSet.put(5);
        omedziHashSet.put(17);
        omedziHashSet.put(1);
        omedziHashSet.put(2);
        omedziHashSet.put(9);
        omedziHashSet.delete(2);
        omedziHashSet.printOmedziHash();
    }
}