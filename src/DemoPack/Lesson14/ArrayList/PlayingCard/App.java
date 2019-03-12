package DemoPack.Lesson14.ArrayList.PlayingCard;


public class App {

    public static void main(String[] args) {

        Card card = new Card(6);
        System.out.println(Suit.DIAMONDS + " " + card.rank);
        System.out.println(Suit.CLUBS + " " + card.rank);
        System.out.println(Suit.HEARTS + " " + card.rank + "\n");


        for (int i = 2; i < 11; i++) {
            System.out.println(i + "- " + Suit.DIAMONDS);

        }
        card.addHighRank();

    }
}
