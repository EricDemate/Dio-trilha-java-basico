import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Agência!");
        String agencia = sc.nextLine();

        System.out.println("Por favor, digite o número da Conta!");
        String numeroConta = sc.nextLine();  // Mantém como string

        System.out.println("Por favor, digite o seu nome!");
        String nomeCliente = sc.nextLine();

        System.out.println("Digite o Saldo Disponível!");
        double saldo = Double.parseDouble(sc.nextLine());

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco. Sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque.");

        sc.close();
    }
}
