import java.util.UUID;

public class CalculadorSalarioService {

    private CalculadorSalarioService() {
    }

    private static CalculadorSalarioService instancia;

    public static CalculadorSalarioService getCalculadorSalarioService(){
       if(instancia == null){
           instancia = new CalculadorSalarioService();
       }
        return instancia;
    }

    public static double calcularSalarioLiquido(double salarioBruto, double valorDescontos, double valorVendas, double percentualComissao){
        return salarioBruto - valorDescontos + (valorVendas * (percentualComissao / 100));
    }

    public UUID uuid = UUID.randomUUID();
}
