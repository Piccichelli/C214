import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class TesteBuscaHorario {
    HorarioService service;
    BuscaHorario buscaHorario;

    @Before
    public void setup() {
        service = new MockHorarioService();
        buscaHorario = new BuscaHorario(service);
    }

    @Test
    public void testaProfessor1 () {
        HorarioProfessor professor = buscaHorario.buscaHorario(1);

        assertEquals("Chris Lima", professor.getNomeDoProfessor());
        assertEquals("17h30", professor.getHorarioDeAtendimento());
        assertEquals("integral", professor.getPeriodo());
    }

    @Test
    public void testaProfessor2 () {
        HorarioProfessor professor = buscaHorario.buscaHorario(2);

        assertEquals("Samuel Baraldi", professor.getNomeDoProfessor());
        assertEquals("20h00", professor.getHorarioDeAtendimento());
        assertEquals("noturno", professor.getPeriodo());
    }

    @Test
    public void testaProfessor3 () {
        HorarioProfessor professor = buscaHorario.buscaHorario(3);

        assertEquals("Renzo", professor.getNomeDoProfessor());
        assertEquals("10h00", professor.getHorarioDeAtendimento());
        assertEquals("integral", professor.getPeriodo());
    }

    @Test
    public void testaProfessorInvalido1 () {
        boolean professorExistente = buscaHorario.verificaProfessorExistente(5);

        assertFalse(professorExistente);
    }

    @Test
    public void testaProfessorInvalido2 () {
        boolean professorExistente = buscaHorario.verificaProfessorExistente(-10);

        assertFalse(professorExistente);
    }

    @Test
    public void testaProfessorInvalido3 () {
        boolean professorExistente = buscaHorario.verificaProfessorExistente(0);

        assertFalse(professorExistente);
    }

}
