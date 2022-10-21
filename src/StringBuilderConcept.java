public class StringBuilderConcept {
    public static void main(String[] args) {

        String s1 = "Welcome Venkat";
        String s2 = "Thanks!";
        String s3 = "Venkat";
        String s4 = "Venkat";
        String s5 = "";
        String s6 = "venkat";
        String s7 = "VENKAT";
        String s8 = " bowling ";

        StringBuilder sb=new StringBuilder("Hai!");

        //1.Append
        System.out.println("Append is : " + sb.append(s1));

        //2.Insert
        System.out.println("Insert is : " + sb.insert(2,"Hello"));

        //3.Replace
        System.out.println("Replace is : " + sb.replace(0,6,"Lolipop"));

        //4.Delete
        System.out.println("Delete is : " + sb.delete(0,6));

        //5.reverse
        System.out.println("Reverse is : " + sb.reverse());

        //6.Capacity
        System.out.println("Capacity is : " + sb.capacity());

        //7.charAt
        System.out.println("CharAt is : " + sb.charAt(3));

        //8.deleteCharAt
        System.out.println("DeleteCharAt is : " + sb.deleteCharAt(3));

        //9.length
        System.out.println("Length is : " + sb.length());

        //10.substring

        System.out.println("Substring is : " + sb.substring(0));
        System.out.println("Substring is : " + sb.substring(0,6));
    }
}