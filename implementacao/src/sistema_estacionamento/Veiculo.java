package sistema_estacionamento;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Veiculo {
    private String modelo;
    private String placa;
    private String categoria;
    private Date horario;
    private SimpleDateFormat formatter;
    
    public Veiculo(String modelo, String placa,String categoria, Date horario) {
        this.modelo = modelo;
        this.placa = placa;
        this.categoria = categoria;
        this.horario= horario;
        formatter = new SimpleDateFormat("dd/MM HH:mm:ss");
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
        return formatter.format(horario);
    }
    public Date getDHorario(){
        return horario;
    }
    
}
