public class TextProcessing {
    private String text;                    // privat variabel text

    public TextProcessing(String text) {            //konstruktør, text som argument
        this.text = text;                           //lagrer i text variabelen
    }

    public int wordCount() {                            //metode som returnerer ant ord i teksten
        String[] words = text.split("[^a-zA-ZæøåÆØÅ]+"); //deler opp teksten vha regex, splitter teksten på alle ikke-alfabetiske tegn
        int wordCount = 0;                              //variabel wordcount som holder styr på ant ord

        for (String word : words) {                 //looper gjennom hele tekster, og øker sordcount om den inneholder ord
            if (!word.trim().isEmpty()) {
                wordCount++;
            }
        }
        return wordCount;                       //returnerer ant ord
    }

    public double averageWordLength() {             //metode beregne og returnere gj.snitt ordlengde
        String[] words = text.split("[^a-zA-ZæøåÆØÅ]+");     //splitte igjen vha regex
        int totalLength = 0;                        //variabel, holde styr på total lengde på ord
        int wordCount = 0;                          // variabel, telle ant ord

        for (String word : words) {                 //looper gjennom ordene og legger til lengden av hvert ord ++ wordcount
            if (!word.trim().isEmpty()) {
                totalLength += word.length();
                wordCount++;
            }
        }

        return wordCount > 0 ? (double) totalLength / wordCount : 0;    //returnerer gj.snitt ordlenge totalLength/wordCount
    }

    public double averageWordsPerSentence() {           //metode, beregne gj.snitt ant ord pr setning
        String[] sentences = text.split("[.!?:]");      //splitte tekst ved skilletegn
        int totalWordCount = wordCount();                 //brukuer wordcount for å få det totale ant ord

        int validSentences = 0;                     //teller hvor mange gyldige setninger, ved å sjekke at de ikke er tomme
        for (String sentence : sentences) {
            if (!sentence.trim().isEmpty()) {
                validSentences++;
            }
        }
                                            //returnerer gj.snitt ant ord pr setning.
        return validSentences > 0 ? (double) totalWordCount / validSentences : 0;
    }

    public void replaceWord(String oldWord, String newWord) {   //metode for å bytte ord vha replace()
        text = text.replace(oldWord, newWord);
    }

    public String getText() {   //metode returnere teksten
        return text;
    }

    public String getTextInUpperCase() {    //metode returnere teksten i store bokstaver
        return text.toUpperCase();
    }
}


