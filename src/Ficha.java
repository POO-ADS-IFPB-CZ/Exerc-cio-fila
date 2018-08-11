import java.time.LocalDateTime;

public class Ficha {

    private final int prioridade;
    private static int contFicha;
    private final int numero;
    private final LocalDateTime dataeHora;

    public Ficha(int prioridade){
        this.prioridade = prioridade;
        numero = ++contFicha;
        dataeHora = LocalDateTime.now();
    }

    public int getPrioridade() {
        return prioridade;
    }

    public int getNumero() {
        return numero;
    }

    public LocalDateTime getDataeHora() {
        return dataeHora;
    }

    @Override
    public String toString() {
        return "Ficha{" +
                "prioridade=" + prioridade +
                ", numero=" + numero +
                ", dataeHora=" + dataeHora +
                '}';
    }

}
