public class student {

    String name;
    int age;

    student(String n, int a) {
        name = n;
        age = a;
    }

    public static void main(String[] args) {
        student obj = new student("SRINATH", 21);
        System.out.println(obj.name + " " + obj.age);
    }
}