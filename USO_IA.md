# Relatório de Utilização de Inteligência Artificial

## 1. Objetivo
Este documento detalha o processo de utilização de Inteligência Artificial (IA) como ferramenta de apoio para a resolução da questão sobre o padrão de projeto **Composite**. A IA atuou como um assistente técnico (*pair programming* e tutoria), suprindo a ausência de exemplos prévios de sala de aula ao auxiliar na validação de diagramas arquiteturais, na elaboração de exemplos de código base e na adequação às rigorosas práticas de controle de versão exigidas.

## 2. Etapas de Desenvolvimento com Suporte da IA

### 2.1. Validação de Diagramas e Criação de Exemplo Prático
Como não havia um slide ou exemplo visto em aula para tomar como base inicial para o padrão Composite, **eu realizei e apresentei o mapeamento inicial das classes do projeto à ferramenta**. A IA foi então acionada para atuar como revisora técnica dos meus diagramas rascunhados e fornecer uma fundação lógica para a transição do modelo visual para o código.
- **Apoio da IA:** A ferramenta analisou as imagens do diagrama UML e da árvore de objetos que construí preliminarmente, identificando falhas estruturais críticas (como a necessidade do método `add()` receber a classe abstrata mãe em vez da classe folha). A IA também esclareceu conceitos de orientação a objetos, corrigindo a nomenclatura da superclasse (de `Carro` para `ComponenteCarro`) para respeitar a semântica de herança, e forneceu um exemplo de código passo a passo ilustrando como instanciar e agrupar as peças (Leaf) dentro dos agregadores (Composite).
- **Prompts utilizados:**
  - "vamos agora para outra questão com outro padrão, me ajude dando o passo a posso de como devo fazer: [texto da questão do Carro]"
  - "por que no diagrama usamos o # nos atributos?"
  - "está correto? estou usando a segunda imagem como base que é como eu estudei [imagens]"
  - "nao entendi isso do componentecarro e nao carro"
  - "ok entendi o diagrama porem a partir dele nao entendi como fazemos um carro no codigo a partir dele"
  - "e agora ta certinho? [imagens]"
- **Ajustes de resposta da IA:** O código base fornecido inicialmente pela IA foi refatorado e adaptado iterativamente à medida que os diagramas finais foram validados. A estrutura de simulação foi ajustada para refletir exatamente as nomenclaturas (motor, transmissão, diferencial, rodas) que estavam mapeadas na árvore de objetos desenhada para o problema.

### 2.2. Gestão de Versão e Commits Atômicos (Requisito Crítico)
Uma parte fundamental do trabalho era garantir que o histórico de commits contasse a evolução da solução de forma clara.
- **Apoio da IA:** A IA estruturou um plano prático de versionamento dividido em cinco etapas atômicas. O fluxo isolou a criação do contrato base (*Component*), dos elementos indivisíveis (*Leaf*), dos agregadores (*Composite*) e da classe de teste (*Client*), garantindo que a evolução arquitetural ficasse registrada no histórico utilizando o padrão de mensagens semânticas (`feat`, `docs`).
- **Prompts utilizados:**
  - "vamos comecar agora a preparar o repositorio seguindo aquelas regras todas de commit"

### 2.3. Elaboração da Documentação
A IA auxiliou na consolidação das informações visuais e textuais para compor o repositório final de forma profissional.
- **Criação do README:** Geração do arquivo `README.md` adaptado a partir do modelo utilizado na atividade anterior para se manter um padrão entre as questões, mas focado no mapeamento dos papéis do *Composite* para as peças de carro.
- **Adaptação à Solução Real:** O texto do README foi reconstruído para espelhar rigorosamente os dois diagramas finais aprovados (UML e Hierarquia de Objetos), garantindo alinhamento total entre a documentação entregue, as imagens anexadas e o código fonte.
- **Prompts utilizados:**
  - "vamos fazer meu readme com base no modelo da atividade passada: [modelo]"
  - "refaça o readme com base nos dois diagramas que irei anexar [imagens]"