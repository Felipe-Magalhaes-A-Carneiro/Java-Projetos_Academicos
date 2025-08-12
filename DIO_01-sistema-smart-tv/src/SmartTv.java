public class SmartTv {
    // CRIAÇÃO DOS ATRIBUTOS:
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    // CRIAÇÃO DE MÉTODOS - Usando o atributo 'ligada':
    public void ligar(){
        ligada = true;
    }

    //dois MÉTODOS para alterarem o atributo 'ligada':
    public void desligar(){
        ligada = false;
    }

}
