class Person {

    private String name;
    private int age;
    private String gender;
    private String dob;

    Person(String name, int age, String gender, String dob) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.dob = dob;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender(){
        return gender;
    }

    public String getDOB() {
        return dob;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: "+gender);
        System.out.println("DOB: "+dob);
    }
}

class Student extends Person {

    private int rollNo;
    private String course;

    Student(String name, int age, String gender,String dob,int rollNo, String course) {
        super(name, age,gender,dob);
        this.rollNo = rollNo;
        this.course = course;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Roll No: " + rollNo);
        System.out.println("Course: " + course);
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Narendra", 20,"Male","24-08-2006", 659, "Computer Science");
        Person p = s1;  
        p.display();
    }
}