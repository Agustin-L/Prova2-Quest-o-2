package questao2; 

public class Main {

    public static void main(String[] args) {

        System.out.println("===== TARIFA DE ESTACIONAMENTO =====");

        int tempo = 90;

        // Criando tickets com o mesmo tempo
        Ticket rotativo = new Ticket(
            "ABC-1234", tempo, new Rotativo()
        );

        Ticket mensalista = new Ticket(
            "DEF-5678", tempo, new Mensalista()
        );

        Ticket conveniado = new Ticket(
            "GHI-9012", tempo, new Conveniado()
        );

        System.out.println("\n--- PERFIL ROTATIVO ---");
        rotativo.exibir();

        System.out.println("--- PERFIL MENSALISTA ---");
        mensalista.exibir();

        System.out.println("--- PERFIL CONVENIADO ---");
        conveniado.exibir();

        // Demonstrando a troca de perfil
        System.out.println("\n===== ALTERANDO PERFIL =====");

        System.out.println("Ticket antes da alteracao:");
        rotativo.exibir();

        System.out.println("Mudando de Rotativo para Conveniado...");

        rotativo.alterarPerfil(new Conveniado());

        System.out.println("Ticket depois da alteracao:");
        rotativo.exibir();

        System.out.println("===== FIM DO PROGRAMA =====");
    }
}
