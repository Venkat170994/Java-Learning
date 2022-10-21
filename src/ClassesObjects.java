public class ClassesObjects {
    int id = 10;
    String check = "Venkat";

    static int num = 1021;
    static String word = "Ram";

    int acc_no;
    String name;
    float amount;

    void insertRecord(int i, String s) {
        id = i;
        check = s;
    }

    void displayInformation() {
        System.out.println(id + " " + check);
    }

    void insert(int a,String n,float amt){
        acc_no=a;
        name=n;
        amount=amt;
    }

    //deposit method
    void deposit(float amt){
        amount=amount+amt;
        System.out.println(amt+" deposited");
    }
    //withdraw method
    void withdraw(float amt){
        if(amount<amt){
            System.out.println("Insufficient Balance");
        }else{
            amount=amount-amt;
            System.out.println(amt+" withdrawn");
        }
    }

    //method to check the balance of the account
    void checkBalance(){System.out.println("Balance is: "+amount);}
    //method to display the values of an object
    void display(){System.out.println(acc_no+" "+name+" "+amount);}

    public static void main(String[] x) {

        ClassesObjects co = new ClassesObjects();

        //Accessing the Non-static variables with creating data
        System.out.println(co.id);
        System.out.println(co.name);


        //Accessing the static variables with creating data
        System.out.println(num);
        System.out.println(word);

        //Initialization through reference

        co.id = 90;
        co.name = "Sid";

        System.out.println(co.id);
        System.out.println(co.name);

        // Initialization through method
        co.insertRecord(100, "200");
        co.displayInformation();

        co.insertRecord(100, "400");
        co.displayInformation();

        co.insert(832345,"Ankit",1000);
        co.display();
        co.checkBalance();
        co.deposit(40000);
        co.checkBalance();
        co.withdraw(15000);
        co.checkBalance();

    }
}