package program;
import model.entitites.AccountBank;
import model.exception.MainException;

import java.util.Scanner;
public class Program {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        try {
            System.out.println("---Enter Account data---");
            System.out.println("Holder name: ");
            String name = tec.nextLine();
            System.out.println("Number: ");
            Integer number = tec.nextInt();
            System.out.println("initial balance: ");
            double balance = tec.nextDouble();
            System.out.println("withdraw Limite: ");
            double withdrawLimite = tec.nextDouble();
            AccountBank accountBank = new AccountBank(number,name,balance,withdrawLimite);
            System.out.println("Enter amount for withdraw: ");
            double withdraw = tec.nextDouble();
            accountBank.withdraw(withdraw);
            System.out.println("New balance: "+accountBank.getBalance());
        }
        catch (MainException e){
            System.out.println(e.getMessage());
        }
        catch (RuntimeException e){
            System.out.println("ERROR ! Enter data valid !");
        }
    }

}