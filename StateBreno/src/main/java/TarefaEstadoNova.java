public class TarefaEstadoNova extends TarefaEstado {

    private TarefaEstadoNova() {};
    private static TarefaEstadoNova instance = new TarefaEstadoNova();
    public static TarefaEstadoNova getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Nova";
    }

    public boolean iniciar(Tarefa tarefa) {
        tarefa.setEstado(TarefaEstadoEmAndamento.getInstance());
        return true;
    }

    public boolean cancelar(Tarefa tarefa) {
        tarefa.setEstado(TarefaEstadoCancelada.getInstance());
        return true;
    }

    public boolean finalizar(Tarefa tarefa) {
        tarefa.setEstado(TarefaEstadoFinalizada.getInstance());
        return true;
    }

}