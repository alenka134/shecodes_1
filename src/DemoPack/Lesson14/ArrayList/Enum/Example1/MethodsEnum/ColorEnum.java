package DemoPack.Lesson14.ArrayList.Enum.Example1.MethodsEnum;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ColorEnum {
    public static void main(String[] args) {

        System.out.println(Color.RED.name()); //output: RED
        System.out.println(Color.RED.ordinal()); //output: 0
        System.out.println(Color.RED.equals(Color.GREEN)); //output: FALSE
        System.out.println(Color.RED.hashCode());  // output: automatically generated hashcode for each color
        System.out.println(Color.BLUE.toString()); // output Blue  --> метод toString() возвращает имя значения перечисления.
                                                  // Назвали значение BLUE, это же значение и получим при вызове toString() или name();
    }
}
