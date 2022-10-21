package Keywords;


class StaticKeyword {

    int rollno;//instance variable
    String name;
    static String college = "ITS";//static variable

    //constructor
    StaticKeyword(int r, String n) {
        rollno = r;
        name = n;
    }

    static void change() {
        college = "BBDIT";
    }

    //method to display the values
    void display() {
        System.out.println(rollno + " " + name + " " + college);
    }

    public static void main(String[] args) {
        change();
        StaticKeyword skw = new StaticKeyword(101, "Venkat");
        skw.display();
    }
}