public class Usuario {
    public static void main(String[] args) throws Exception {
        
        // CRIAÇÃO DE OBJETO - com base na classe 'SmartTv':
        SmartTv smartTv = new SmartTv();

        // TESTANDO OBJETO CRIADO:
        System.out.println("A TV está ligada? " + smartTv.ligada);
        System.out.println("Qual é o canal atual? " + smartTv.canal);
        System.out.println("O volume atual é " + smartTv.volume);

        // TESTANDO OJETOS UTILIZANDO OS MÉTODOS - criados na 'SmartTv':
        smartTv.ligar();
        
        System.out.println("Novo Status: A TV está ligada? " + smartTv.ligada);
    }
}
