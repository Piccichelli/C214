import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class BuscaHorario {

    HorarioService horarioService;

    public BuscaHorario(HorarioService service) {
        this.horarioService = service;
    }

    public HorarioProfessor buscaHorario(int id) {
        String horarioProfessor = horarioService.busca(id);
        JsonObject jsonObject = JsonParser.parseString(horarioProfessor).getAsJsonObject();

        return new HorarioProfessor(jsonObject.get("nomeDoProfessor").getAsString(),
                jsonObject.get("horarioDeAtendimento").getAsString(),
                jsonObject.get("periodo").getAsString());
    }

    public boolean verificaProfessorExistente(int id) {
        boolean professorExistente = horarioService.professorExistente(id);

        return professorExistente;
    }
}
