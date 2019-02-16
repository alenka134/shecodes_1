package DemoPack.Lesson11.Interface.PassByValue;

public class IceCream {
    String flavor;

    public IceCream(String flavor){
        this.flavor = flavor;
    }

    public String getFlavor(){
        return flavor;
    }

    public void setFlavor(String flavor){
        this.flavor = flavor;
    }

    @Override
    public String toString(){
        return "IceCream [flavor= " + flavor + "]";
    }
}
