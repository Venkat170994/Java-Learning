package Inheritance;

class Shape{
    void displayShape(){
        System.out.println("The shape is");
    }

}

class Circle extends Shape{
    void displayCircleShape(){
        System.out.println("The shape is Circle");
    }
}

class SmallCircle extends Circle{
    void displaySmallCircleShape(){
        System.out.println("The shape is Small Circle");
    }
}

class Rectangle extends Shape{
    void displayRectangleCircleShape(){
        System.out.println("The shape is Rectangle");
    }
}

class HybridInheritance{
    public static void main(String[] xs){
        Rectangle rs=new Rectangle();
        rs.displayRectangleCircleShape();;
        rs.displayShape();

        SmallCircle cr=new SmallCircle();
        cr.displayCircleShape();
        cr.displayShape();
        cr.displaySmallCircleShape();

    }
}
