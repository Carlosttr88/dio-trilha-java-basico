import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String [] args) throws Exception {
       Double saldo = 237.48;

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
    
    System.out.println("Por favor, digite o seu nome");
    String cliente = scanner.next();
    System.out.println("agência");
    String agência = scanner.next();
    System.out.println("conta");
    String conta = scanner.next();
    System.out.println("saldo");
    
    System.out.println("Olá " +  cliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agência + " conta " + conta + " e seu saldo " + saldo + " já está disponível para saque.");
    


    }


}

