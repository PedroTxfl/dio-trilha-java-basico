import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in).useLocale(new Locale("pt", "BR"));
        
        System.out.println("Por favor, digite seu nome:");
        String nomeCliente = scanner.nextLine();
        
        System.out.println("Digite o número da sua agência:");
        String agencia = scanner.next();
        
        System.out.println("Digite o número da sua conta:");
        int numero = scanner.nextInt();
        
        System.out.println("Digite seu saldo:");
        double saldo = scanner.nextDouble();

        String mensagem = "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " 
                        + agencia + ", conta " + numero + " e seu saldo R$ " + String.format("%.2f", saldo) + " já está disponível para saque.";
        

        System.out.println(mensagem);

        scanner.close();
    }
}
