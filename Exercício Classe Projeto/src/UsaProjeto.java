import java.util.Scanner;

public class UsaProjeto {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int escolha = 0;
        String novoNome;
        double novoCustoHora;
        int horasTrab;

        Projeto cliente1 = new Projeto("Teste (Atualize o nome)");

        while (escolha != 9) {
            System.out.println("1 - Atualizar nome");
            System.out.println("2 - Atualizar custo hora");
            System.out.println("3 - Registrar horas trabalhadas");
            System.out.println("4 - Consultar resultados");
            System.out.println("9 - Encerrar o programa");

            escolha = leia.nextInt();
            leia.nextLine();

            switch (escolha) {
                case 1:
                    System.out.print("Novo nome: ");
                    novoNome = leia.nextLine();
                    cliente1.setNome(novoNome);
                    break;

                case 2:
                    System.out.print("Novo valor Custo Hora: R$");
                    novoCustoHora = leia.nextDouble();
                    if (novoCustoHora <= 0) {
                        System.out.println("ERRO! Valor inserido inválido.");
                    } else {
                        cliente1.setCustoHora(novoCustoHora);
                    }
                    break;

                case 3:
                    System.out.print("Quantidade de horas trabalhadas: ");
                    horasTrab = leia.nextInt();
                    cliente1.registrarHoras(horasTrab);
                    break;

                case 4:
                    System.out.println("Nome: " + cliente1.getNome());
                    System.out.println("Custo Hora: R$" + cliente1.getCustoHora());
                    System.out.println("Horas Trabalhadas: " + cliente1.getHoras());
                    System.out.println("Valor a receber: R$" + cliente1.getCustoAtual());
                    break;
            }
        }
    }
}