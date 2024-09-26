public class TesteCarro {
    public static void main(String[] args) {
        // Criando um objeto Carro
        Carro meuCarro = new Carro();

        // Definindo os atributos do carro
        meuCarro.marca = "Toyota";
        meuCarro.modelo = "Corolla";
        meuCarro.cor = "Preto";

        // Usando os métodos do carro
        meuCarro.ligar();
        meuCarro.acelerar();
    }
}
