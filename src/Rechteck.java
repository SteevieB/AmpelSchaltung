/**
 * Rechteck
 */
public class Rechteck {
    int    positionX;
    int    positionY;
    int    breite;
    int    hoehe;
    String farbe;
    
    public Rechteck() {
        this(200, 100, 300, 100, "rot");
    }

    public Rechteck(int x, int y, int b, int h, String farbe) {
        this.positionX = x;
        this.positionY = y;
        this.breite    = b;
        this.hoehe     = h;
        this.farbe     = farbe;
    }

    public void verschieben(int x, int y) {
        this.positionX += x;
        this.positionY += y;
    }

    public double getArea(){
        return breite * hoehe;
    }

    public void vergroessern(int z){
        this.breite *= z;
        this.hoehe  *= z;
    }

    public double getPerimeter(){
        return breite * 2 + hoehe * 2;
    }

    public void changeColor(String c){
        this.farbe = c;
    }
}
