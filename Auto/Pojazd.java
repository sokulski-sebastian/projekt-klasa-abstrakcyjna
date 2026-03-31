**
 * Interfejs Pojazd.
 *
 * Słowo kluczowe "interface" zamiast "class".
 * Interfejs NIE JEST klasą — nie można tworzyć jego obiektów.
 *
 * Różnice między interfejsem a klasą abstrakcyjną:
 * Interfejs:
 * - wszystkie metody są domyślnie public i abstract (przed Java 8)
 * - może mieć metody domyślne (default) z implementacją od Java 8
 * - nie może mieć konstruktora
 * - klasa może implementować WIELE interfejsów (interface1, interface2, ...)
 * Klasa abstrakcyjna:
 * - może mieć konstruktor
 * - może mieć pola instancji
 * - klasa może dziedziczyć tylko JEDNĄ klasę abstrakcyjną
 */
public interface Pojazd {
 // Metody interfejsu — brak słowa "abstract", ale są abstrakcyjne domyślnie.
 // Każda klasa implementująca MUSI je zaimplementować.
 void jedz();
 void zatrzymajSie();
 String getNazwa();
 // ── Metoda domyślna (od Java 8) ─────────────────────────────
 // Ma implementację! Klasa implementująca może ją użyć lub nadpisać.
 default void wyswietlStatus() {
 System.out.println("Pojazd: " + getNazwa() + " jest gotowy do jazdy.");
 }
