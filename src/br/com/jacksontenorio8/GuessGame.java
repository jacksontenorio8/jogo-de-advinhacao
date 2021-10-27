package br.com.jacksontenorio8;

public class GuessGame {
    /*GuessGame tem três variáveis de instâncias para os três objetos Player*/
    Player p1;
    Player p2;
    Player p3;

    public void startGame(){
        /*cria três objetos Player e atribui a eles as três variáveis de instância
        * Player */
        p1 = new Player();
        p2 = new Player();
        p3 = new Player();

        /*declara três variáveis para armazenar os três palpites que os jogadores
         forneceram*/
        int guessp1 = 0;
        int guessp2 = 0;
        int guessp3 = 0;

        /*declara três variáveis para armazenar um valor verdadeiro ou falso baseado
         na resposta do jogador*/
        boolean p1isRight = false;
        boolean p2isRight = false;
        boolean p3isRight = false;

        /*Cria um número 'alvo' que os jogadores vão ter que advinhar*/

        int targetNumber = (int) (Math.random() * 10);
        System.out.println("Estou pensando em um número entre 0 e 9...");

        while(true) {
            System.out.println("O número a advinhar é " + targetNumber);

            //Chama o método guess de cada jogador

            p1.guess();
            p2.guess();
            p3.guess();

            /*
            Obtém o palpite de cada jogador, o resulatado da execução de seu metódo guess() acresentando a
            variável númerica de cada um.
            */
        }

    }
}
