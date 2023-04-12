import java.util.Scanner;

public class desafio {
    public static void main(String[] args) {

        String name = "Guilherme Wilias";
        String tipoConta = "Corrente";
        double saldo = 1599.99;
        int opcao = 0;


        System.out.println("****************");
        System.out.println("\nNome do cliente : " + name);
        System.out.println("\nTipo de conta do cliente : " + tipoConta);
        System.out.println("\nSaldo da conta do cliente --> " + saldo);
        System.out.println("\n****************");

        String menu = """
                ** Digite a opção que deseja efetuar : 
                1- Consultar saldo
                2- Fazer transferencia
                3- Receber valor
                4- Sair 
                """;
        Scanner leituraDeOpcao = new Scanner(System.in);
        while (opcao != 4){
            System.out.println(menu);
            opcao = leituraDeOpcao.nextInt();
        }

        if (opcao == 1){
            System.out.println("\nO saldo atual desta conta é --> " + saldo);
        } else if (opcao == 2) {
            System.out.println("Digite o valor que deseja transferir : ");
            double valor = leituraDeOpcao.nextDouble();
            if (valor > saldo){
                System.out.println("Não há saldo suficiente para realizar a transferencia");
            }else{
                saldo = saldo - valor;
                System.out.println("Transferencia realizada com sucesso! Saldo disponivel : " + saldo);
            }

        } else if (opcao == 3) {
            System.out.println("valor recebido : ");
            double valor = leituraDeOpcao.nextDouble();
            saldo += valor;
            System.out.println("Novo saldo após o valor recebido : ");

        } else if (opcao != 4) {
            System.out.println("Opção selecionada é invalida!");

        }


    }
}
