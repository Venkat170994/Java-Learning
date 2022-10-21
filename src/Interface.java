interface Drawable {
    void draw();
}

//Implementation: by second user
class Triangle implements Drawable {
    public void draw() {
        System.out.println("drawing rectangle");
    }
}

class Circle implements Drawable {
    public void draw() {
        System.out.println("drawing circle");
    }
}

class Interface {
    public static void main(String[] args) {
        Drawable d=new Circle();
        d.draw();
    }
}