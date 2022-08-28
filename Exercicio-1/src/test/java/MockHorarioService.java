public class MockHorarioService implements HorarioService{

    @Override
    public String busca(int id) {
        if(id == 1) {
            return RetornoConst.Professor1;
        } else if (id == 2) {
            return  RetornoConst.Professor2;
        } else if(id == 3) {
            return RetornoConst.Professor3;
        } else {
            return  RetornoConst.PADRAO;
        }
    }

    @Override
    public boolean professorExistente(int id) {
        if(id == 1 || id == 2 || id == 3) {
            return true;
        }
        else {
            return false;
        }
    }
}
