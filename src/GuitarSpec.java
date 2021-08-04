public class GuitarSpec {

    private String model;
    private Builder builder;
    private Type type;
    private Wood backWood;
    private Wood topWood;


    public GuitarSpec(Builder builder,String model, Type type, Wood backWood, Wood topWood) {
        this.builder = builder;
        this.type = type;
        this.backWood = backWood;
        this.topWood = topWood;
        this.model=model;
    }

    public Builder getBuilder() {
        return builder;
    }

    public Type getType() {
        return type;
    }

    public String getModel() {
        return model;
    }

    public Wood getBackWood() {
        return backWood;
    }

    public Wood getTopWood() {
        return topWood;
    }
}
