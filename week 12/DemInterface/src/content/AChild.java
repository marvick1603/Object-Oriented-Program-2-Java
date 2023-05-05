package content;

public class AChild extends AParent implements First,Second{
    
    
    @Override
    public String stuff() {
        return "This is AChild";
    }

    @Override
    public String firstStuff() {
    return "THIS IS ACHILD FIRST";    
    }

    @Override
    public String secondStuff() {
        return "This is seocnd stuff";
    }
    
}
