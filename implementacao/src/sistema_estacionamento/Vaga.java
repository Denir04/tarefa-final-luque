package sistema_estacionamento;


public class Vaga {
    private int id;
    private String categoria;
    private String situacao;
    private Veiculo vec;

    public Vaga(int id, String categoria) {
        this.id = id;
        this.categoria = categoria;
        this.situacao = "Disponivel";
    }

    public int getId() {
        return id;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getSituacao() {
        return situacao;
    }

    public String getPlaca() {
        return vec.getPlaca();
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setVec(Veiculo vec) {
        this.vec = vec;
        if(situacao.equals("Disponivel")) situacao="Ocupada";
        else if(situacao.equals("Ocupada")) situacao="Disponivel";
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
        vec.setPlaca(" - ");
    }
}
