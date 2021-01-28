import java.util.ArrayList;

public class Game {


    private ArrayList<Player> players;
    private Deck deck;

    public Game(Deck deck){
        this.players = new ArrayList<Player>();
        this.deck = deck;
    }

    public void addPlayer(Player player){
        this.players.add(player);
    }

    public int countPlayers(){
        return this.players.size();
    }

    public Player playGame(){
        deck.populateDeck();
        deck.shuffleDeck();
        for (Player player : players){
            deck.dealCardToPlayer(player);
        }
        int highestNumber = 0;
        for (Player player : players){
            if (player.getCard().getValueFromEnum() > highestNumber){
                highestNumber = player.getCard().getValueFromEnum();
            }
        }
    }





}
