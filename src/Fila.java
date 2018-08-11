import java.util.LinkedList;
import java.util.Queue;

public class Fila {

    private Queue<Ficha> filaConvencional;
    private Queue<Ficha> filaPrioritaria;

    public Fila(){
        filaConvencional = new LinkedList<>();
        filaPrioritaria = new LinkedList<>();
    }

    public boolean novaFicha(int prioridade){
        Ficha ficha = new Ficha(prioridade);

        if(prioridade == 0){
            return filaPrioritaria.offer(ficha);
        }else{
            return filaConvencional.offer(ficha);
        }
    }

}
