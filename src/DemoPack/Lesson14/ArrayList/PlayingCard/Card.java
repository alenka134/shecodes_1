package DemoPack.Lesson14.ArrayList.PlayingCard;

public class Card {
    int rank;


    public Card(int rank) {
        this.rank = rank;

    }

    public void addHighRank() {
        System.out.println("\n"+ Suit.SPADES +": Jack, Dame, King, Ace");
    }


}

