import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Задание 1
        Student student = new Student("Oleg", new Address("Ivanovo", "Vichuga"));
        Student student1 = new Student("Ivan", new Address("Moscow", "Kineshma"));
        Student student2 = new Student("Artem");
        Student student3 = new Student("Sergey");
        Student student4 = new Student("Matvey", new Address("Kostrama", "Kostramskoi"));

        printStudentInfo(student);
        printStudentInfo(student1);
        printStudentInfo(student2);
        printStudentInfo(student3);
        printStudentInfo(student4);
        //Задание 2

        List<String> leto = new ArrayList<>();
        leto.add("Ура! ");
        leto.add("Осталось ");
        leto.add("всего ");
        leto.add("восемь ");
        leto.add("дней ");
        leto.add("до ");
        leto.add("лета!");

        String str = String.valueOf(leto.stream().reduce((x, y) -> x + y));
        System.out.println(str);
        System.out.println(leto);
    }
    public static void printStudentInfo(Student student) {
        System.out.println("Student name: " + student.getName());
        student.getAddress().ifPresent(a -> System.out.println("Student address: " + a.getCity() + "  " + a.getRegion()));
    }
}