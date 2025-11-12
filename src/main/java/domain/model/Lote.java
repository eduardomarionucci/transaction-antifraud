package domain.model;

public class Lote {
    private String idLote;
    private int quantidadeTransacoes;
    private StatusLote statusLote;

    public int getQuantidadeTransacoes() {
        return quantidadeTransacoes;
    }

    public void setQuantidadeTransacoes(int quantidadeTransacoes) {
        this.quantidadeTransacoes = quantidadeTransacoes;
    }

    public StatusLote getStatusLote() {
        return statusLote;
    }

    public void setStatusLote(StatusLote statusLote) {
        this.statusLote = statusLote;
    }
}
