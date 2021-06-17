package sistema_estacionamento;


public class Veiculo {
    String modelo;
    String placa;
    String categoria;
    String horario;
    
    public Veiculo(String modelo, String placa,String categoria, String horario) {
        this.modelo = modelo;
        this.placa = placa;
        this.categoria = categoria;
        this.horario= horario;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
    
    
}
