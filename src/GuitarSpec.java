import enums.Builder;
import enums.Type;
import enums.Wood;

public class GuitarSpec extends InstrumentSpec {

    private int numString;

    public GuitarSpec(Builder builder, String model, Type type, Wood backWood, Wood topWood, int numString) {
        super(builder, model, type, backWood, topWood);
        this.numString = numString;
    }

    public int getNumString() {
        return numString;
    }

    @Override
    public boolean matches(InstrumentSpec otherSpec) {
        if (!super.matches(otherSpec)) {
            return false;
        }
        if (!(otherSpec instanceof GuitarSpec))
            return false;
        GuitarSpec spec = (GuitarSpec) otherSpec;
        if (numString != spec.numString)
            return false;
        return true;
    }
}
