package HomeWork1;


    public class Test1 {
        public static void main(String[] args) {
            Sword<Steal> sword = new Sword<>();
            sword.MakeSword(new Steal());
            if (sword.testEndurance()) System.out.println("Your sword is great!!!");
            else System.out.println("Your sword is bad :/");
        }
    }

