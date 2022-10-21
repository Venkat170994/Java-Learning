package Inheritance;

class ProjectManager {
    float salary = 1000000;

    void displaySalary() {
        System.out.println(salary);
    }
}

class Developer extends ProjectManager {
    float salary = 100000;

    void displayDeveloperSalary() {
        System.out.println(salary);
    }
}

class QualityAnalyst extends ProjectManager {
    float salary = 50000;

    void displayQArSalary() {
        System.out.println(salary);
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {
        QualityAnalyst qa = new QualityAnalyst();
        qa.displayQArSalary();
        qa.displaySalary();
        Developer dev=new Developer();
        dev.displaySalary();
        dev.displayDeveloperSalary();

    }
}