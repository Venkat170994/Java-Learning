package Polymorphism;

public class MethodOverLoading {

    int id;
    String name;

    void display(int id) {
        id = id;
        System.out.println(id);
    }

    void display(String name) {
        name = name;
        System.out.println(name);
    }

    void display(int id, String name) {
        System.out.println(id + " " + name);
    }

    public static void main(String[] args) {
        MethodOverLoading mol = new MethodOverLoading();
        mol.display(100);
        mol.display("Venkat");
        mol.display(100, "Venkat");
    }
}