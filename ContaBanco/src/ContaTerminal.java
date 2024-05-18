import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int numero = 0;
        String agencia = "";
        String nomeCliente = "";
        double saldo = 01052;

        System.out.println("Por favor, digite o número da Agência!");
        agencia = sc.nextLine();
        System.out.println("Por favor, digite o número da Conta!");
        numero = sc.nextInt();
        System.out.println("Por favor, digite o seu nome!");
        nomeCliente = sc.next();
        //System.out.println();
        System.out.println("Digite o Salodo Disponivel!");
        saldo = sc.nextDouble();

        System.out.println("Olá "+ nomeCliente +", obrigado por criar uma conta em nosso banco, sua agência é "+ agencia +", conta "+ numero +" e seu saldo "+saldo+" já está disponível para saque.");

        sc.close();
    }
}
