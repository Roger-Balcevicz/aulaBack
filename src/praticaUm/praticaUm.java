package praticaUm;

public class praticaUm {
    private int capacidade;
    private int ultimaPosicao;
    private int[] valores;

    public praticaUm(int capacidade, int ultimaPosicao, int[] valores) {
        this.capacidade = capacidade;
        this.ultimaPosicao = -1;
        this.valores = new int[capacidade];
    }

    public void imprime(){
        if (ultimaPosicao == -1){
        System.out.println("O vetor ta vazio");
    } else {
        for (int i = 0; i < ultimaPosicao +1; i++){
            System.out.println(i + " - " + valores[1]);
        }

    }
}
    public void inserirValor(int valor){
    if (ultimaPosicao == capacidade -1){
        System.out.println("Capacidade maxima atingida.");
        return;
    }
    int posicao = 0;
    for(int i = 0; i < capacidade +1;){
        posicao = i;
        if (valores[i] > valor){
            break;
        }
        if (i == ultimaPosicao){
            posicao = i + 1;
        }
    }
    int x = ultimaPosicao;
    while (x >= posicao){
        valores[x+1] = valores[x];
        x -= 1;
    }
    valores[posicao] = valor;
    ultimaPosicao += 1;}

public int pesquisaLinear (int valor) {
    for (int i = 0; i < ultimaPosicao + 1; ) {
        if (valores[i] > valor) {
            return -1;
        }
        if (valores[i] == valor) {
            return i;
        }
        if (i == ultimaPosicao) {
            return -1;
        }
    }
    return valor;
    }

    public int pesquisaBinaria (int valor) {
    int limiteInferior = 0;
    int limiteSuperior = ultimaPosicao;

    while(true){
        int posicaoAtual = (limiteInferior + limiteSuperior) / 2;

        if (valores[posicaoAtual] == valor){
            return posicaoAtual;
        } else if (limiteInferior > limiteSuperior) {
            return -1;
        } else {
            if (valores[posicaoAtual] < valor){
                limiteInferior = posicaoAtual + 1;
            } else {
                limiteSuperior = posicaoAtual -1;
                }
            }
         }
    }

    public boolean excluir (int valor){
        int posicao = pesquisaLinear(valor);
        if (posicao == -1){
            return false;
        } else {
            for (int i = posicao; i < ultimaPosicao; i++){
                valores[i] = valores[i + 1];
            }
            ultimaPosicao -= 1;

            return true;
        }
    }
}









