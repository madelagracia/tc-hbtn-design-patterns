import java.util.Locale;

public class Program {
    public static void main(String[] args) {
        final var locale = new Locale("pt","BR");
        Locale.setDefault(locale);
        Director director = new Director();

        GuerreiroBuilder guerreiroBuilder = new GuerreiroBuilder();
        director.buildGuerreiro(guerreiroBuilder);

        MagoBuilder magoBuilder = new MagoBuilder();
        director.buildMago(magoBuilder);

        LadraoBuilder ladraoBuilder = new LadraoBuilder();
        director.buildLadrao(ladraoBuilder);

        try {
            Mago mago = magoBuilder.build();
            System.out.println(mago);
        } catch(Exception ex) {
            System.out.println(ex.getMessage());
        }

        try {
            Ladrao ladrao = ladraoBuilder.build();
            System.out.println(ladrao);
        } catch(Exception ex) {
            System.out.println(ex.getMessage());
        }

        try {
            Guerreiro guerreiro = guerreiroBuilder.build();
            System.out.println(guerreiro);
        } catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}