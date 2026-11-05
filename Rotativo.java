package questao2; 

public class Rotativo implements PerfilCobranca {

    @Override
    public double calcular(int minutos) {

        int horas = (int) Math.ceil(minutos / 60.0);

        return horas * VALOR_HORA_ROTATIVO;
    }
}
