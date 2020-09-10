# Multicor - O Jogo

Jairo está jogando um jogo chamado Multicor.

O jogo consiste em 6 quadrados coloridos com as cores `VERMELHO`, `VERDE`, `AZUL`, `AMARELO`, `ROXO` e `ROSA`, dispostas em um espaço pequeno, de forma que você pode pular de qualquer cor para qualquer cor.

No início do jogo, são sorteadas `20` bolas (que o jogador vê quais são e qual sua ordem) que podem ter qualquer uma das `6` cores, sendo a primeira bola para o round 1, a segundo bola para o round 2, e assim por diante.

Após o sorteio, o jogador escolhe um dos quadrados para começar. _A cada round, caso o jogador esteja no quadrado correspondente à cor da bola do round, ele deve que pular para um quadrado de outra cor._

## Exemplo de um jogo com 4 bolas e 3 cores

- Foram sorteado as bolas na ordem `VERMELHO`, `AZUL`, `VERDE` e `VERMELHO`.
- Jairo escolhe começar no quadrado `AZUL`.
- No primeiro round, a cor da bola é `VERMELHO`, então Jairo não precisa pular.
- No segundo round, a cor da bola é `AZUL`, então Jairo tem que pular, e escolhe pular para o quadrado `VERDE`.
- No terceiro round, a cor da bola é `VERDE`, e Jairo escolhe pular para o quadrado `VERMELHO`.
- No último round, a cor da bola é `VERMELHO`, e Jairo escolhe pular para o quadrado `VERDE`, e acaba o jogo.

Como Jairo é muito preguiçoso, ele pediu para você fazer um programa que diga em qual quadrado ele deve começar e para quais quadrados deve pular ao decorrer do jogo, de forma que ele pule o _menor_ número de vezes possível.

No exemplo acima das `4` bolas e `3` cores, o resultado seria: `VERDE`, `AZUL`.
Ou seja, Jairo deveria começar no quadrado `VERDE`, e pular para o quadrado `AZUL` quando encontrasse a bola de cor `VERDE`

_Caso exista mais de uma solução com o mesmo número de pulos, você pode retornar qualquer uma._
