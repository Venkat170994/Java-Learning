package Keywords;

class A {
    String name = "Sid";

    A() {
        System.out.println("Hai");
    }

    String getName() {
        return "Hello";
    }
}

class B extends A {

    B() {
        super();
    }

    String getCountry() {
        System.out.println("The name is " + super.name);
        System.out.println("The name is " + super.getName());
        return "India";
    }
}

class SuperKeyWord {
    public static void main(String[] args) {
        B b = new B();
        System.out.println(b.getCountry());

    }
}