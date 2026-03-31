public class Main {
 public static void main(String[] args) {
 // ── Tworzymy obiekty klas potomnych ──────────────────
 // Zmienna jest typu Figura (klasa abstrakcyjna),
 // ale przechowuje konkretny obiekt Kolo lub Prostokat.
 Figura kolo = new Kolo(5.0, "czerwony");
 Figura prostokat = new Prostokat(4.0, 6.0, "niebieski");
 // ── Polimorfizm w akcji ───────────────────────────
 // Java wywołuje obliczPole() z Kolo dla zmiennej kolo,
 // i obliczPole() z Prostokat dla zmiennej prostokat.
 System.out.println("=== Klasa abstrakcyjna — przykład ===");
 System.out.println();
 wyswietlInfo(kolo);
 System.out.println();
 wyswietlInfo(prostokat);
 // ── Nie można tworzyć obiektu klasy abstrakcyjnej ─────────────────────
 // Poniższa linia spowodowałaby BŁĄD KOMPILACJI — odkomentuj żeby zobaczyć:
 // Figura f = new Figura("zielony"); // ERROR: Figura is abstract
 }
 /**
 * Metoda pomocnicza przyjmuje dowolną Figurę.
 * Nie wie z góry, czy dostanie Kolo czy Prostokat —
 * i właśnie to jest piękno polimorfizmu.
 */
 public static void wyswietlInfo(Figura f) {
 System.out.println(f);
 System.out.printf(" Pole: %.2f%n", f.obliczPole());
 System.out.printf(" Obwód: %.2f%n", f.obliczObwod());
 System.out.println(" Kolor: " + f.getKolor());
 }
}
