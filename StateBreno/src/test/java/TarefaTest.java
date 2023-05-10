import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TarefaTest {

    Tarefa tarefa;

    @BeforeEach
    public void setUp() {
        tarefa = new Tarefa();
    }



    @Test
    public void naoDarAndamentoTarefaFinalizada () {
        tarefa.setEstado(TarefaEstadoCancelada.getInstance());
        assertFalse(tarefa.finalizar());
    }

    @Test
    public void naoDarAndamentoTarefaCancelada() {
        tarefa.setEstado(TarefaEstadoCancelada.getInstance());
        assertFalse(tarefa.cancelar());
    }



    @Test
    public void naoDarTarefaNovaTarefaFinalizada() {
        tarefa.setEstado(TarefaEstadoFinalizada.getInstance());
        assertFalse(tarefa.finalizar());
    }

    @Test
    public void naoDarTarefaNovaTarefaCancelada() {
        tarefa.setEstado(TarefaEstadoFinalizada.getInstance());
        assertFalse(tarefa.cancelar());
    }



    @Test
    public void deveDarAndamentoTarefaNova() {
        tarefa.setEstado(TarefaEstadoEmAndamento.getInstance());
        assertTrue(tarefa.finalizar());
        assertEquals(TarefaEstadoFinalizada.getInstance(), tarefa.getEstado());
    }



    @Test
    public void deveDarTarefaNovaTarefaFinalizada() {
        tarefa.setEstado(TarefaEstadoNova.getInstance());
        assertTrue(tarefa.finalizar());
        assertEquals(TarefaEstadoFinalizada.getInstance(), tarefa.getEstado());
    }

    @Test
    public void deveDarTarefaNovaTarefaCancelada() {
        tarefa.setEstado(TarefaEstadoNova.getInstance());
        assertTrue(tarefa.cancelar());
        assertEquals(TarefaEstadoCancelada.getInstance(), tarefa.getEstado());
    }

    
}