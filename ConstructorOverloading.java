class Teacher {
    String name;
    int age;

    // Default
    Teacher() {
        name = "Kim Taehyung";
        age = 30;
    }

    // Parameterized
    Teacher(String n, int a) {
        name = n;
        age = a;
    }
}

public class ConstructorOverloading  {
    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        Teacher t2 = new Teacher("Kavita", 20);

        System.out.println(t1.name + " " + t1.age);
        System.out.println(t2.name + " " + t2.age);
    }
}


