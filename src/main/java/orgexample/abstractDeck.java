package orgexample;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public abstract class abstractDeck implements Deck{
    protected List <Card> cards;


    public List<Card> getDeck(){
        return this.cards;
    }


    @Override
    public void shuffle(){
        long seed= System.nanoTime();
        Collections.shuffle(this.cards,new Random(seed));
    }
}
