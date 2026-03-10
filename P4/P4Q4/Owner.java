public class Owner {
    // data fields
    private String name;
    private String icNo;
    
    //parameterised() method
    public Owner(String name, String icNo) {
        this.name = name;
        this.icNo = icNo;
    }

    // toStirng() method
    public String toString(){
        return String.format("%-12s %-12s", name, icNo);
    }

    


    
}
