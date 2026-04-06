package abstractfactory;

public class FabricaEsportiva implements FabricaLojaBicicleta {
    @Override
    public Bicicleta createBicicleta() {
        return new BicicletaEsportiva();
    }

    @Override
    public Acessorio createAcessorio() {
        return new AcessorioEsportivo();
    }
}