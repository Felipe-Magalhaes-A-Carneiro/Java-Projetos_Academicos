public class SmartTv {
    // CRIAÇÃO DOS ATRIBUTOS:
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    // ----------
    // CRIAÇÃO DE MÉTODOS
    
    // Método para ligar a TV:
    // O método não recebe nenhum parâmetro e não retorna nada (void):
    
    // ligar():
    public void ligar(){
        ligada = true;
    }

    // Método para desligar a TV:
    // O método não recebe nenhum parâmetro e não retorna nada (void):

    // desligar():
    public void desligar(){
        ligada = false;
    }

    // ----------
    // Método para aumentar o volume:
    public void aumentarVolume() {
        if(volume < 100) {
            volume++;
        } else {
            System.out.println("Volume já está no máximo!");
        }
    }

    // Método para diminuir o volume:
    public void diminuirVolume(){
        if (volume > 0) {
            volume--;
        } else {
            System.out.println("Volume já está no mínimo!");
        }
    }
}
