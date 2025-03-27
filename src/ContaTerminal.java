
import java.util.Scanner;

/**
* <h1>Desafio - Conta</h1>
* O desafio consiste em realizar o pedido de informações
* para o usuário e imprimir uma mensagem de boas vindas
* <p>
* <b>Note:</b> Leia atentamente a documentação desta classes
* para desfrutar dos recursos oferecidos pelo autor
*
* @author  Tayara Cruz
* @version 1.0
* @since   27/03/2025
*/

public class ContaTerminal {
    /**
     * Atributos da classe
     * @param numeroConta Número da agência
     * @param agencia agência
     * @param nomeCliente Nome do cliente
     * @param saldo Saldo da conta
     */
    int numeroConta;
    String agencia;
    String nomeCliente;
    double saldo;	

    /**
     * Método para imprimir mensagem de boas vindas
     * @return void
     */

    public void imprimir(){
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " +  numeroConta + " e seu saldo " + saldo + " já está disponível para saque.");
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in).useLocale(java.util.Locale.US);

        /**
         * Instanciando a classe ContaTerminal
         */

        ContaTerminal conta = new ContaTerminal();

        System.out.println("Por favor, digite o número da Agência: ");
        conta.numeroConta = entrada.nextInt();

        entrada.nextLine();

        System.out.println("Por favor, digite a agência: ");
        conta.agencia = entrada.nextLine();

        System.out.println("Por favor, digite o nome do cliente: ");
        conta.nomeCliente = entrada.nextLine();

        System.out.println("Por favor, digite o saldo: ");
        conta.saldo = entrada.nextDouble();

        conta.imprimir();

        
    }



    
}
