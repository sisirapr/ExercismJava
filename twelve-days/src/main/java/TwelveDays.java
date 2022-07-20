class TwelveDays {
    String verse(int verseNumber) {
        String verseString,day;
        String firstString="On the ";
        String secondString=" day of Christmas my true love gave to me: ";
            switch(verseNumber){
                    case 1: day="first"; break;
                    case 2: day="second"; break;
                    case 3: day="third"; break;
                    case 4: day="fourth"; break;
                    case 5: day="fifth"; break;
                    case 6: day="sixth"; break;
                    case 7: day="seventh"; break;
                    case 8: day="eighth"; break;
                    case 9: day="ninth"; break;
                    case 10: day="tenth"; break;
                    case 11: day="eleventh"; break;
                    case 12: day="twelfth"; break;
                    default: day="";
            }
            String line= firstString+day+secondString;
        for(int i=verseNumber;i>0;i--){
            switch(i){
                    case 1: verseString="a Partridge in a Pear Tree.\n"; break;
                    case 2: verseString="two Turtle Doves, and "; break;
                    case 3: verseString="three French Hens, "; break;
                    case 4: verseString="four Calling Birds, "; break;
                    case 5: verseString="five Gold Rings, "; break;
                    case 6: verseString="six Geese-a-Laying, "; break;
                    case 7: verseString="seven Swans-a-Swimming, "; break;
                    case 8: verseString="eight Maids-a-Milking, "; break;
                    case 9: verseString="nine Ladies Dancing, "; break;
                    case 10: verseString="ten Lords-a-Leaping, "; break;
                    case 11: verseString="eleven Pipers Piping, "; break;
                    case 12: verseString="twelve Drummers Drumming, "; break;
                    default: verseString="";
            }
            line = line+verseString;
        }
        return line;
    }

    String verses(int startVerse, int endVerse) {
        String versesString=verse(startVerse);
        for(int i=startVerse+1;i<=endVerse;i++){
            versesString=versesString+"\n"+verse(i);
        }
        return versesString;
    }
    
    String sing() {
        return verses(1,12);
    }
}
