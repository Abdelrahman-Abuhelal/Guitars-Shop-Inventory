import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Inventory firstInventory = new Inventory();
        InitializeInventory(firstInventory);
        GuitarSpec whatOsamaLike = new GuitarSpec(Builder.FENDER, "Stratocastor", Type.ELECTRIC,
                Wood.BRAZILIAN_ROSEWOOD, Wood.INDIAN_ROSEWOOD);

        List matchingGuitars = firstInventory.search(whatOsamaLike);
        if (!matchingGuitars.isEmpty()) {
            for (Iterator i = matchingGuitars.iterator(); i.hasNext(); ) {
                Guitar guitar = (Guitar)i.next();
                GuitarSpec spec = guitar.getSpec();
                System.out.println("you might like this " +
                        spec.getBuilder() + " " + spec.getModel() + " " +
                        spec.getType() + "guitar:\n " +
                        spec.getBackWood() + " back and sides,\n " +
                        spec.getTopWood()+"You can have it for $"+guitar.getPrice());
            }
        } else {
            System.out.println("sorry we couldn't find a guitar you want");
        }

    }

    public static void InitializeInventory(Inventory inventory) {
        inventory.addGuitar("99", 800,new GuitarSpec(Builder.FENDER,"Stratocastor",Type.ELECTRIC,Wood.BRAZILIAN_ROSEWOOD,Wood.INDIAN_ROSEWOOD));
        inventory.addGuitar("104", 1700,new GuitarSpec(Builder.ANY,"nasa",Type.ACOUSTIC,Wood.INDIAN_ROSEWOOD,Wood.BRAZILIAN_ROSEWOOD));

//        inventory.addGuitar("100", 500, "Eren", "Attack", "titan", "death", "strong");
    }
}

