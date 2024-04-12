package Stringesercizi;
/*Scrivi un programma Java che abbia un metodo che prenda due stringHe e le compari lessico-graficamente.
* Il metodo dovrà restituire "Le due stringhe sono uguali" o "Le due stringhe sono differenti" basandosi sul risultato
*  del confronto.  * Per la creazione della stringa di risultato dovrebbe essere utilizzato StringBuilder.
 */
public class tutorex {
    public static void main(String[] args) {

        String assegna1 = "wewe";
        String assegna2 ="wewe";
        System.out.println(confrontoStringhe(assegna1,assegna2));

    }
    public static String confrontoStringhe(String string1 , String string2){
       int confronto = string1.compareTo(string2);
       StringBuilder stringBuild = new StringBuilder().append("le due stringhe sono :");
       if (confronto == 0){
           stringBuild.append("uguali");
       }else{
           stringBuild.append("diverse");
       }
       return stringBuild.toString();
    }


}
