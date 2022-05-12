import ack.shapes.Leinwand;

/**
 * App
 */
public class App {
    public static void main(String[] args) {
        Ampel    a1    = new Ampel    ();
        Leinwand lWand = new Leinwand ();

        for( int i = 0; i < 100; i++ ) {
            a1.zeichne( lWand );
            lWand.warte (1000);
            a1.schalten();
        }
    }
}
