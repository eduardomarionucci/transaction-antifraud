package domain.model;

public class Regra {
    String nome;
    Severidade nivel;
    double peso;
    boolean ativa;

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public Severidade getNivel() {
        return nivel;
    }

    public void setNivel(Severidade nivel) {
        this.nivel = nivel;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
