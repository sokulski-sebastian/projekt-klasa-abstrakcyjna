/**
 * Kolo rozszerza (dziedziczy) klasę abstrakcyjną Figura.
 * Słowo kluczowe "extends" oznacza dziedziczenie.
 *
 * Klasa Kolo MUSI zaimplementować WSZYSTKIE metody abstrakcyjne
 * z klasy Figura (obliczPole i obliczObwod).
 * Jeśli chociaż jednej brakuje → błąd kompilacji.
 */
public class Kolo extends Figura {
 // ── Pole własne klasy Kolo ────────────────────────────────────
 private double promien;
 // ── Konstruktor ───────────────────────────────────────────
 // super(kolor) wywołuje konstruktor klasy nadrzędnej (Figura).
 // MUSI być pierwszą instrukcją w konstruktorze.
 public Kolo(double promien, String kolor) {
 super(kolor); // wywołaj Figura(kolor)
 this.promien = promien;
 }
 // ── Implementacja metody abstrakcyjnej obliczPole() ──────────────────────
 // Adnotacja @Override informuje kompilator: "nadpisuję metodę z klasy wyżej".
 // To dobra praktyka — kompilator sprawdzi czy nazwa metody jest poprawna.
 @Override
 public double obliczPole() {
 return Math.PI * promien * promien; // π * r²
 }
 // ── Implementacja metody abstrakcyjnej obliczObwod() ────────────────────
 @Override
 public double obliczObwod() {
 return 2 * Math.PI * promien; // 2 * π * r
 }
 // ── Własna metoda klasy Kolo (nie ma jej w Figura) ──────────────────────
 public double getPromien() {
 return promien;
 }
 @Override
 public String toString() {
 return "Kolo [promien=" + promien + ", kolor=" + getKolor() + "]";
 }
}
