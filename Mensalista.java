package questao2; 

public class Mensalista implements PerfilCobranca {

    @Override
    public double calcular(int minutos) {
        return VALOR_MENSALISTA;
    }
}
