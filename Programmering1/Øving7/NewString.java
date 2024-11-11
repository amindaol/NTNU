public class NewString {
    private final String text;      //privat konstant variabel text

    public NewString(String text) {     //konstrkuktør som tar en tekst som argument, setter den til text
        this.text = text;
    }

    public String shorten() {       //metode forkorte teksten
        String[] words = text.split(" ");   //deler ved å bruke mellomrom som separator
        StringBuilder shortened = new StringBuilder();  //stringbuilder for å bygge den forkortede versjonen effektivt
        for (String word : words) {             //looper gjennom hvert ord i den splittede teksten, sjekker om de er tomme
            if (!word.isEmpty()) {
                shortened.append(word.charAt(0));   //legger til den første bokstaven i hvert ord til shortened strengen
            }
        }
        return shortened.toString();        //returnerer den forkortede teksten
    }

    public String removeCharacter(char toRemove) {  //metode som fjerner en gitt karakter
        StringBuilder result = new StringBuilder(); //stringbuilder for å bygge resultatet med de gjenværende karakterene
        for (int i = 0; i < text.length(); i++) {   //looper gjennom hver karakter vha indeks og henter hver karakter
            char currentChar = text.charAt(i);
            if (currentChar != toRemove) {  //hvis karakteren ikke er den som skal fjernes, legges den til result
                result.append(currentChar);
            }
        }
        return result.toString();   //returnerer den nye teksten uten den gitte karakteren
    }

    public String getText() {   //metode returnerer den opprinnelige teksten uten endringer
        return text;
    }
}

