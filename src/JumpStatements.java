public class JumpStatements {
    public static void main(String[] args) {

        //break statement
        System.out.println("break statement");

        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
            if (i == 6) {
                break;
            }
        }

        System.out.println("\n");

        //continue statement
        System.out.println("continue statement");
        for(int i=1;i<=10;i++){
            if(i==5){
                //using continue statement
                continue;//it will skip the rest statement
            }
            System.out.println(i);
        }
    }
}