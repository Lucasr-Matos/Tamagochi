// Classe principal do projeto

import java.lang.Math;
// import para uso do math.random

public class TamagochiPrincipal {
    public static void main(String[] args) {
        // Método main do código
        Tamagochi t = new Tamagochi(Teclado.leString("Insira o nome do seu mais novo mascote virtual"));
        t.sentirSono(0);

        // Criação do tamagochi
        int c;
        c = 1;

        while (c == 1) { // loop do programa

            t.imprimirStatus();
            // imprime o estado atual do tamagochi

            if (t.getPeso() > 20) { // if para caso ele morra por comer muito
                System.out.println("Nossa seu bichinho comeu tanto que acabou explodindo ");
                System.out.println("estas eram as características de seu mascote antes de ele fazer kabum");
                t.imprimirStatus();
                break;

            } else if (t.getPeso() <= 0) { // if para caso ele morra de desnutrição
                System.out.println("Meu deus como isso foi acontecer, seu mascote ficou tão magro que sumiu");
                System.out.println(
                        "estas eram as características de seu mascote antes de ele ficar mais fino que o papel");
                t.imprimirStatus();
                break;

            } else if (t.getIdade() == 15) {// condição para caso ele morra de velhice
                System.out.println(
                        "Chegou o dia... seu tamagochi morreu por causa de velhice, pelo menos ele viveu bem, pode até ser considerado com um ancião para os tamagochis obivio ");
                System.out.println(
                        "estas eram as características de seu mascote antes de ele virar uma reliquia pre histórica");
                t.imprimirStatus();
                break;

            }

            for (int i = 0; i < 1; i++) {
                int numopcao = (int) (Math.random() * 3) + 1;
                // criação do numero aleatório para "escolher" o que o tamagochi esta sentindo

                if (numopcao == 1) { // opção designada para chamar o método sentir sono
                    System.out.println("Estou com sono... Zzz");
                    System.out.println("Seu Tamagochi está com sono selecione uma opção:");
                    System.out.println("1) Dormir");
                    System.out.println("2) Permanecer acordado");
                    t.sentirSono(Teclado.leInt("Insira uma opção"));

                } else if (numopcao == 2) { // opção designada para chamar o método sentir fome
                    System.out.println("Estou me sentindo vazio...");
                    System.out.println("Seu Tamagochi está com fome, selecione uma opção:");
                    System.out.println("1) Comer muito");
                    System.out.println("2) Comer pouco");
                    System.out.println("3) Não comer");
                    t.sentirFome(Teclado.leInt("Insira uma opção"));

                } else if (numopcao == 3) {// opção desginada pra o método fica entendiado
                    System.out.println(t.getnome() + " está entediado e quer fazer algo!");
                    System.out.println("escolha uma opção a baixo:");
                    System.out.println("1) Correr 10 minutos");
                    System.out.println("2) Caminhar 10 minutos");
                    t.ficarEntendiado(Teclado.leInt("Insira uma opção"));

                }

            }
        }
    }
}
