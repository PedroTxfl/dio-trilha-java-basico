import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(new Locale("pt", "BR"));
        
        System.out.println("Por favor, digite seu nome:");
        String nomeCliente = scanner.nextLine();
        
        System.out.println("Digite o número da sua agência:");
        
        
        System.out.println("Digite o número da sua conta:");
        int numero = scanner.nextInt();
        
        System.out.println("Digite seu saldo:");
        //TODO: Conhecer e importar a classe scanner
        //exibir as mensagens ao usuário
        //Obter pela classe scanner os valores digitados no terminal
        //exibir a mensagem da conta criada
    }
}
