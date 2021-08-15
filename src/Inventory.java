import java.util.*;

public class Inventory {

    private List Inventory;

    public Inventory() {
        Inventory = new LinkedList();
    }

    public void addInstrument(String serialNumber, double price, InstrumentSpec spec) {
        Instrument instrument = null;
        if (spec instanceof GuitarSpec){
            instrument=new Guitar(serialNumber,price,(GuitarSpec)spec);
        }
        else if(spec instanceof MandolinSpec)
            instrument=new Mandolin(serialNumber,price,(MandolinSpec) spec);
        Inventory.add(instrument);
    }
//this method is used to return a guitar from the linked list guitars
    public Instrument getInstrument(String serialNumber) {
        for (Iterator i = Inventory.iterator(); i.hasNext(); ) {
            Instrument instrument = (Instrument) i.next();
            if (instrument.getSerialNumber().equals(serialNumber)) {
                return instrument;
            }
        }
        return null;
    }

    public List search(GuitarSpec searchSpec) {
        List matchingGuitars = new ArrayList();
        for (Iterator i = Inventory.iterator(); i.hasNext(); ) {
            Guitar guitar = (Guitar) i.next();
          if(guitar.getSpec().matches(searchSpec))
              matchingGuitars.add(guitar);
        }
            return matchingGuitars;

    }
    public List search(MandolinSpec searchSpec) {
        List matchingMandolins = new ArrayList();
        for (Iterator i = Inventory.iterator(); i.hasNext(); ) {
            Mandolin mandolin = (Mandolin) i.next();
            if(mandolin.getSpec().matches(searchSpec))
                matchingMandolins.add(mandolin);
        }
        return matchingMandolins;

    }


}
