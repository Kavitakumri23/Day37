
class Student2 {
    String name;
    int age;

    // Parameterized constructor
    Student2(String n, int a) {
        name = n;
        age = a;
    }
}

public class ParameterizedConstructor {
    public static void main(String[] args) {
        Student2 s1 = new Student2("Kavita", 20);
        System.out.println(s1.name + " " + s1.age);
    }
}

