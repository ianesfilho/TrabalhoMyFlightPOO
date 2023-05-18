package pucrs.myflight.modelo;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class VooEscalas extends Voo{
    private ArrayList<VooEscalas> rotas;
    private Rota rotaFinal;

    public VooEscalas(Rota rota, Rota rotaFinal, LocalDateTime datahora, Duration duracao) {
        super(rotaFinal, duracao);
       this.rotaFinal = rotaFinal;
    }

    public Rota getRotaFinal() { 
        return rotaFinal; 
    }

    @Override
    public String toString() {
       return super.toString() + " -> " + rotaFinal;
    }

    @Override
    public Rota getRota() {
        throw new UnsupportedOperationException("Unimplemented method 'getRota'");
    }

    @Override
    public Duration getDuracao() {
        throw new UnsupportedOperationException("Unimplemented method 'getDuracao'");
    }

    public void addRota() {
    }

    public void getRotas() {
		rotas = new ArrayList<>();
	}

}
