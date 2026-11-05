package questao2; 

public class Ticket {

    private String placa;
    private int minutos;
    private PerfilCobranca perfil;

    public Ticket(String placa, int minutos,
                  PerfilCobranca perfil) {

        if (minutos < 0) {
            throw new IllegalArgumentException(
                "Tempo de permanencia nao pode ser negativo."
            );
        }

        this.placa = placa;
        this.minutos = minutos;
        this.perfil = perfil;
    }

    public void alterarPerfil(PerfilCobranca novoPerfil) {
        this.perfil = novoPerfil;
    }

    public double calcularValor() {
        return perfil.calcular(minutos);
    }

    public void exibir() {

        System.out.println("Placa: " + placa);
        System.out.println("Permanencia: " + minutos + " minutos");

        System.out.printf(
            "Valor: R$ %.2f%n",
            calcularValor()
        );

        System.out.println("--------------------------");
    }
}
