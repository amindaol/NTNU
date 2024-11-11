public class StringClass {
    private final String text;
    private int[] numberLetter = new int[30];   //array, A-Å, + tegn som ikke er bokstaver

    public StringClass(String text) {
        this.text = text;                       //konstruktør, parameter "String".
        analyseText(text);                     //kaller metoden analyseText for å analysere teksten.
    }

    public void analyseText(String text) {      //metode analyseText
        for (int i = 0; i < text.length(); i++) {  //for-løkke til å gå gjennom hvert tegn i "text"
            char c = text.charAt(i);               // henter karakteren på indeks i
            if (Character.isLetter(c)) {           // sjekker om c er en bokstav
                c = Character.toLowerCase(c);      // Hvis bokstav, konverteres til små bokstaver
                int index = c - 'a';                //beregner indeks til bokstaven
                if (index >= 0 && index < 29) {     //hvis indeksen er 0-28, økes antallet for
                    numberLetter[index]++;          //den spesifikke bokstaven i numberLetter
                }
            } else {                                //hvis ikke c er en bokstav,
                numberLetter[29]++;                 //øker indeks 29, med 1.
            }
        }
    }

    public int findNumberOfDifferentLetters() {     //metode finner hvor mange forskjellige bokstaver det er i teksten.
        int quantity = 0;                           //oppretter variabel for å holde ant bokstaver
        for (int i = 0; i < 29; i++) {              //for-løkka går gjennom bokstavene a-å
            if (numberLetter[i] > 0) {              // sjekker om bestemt bokstav har blitt funnet i teksten
                quantity++;                         //øker ant. hvis bokstaven finner
            }
        }
        return quantity;                            //returnerer ant. forskjellige bokstaver funnet.
    }

    public int findTotalNumberLetter() {            //metode for å finne tot ant. bokstaver
        int sum = 0;                                //oppretter variabel for å holde summen av alle bokstavene.
        for (int i = 0; i < 29; i++) {               //for-løkke, går gjennom numberLetter a-å
            sum += numberLetter[i];                 //legger til antallet for hver bokstav til sum
        }
        return sum;                                  //returnerer ant. bokstaver
    }

    public double findNumberNotLetter() {            //metode finne prosent tegn som ikke er bokstaver
        int totalNumberLetter = findTotalNumberLetter() + numberLetter[29]; //finner tot ant tegn
        if (totalNumberLetter == 0) {                 //sjekker om det finnes noen tegn,
            return 0.0;                             //hvis ikke, returneres 0.0, for å unngå divisjon med 0
        }
        return (double) numberLetter[29] / totalNumberLetter * 100; //returnerer ant ikke-bokstaver, ved å dele på totalen
    }

    public int findNumberOfSpecificLetter(char letter) {     //finner ant forekomster av spesifikk bokstav 'a'
        letter = Character.toLowerCase(letter);            //konverterer alle av spesifikk bokstav til små bokstaver
        int index = letter - 'a';                       //beregner indeksen for bokstaven
        if (index >= 0 && index <= 28) {                //hvis indeksen er gyldig (0-28)
            return numberLetter[index];                 //returneres ant forekomster
        } else {                                        //hvis ikke,
            return 0;                                   //returneres 0.
        }

    }

    public java.lang.String findCommonLetter() {                   //metode for å finne den mest brukte bokstaven
        int maxOccurence = 0;                           //variabel for å holde ant
        StringBuilder common = new StringBuilder();    //lagrer bokstaven med flest forekomster
        for (int i = 0; i < 29; i++) {                    //for-løkke for å finne hvilken bokstav som har flest forekomster
            if (numberLetter[i] > maxOccurence) {        //Hvis en bokstav har flere forekomster enn tidligere, oppdateres maxOccurence og bokstaven lagres.
                maxOccurence = numberLetter[i];
                common = new StringBuilder();
                common.append((char) (i + 'a'));
            } else if (numberLetter[i] == maxOccurence && maxOccurence > 0) {
                common.append(", ").append((char) (i + 'a'));
            }
        }
        return common.toString();                       //returnerer den mest brukte bokstaven som en string


    }

    public String getText() {
        return "";
    }

}
