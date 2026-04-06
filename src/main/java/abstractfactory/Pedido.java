package abstractfactory;

public class Pedido {
    private Bicicleta bicicleta;
    private Acessorio acessorio;

    public Pedido(FabricaLojaBicicleta fabrica) {
        this.bicicleta = fabrica.createBicicleta();
        this.acessorio = fabrica.createAcessorio();
    }

    public String montarBicicleta() {
        return this.bicicleta.montar();
    }

    public String adicionarAcessorio() {
        return this.acessorio.adicionar();
    }
}