//Leia a quantidade de vidas de um jogador. E faça o que se pede abaixo nas regras:
//        ● vidas > 0 → 'Continue jogando'
//        ● vidas == 0 → 'Game Over'
//        ● vidas < 0 → 'Valor inválido'

import static java.lang.IO.print;

void main() {
    //int vida = 20;
    print("Escreva o valor da vida do seu personagem!");
    Scanner inputScanner = new Scanner(System.in);

    int vida = inputScanner.nextInt();

    if (vida > 0 ){
        print("Continue Jogando");
    } else if (vida == 0 ){
        print("Game Over");
    } else {
        print("Valor inválido");
    }
    
}
