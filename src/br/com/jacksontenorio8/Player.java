package br.com.jacksontenorio8;

public class Player {
    int number = 0;            // onde entra o palpite

    public void guess(){
        number = (int) (Math.random() * 10);
        System.out.println("Estou pensando em " + number);
    }
}

public class GameLauncher {
    public static void main (String[] args) {
        GuessGame game = new GuessGame();
        game.startGame();
    }
}