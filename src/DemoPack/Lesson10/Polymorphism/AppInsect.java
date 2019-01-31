package DemoPack.Lesson10.Polymorphism;

public class AppInsect {
    public static void main(String[] args) {

        Insect allInsects[] = new Insect[4];
        allInsects[0] = new Roach();
        allInsects[1] = new Beatle();
        allInsects[2] = new Spider();
        allInsects[3] = new Spider();

        //Object Spider can be presented also, where "ins1" - reference variables:
        Insect ins1 = new Spider();
        Spider ins2 = new Spider();
        Roach ins3 = new Roach();
        ins1 = ins2;
        ins1 = ins3;

        for (int i = 0; i < allInsects.length; i++){

            allInsects[i].eat();
        }

    }
}
