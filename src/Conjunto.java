import java.util.ArrayList;
import java.util.List;

public class Conjunto extends ComponenteCarro {
    private List<ComponenteCarro> partes = new ArrayList<>();

    public Conjunto(String nome, double pesoEstrutural) {
        super(nome, pesoEstrutural);
    }

    public void adicionar(ComponenteCarro parte) {
        partes.add(parte);
    }

    @Override
    public double calcularPeso() {
        // Contabiliza o peso da estrutura do próprio conjunto (ex: o metal base da carroceria)
        if (this.peso > 0) {
            somaParcial += this.peso;
            System.out.println("Somando agora o peso de " + this.nome + " (Estrutura): " + this.peso + ". Total parcial: " + somaParcial);
        }

        double pesoTotalDaArvore = this.peso;

        // Delega o cálculo para todos os filhos adicionados
        for (ComponenteCarro parte : partes) {
            pesoTotalDaArvore += parte.calcularPeso();
        }

        return pesoTotalDaArvore;
    }
}
