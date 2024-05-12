package De2;

public class De2Run {
    public static void main(String[] args) throws PlayError {
        WindInstrument w1 = new WindInstrument(3, "Đàn baba");
        w1.Playing();
        w1.Display();

        WindInstrument w2 = new WindInstrument(0, "Đàn hahaha");
        try {
            w2.Display();
            w2.Playing();
        } catch (PlayError p) {
            System.out.println(p.getMessage());
        }
    }

}

//LOP TRUU TUONG INSTRUMENT
abstract class Instrument {

    String Name;

    public Instrument() {
    }

    public Instrument(String Name) {
        this();
        this.Name = Name;
    }

    public void Display() {
        System.out.println("Tên nhạc cụ: " + this.Name);
    }

    // abstract public void Playing();
    //Cau 3:
    abstract public void Playing() throws PlayError;
}

//LOP WINDINSTRUMENT THUA KE LAI LOP INSTRUMENT
class WindInstrument extends Instrument {
    int KeyNum;

    public WindInstrument(int KeyNum) {
        this.KeyNum = KeyNum;
    }

    public WindInstrument(int KeyNum, String Name) {
        super(Name);
        this.KeyNum = KeyNum;
    }

    @Override
    public void Display() {
        super.Display();
        System.out.println("Số phím : " + this.KeyNum);
    }

    //@Override
    /*
    public void Playing() {
          System.out.println(Name + "is played");
       }
    */
    // Cau 3
    @Override
    public void Playing() throws PlayError {
        if (this.KeyNum == 0) {
            throw new PlayError(this.Name);
        }
    }
}

class PlayError extends Exception {
    String Name;

    public PlayError(String Name) {
        this.Name = Name;
    }

    public String getMessage() {
        return this.Name + " không được có số phím bằng 0";
    }
}
