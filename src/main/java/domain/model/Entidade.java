package domain.model;

public class Entidade
{
    private String nome;
    private String taxId;
    private TipoEntidade tipoEntidade;
    private PerfilRisco perfil;

    public PerfilRisco getPerfil() {
        return perfil;
    }

    public void setPerfil(PerfilRisco perfil) {
        this.perfil = perfil;
    }

    public TipoEntidade getTipoEntidade() {
        return tipoEntidade;
    }

    public void setTipoEntidade(TipoEntidade tipoEntidade) {
        this.tipoEntidade = tipoEntidade;
    }

    public String getTaxId() {
        return taxId;
    }

    public void setTaxId(String taxId) {
        this.taxId = taxId;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
