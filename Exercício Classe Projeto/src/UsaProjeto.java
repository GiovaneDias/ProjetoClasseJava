import java.util.Scanner;

public class UsaProjeto {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int escolha = 0;
        String novoNome;
        double novoCustoHora;
        int horasTrab;

        Projeto projeto1 = new Projeto("Teste");

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
                    System.out.print("Novo nome do projeto: ");
                    novoNome = leia.nextLine();
                    projeto1.setNome(novoNome);
                    break;

                case 2:
                    System.out.print("Novo valor Custo Hora: ");
                    novoCustoHora = leia.nextDouble();
                    if (novoCustoHora <= 0) {
                        System.out.println("ERRO! Valor inserido inválido.");
                    } else {
                        projeto1.setCustoHora(novoCustoHora);
                    }
                    break;

                case 3:
                    System.out.print("Quantidade de horas trabalhadas: ");
                    horasTrab = leia.nextInt();
                    projeto1.registrarHoras(horasTrab);
                    break;

                case 4:
                    System.out.println("Nome: " + projeto1.getNome());
                    System.out.println("Custo Hora: " + projeto1.getCustoHora());
                    System.out.println("Horas Trabalhadas: " + projeto1.getHoras());
                    System.out.println("Custo atual: " + projeto1.getCustoAtual());
                    break;
            }
        }
    }
}