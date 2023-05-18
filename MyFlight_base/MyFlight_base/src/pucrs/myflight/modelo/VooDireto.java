package pucrs.myflight.modelo;

import java.time.Duration;

public class VooDireto extends Voo{

    public VooDireto(Rota rota, Duration duracao) {
        super(rota, duracao);
    }

    @Override
    public Rota getRota() {
        throw new UnsupportedOperationException("Unimplemented method 'getRota'");
    }

    @Override
    public Duration getDuracao() {
        throw new UnsupportedOperationException("Unimplemented method 'getDuracao'");
    }
    
}
