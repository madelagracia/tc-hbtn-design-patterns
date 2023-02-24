import java.util.ArrayList;
import java.util.List;

public class BebidaCafe extends Bebida {

    @Override
    public List<String> obterIngredientes() {
        ArrayList<String> ingredientes = new ArrayList<>();
        ingredientes.add("cafe");
        return ingredientes;
    }

    @Override
    public double obterPreco() {
        return 5.35;
    }
}