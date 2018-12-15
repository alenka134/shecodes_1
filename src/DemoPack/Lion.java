package DemoPack;

public class Lion {
    public static void main(String[] args) {

        myLion cub = new myLion();
        myLion lioness = new myLion();
        myLion lion = new myLion();

        cub.color = "gold";
        cub.height = 50;
        cub.roarDecibels = 5.3;

        lioness.color = "brown";
        lioness.height = 90;
        lioness.roarDecibels = 12.5;

        lion.color = "light brown";
        lion.height = 120;
        lion.roarDecibels = 25.5;

        System.out.println("New lion arrived in zoo 25.12.2018: ");
        lion.setNewHeightWeight(125, 95);

        System.out.println("\nCub color: " + cub.color + " , heigh: " + cub.height);
        System.out.println("Cub can roar 30 min with power " + cub.dependenceRoar(0.5) + "  decibels");
        System.out.println("Lion can roar 30 min with power " + lion.dependenceRoar(0.5) + " decibels");

        System.out.println("\nRabbit appears suddenly and: ");
        cub.RabbitHunt();

    }
}


class myLion {

    int height;
    int weight;
    String color;
    double roarDecibels;

    double dependenceRoar(double time) {
        return roarDecibels / time;

    }

    void setNewHeightWeight(int newHeight, int newWeight) {                                //Method to enter a new height and weight

        height = newHeight;
        weight = newWeight;
        System.out.println("He has height " + newHeight + " cm and weight: " + newWeight + " kg");


    }
    void RabbitHunt(){
        String hunt = "'RRarRR' and starts hunting the rabbit";

        System.out.println("Cub is growls: " + hunt);
    }

}



