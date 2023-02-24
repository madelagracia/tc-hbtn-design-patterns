public class ImpressaoFactory {
    public static Impressao createImpressao(TamanhoImpressao tamanhoImpressao, int totalPaginas, int quantidadePaginasColoridas, boolean ehFrenteVerso) {

        Impressao impressao = new Impressao();
        impressao.setEhFrenteVerso(ehFrenteVerso);
        impressao.setPaginasTotais(totalPaginas);
        impressao.setPaginasColoridas(quantidadePaginasColoridas);

        if (tamanhoImpressao == TamanhoImpressao.A2) {
            impressao.setValorPretoBrancoFrenteVerso(0.18);
            impressao.setValorPretoBrancoFrenteApenas(0.22);
            impressao.setValorColoridasFrenteApenas(0.32);
            impressao.setValorColoridasFrenteVerso(0.28);
        }
        if (tamanhoImpressao == TamanhoImpressao.A3) {
            impressao.setValorPretoBrancoFrenteVerso(0.15);
            impressao.setValorPretoBrancoFrenteApenas(0.20);
            impressao.setValorColoridasFrenteApenas(0.30);
            impressao.setValorColoridasFrenteVerso(0.25);
        }
        if (tamanhoImpressao == TamanhoImpressao.A4) {
            impressao.setValorPretoBrancoFrenteVerso(0.10);
            impressao.setValorPretoBrancoFrenteApenas(0.15);
            impressao.setValorColoridasFrenteApenas(0.25);
            impressao.setValorColoridasFrenteVerso(0.20);
        }

        return impressao;
    }
}