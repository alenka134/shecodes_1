package DemoPack.Garbage;

import java.util.ArrayList;

public class Main2 {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("red");
        colors.add("blue");
        colors.add("yellow");

        //loop A
        for (int i=0; i<colors.size(); i++){
            System.out.println(colors.get(i));
        }
        //loop B
        for (String value : colors){
            System.out.println(value);
        }
    }
}
