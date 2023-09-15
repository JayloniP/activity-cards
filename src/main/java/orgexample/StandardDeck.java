package orgexample;
import java.util.*;

public class StandardDeck extends abstractDeck {

    public StandardDeck(){
        this.cards=newDeck();
    }

    private List<Card> newDeck() {
        List<Card> cards =new ArrayList<>();

        Arrays.stream(Suit.values()).forEach(suit -> {
            Arrays.stream(FaceValue.values());
            .map(faceValue -> new Card(Suit,faceValue));
            .forEach(newDeck::add);

        });

        return cards;
    }

    @Override
    public void shuffle(){
        Collections.shuffle(this.cards);
    }

    @Override
    public void cut(int index) {
        List<Card> top = this. cards.subList(0,index);
        List<Card> bottom=this.cards.subList(index,this.cards.size());

        this.cards.clear();
        this.cards.addAll(bottom);
        this.cards.addAll(top);

    }

    @Override
    public Card deal() {
        return this.cards.remove(0);
    }

    @Override
    public void newOrder(Deck deck) {
        //FIXME:implement
        // Collections.sort(((abstractDeck)deck).getDeck());

    }

    @Override
    public int search(Card card) {
        return this.cards.indexOf(card);
    }




@Override
    public int size(){
        return this.cards.size();
}

    @Override
    public Card turnOver() {

        return this.cards.get(0);
    }
}
