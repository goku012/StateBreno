public class TarefaEstadoFinalizada extends TarefaEstado {

    private TarefaEstadoFinalizada() {};
    private static TarefaEstadoFinalizada instance = new TarefaEstadoFinalizada();
    public static TarefaEstadoFinalizada getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Finalizada";
    }


}