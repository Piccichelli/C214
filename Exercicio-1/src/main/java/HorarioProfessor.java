public class HorarioProfessor {
    String nomeDoProfessor;
    String horarioDeAtendimento;
    String periodo;

    public HorarioProfessor(String nomeDoProfessor, String horarioDeAtendimento, String periodo) {
        this.nomeDoProfessor = nomeDoProfessor;
        this.horarioDeAtendimento = horarioDeAtendimento;
        this.periodo = periodo;
    }

    public String getNomeDoProfessor() {
        return nomeDoProfessor;
    }

    public void setNomeDoProfessor(String nomeDoProfessor) {
        this.nomeDoProfessor = nomeDoProfessor;
    }

    public String getHorarioDeAtendimento() {
        return horarioDeAtendimento;
    }

    public void setHorarioDeAtendimento(String horarioDeAtendimento) {
        this.horarioDeAtendimento = horarioDeAtendimento;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }
}
