public class Tarefa {

    private String descricao;
    private String categoria;
    private TarefaEstado estado;

    public Tarefa() {
        this.estado = TarefaEstadoNova.getInstance();
    }

    public void setEstado(TarefaEstado estado) {
        this.estado = estado;
    }

    public boolean iniciar() {
        return estado.iniciar(this);
    }

    public boolean finalizar() {
        return estado.finalizar(this);
    }

    public boolean cancelar() {
        return estado.cancelar(this);
    }

    public TarefaEstado getEstado() {
        return estado;
    }
}