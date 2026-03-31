public abstract class Figura {
 // ── Pole wspólne dla wszystkich figur ────────────────────────────
 // Każda figura ma kolor; to pole dziedziczy każda klasa potomna.
 private String kolor;
 // ── Konstruktor klasy abstrakcyjnej ─────────────────────────────
 // Choć nie możemy tworzyć obiektu Figura bezpośrednio,
 // konstruktor jest wywoływany przez konstruktory klas potomnych (super(...)).
 public Figura(String kolor) {
 this.kolor = kolor;
 }
 // ── Metoda abstrakcyjna: obliczPole() ────────────────────────────
 // Słowo "abstract" przed typem zwracanym oznacza, że:
 // 1. ta metoda NIE MA ciała (brak {})
 // 2. każda klasa dziedzicząca MUSI ją zaimplementować
 // Bez implementacji w klasie potomnej — błąd kompilacji!
 public abstract double obliczPole();
 // ── Metoda abstrakcyjna: obliczObwod() ─────────────────────────
 public abstract double obliczObwod();
 // ── Metoda konkretna (nieabstrakcyjna) ─────────────────────────
 // Ta metoda MA ciało — działa tak samo dla WSZYSTKICH figur.
 // Klasy potomne dziedziczą ją i nie muszą jej nadpisywać.
 public String getKolor() {
 return kolor;
 }
 // ── Metoda toString() — nadpisuje metodę z klasy Object ───────────────
 // Dzięki temu System.out.println(figura) wyświetli ładny opis.
 @Override
 public String toString() {
 return "Figura [kolor=" + kolor + "]";
 }
}
