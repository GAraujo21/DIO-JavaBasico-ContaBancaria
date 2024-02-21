import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Por favor, digite o número da Conta: ");
        int numeroConta = sc.nextInt();
        //esse sc.nextLine(); é para que funcione corretamente, sem ele não seria possível digitar o número da agência.
        sc.nextLine();

        System.out.println("Por favor, digite o número da Agência: ");
        String numeroAgencia = sc.nextLine();

        System.out.println("Por favor, digite seu nome: ");
        String nomeCliente = sc.nextLine();

        System.out.println("Por favor, digite o saldo: ");
        double saldo = sc.nextDouble();

        //System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + numeroAgencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque");

        // mesmo resultado que em cima!
        System.out.println("Olá ".concat(nomeCliente).concat(", obrigado por criar uma conta em nosso banco, sua agência é ").concat(numeroAgencia).concat(", conta").concat(Integer.toString(numeroConta)).concat(" e seu saldo ").concat(Double.toString(saldo)).concat(" já está disponível para saque"));

        sc.close();
    }
}
