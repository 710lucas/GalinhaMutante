

import java.util.Random;

public class Mosquito implements Voador{

    private boolean voando = false;
    private double sangueChupadoTotal = 0;

    public double chupaSangue(){
        Random rand = new Random();
        double sangueChupado = rand.nextDouble(100);
        sangueChupadoTotal += sangueChupado;
        return sangueChupado;
    }

    @Override
    public double voar() {
        System.out.println("Voa mosquito");
        voando = true;
        return 10;
    }

    @Override
    public void planar() {
        System.out.println("Mosquito planando");
    }

    @Override
    public boolean pousar() {
        if(voando)
            voando = false;
        System.out.println("pousa mosquito");
        return voando;
    }
}

