import java.io.IOException;

class ExceptionHandling {
    static void method() throws ArithmeticException {
        throw new ArithmeticException("device error");
    }

    public static void main(String[] args) {
        int age = 16;
        try {
            int a[] = new int[5];
            a[6] = 0;
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception occurs");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBounds Exception occurs");
        } catch (Exception e) {
            System.out.println("Parent Exception occurs");
        } finally {
            System.out.println("finally block is always executed");
        }

        if (age < 18) {
            //throw Arithmetic exception if not eligible to vote
            throw new ArithmeticException("Person is not eligible to vote");
        } else {
            System.out.println("Person is eligible to vote!!");
        }

        method();
    }
}