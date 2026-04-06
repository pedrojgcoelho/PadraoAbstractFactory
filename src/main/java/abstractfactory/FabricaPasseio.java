package abstractfactory;

public class FabricaPasseio implements FabricaLojaBicicleta {
    @Override
    public Bicicleta createBicicleta() {
        return new BicicletaPasseio();
    }

    @Override
    public Acessorio createAcessorio() {
        return new AcessorioPasseio();
    }
}