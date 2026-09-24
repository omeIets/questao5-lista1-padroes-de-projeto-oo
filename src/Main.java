public class Main {
    public static void main(String[] args) {

        // 1. Criando o Trem de Força e seus filhos
        Conjunto tremDeForca = new Conjunto("Trem de Força", 0);
        tremDeForca.adicionar(new Peca("Motor", 120.0));
        tremDeForca.adicionar(new Peca("Transmissão", 60.0));
        tremDeForca.adicionar(new Peca("Diferencial", 30.0));
        tremDeForca.adicionar(new Peca("Rodas", 80.0));

        // 2. Criando o Chassi e seus filhos
        Conjunto chassi = new Conjunto("Chassi", 150.0); // Chassi tem 150kg estruturais
        chassi.adicionar(tremDeForca);
        chassi.adicionar(new Peca("Suspensão", 70.0));

        // 3. Criando a Carroceria e seus filhos
        Conjunto carroceria = new Conjunto("Carroceria", 200.0); // Carroceria tem 200kg estruturais
        carroceria.adicionar(new Peca("Para-lamas", 20.0));
        carroceria.adicionar(new Peca("Portas", 90.0));
        carroceria.adicionar(new Peca("Painéis", 40.0));
        carroceria.adicionar(new Peca("Porta-malas", 35.0));
        carroceria.adicionar(new Peca("Capô", 25.0));

        // 4. Criando o Carro Completo (A raiz da árvore)
        Conjunto carro = new Conjunto("Carro Completo", 0);
        carro.adicionar(chassi);
        carro.adicionar(carroceria);

        // 5. Acionando a pesagem
        System.out.println("Iniciando a pesagem...\n");
        double pesoTotal = carro.calcularPeso();

        System.out.println("\n------------------------------------------------");
        System.out.println("Peso final calculado do Carro: " + pesoTotal + " kg");
    }
}
