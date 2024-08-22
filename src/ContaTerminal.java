import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Por favor, informe o número da Agência: ");
        String numero = scanner.next();
        
        System.out.println("Por favor, informe o nome da Agência: ");
        String agencia = scanner.next();
        
        System.out.println("Agora nos informe seu nome completo: ");
        scanner.nextLine();
        String nomeCliente = scanner.nextLine();
        
        System.out.println("Qual valor deseja depositar em sua nova conta ? ");
        double saldo = scanner.nextDouble();
        
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
        
        scanner.close();
    }
}
