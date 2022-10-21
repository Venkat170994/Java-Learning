
public class Constructor {
    int rollno;
    String name, course;
    float fee;

    //Default Constructor
    Constructor() {
        System.out.println("Default Constructor is created");
    }

    //Parameterized Constructor
    Constructor(int rollno, String name, String course) {
        this.rollno = rollno;
        this.name = name;
        this.course = course;
    }

    // Constructor OverLoading
    Constructor(int rollno, String name, String course, float fee) {
        this(rollno, name, course);//reusing constructor
        this.fee = fee;
    }

    void display() {
        System.out.println(rollno + " " + name + " " + course + " " + fee);
    }


    public static void main(String[] args) {
        Constructor c1 = new Constructor();
        Constructor c2 = new Constructor(101, "Venkat", "CSE");
        Constructor c3 = new Constructor(101, "Venkat", "CSE", 10000.0f);
        c2.display();
        c3.display();

    }
}