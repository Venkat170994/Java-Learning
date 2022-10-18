
public class DataTypes {

    public static void main(String[] args) {
        //Primitive datatype

        boolean b = false; //Store only two possible values: true and false. Default = false

        byte by = 127; //8-bit signed two's complement integer. Default = 0
        short s = 1220; // 16-bit signed two's complement integer. Default = 0
        int a = 10; // 32-bit signed two's complement integer. Default = 0
        long l = 1000; // 64-bit signed two's complement integer. Default = 0L

        float f = 1.2f; //single-precision 32-bit IEEE 754 floating point. Default = 0.0f
        double d = 1.22; //double-precision 64-bit IEEE 754 floating point. Default = 0.0d

        char c = 'A'; //single 16-bit Unicode character. Default = '\u0000'

        System.out.println("Primitive Datatypes \n");

        System.out.println("Boolean Value is :" + b);
        System.out.println("Byte Value is :" + by);
        System.out.println("Short Value is :" + s);
        System.out.println("Integer Value is :" + a);
        System.out.println("Long Value is :" + l);
        System.out.println("Float Value is :" + f);
        System.out.println("Double Value is :" + a);
        System.out.println("Char Value is :" + a);

        System.out.println("\n");

        //Non Primitive datatype
        String str = "Letter";
        System.out.println("Non Primitive Datatypes");
        System.out.println("String Value is :" + str);

    }
}