package content;

public enum Coin {
    NICKEL(5, "Nickel","made of nickel"),
    DIME(10, "Dime", "made of tin"),
    QUARTER(25, "Quarter","made of silver"),
    LOONIE(100, "Loonie","made of copper"),
    TWOONIE(200, "Twoonie","bronze");
    
    
    private final int cents;
    private final String coinName;
    private final String description;
    
    private Coin(int cents, String coinName, String description){
        this.cents = cents;
        this.coinName = coinName;
        this.description= description;
    }
    
    public int getCents(){
        return this.cents;
    }

    public String getCoinName() {
        return this.coinName;
    }

    public String getDescription() {
        return this.description;
    }
    
    
            
}
