package DemoPack;

public class PlayerMain {


    public static void main(String[] args) {

        FootballPlayer player = new FootballPlayer("Jeremy", 700);
        FootballPlayer player1 = new FootballPlayer("Boris", 500);

      //  System.out.println("Simply print Players NAME & Points--> " + String.format("%s %s ", player.getPlayerName(), player.getPoint()));
      //  System.out.println("Simply print Players NAME & Points--> " + String.format("%s %s ", player1.getPlayerName(), player1.getPoint()));

        String footballPlayerString = player.toString();
        String footballPlayer1String = player1.toString();

        System.out.println(footballPlayerString);
        player.setPoint(player.getPoint()+50);

        System.out.println(player.toString() + "overwrite toString");


        System.out.println(footballPlayer1String);
        player1.setPoint(player1.getPoint()+100);

        System.out.println(player1.toString() + "overwrite toString");
    }
    
}

