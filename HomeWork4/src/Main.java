public class Main {
    public static void main(String[] args) {
        OmedziTreeSet<Integer> omedzi = new OmedziTreeSet<>();
        omedzi.add(40);
        omedzi.add(20);
        omedzi.add(60);
        omedzi.add(10);
        omedzi.add(30);
        omedzi.add(50);
        omedzi.add(70);
        omedzi.add(5);
        omedzi.add(55);
        if (omedzi.contains(50)) System.out.println("Contains");
        else System.out.println("Not contains :(");
        omedzi.remove(55);
        omedzi.printOmedziTree();
    }
}