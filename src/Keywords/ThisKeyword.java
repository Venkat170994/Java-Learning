package Keywords;

class ThisKeyword {
    int rollno;
    String name, course;
    float fee;

    ThisKeyword(int rollno, String name, String course) {
        this.rollno = rollno;
        this.name = name;
        this.course = course;
    }

    ThisKeyword(int rollno, String name, String course, float fee) {
        this(rollno, name, course);//reusing constructor
        this.fee = fee;
    }

    void display() {
        System.out.println(rollno + " " + name + " " + course + " " + fee);
    }

    public static void main(String[] args) {
        ThisKeyword tkw = new ThisKeyword(101,"Venkat","CSE");
        ThisKeyword tkw1 = new ThisKeyword(101,"Venkat","CSE",10000.0f);
        tkw.display();
        tkw1.display();
    }
}

