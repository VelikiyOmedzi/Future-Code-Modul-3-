public class Main {
    public static void main(String[] args) {
        OmedziList<Integer> omedzi = new OmedziList<>();
        omedzi.add(18);
        omedzi.add(78);
        omedzi.add(17);
        omedzi.add(651);
        omedzi.add(43);
        omedzi.add(12);
        omedzi.add(0);
        omedzi.add(1);
        omedzi.add(3);
        omedzi.add(66);

        System.out.println(omedzi.get(3));

        System.out.println("Then: ");

        for (int i = 0; i < omedzi.getSize(); i++) {
            System.out.print(omedzi.get(i) + "  ");
        }

        omedzi.remove(3);

        System.out.println("\nAfter: ");

        for (int i = 0; i < omedzi.getSize(); i++) {
            System.out.print(omedzi.get(i) + "  ");
        }
    }


}