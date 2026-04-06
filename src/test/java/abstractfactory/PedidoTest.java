package abstractfactory;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PedidoTest {

    @Test
    void deveMontarBicicletaPasseio() {
        FabricaLojaBicicleta fabrica = new FabricaPasseio();
        Pedido pedido = new Pedido(fabrica);
        assertEquals("Bicicleta de Passeio montada com conforto e cesta frontal", pedido.montarBicicleta());
    }

    @Test
    void deveMontarBicicletaEsportiva() {
        FabricaLojaBicicleta fabrica = new FabricaEsportiva();
        Pedido pedido = new Pedido(fabrica);
        assertEquals("Bicicleta Esportiva montada com quadro leve e alto desempenho", pedido.montarBicicleta());
    }

    @Test
    void deveAdicionarAcessorioPasseio() {
        FabricaLojaBicicleta fabrica = new FabricaPasseio();
        Pedido pedido = new Pedido(fabrica);
        assertEquals("Campainha e cesta adicionadas para a bicicleta de passeio", pedido.adicionarAcessorio());
    }

    @Test
    void deveAdicionarAcessorioEsportivo() {
        FabricaLojaBicicleta fabrica = new FabricaEsportiva();
        Pedido pedido = new Pedido(fabrica);
        assertEquals("Capacete e garrafa adicionados para a bicicleta esportiva", pedido.adicionarAcessorio());
    }
}