public abstract class TarefaEstado {

    public abstract String getEstado();

    public boolean iniciar(Tarefa tarefa) {
        return false;
    }

    public boolean finalizar(Tarefa tarefa) {
        return false;
    }

    public boolean cancelar(Tarefa tarefa) {
        return false;
    }

}