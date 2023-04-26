import java.util.ArrayList;
import java.util.Random;

public class Main {

    static ArrayList<Voador> voadores = new ArrayList<>();
    public static void main(String[] args) {
        Random rand = new Random();
        for(int i = 0; i<10; i++){
            int nmrAleatorio = rand.nextInt(3);
            switch (nmrAleatorio){
                case 0:
                    voadores.add(new GalinhaVoadora());
                    break;
                case 1:
                    voadores.add(new Drone("Tipo teste"));
                    break;
                case 2:
                    voadores.add(new Mosquito());
                    break;
            }
        }

        for (Voador voador : voadores){
            voador.voar();
        }

        for(Voador voador : voadores){
            voador.pousar();
        }
    }
}