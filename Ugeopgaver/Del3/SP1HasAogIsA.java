public class SP1HasAogIsA {

    public class SP1Variation4 {

        // =========================
        // DEL 3: SP1 ANALYSE
        // =========================

        /*
         * KOMPOSITION (has-a):
         *
         * Klassen SP1Variation4 har et felt kaldet "repertoire", som er et
         * String-array:
         *
         * private String[] repertoire;
         *
         * Det betyder, at et SP1Variation4-objekt har en samling af sange.
         * Man kan derfor sige, at et band "has-a" repertoire.
         *
         * Relation:
         * SP1Variation4 has-a repertoire (String[])
         *
         * I denne SP1-kode er der dog ikke to forskellige selvskrevne klasser,
         * hvor den ene tydeligt ejer den anden. Repertoiret består af String-
         * objekter, så det er det tydeligste eksempel på en has-a-relation
         * i den nuværende kode.
         */


        /*
         * NEDARVNING (is-a):
         *
         * I den nuværende SP1-kode har vi kun én klasse:
         *
         * SP1Variation4
         *
         * Derfor er der ikke nogen klasser, der allerede deler felter og
         * metoder på en måde, hvor nedarvning giver mening.
         *
         * Hvis vi senere lavede forskellige typer bands, kunne de for eksempel
         * arve fra en fælles superklasse kaldet "Band".
         *
         * Eksempel:
         *
         * RockBand extends Band
         * PopBand extends Band
         * RapBand extends Band
         *
         * De kunne så arve fælles felter som:
         * - bandName
         * - fans
         * - maxFans
         * - money
         * - fameLevel
         *
         * Og fælles metoder som:
         * - gainFans()
         * - loseFans()
         * - earnMoney()
         * - spendMoney()
         * - levelUp()
         * - isActive()
         *
         * Så ville relationen være:
         *
         * RockBand is-a Band
         * PopBand is-a Band
         * RapBand is-a Band
         *
         * Men i den nuværende SP1-opgave er der ikke behov for at ændre
         * koden, fordi der kun findes én bandklasse.
         */
    }
}
