import java.util.Scanner;

public class ContaTerminal {
    public int numero;
    public String agencia;
    public String nomeCliente;
    public double saldo;
    public Scanner leitura = new Scanner(System.in);

    public void exibeMenu(){
        System.out.println("**** Bem vindo ao NuInter ****");
        System.out.println(" ");
        System.out.println("Por favor, digite o número da Conta : ");
        setNumero(leitura.nextInt());
        System.out.println("Digite a sua Agência : ");
        setAgencia(leitura.next());
        System.out.println("Digite seu Nome : ");
        setNomeCliente(leitura.next());
        leitura.nextLine();
        System.out.println("Digite seu saldo : ");
        setSaldo(leitura.nextDouble());

    }

    @Override
    public String toString() {
        return
                "Olá "+ nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "+ agencia +", " +
                "conta " + numero + "  e seu saldo " + saldo + " já está disponível para saque";
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
