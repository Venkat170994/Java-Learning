public class Operators {
    public static void main(String[] args) {

        //Unary Operator
        int x = 10;
        System.out.println("Unary Operator");
        System.out.println(x++);//10 (11)
        System.out.println(++x);//12
        System.out.println(x--);//12 (11)
        System.out.println(--x);//10
        int aa = 10;
        int bb = -10;
        boolean c = true;
        boolean d = false;
        System.out.println(~aa);//-11 (minus of total positive value which starts from 0)
        System.out.println(~bb);//9 (positive of total minus, positive starts from 0)
        System.out.println(!c);//false (opposite of boolean value)
        System.out.println(!d);//true
        System.out.println("\n");

        //Arithmetic Operator Operator
        int a = 10;
        int b = 5;
        System.out.println("Arithmetic Operator");
        System.out.println(a + b);//15
        System.out.println(a - b);//5
        System.out.println(a * b);//50
        System.out.println(a / b);//2
        System.out.println(a % b);//0
        System.out.println(10 * 10 / 5 + 3 - 1 * 4 / 2); //Expression
        System.out.println("\n");

        System.out.println("Left Shift Operator");
        System.out.println(10 << 2);//10*2^2=10*4=40
        System.out.println(10 << 3);//10*2^3=10*8=80
        System.out.println(20 << 2);//20*2^2=20*4=80
        System.out.println(15 << 4);//15*2^4=15*16=240
        System.out.println("\n");

        System.out.println("Right Shift Operator");
        System.out.println(10 >> 2);//10/2^2=10/4=2
        System.out.println(20 >> 2);//20/2^2=20/4=5
        System.out.println(20 >> 3);//20/2^3=20/8=2
        System.out.println("\n");

        System.out.println("Logical Bitwise AND Operator");
        int aaa = 10;
        int bbb = 5;
        int ccc = 20;
        System.out.println(aaa < bbb && aaa++ < ccc);//false && true = false
        System.out.println(aaa);//10 because second condition is not checked
        System.out.println(aaa < bbb & a++ < ccc);//false && true = false
        System.out.println(aaa);//11 because second condition is checked
        System.out.println("\n");

        System.out.println("Logical Bitwise OR Operator");
        System.out.println(aaa>bbb||aaa<ccc);//true || true = true
        System.out.println(aaa>bbb|aaa<ccc);//true | true = true
        System.out.println(aaa>bbb||aaa++<ccc);//true || true = true
        System.out.println(aaa);//10 because second condition is not checked
        System.out.println(aaa>bbb|aaa++<ccc);//true | true = true
        System.out.println(aaa);//11 because second condition is checked
        System.out.println("\n");

        System.out.println("Ternary Operator");
        int f=2;
        int e=5;
        int min=(f<e)?f:e;
        System.out.println(min);

        System.out.println("\n");

        System.out.println("Assignment Operator");
        int num=10;
        num+=3;//10+3
        System.out.println(num);
        num-=4;//13-4
        System.out.println(num);
        num*=2;//9*2
        System.out.println(num);
        num/=2;//18/2
        System.out.println(num);
    }
}