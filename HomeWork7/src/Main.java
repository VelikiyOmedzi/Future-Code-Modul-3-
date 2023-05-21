import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        List<Phone> phones = new ArrayList<>();
        Phone p1 = new Phone("Apple", "Iphone 12", 30000);
        Phone p2 = new Phone("Apple", "Iphone 11", 22000);
        Phone p3 = new Phone("Samsung", "Samsung Galaxy T19", 31000);
        Phone p4 = new Phone("Oppo", "Oppo A54", 20000);
        Phone p5 = new Phone("Huawei", "Huawei X Pro 13", 40000);
        Phone p6 = new Phone("Apple", "Iphone 13", 50000);
        Phone p7 = new Phone("Golem", "Golem I0917", 100000);

        phones.add(p1);
        phones.add(p2);
        phones.add(p3);
        phones.add(p4);
        phones.add(p5);
        phones.add(p6);
        phones.add(p7);

        List<String> appleModels = phones.stream().filter(p -> p.firm.equals("Apple"))
                .sorted(Comparator.comparing(o -> o.price))
                .map(p -> p.model)
                .toList();

        for (String appleModel : appleModels) {
            System.out.print(appleModel + " | ");
        }

        System.out.println("\n");

        phones.stream().sorted(Comparator.comparing(p -> p.price))
                .forEach(p -> System.out.println("Model: " + p.model + "\nPrice: " + p.price + "\n************"));

    }
}