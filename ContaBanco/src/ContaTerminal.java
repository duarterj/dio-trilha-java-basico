import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        int numero;
        String agencia;
        String nomeCliente;
        Double saldo = 254.60;

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);


        System.out.println("Por favor, digite o número da agência");
        numero = scanner.nextInt();

        System.out.println("Digite o nome de sua agência");
        agencia = scanner.next();

        System.out.println("Digite o seu nome");
        nomeCliente = scanner.next();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco," +
                    " sua agência é " + agencia + ", conta " + numero + " e seu saldo "
                    + saldo + "$ já está disponível para saque.");
    }
}

