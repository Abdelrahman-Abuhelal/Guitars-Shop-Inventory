package enums;

public enum Builder {
    FENDER, MARTIN, GIBSON,ANY;

    public String toString(){
        switch(this){
            case FENDER: return "fender";
            case MARTIN: return "martin";
            case GIBSON: return "gibson";
            case ANY: return "any";
            default: return "";
        }
    }

}
