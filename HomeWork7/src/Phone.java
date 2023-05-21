public class Phone implements Comparable{
     String firm;
     String model;
     int price;
    public Phone(String firm, String model, int price) {
        this.firm = firm;
        this.model = model;
        this.price = price;
    }
    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
