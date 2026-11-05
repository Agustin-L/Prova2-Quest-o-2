package questao2; 

public interface PerfilCobranca {

    double VALOR_HORA_ROTATIVO = 10.00;
    double VALOR_MENSALISTA = 200.00;
    double VALOR_HORA_CONVENIADO = 10.00;
    double DESCONTO_CONVENIADO = 0.20;
    int MINUTOS_GRATUITOS = 30;

    double calcular(int minutos);
}
