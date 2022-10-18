public class Variables
{
    static int m=100;//static variable
    void method()
    {
        int n=90;//local variable
        System.out.println(n);
    }
    public static void main(String args[])
    {
        int data=50;//instance variable
        Variables vb=new Variables();
        System.out.println(data);
        vb.method();
        System.out.println(m);
    }
}//end of class 