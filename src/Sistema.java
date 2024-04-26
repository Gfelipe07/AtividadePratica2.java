public class Sistema {

    private static void exibirMenu() {
        System.out.println("\nSISTEMA DE CADASTRO DE CARROS");
        System.out.println("1) Cadastrar Carro");
        System.out.println("2) Listar Todos os carros cadastrados");
        System.out.println("3) Deletar Todos os carros cadastrados");
        System.out.println("0) Sair");
        System.out.print("Informe uma opção: ");
    }

    private static void verificarOpcao(int op) {
        switch (op) {
            case 1:
                System.out.println("\nNovo Carro:");
                System.out.print("Modelo: ");
                String modelo = Console.lerString();

                System.out.print("Placa: ");
                String placa = Console.lerString();

                System.out.print("Ano: ");
                int ano = Console.lerInt();

                System.out.print("Kilometragem: ");
                float kilometragem = Console.lerFloat();

                Carro carro = new Carro(modelo, placa, ano, kilometragem);

                Cadastro.cadastrar(carro);

                System.out.println("\nCarro cadastrado com sucesso!");
                break;

            case 2:
                System.out.println("\nTodos os carros cadastrados:");

                if (Cadastro.getListaCarros().size() == 0) {
                    System.out.println("\nNão há carros cadastrados");
                    return;
                }

                for (Carro temp : Cadastro.getListaCarros()) {
                    System.out.println(temp.toString());
                }
                break;

            case 3:
                System.out.println("\nDeletar Carro:");
                System.out.print("Informe a placa do carro a ser deletado: ");
                String placaDeletar = Console.lerString();

                Carro carroDeletar = Cadastro.buscar(placaDeletar);
                if (carroDeletar != null) {
                    Cadastro.remover(carroDeletar);
                    System.out.println("\nCarro deletado com sucesso!");
                } else {
                    System.out.println("\nCarro não encontrado!");
                }
                break;

            case 0:
                System.out.println("\nO programa foi finalizado");
                break;

            default:
                System.out.println("\nOpção inválida. Digite novamente");
                break;
        }
    }

    public static void executar() {
        int op;
        do {
            exibirMenu();
            op = Console.lerInt();
            verificarOpcao(op);
        } while (op != 0);
    }
}
