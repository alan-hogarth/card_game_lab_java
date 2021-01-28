import java.util.ArrayList;

public class Runner {


//    private Player playGame(){

    public static void main(String[] args) {
        Deck deck = new Deck();
        Game game = new Game(deck);
        Player player1 = new Player("Sharky");
        Player player2 = new Player("Chuck");

        game.addPlayer(player1);
        game.addPlayer(player2);
        Player winner = game.playGame();


    }
}
