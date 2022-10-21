import java.util.Locale;

class Strings {
    public static void main(String[] args) {

        String s1 = "Welcome Venkat";
        String s2 = "Thanks!";
        String s3 = "Venkat";
        String s4 = "Venkat";
        String s5 = "";
        String s6 = "venkat";
        String s7 = "VENKAT";
        String s8 = " bowling ";
        //1.charAt

        System.out.println("charAt is : " + s1.charAt(2));

        //2.Length

        System.out.println("Length is : " + s1.length());

        //3.Format
        System.out.println("Formatis :");
        String str1 = String.format("|0%d|", 101);          // Integer value
        String str2 = String.format("%s", "Amar Singh"); // String value
        String str3 = String.format("%f", 101.00);       // Float value
        String str4 = String.format("%x", 101);          // Hexadecimal value
        String str5 = String.format("%c", 'c');          // Char value
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
        System.out.println(str5);

        //4.Format

        //5.substring

        System.out.println("Substring is : " + s1.substring(6));

        //6.substring

        System.out.println("Substring is : " + s1.substring(6, 8));

        //7.contains

        System.out.println("Contains is : " + s1.contains(s3));

        //8.Join

        //9.Join

        //10.equals

        System.out.println("Equals is : " + s3.equals(s4));

        //11.isEmpty

        System.out.println("IsEmpty() is : " + s5.isEmpty());

        //12.concatenation

        System.out.println("Concatenation is : " + s1.concat(s2));

        //13.replace

        System.out.println("Replace Char is : " + s1.replace('e', 'f'));

        //14.replace

        System.out.println("Replace Char sequence is : " + s1.replace("Venkat", "Sid"));

        //15.equalsIgnoreCase

        System.out.println("Equals Ignorecase is : " + s3.equalsIgnoreCase(s6));

        //16.split

        String st = "java string split method";
        String[] words = st.split("\\s");
        System.out.println("Split : ");
        for (String w : words) {
            System.out.println(w);
        }

        String st1 = "[java][string][split][method]";
        String reg = "\\W+";
        String[] words1 = st1.split(reg);
        System.out.println("Split : ");
        for (String w1 : words1) {
            System.out.println(w1);
        }

        //17.split

        //18.indexOf - char

        System.out.println("Index of char is : " + s1.indexOf('e'));

        //19.indexOf - char and fromIndex

        System.out.println("Index of char andfromIndex is : " + s1.indexOf('e', 1));

        //20.indexOf - substring

        System.out.println("Index of Substring is : " + s1.indexOf("Venkat"));

        //21.indexOf - substring and fromIndex

        System.out.println("Index of Substring and FromIndex is : " + s1.indexOf("Venkat", 4));

        //22.toLowercase

        System.out.println("ToLowercase is : " + s7.toLowerCase());

        //23.toLowercase-Locale

        System.out.println("ToLowercase is : " + s7.toLowerCase(Locale.ROOT));

        //24.toUppercase

        System.out.println("To Uppercase is : " + s6.toUpperCase());

        //25.toUppercase -Locale

        System.out.println("To Uppercase is : " + s6.toUpperCase(Locale.ROOT));

        //26.Intern()
        System.out.println("Intern is : " + s6.intern());

        //27.trim()

        System.out.println("Trim is : " + s8.trim());

        //28.valueOf

        int value = 30;
        String s9 = String.valueOf(value);
        System.out.println("valueOf is : " + s9);

        //29.toCharArray

        String sg = "hello";
        char[] ch = sg.toCharArray();
        System.out.println("ToCharArray is : ");
        for (int i = 0; i < ch.length; i++) {
            System.out.print(ch[i]);
        }

        //30.getChars
        System.out.println("GetChar is");
        char[] chr = new char[10];
        try {
            sg.getChars(3, 4, ch, 0);
            System.out.println(ch);
        } catch (Exception e) {

        }
        //31.compareTo
        System.out.println("CompareTo is");
        String sg1="hello";
        String sg2="hello";
        System.out.println(sg1.compareTo(sg2));

        //32.endswith
        System.out.println("EndsWith");
        System.out.println(s1.endsWith("t"));
        System.out.println(s1.endsWith("Venkat"));
        System.out.println(s1.endsWith("h"));
        System.out.println(s1.endsWith("hello"));

        //33.startswith
        System.out.println("startsWith");
        System.out.println(s1.startsWith("W"));
        System.out.println(s1.startsWith("Welcome"));
        System.out.println(s1.startsWith("V"));
        System.out.println(s1.startsWith("Venkat"));

        //34.LastIndexof
        System.out.println("LastIndex of");
        String sr="this is index of example";//there are 2 's' characters in this sentence
        int index1=sr.lastIndexOf('s');
        System.out.println(index1);

        //35.replaceAll
        System.out.println("ReplaceAll");
        String sn1="javatpoint is a very good website";
        String replaceString=sn1.replaceAll("a","e");//replaces all occurrences of "a" to "e"
        System.out.println(replaceString);
    }


}