public class PedidoBuilder extends PedidoAbstractBuilder{

    private Pedido pedido = new Pedido();

    public Pedido build(){
        return pedido;
    }

    @Override
    public void setLanche(TipoLanche tipo) {
        this.pedido.adicionarItemDentroCaixa(
                new ItemPedido(TipoItemPedido.LANCHE, tipo.name()));
    }

    @Override
    public void setBatata(TamanhoBatata tamanho) {
        this.pedido.adicionarItemDentroCaixa(
                new ItemPedido(TipoItemPedido.BATATA, tamanho.name()));
    }

    @Override
    public void setBrinde(TipoBrinde tipo) {
        this.pedido.adicionarItemDentroCaixa(
                new ItemPedido(TipoItemPedido.BRINDE, tipo.name()));
    }

    @Override
    public void setBebida(TipoBebida tipo) {
        this.pedido.adicionarItemForaCaixa(
                new ItemPedido(TipoItemPedido.BEBIDA, tipo.name()));
    }
}
