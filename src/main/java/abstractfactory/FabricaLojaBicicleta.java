package abstractfactory;

public interface FabricaLojaBicicleta {
    Bicicleta createBicicleta();

    Acessorio createAcessorio();
}