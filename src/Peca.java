public class Peca extends ComponenteCarro {

    public Peca(String nome, double peso) {
        super(nome, peso);
    }

    @Override
    public double calcularPeso() {
        somaParcial += this.peso;
        System.out.println("Somando agora o peso de " + this.nome + ": " + this.peso + ". Total parcial: " + somaParcial);
        return this.peso;
    }
}
