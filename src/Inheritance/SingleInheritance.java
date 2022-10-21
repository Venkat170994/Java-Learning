package Inheritance;

class Employee {
    float salary = 400;
}

class Programmer extends Employee {
    int bonus = 10000;
}   

public class SingleInheritance {
    public static void main(String[] args) {
        Programmer si = new Programmer();
        System.out.println("Programmer salary is:" + si.salary);
        System.out.println("Bonus of Programmer is:" + si.bonus);

    }
}