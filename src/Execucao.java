import Enums.Cor;
import Sorteia.SorteiaCor;

import java.util.HashMap;
import java.util.Map;

public class Execucao {
    //6 Quadrados coloridos (VERMELHO, VERDE, AZUL, AMARELO, ROXO e ROSA)
    //20 Bolas sorteadas contendo uma das 6 cores
    //Depois de ver as 20 bolas, o jogador escolhe em qual quadrado quer começar
        //Caso ele esteja no quadrado da cor da bola sorteada, ele deve mudar de quadrado
    //Como ganhar:
        //Jogador deve fazer o menor número de movimentos considerando as 20 bolas que saíram
    //Exemplo com 4 bolas e 3 cores
        //Foram sorteado as bolas na ordem VERMELHO, AZUL, VERDE e VERMELHO
        //Jairo escolhe começar no quadrado AZUL.
    /*
    No primeiro round, a cor da bola é VERMELHO, então Jairo não precisa pular.
    No segundo round, a cor da bola é AZUL, então Jairo tem que pular, e escolhe pular para o quadrado VERDE.
    No terceiro round, a cor da bola é VERDE, e Jairo escolhe pular para o quadrado VERMELHO.
    No último round, a cor da bola é VERMELHO, e Jairo escolhe pular para o quadrado VERDE, e acaba o jogo.
     */
    /*
    No exemplo acima das 4 bolas e 3 cores, o resultado seria: VERDE, AZUL.
    Ou seja, Jairo deveria começar no quadrado VERDE, e pular para o quadrado AZUL quando encontrasse a bola de cor VERDE
     */
    public static void main(String[] args) {
        Map<Integer, Cor> bolasSorteadas = new HashMap<>();
        for (int i=1; i<=20 ; i++){
            bolasSorteadas.put(i, SorteiaCor.sorteia());
        }

        System.out.println("As Bolas sorteadas são: " + bolasSorteadas);

        EscolherQuadrado escolherQuadrado = new EscolherQuadrado(bolasSorteadas);

        System.out.println("As melhores escolhas são: " + escolherQuadrado.menorQuantidadeDeMovimentos());

    }
}
