package Keywords;

public class FinalKeyword {


    public static void main(String[] args) {
        final int i = 100;
     //   i = 200; // Compile time Error
        System.out.println(i);
    }
}