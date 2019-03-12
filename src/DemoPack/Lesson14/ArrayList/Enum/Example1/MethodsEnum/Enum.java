package DemoPack.Lesson14.ArrayList.Enum.Example1.MethodsEnum;

import java.io.Serializable;

public abstract class Enum<E extends java.lang.Enum<E>>
        implements Comparable<E>, Serializable {

    private final String name;

    public final String name() {
        return name;
    }

    private final int ordinal;

    public final int ordinal() {
        return ordinal;
    }

    protected Enum(String name, int ordinal) {
        this.name = name;
        this.ordinal = ordinal;
    }

    boolean isEqualToItself = Color.RED.equals(Color.RED);
    boolean isEqualToDifferentColor = Color.RED.equals(Color.GREEN);

    public void isEqualToItself() {
        System.out.println(isEqualToItself); //output true

    }

    public void isEqualToDifferentColor() {
        System.out.println(isEqualToDifferentColor); //output false
    }

    int hashOfRed = Color.RED.hashCode();
    int getHashOfGreen = Color.GREEN.hashCode();

    public void setHashOfRed(int hashOfRed) {
        this.hashOfRed = hashOfRed;
        System.out.println(hashOfRed);
    }

    public void setGetHashOfGreen(int getHashOfGreen) {
        this.getHashOfGreen = getHashOfGreen;
        System.out.println(getHashOfGreen);
    }

    String blue = Color.RED.toString();

    public String ToString(){
        return name;                // метод toString() возвращает имя значения перечисления.
                                    // Назвали значение BLUE,  это же значение и получим при вызове toString() или name();
    }

    protected final void finalize() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }
    protected final Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();

    }

}