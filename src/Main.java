public class Main {
    public static void main(String[] args) {
        /*
        Aufgabe 1: Wertebereich überprüfen

        Legen Sie eine Integer Variable mit einem beliebigen Wert an. Schreiben Sie nun eine boolesche Bedingung,
        die überprüft, ob der Wert der Variablen zwischen 1 und 10 (jeweils exklusive) liegt. Geben Sie den booleschen
        Wert auf der Konsole aus.

        Schreiben Sie anschließend eine weitere Bedingung, die überprüft, ob der Wert der Variablen zwischen 1 und 10 –
        aber diesmal inklusive der beiden Grenzen – liegt. Geben Sie auch hier den booleschen Wert auf der Konsole aus.
        Testen Sie Ihr Programm mit unterschiedlichen Werten, z.B. 0, 1, 2, 9, 10, 11, -5, 1000, ...
        */

         /*
        jeweils inklusive: die Variable darf die Randwerte 1 bzw. 10 nicht annehmen.
        Es ist also nicht richtig, auf "größer gleich" bzw. auf "kleiner gleich" zu prüfen.
        Es muss auf "größer" bzw. auf "kleiner" geprüft werden. Das Gegenteil gilt für jeweils inklusive!
        */

        int num = 1;

        boolean test = num > 1 && num < 10;

        System.out.println(test);

        boolean test2 = num >= 1 || num <= 10;
        System.out.println(test2);

        /*
        Aufgabe 2: Boolesche Bedingungen auswerten

        Gegeben sind die booleschen Variablen a, b und c mit den unten gezeigten Wahrheitswerten. Werten Sie die
        booleschen Ausdrücke in der Tabelle im Kopf aus und notieren Sie Ihr Ergebnis. Überprüfen Sie Ihr Ergebnis
        anschließend in IntelliJ.
        • a = true
        • b = false
        • c = true
        */

        boolean a,b,c;
        a = true;
        b = false;
        c = true;

        System.out.println();

        boolean eins = a && b && c;
        System.out.println(eins);
        boolean zwei = (a && b) || c;
        System.out.println(zwei);
        boolean drei = (a && b) || (a && c);
        System.out.println(drei);
        boolean vier = a && !b && !c;
        System.out.println(vier);
        boolean fünf = a && (b || c);
        System.out.println(fünf);
        boolean sechs = (!a && !b) || (!b && c);
        System.out.println(sechs);
        boolean sieben = (!a || !b) && (!b || !c);
        System.out.println(sieben);

        System.out.println();

        /*
        Aufgabe 3: Boolesche Bedingungen formulieren

        Legen Sie Variablen für die folgenden Werte für den Kauf eines Computers an:

        • Ist der Computer gebraucht (Boolean)
        • Hauptspeicher (in GB, Byte)
        • Preis (Integer oder Float)
        • Handelt es sich um ein Black Friday Angebot (Boolean)

        Formulieren Sie nun die zusammengesetzte Bedingung, die folgendes ausdrückt: ich kaufe den Computer, wenn er
        nicht gebraucht ist, ausreichend Hauptspeicher (d.h. mindestens 8 GB) hat und nicht mehr als 1000 EUR kostet
        oder wenn es sich um ein Black Friday Angebot handelt und der Computer nicht mehr als 1250 EUR kostet. Auch in
        diesem Fall darf der Computer nicht gebraucht sein.
        */

        boolean nichtGebraucht = true;
        byte hauptspeicher = 8;
        int preis = 1000;
        boolean blackFriday = false;

        boolean kaufen = (nichtGebraucht && hauptspeicher >= 8 && preis <= 1000 || blackFriday && preis <= 1250 && nichtGebraucht);
        System.out.println(kaufen);
        System.out.println();

        /*
        Aufgabe 4: Verknüpfen von Zeichenketten
        Erstellen Sie zwei String und eine Float Variable und verknüpfen Sie diese zu einem einzelnen String.
        Geben Sie den Ergebnisstring dann auf der Konsole aus. Die Ausgabe könnte wie folgt aussehen:

        Der Computer kostet 1234.56 Euro.
        */

        String textEins,textZwei;
        float zahl;

        textEins = "Der Computer kostet ";
        zahl = 1234.56f;
        textZwei = " Euro.";

        System.out.println(textEins + zahl + textZwei);

        System.out.println();

        /*
        Aufgabe 5: Wo in Österreich ...
        Gegeben sind drei String Variablen mit den Werten Upper, Lower und Austria. Verwenden Sie String Funktionen,
        um Variablen mit den folgenden Werten zu erstellen: UPPER AUSTRIA und lower austria. Geben Sie die Werte
        der Variablen auf der Konsole aus.
        */

        String text1, text2, text3;

        text1 = "Upper";
        text2 = "Lower";
        text3 = "Austria";

        System.out.println(text1.toUpperCase() + " " + text3.toUpperCase());
        System.out.println(text2.toLowerCase() + " " + text3.toLowerCase());

        System.out.println();

        /*
        Aufgabe 6: Wo im String ...
        Gegeben ist eine String Variable mit dem Wert HTL Wien West. Finden Sie nun die Position des ersten Vorkommens
        für folgende Buchstaben: W, e, H, T, t, f, h. Geben Sie das Ergebnis auf der Konsole wie folgt aus:
        Der Buchstabe ... kommt im String an Position ... vor.
        Stellen Sie (für sich) sicher, dass Sie die Ergebnisse bzw. die Ausgabe für alle Buchstaben verstehen.
        */

        String name = "HTL Wien West";

        String findeW = "W";
        System.out.println("Der Buchstabe " + findeW + " kommt im String an Position " + name.indexOf(findeW));
        String findee = "e";
        System.out.println("Der Buchstabe " + findee + " kommt im String an Position " + name.indexOf(findee));
        String findeH = "H";
        System.out.println("Der Buchstabe " + findeH + " kommt im String an Position " + name.indexOf(findeH));
        String findeT = "T";
        System.out.println("Der Buchstabe " + findeT + " kommt im String an Position " + name.indexOf(findeT));
        String findet = "t";
        System.out.println("Der Buchstabe " + findet + " kommt im String an Position " + name.indexOf(findet));
        String findef = "f";
        System.out.println("Der Buchstabe " + findef + " kommt im String an Position " + name.indexOf(findef));
        String findeh = "h";
        System.out.println("Der Buchstabe " + findeh + " kommt im String an Position " + name.indexOf(findeh));

        System.out.println();

        /*
        Aufgabe 7: Fehlerkorrektur

        Ersetzen Sie im String HTL Wyen Wäst alle y durch i und alle ä durch e.
        Geben Sie das Ergebnis auf der Konsole aus.

        */

        String nameZwei = "HTL Wyen Wäst";

        String str1 = nameZwei.replace('y', 'i');
        String str2 = str1.replace('ä', 'e');

        System.out.println(str2);

        System.out.println();

        /*
        Aufgabe 8: Leer oder nicht
        Überlegen Sie sich zwei Arten wie Sie überprüfen können, ob der Wert einer String Variablen ein Leerstring ist. Legen
        Sie für jede der beiden Arten eine boolesche Variable an und geben Sie die Ergebnisse auf der Konsole aus. Testen
        Sie Ihr Programm mit den Strings "HTL Wien West", "", " ", " " und null.
        */

        String s1 = "HTL Wien West";
        String s2 = "";
        String s3 = " ";
        String s4 = null;

        boolean isEmpty = s1.isEmpty();
        System.out.println(isEmpty);
        isEmpty = s2.isEmpty();
        System.out.println(isEmpty);
        isEmpty = s3.isEmpty();
        System.out.println(isEmpty);
        //isEmpty = s4.isEmpty(); //Since s4 is null, NullPointerException will arise every time I use it until I initialize it.
        //System.out.println(isEmpty);

        System.out.println();

        /*
        Aufgabe 9: Anfang und Ende
        Gegeben ist ein beliebiger String (z.B. HTL Wien West). Legen Sie zwei boolesche Variablen an, die angeben ob der
        gegebene String mit HTL beginnt bzw. mit einem Satzzeichen (d.h. Punkt, Rufzeichen, Fragezeichen) endet. Geben
        Sie die Werte für die beiden Variablen auf der Konsole aus und testen Sie ihr Programm mit unterschiedlichen Werten.

        Zusatz: was passiert, wenn Ihr String mit einem (oder mehreren) Leerzeichen endet? Was können Sie tun, um
        Leerzeichen am Anfang und/oder Ende zu ignorieren?
        */

        String word = "      HTL Wien West  ";
        boolean startsWith = word.startsWith("HTL");
        boolean endsWith = word.endsWith(".") || word.endsWith("!") || word.endsWith("?");

        System.out.println(startsWith);
        System.out.println(endsWith);

        //Zusatz

        String zusatz = word.stripLeading();
        String zusatz2 = zusatz.stripTrailing();
        System.out.println(zusatz2);

        System.out.println();

        /*
        Aufgabe 10: Aus zwei mach eins
        Gegeben sind die Strings Donaubrücke und Dampfschiff. Ausgegeben werden soll Donauschiff.
        */

        String donaubruecke = "Donaubrücke";
        String dampfschiff = "Dampfschiff";

        String ersetzen = donaubruecke.replace("brücke", "schiff");
        System.out.println(ersetzen);

        System.out.println();

        /*
        Aufgabe 11: Begrüßung 2.0
        Gegeben ist eine String Variable mit einem beliebigen Namen, z.B. Albert Einstein. Erstellen Sie ein Programm,
        das nun eine personalisierte Begrüßung erzeugt, die wie folgt aussieht. Insbesondere ist die Anzahl der benötigten
        Sternchen natürlich nicht fix, sondern hängt vom Wert der String Variablen ab. Wenn Sie den Wert ändern, z.B. auf
        Linus Torvalds, muss Ihr Programm noch immer richtig funktionieren. Die Ausgabe soll wie folgt aussehen:

        *******************************************
        ** Herzlich willkommen, Albert Einstein! **
        *******************************************

        */

        String greeting = "** Herzlich Willkommen, ";
        String person = "Mervan Polat! **";
        System.out.print("*".repeat(greeting.length()));
        System.out.print("*".repeat(person.length()));
        System.out.println();
        System.out.println(greeting+person);
        System.out.print("*".repeat(greeting.length()));
        System.out.print("*".repeat(person.length()));

        System.out.println();
    }
}