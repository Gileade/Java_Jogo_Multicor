import Enums.Cor;

import java.util.ArrayList;
import java.util.Map;

public class EscolherQuadrado {

    private Map<Integer, Cor> bolasSorteadas;
    private ArrayList<String> resultado = new ArrayList();

    public EscolherQuadrado(Map<Integer, Cor> bolasSorteadas) {
        this.bolasSorteadas = bolasSorteadas;
    }

    public ArrayList<String> menorQuantidadeDeMovimentos() {
        //Ele executará esses métodos até o Map se esvaziar, ou alguma cor que não esxiste no Map for encontrada
        while (!bolasSorteadas.isEmpty()){
            if(algumaCorDoEnumNaoFoiSorteada()) break;
            verificaAsJogadas();
        }

        return resultado;
    }

    private boolean algumaCorDoEnumNaoFoiSorteada() {
        //Passa em todas as cores do Enum
        for (Cor corDoEnum : Cor.values()) {
            //Verifica se a cor do Enum não está no sorteio
            if (!bolasSorteadas.containsValue(corDoEnum)) {
                //Verifica se o tamanho do array de resultados é maior que 0, pois caso ele seja, ele verifica se a cor encontrada é igual a última cor contida no array
                if (resultado.size() > 0){
                    //Caso a cor encontrada seja igual a última contida, ele não adiciona e continua o For
                    if (resultado.get(resultado.size()-1).equals(corDoEnum.toString())) continue;
                }
                //Adiciona a cor no resultado
                resultado.add(corDoEnum.name());
                return true;
            }
        }
        return false;
    }

    //Esse método pega a maior key de bola, levando em questão todas as cores disponíveis (Enum)
    private void verificaAsJogadas() {
        int keyDaJogada = 0;
        String valueDaJogada = "";

        //Passa em todas as cores do Enum
        for (Cor corDoEnum : Cor.values()) {
            //Passa em todas as bolas sorteadas
            for (Map.Entry<Integer, Cor> bolaSorteada : bolasSorteadas.entrySet()) {
                //Verifica se a bola sorteada é igual a cor do Enum
                if (bolaSorteada.getValue().equals(corDoEnum)) {
                    //Guarda a key e a cor da bola sorteada que for maior
                    if (bolaSorteada.getKey() > keyDaJogada){
                        keyDaJogada = bolaSorteada.getKey();
                        valueDaJogada = bolaSorteada.getValue().name();
                    }
                    break;
                }
            }
        }

        //Verifica se o tamanho do array de resultados é maior que 0, pois caso ele seja, ele verifica se a cor encontrada é igual a última cor contida no array
        if (resultado.size() > 0){
            //Caso a cor encontrada seja diferente da última contida, ele exclui as bolas sorteadas menor que a key que foi pega, e adiciona o valor no resultado
            if (!resultado.get(resultado.size()-1).equals(valueDaJogada)) {
                excluiBolasAPartirDoIndice(keyDaJogada);
                resultado.add(valueDaJogada);
            }
        }else {//Se for a primeira inserção, ele exclui as bolas sorteadas menor que a key que foi pega, e adiciona o valor no resultado
            excluiBolasAPartirDoIndice(keyDaJogada);
            resultado.add(valueDaJogada);
        }

    }

    //Método para exclusão das bolas apartir do indice passado
    private void excluiBolasAPartirDoIndice(int keyDaJogada) {
        while (keyDaJogada >= 1){
            bolasSorteadas.remove(keyDaJogada);
            keyDaJogada--;
        }
    }

}
