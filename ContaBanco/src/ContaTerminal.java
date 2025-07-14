import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        ContaSG conta = new ContaSG();
        conta.setAgencia("075-9");
        conta.setNumero(2065);
        conta.setNome("João Silva");
        conta.setSaldo(650.75f);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao Banco!");
        System.out.println("Digite o número da agência: ");
        String agencia = scanner.nextLine();

        if ( agencia.equals(conta.getAgencia()) ) {
            System.out.println("Digite o número da conta: ");
            System.out.print("Conta criada com sucesso! ");
            int numero = scanner.nextInt();
            if ( numero == conta.getNumero() ) {
                System.out.println("Olá " + conta.getNome() + " Obrigado por criar uma conta em nosso banco, sua agência é "
                 + conta.getAgencia() + ", conta número " + conta.getNumero() +
                " e seu saldo " + conta.getSaldo() + " já está disponível para saque.");
            } else {
                System.out.println("Número da conta incorreto.");
            }
        } else {
            System.out.println("Agência incorreta.");
        }
        
    }
}
