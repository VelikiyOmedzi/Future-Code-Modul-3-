public class Main {
    public static void main(String[] args) {
        OmedziTree<Integer> omedzi = new OmedziTree<>();
        omedzi.add(40);
        omedzi.add(20);
        omedzi.add(60);
        omedzi.add(10);
        omedzi.add(30);
        omedzi.add(50);
        omedzi.add(70);
        omedzi.add(5);
        omedzi.add(55);
        omedzi.remove(40);
        omedzi.printOmedziTree();
    }
}