public class TarefaEstadoEmAndamento extends TarefaEstado {

    private TarefaEstadoEmAndamento() {};
    private static TarefaEstadoEmAndamento instance = new TarefaEstadoEmAndamento();
    public static TarefaEstadoEmAndamento getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Em andamento";
    }

    public boolean finalizar(Tarefa tarefa) {
        tarefa.setEstado(TarefaEstadoFinalizada.getInstance());
        return true;
    }

    public boolean cancelar(Tarefa tarefa) {
        tarefa.setEstado(TarefaEstadoCancelada.getInstance());
        return true;
    }

    public boolean iniciar(Tarefa tarefa) {
        tarefa.setEstado(TarefaEstadoEmAndamento.getInstance());
        return true;
    }

}