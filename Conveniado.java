package questao2; 

public class Conveniado implements PerfilCobranca {

    @Override
    public double calcular(int minutos) {

        if (minutos <= MINUTOS_GRATUITOS) {
            return 0.0;
        }

        int minutosCobrados = minutos - MINUTOS_GRATUITOS;

        int horas = (int) Math.ceil(minutosCobrados / 60.0);

        double valor = horas * VALOR_HORA_CONVENIADO;

        return valor * (1 - DESCONTO_CONVENIADO);
    }
}
