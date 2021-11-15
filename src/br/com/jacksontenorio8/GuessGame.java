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
            Obtém o palpite de cada jogador, o resulta do da execução de seu metódo guess() acresentando a
            variável númerica de cada um.
            */
            guessp1 = p1.number;
            System.out.println("O jogador um forneceu o palpite " + guessp1);
            guessp2 = p2.number;
            System.out.println("O jogador dois forneceu o palpite " + guessp2);
            guessp3 = p3.number;
            System.out.println("O jogador três forneceu o palpite " +guessp3);

            /*
            Verifica o palpite de cada jogador para ver se é igual ao número-alvo. Se um jogador acertar,
            sua variável será configurada com true (lembre-se de que configuramos false como padrão)
            */

            if (guessp1 == targetNumber) {
                p1isRight = true;
            }
            if(guessp2 == targetNumber) {
                p2isRight = true;
            }
            if(guessp3 == targetNumber) {
                p3isRight = true;
            }

            /*
            se o jogador um OU o jogador dois OU o jogador três acertar... (O operador || significa OU.)
            */

            if(p1isRight || p2isRight || p3isRight) {

                System.out.println("Temos um vencedor!");
                System.out.println("O jogador acertou? " + p1isRight);
                System.out.println("O jogador acertou? " + p2isRight);
                System.out.println("O jogador acertou? " + p3isRight);
                System.out.println("Fim de jogo.");
                break; // Fim de jogo, portanto saia do loop.
            } else {                                                        /*caso contrário, fique no
                                                                            loop e peça aos jogadores outro
                                                                            palpite*/
                // devemos continuar porque ninguém acertou!
            }
        }

    }
}
