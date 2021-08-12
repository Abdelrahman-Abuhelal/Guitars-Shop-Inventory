import java.util.*;

public class Inventory {

    private List Instruments;

    public Inventory() {
        Instruments = new LinkedList();
    }

    public void addInstrument(String serialNumber, double price, InstrumentSpec spec) {
        Instrument instrument = null;
        if (spec instanceof GuitarSpec){
            instrument=new Guitar(serialNumber,price,(GuitarSpec)spec);
        }
        else if(spec instanceof MandolinSpec)
            instrument=new Mandolin(serialNumber,price,(MandolinSpec) spec);
        Instruments.add(instrument);
    }
//this method is used to return a guitar from the linked list guitars
    public Guitar getGuitar(String serialNumber) {
        for (Iterator i = Instruments.iterator(); i.hasNext(); ) {
            Guitar guitar = (Guitar) i.next();
            if (guitar.getSerialNumber().equals(serialNumber)) {
                return guitar;
            }
        }
        return null;
    }

    public List search(GuitarSpec searchSpec) {
        List matchingGuitars = new ArrayList();
        for (Iterator i = guitars.iterator(); i.hasNext(); ) {
            Guitar guitar = (Guitar) i.next();
          if(guitar.getSpec().matches(searchSpec))
              matchingGuitars.add(guitar);
        }
            return matchingGuitars;

    }


}
