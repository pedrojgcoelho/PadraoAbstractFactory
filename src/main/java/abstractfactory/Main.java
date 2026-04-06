package abstractfactory;

public class Main {
    public static void main(String[] args) {

        FabricaLojaBicicleta fabricaPasseio = new FabricaPasseio();
        Pedido pedidoPasseio = new Pedido(fabricaPasseio);

        System.out.println("Pedido 1:");
        System.out.println(pedidoPasseio.montarBicicleta());
        System.out.println(pedidoPasseio.adicionarAcessorio());

        System.out.println();

        FabricaLojaBicicleta fabricaEsportiva = new FabricaEsportiva();
        Pedido pedidoEsportivo = new Pedido(fabricaEsportiva);

        System.out.println("Pedido 2:");
        System.out.println(pedidoEsportivo.montarBicicleta());
        System.out.println(pedidoEsportivo.adicionarAcessorio());
    }
}