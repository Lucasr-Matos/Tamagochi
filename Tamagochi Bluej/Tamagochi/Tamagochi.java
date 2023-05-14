// Classe do Tamagochi.

public class Tamagochi {
    private String nome;
    private int idade;
    private int peso;
    private int sono;

    // Atributos do objeto Tamagochi.

    public Tamagochi(String nomeNovo) {
        nome = nomeNovo;
        idade = 0;
        peso = 1;
        sono = 0;

    }

    // Método Construtor do Tamagochi.

    public String getnome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public int getPeso() {
        return peso;
    }

    public int getSono() {
        return sono;
    }

    public void setNome(String novoNome) {
        nome = novoNome;
    }

    public void setIdade(int novaIdade) {
        idade = novaIdade;

    }

    public void setPeso(int novoPeso) {
        peso = novoPeso;
    }

    public void setSono(int novoSono) {
        sono = novoSono;

    }

    // Métodos de acesso (Getters and Setters).

    public void sentirSono(int opcao) {
        if (sono == 5) {
            System.out.println("\n   ");
            System.out.print("Poxa! o seu bichinho não descansa a muito tempo e acabou capotando");
            System.out.print(nome + " dormiu feito uma pedra e envelheceu mais um dia");
            System.out.println("\n   ");
            setSono(0);
            setIdade(idade + 1);

        } else if (opcao == 1) {
            System.out.println("Zzz... " + nome + " teve uma boa noite de sono e envelheceu um dia");
            setSono(0);
            setIdade(idade + 1);

        } else if (opcao == 2) {
            System.out.println("\n   ");
            System.out.println("Ops! " + nome + " permaneceu acordado e está com mais sono");
            System.out.println("\n   ");
            setSono(sono + 1);

        } else if (opcao == 3) {
            System.out.println("");
            System.out.println(
                    "ó meu deus, " + nome + " encheu tanto a pança que dormiu logo em seguida");
            System.out.println("");
            setSono(0);
            setIdade(idade + 1);

        }
    }

    // Método onde estão as opções e seus resultados em suas caracteristicas para
    // quando o tamagochi estiver sentido sono, a mensagem avisando o estado atual
    // de fome, sono ou tédio está na classe principal, esta mensagem só sera
    // chamada caso o "Math.random()" resulte no numero designado da opção.

    public void sentirFome(int opcao) {

        if (opcao == 1) {
            System.out.println("");
            System.out.println("Poxa vida ! " + nome + " escapou um pouco da dieta e engordou uns quilinhos");
            System.out.println("");
            setPeso(peso + 5);
            sentirSono(3);

        } else if (opcao == 2) {
            System.out.println("");
            System.out.println("Yummy, " + nome + " comeu um pouquinho e saciou sua fome");
            System.out.println("");
            setPeso(peso + 1);;

        } else if (opcao == 3) {
            System.out.println("");
            System.out.println("Ah não !, seu mascote ficou sem comer se continuar assim vai ficar muito magro");
            System.out.println("");
            setPeso(peso - 2);

        }

    }

    // Método onde estão as opções e seus resultados em suas caracteristicas para
    // quando o tamagochi estiver sentido fome, a mensagem avisando o estado atual
    // de fome, sono ou tédio está na classe principal, esta mensagem só sera
    // chamada caso o "Math.random()" resulte no numero designado da opção.

    public void ficarEntendiado(int opcao) {

        if (opcao == 1) {
            System.out.println("O que foi isso? uma maratona?");
            System.out.println(" A não foi só uma caminhada mesmo mas o " + nome
                    + " vai precisar comer dps de tantas calorias perdidas");
            System.out.println("");
            setPeso(peso + 4);
            sentirFome(1);

        } else if (opcao == 2) {
            System.out.println(
                    nome + "deu uma leve encaminhada que fez ele abrir um pouco o apetite e perder um pesinho");
            System.out.println("\n   ");
            setPeso(peso - 1);
            sentirFome(0);

        }

    }

    // Método onde estão as opções e seus resultados em suas caracteristicas para
    // quando o tamagochi estiver entediado, a mensagem avisando o estado atual
    // de fome, sono ou tédio está na classe principal, esta mensagem só sera
    // chamada caso o "Math.random()" resulte no numero designado da opção.

    public void imprimirStatus() {
        System.out.println("------------------------------------------------");
        System.out.println("Ficha de status de " + nome + " : ");
        System.out.println("Idade : " + idade);
        System.out.println("Peso : " + peso);
        System.out.println("Dias sem dormir : " + sono);
        System.out.println("------------------------------------------------");
    }

    // Método adicional para manter o usuario informado do status de seu tamagochi
}