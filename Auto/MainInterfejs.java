public class MainInterfejs {
 public static void main(String[] args) {
 System.out.println("=== Interfejsy — przykład ===\n");
 // ── Polimorfizm przez interfejs ───────────────────────────────
 // Zmienna typu Pojazd może przechowywać KAŻDY obiekt
 // który implementuje interfejs Pojazd.
 Pojazd auto = new Samochod("Toyota Corolla", 1800);
 Pojazd elektryk = new SamochodElektryczny("Tesla Model 3", 80);
 // Wywołanie metody domyślnej z interfejsu Pojazd:
 auto.wyswietlStatus();
 elektryk.wyswietlStatus();
 System.out.println();
 // ── Praca z samochodem spalinowym ─────────────────────
 // Musimy rzutować na Silnikowy żeby użyć metod tego interfejsu:
 Silnikowy silnikowy = (Silnikowy) auto;
 silnikowy.uruchomSilnik();
 auto.jedz();
 auto.zatrzymajSie();
 System.out.println();
 // ── Praca z samochodem elektrycznym ───────────────
 Elektryczny el = (Elektryczny) elektryk;
 System.out.println("Poziom naładowania: " + el.getPoziomNaladowania() + "%");
 elektryk.jedz();
 elektryk.jedz();
 System.out.println("Poziom po jeździe: " + el.getPoziomNaladowania() + "%");
 el.naladujAkumulator();
 // ── instanceof — sprawdź czy obiekt implementuje interfejs ───
 System.out.println("\n--- instanceof ---");
 System.out.println("auto instanceof Pojazd: " + (auto instanceof Pojazd));
 System.out.println("auto instanceof Silnikowy: " + (auto instanceof Silnikowy));
 System.out.println("auto instanceof Elektryczny: " + (auto instanceof Elektryczny));
 }
}
