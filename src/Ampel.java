import ack.shapes.Leinwand;

/**
 * Ampel
 */
public class Ampel {

    final static int GELB  = 0;
    final static int ROT   = 1;
    final static int ROTG  = 2;
    final static int GRUEN = 3;

    int state = GELB;
    int count = 0;

    private Rechteck gehaeuse;
    private Kreis    gruenerKreis;
    private Kreis    gelberKreis;
    private Kreis    roterKreis;

    public Ampel(){
        this(45, 45, 110, 310);
    }

    public Ampel(int positionX, int positionY, int breite, int hoehe){
        this.gehaeuse       = new Rechteck(positionX, positionY, 
            breite, hoehe, "schwarz");
        this.gruenerKreis   = new Kreis(100, 300, 50, "gruen");
        this.gelberKreis    = new Kreis(100, 200, 50, "gelb" );
        this.roterKreis     = new Kreis(100, 100, 50, "rot"  );
        roterKreis.schalten();
        gelberKreis.schalten();
    }

    public void zeichne(Leinwand leinwand){
        leinwand.zeichne(gehaeuse    );
        leinwand.zeichne(gruenerKreis);
        leinwand.zeichne(gelberKreis );
        leinwand.zeichne(roterKreis  );
    }

    public void schalten(){
        this.count = this.count % 4;
        if( this.count == GELB ){
            gruenerKreis.schalten();
            gelberKreis.schalten();
        } else if ( this.count == ROT ){
            roterKreis.schalten();
            gelberKreis.schalten();
        } else if ( this.count == ROTG ) {
            gelberKreis.schalten();
        } else if ( this.count == GRUEN ) {
            roterKreis.schalten();
            gelberKreis.schalten();
            gruenerKreis.schalten();
        }
        this.count++;
    }

}
