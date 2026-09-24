public abstract class ComponenteCarro {
    protected String nome;
    protected double peso;

    // Variável estática para compartilhar a soma entre todas as instâncias no console
    protected static double somaParcial = 0;

    public ComponenteCarro(String nome, double peso) {
        this.nome = nome;
        this.peso = peso;
    }

    public abstract double calcularPeso();
}
