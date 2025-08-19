public class Usuario {
    public static void main(String[] args) throws Exception {
        
        // CRIAÇÃO DE OBJETO - com base na classe 'SmartTv':
        SmartTv smartTv = new SmartTv();

        // TESTANDO OBJETO CRIADO:
        System.out.println("A TV está ligada? " + smartTv.ligada);

        System.out.println("Qual é o canal atual? " + smartTv.canal);

        System.out.println("O volume atual é " + smartTv.volume);

        // TESTANDO OJETOS UTILIZANDO OS MÉTODOS - criados na 'SmartTv':
        // O objeto é 'chmado' pelo nome do objeto, seguido do ponto e do nome do método:
        smartTv.ligar();
        
        // Verificando o status da TV após ligar:
        System.out.println("Novo Status: A TV está ligada? " + smartTv.ligada);

        smartTv.desligar();
        // Verificando o status da TV após desligar:
        System.out.println("Novo Status: A TV está desligada? " + smartTv.ligada);

        // -----

        // Aumentando o volume:
        smartTv.aumentarVolume();
        System.out.println("Novo Status: Qual é o volume? " + smartTv.volume);
        // Diminuindo o volume:
        smartTv.diminuirVolume();
        System.out.println("Novo Status: Qual é o volume? " + 
        smartTv.volume);
    }
}
