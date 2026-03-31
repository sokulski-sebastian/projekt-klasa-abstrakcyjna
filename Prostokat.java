class Prostokat extends Figura {
 private double szerokosc;
 private double wysokosc;
 public Prostokat(double szerokosc, double wysokosc, String kolor) {
 super(kolor);
 this.szerokosc = szerokosc;
 this.wysokosc = wysokosc;
 }
 @Override
 public double obliczPole() {
 return szerokosc * wysokosc;
 }
 @Override
 public double obliczObwod() {
 return 2 * (szerokosc + wysokosc);
 }
 @Override
 public String toString() {
 return "Prostokat [" + szerokosc + "x" + wysokosc
+ ", kolor=" + getKolor() + "]";

}
}
