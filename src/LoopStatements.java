public class LoopStatements {
    public static void main(String[] args) {

        //for loop
        System.out.println("for loop");
        int sum = 0;
        for (int j = 1; j <= 10; j++) {
            sum = sum + j;
        }
        System.out.println("The sum of first 10 natural numbers is " + sum);
        System.out.println("\n");

        //for-each loop
        System.out.println("for-each loop");
        String[] names = {"Java","C","C++","Python","JavaScript"};
        System.out.println("Printing the content of the array names:\n");
        for(String name:names) {
            System.out.println(name);
        }
        System.out.println("\n");

        //While loop
        System.out.println("While loop");

        int i = 0;
        System.out.println("Printing the list of first 10 even numbers \n");
        while(i<=10) {
            System.out.println(i);
            i = i + 2;
        }
        System.out.println("\n");

        //do-while loop
        System.out.println("do-while loop");
        int k = 0;
        System.out.println("Printing the list of first 10 even numbers \n");
        do {
            System.out.println(k);
            k = k + 2;
        }while(k<=10);
    }
}
