import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Account account1 = new Account("Tom", 1000);
        Account account2 = new Account("luna", 584.8648);
        Account account3 = new Account("james", 432.654);

        System.out.println("Account1 name is : \n" + account1.getName() + "\t" + account1.getBalance());
        System.out.println("Account2 name is : \n" + account2.getName() + "\t" + account2.getBalance());
        System.out.println("Account3 name is : \n" + account3.getName() + "\t" + account3.getBalance());

        Scanner scanner = new Scanner(System.in);

        System.out.println("Which account ?");
        int type = scanner.nextInt();
        double deposit;
        switch (type) {
            case 1 :
                System.out.println("Enter deposit : ");
                deposit = scanner.nextDouble();
                account1.deposit(deposit);
                System.out.println("new balance is : " + account1.getBalance());
                break;
            case 2 :
                System.out.println("Enter deposit : ");
                deposit = scanner.nextDouble();
                account2.deposit(deposit);
                System.out.println("new balance is : " + account2.getBalance());
                break;
            case 3 :
                System.out.println("Enter deposit : ");
                deposit = scanner.nextDouble();
                account3.deposit(deposit);
                System.out.println("new balance is : " + account3.getBalance());
                break;
            default :
                System.out.println("number is not valid!");
                break;
        }





    }
}