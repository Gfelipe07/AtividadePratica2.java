import java.util.ArrayList;
import java.util.List;

public class Cadastro {

    private static List<Carro> listaCarros = new ArrayList<>();

    public static void cadastrar(Carro carro) {
        listaCarros.add(carro);
    }

    public static List<Carro> getListaCarros() {
        return listaCarros;
    }

    public static Carro buscar(String placa) {
        for (Carro temp : listaCarros) {
            if (temp.getPlaca().equals(placa)) {
                return temp;
            }
        }
        return null;
    }

    public static void remover(Carro carro) {
        listaCarros.remove(carro);
    }

}
