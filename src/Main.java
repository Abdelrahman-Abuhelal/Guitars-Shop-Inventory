import enums.Builder;
import enums.Type;
import enums.Wood;

import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Inventory firstInventory = new Inventory();
        InitializeInventory(firstInventory);
        GuitarSpec whatOsamaLike =new GuitarSpec(Builder.FENDER,"Stratocastor",Type.ELECTRIC,Wood.BRAZILIAN_ROSEWOOD,Wood.INDIAN_ROSEWOOD,12);

        List matchingInstruments = firstInventory.search(whatOsamaLike);
        if (!matchingInstruments.isEmpty()) {
            for (Iterator i = matchingInstruments.iterator(); i.hasNext(); ) {
                Instrument instrument = (Instrument)i.next();
                InstrumentSpec spec = instrument.getSpec();
                System.out.println("you might like this " +
                        spec.getBuilder() + " " + spec.getModel() + " " +
                        spec.getType() + "guitar:\n " +
                        spec.getBackWood() + " back and sides,\n " +
                        spec.getTopWood()+"You can have it for $"+instrument.getPrice());
            }
        } else {
            System.out.println("sorry we couldn't find a guitar you want");
        }

    }

    public static void InitializeInventory(Inventory inventory) {
        inventory.addInstrument("99", 800,new GuitarSpec(Builder.FENDER,"Stratocastor",Type.ELECTRIC,Wood.BRAZILIAN_ROSEWOOD,Wood.INDIAN_ROSEWOOD,12));
        inventory.addInstrument("104", 1700,new GuitarSpec(Builder.ANY,"nasa",Type.ACOUSTIC,Wood.INDIAN_ROSEWOOD,Wood.BRAZILIAN_ROSEWOOD,6));

//        inventory.addInstrument("100", 500, "Eren", "Attack", "titan", "death", "strong");
    }
}

