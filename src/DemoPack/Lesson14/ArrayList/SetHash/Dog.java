package DemoPack.Lesson14.ArrayList.SetHash;

public class Dog {

    public String name;
    public int age;
    public int weight;

    public Dog(String name) {
        super();
        this.name = name;
    }

    public Dog(String name, int age, int weight) {
        super();
        this.name = name;
        this.age = age;
        this.weight = weight;
    }



    @Override
    public String toString() {
        return "Dog [name=" + name + ", age=" + age + ", weight=" + weight + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + age;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + weight;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Dog other = (Dog) obj;
        if (age != other.age)
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (weight != other.weight)
            return false;
        return true;
    }


}

