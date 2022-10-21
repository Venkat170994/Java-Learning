import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class FileReadWrite {
    public static void main(String[] args) {
        try {
            FileOutputStream fo = new FileOutputStream("E:\\Documents\\Venkat\\Learning\\Java-Learning\\NewFile.txt");
            String s = "Welcome to javaTpoint.";
            byte b[] = s.getBytes();//converting string into byte array
            fo.write(b);
            fo.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileInputStream fin = new FileInputStream("E:\\Documents\\Venkat\\Learning\\Java-Learning\\NewFile.txt");
            int i = 0;
            while ((i = fin.read()) != -1) {
                System.out.print((char) i);
            }

            fin.close();
        } catch (Exception e) {
            System.out.println(e);
        }


        try {
            FileWriter fw = new FileWriter("E:\\Documents\\Venkat\\Learning\\Java-Learning\\NewFile.txt");
            fw.write("Welcome to Wipro.");
            fw.close();
            FileReader fr=new FileReader("E:\\Documents\\Venkat\\Learning\\Java-Learning\\NewFile.txt");
            int i;
            while((i=fr.read())!=-1)
                System.out.print((char)i);
            fr.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Success...");
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(dtf.format(now));
    }
}
