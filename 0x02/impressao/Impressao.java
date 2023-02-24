public class Impressao {
    private int paginasTotais;
    private int paginasColoridas;
    private boolean ehFrenteVerso;
    private double valorColoridasFrenteVerso;
    private double valorPretoBrancoFrenteVerso;
    private double valorColoridasFrenteApenas;
    private double valorPretoBrancoFrenteApenas;

    public int getPaginasTotais() {
        return paginasTotais;
    }

    public void setPaginasTotais(int paginasTotais) {
        this.paginasTotais = paginasTotais;
    }

    public int getPaginasColoridas() {
        return paginasColoridas;
    }

    public void setPaginasColoridas(int paginasColoridas) {
        this.paginasColoridas = paginasColoridas;
    }

    public boolean isEhFrenteVerso() {
        return ehFrenteVerso;
    }

    public void setEhFrenteVerso(boolean ehFrenteVerso) {
        this.ehFrenteVerso = ehFrenteVerso;
    }

    public double getValorColoridasFrenteVerso() {
        return valorColoridasFrenteVerso;
    }

    public void setValorColoridasFrenteVerso(double valorColoridasFrenteVerso) {
        this.valorColoridasFrenteVerso = valorColoridasFrenteVerso;
    }

    public double getValorPretoBrancoFrenteVerso() {
        return valorPretoBrancoFrenteVerso;
    }

    public void setValorPretoBrancoFrenteVerso(double valorPretoBrancoFrenteVerso) {
        this.valorPretoBrancoFrenteVerso = valorPretoBrancoFrenteVerso;
    }

    public double getValorColoridasFrenteApenas() {
        return valorColoridasFrenteApenas;
    }

    public void setValorColoridasFrenteApenas(double valorColoridasFrenteApenas) {
        this.valorColoridasFrenteApenas = valorColoridasFrenteApenas;
    }

    public double getValorPretoBrancoFrenteApenas() {
        return valorPretoBrancoFrenteApenas;
    }

    public void setValorPretoBrancoFrenteApenas(double valorPretoBrancoFrenteApenas) {
        this.valorPretoBrancoFrenteApenas = valorPretoBrancoFrenteApenas;
    }

    @Override
    public String toString() {

        return "total de paginas: " + paginasTotais + ", total coloridas: " + paginasColoridas + ", total preto e branco: " + (paginasTotais - paginasColoridas) + ", " + FrenteVerso() + "total: R$ " + String.format("%.2f", calcularTotal());
    }

    public String FrenteVerso(){
        if(isEhFrenteVerso()){
            return "frente e verso. ";
        }else{
            return "frente apenas. ";
        }
    }
    public double calcularTotal() {
        double total = 0;
        if (isEhFrenteVerso()) {
            total = ((paginasTotais - paginasColoridas) * getValorPretoBrancoFrenteVerso()) + (paginasColoridas * getValorColoridasFrenteVerso());
        } else {
            total = ((paginasTotais - paginasColoridas) * getValorPretoBrancoFrenteApenas()) + (paginasColoridas * getValorColoridasFrenteApenas());
        }
        return total;
    }
}
