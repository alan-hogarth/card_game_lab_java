import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsInstanceOf.instanceOf;

public class DeckTest {

    private Deck deck;
    private Card card;
    private Player player;

    @Before
    public void before(){
        deck = new Deck();
        card = new Card(SuitType.HEARTS, RankType.EIGHT);
        player = new Player("Chester");
    }

    @Test
    public void deckStartsEmpty(){
        assertEquals(0, deck.getDeckCount());
    }

    @Test
    public void canAddOneCard(){
        deck.addCard(card);
        assertEquals(1, deck.getDeckCount());
    }

    @Test
    public void canPopulateDeck(){
        deck.populateDeck();
        assertEquals(52, deck.getDeckCount());
    }

    @Test
    public void canDealCard(){
        deck.populateDeck();
        deck.dealCard();
        assertEquals(51, deck.getDeckCount());
    }

    @Test
    public void canDealCardToPlayer(){
        deck.populateDeck();
        deck.shuffleDeck();
        deck.dealCardToPlayer(player);
        assertEquals(51, deck.getDeckCount());
    }

}
