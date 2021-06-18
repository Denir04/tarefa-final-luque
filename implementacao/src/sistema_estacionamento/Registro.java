package sistema_estacionamento;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Registro {
    private float preco;
    private Date horario;
    private SimpleDateFormat formatter;
    
    public Registro(float preco, Date data) {
        this.preco = preco;
        this.horario = data;
        formatter = new SimpleDateFormat("dd/MM HH:mm:ss");
    }
    
    public float getPreco() {
        return preco;
    }

    public Date getHorario() {
        return horario;
    }
    public String getStringHorario(){
        return formatter.format(horario);
    }
    
    
}
