public class Matrix {       //oppretter klasse Matrix
    private int[][] elements;   //2D-array som lagrer matrisens elementer

    public Matrix(int[][] elements) {                                           //konstruktør som tar 2D-array som parameter for å lage en ny matrise.
        if (elements == null || elements.length == 0 || elements[0].length == 0) {  //sjekker om innsendt arrat er 0.
            throw new IllegalArgumentException("Matrise dimensjonene kan ikke være 0."); //kaster illegalArgumentException hvis det er tilfelle
        }

        this.elements = new int[elements.length] [elements[0].length];  //oppretter nytt 2D-array, med samme dimensjoner
        for(int i = 0; i < elements.length; i++) {                      //kopierer hver rad av det innsendte arrayet,
            this.elements[i] = elements[i].clone();                       // til det nye elements.arrayet.
        }
    }

    public Matrix add(Matrix other) {                                               //metode for å legge sammen to matriser.
        if (other == null || this.elements.length != other.elements.length || this.elements[0].length != other.elements[0].length) {    //sjekker om andre matrisen er null ++
            return null;                                                                //returnerer evt. null
        }
        int[][] result = new int[this.elements.length][this.elements[0].length]; //oppretter nytt 2D-array kalt result, med samme dimensjoner som this.elements
        for (int i = 0; i < this.elements.length; i++) {                        //for-løkke, som itererer alle radene i matrisen
            for (int j = 0; j < this.elements[i].length; j++) {                //for-løkke som itererer alle kolonnene i matrisen
                result[i][j] = this.elements[i][j] + other.elements[i][j];    //legger sammen, og lagrer i result
            }
        }
        return new Matrix(result);                                              //oppretter og returnerer en ny matrise, som er resultatet
    }


    public Matrix multiply(Matrix other) {                                          //metode for å multiplisere
        if (other == null || this.elements[0].length != other.elements.length) {   //sjekker om other er null og om den samsvarer
            return null;                                                            //returnerer evt. null
        }
        int[][] result = new int[this.elements.length][other.elements[0].length];     //oppretter ny matrise result som lagrer multiplikasjonen
        for (int i = 0; i < this.elements.length; i++) {                            //for-løkke som itererer gjennom radene
            for (int j = 0; j < other.elements[0].length; j++) {                    //for løkke som itererer gjennom kolonnene
                for (int k = 0; k < this.elements[0].length; k++) {                 //for-løkke som går gjennom elementene som skal multipliseres mellom radene this og kolonnene other.
                    result[i][j] += this.elements[i][k] * other.elements[k][j];     //utfører multiplikasjon og summering.
                }
            }
        }
        return new Matrix(result);                                                   //oppretter og returnerer ny matrise med resultatet.
    }


    public Matrix transpose() {                                                     //metode for å transponere matrisen
        int[][] result = new int[this.elements[0].length][this.elements.length];    //oppretter ny matrise for å lagre den transponerte matrisen
        for(int i = 0; i < this.elements[0].length; i++) {                           //itererer gjennom kolonnene i den originale matrisen
            for(int j = 0; j < this.elements.length; j++) {                          //itererer gjenomm radene i den originale matrisen.
                result[j][i] = this.elements[i][j];                                   //bytter plass på elementene.
            }
        }

        return new Matrix(result);                                                      //returnerer ny matrise med resultatet.
    }

    public int[][] getElements() {                                                      //metode for å returnere matrisens interne 2D-array
        return elements;                                                                //returnerer elements
    }
}
