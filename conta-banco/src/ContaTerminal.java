import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Olá, seja muito bem-vindo ao banco da DIO, por favor, poderia me dizer o seu nome completo?");
        String nome = scanner.nextLine();

        System.out.println("Muito bem, agora digite o numero da sua conta");
        int conta = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Digite o numero da agencia.");
        String agencia = scanner.nextLine();

        System.out.println("Muito bem, agora diga o valor do seu saldo");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + " e seu saldo " + saldo + " já está disponível para saque.");


    }
}
