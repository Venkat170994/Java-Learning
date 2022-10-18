public class Unicode {
    public static void main(String[] args) {
        int ch1 = 'A'; //Start of Capital Letter is 65-90
        int ch2 = 'a';//Start of small letter is 97-122
        System.out.println("The ASCII value of a is: "+ch1);
        System.out.println("The ASCII value of b is: "+ch2);

        //To print all ASCII code
        for(int i = 0; i <= 255; i++)
        {
            System.out.println("The ASCII value of " + (char)i + "  =  " + i);
        }
    }
}