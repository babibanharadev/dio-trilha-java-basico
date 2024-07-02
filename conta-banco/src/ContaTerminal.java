import java.util.Scanner;

public class ContaTerminal {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        //TODO: Conhecer e importar a classe scanner

        //Exibir as mensagens para o nosso usuário

        //Obter pela scanner os valores digitados no terminal

        //Exibir a mensagem conta criada

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Por favor, digite o número da Agência:");
        String agencia = scanner.nextLine().trim(); 
        
        System.out.println("Por favor, digite o número da Conta:");
        int numero = scanner.nextInt(); 
        
        scanner.nextLine();
        
        System.out.println("Por favor, digite o nome do Cliente:");
        String nomeCliente = scanner.nextLine(); 
        
        System.out.println("Por favor, digite o saldo inicial:");
        double saldo = scanner.nextDouble(); 
        
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco,");
        System.out.println("sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
        
        scanner.close(); 
    }
}
