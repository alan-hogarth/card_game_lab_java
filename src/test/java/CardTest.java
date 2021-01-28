import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CardTest {

    Card card;

    @Before
    public void before(){
        card = new Card(SuitType.HEARTS, RankType.ACE);
    }

    @Test
    public void canGetSuit() {
        assertEquals(SuitType.HEARTS, card.getSuit());
    }

    @Test
    public void canGetRank() {
        assertEquals(RankType.ACE, card.getRank());
    }

    @Test
    public void aceHasValue1() {
        assertEquals(1, card.getValueFromEnum());
    }

    @Test
    public void canGetAllSuits() {
        SuitType[] suits = SuitType.values();
        for (SuitType suit : suits){
            System.out.println(suit);
        }
    }

    @Test
    public void canGetRankFromValue() {
        RankType rank = RankType.valueOf("SEVEN");
        System.out.println(rank);
    }

    //    @Test
//    public void suitCanBeMisspelled() {
//        card = new Card("Heeeearts");
//        assertEquals("Heeeearts", card.getSuit());
//    }
}
