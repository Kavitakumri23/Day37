class Student1 {
        String name;
        int age;

        // Default constructor
        Student1() {
            name = "Kavita";
            age = 20;
        }
    }

    public class DefaultConstructor {
        public static void main(String[] args) {
            Student1 s1 = new Student1();
            System.out.println(s1.name + " " + s1.age);
        }
    }

