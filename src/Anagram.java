import java.util.Objects;

public class Anagram {
        public static boolean Anagram(String wordToCheck) {
            // .sort kan give alfabetisk rækkefølge
            String[] convertedWord = wordToCheck.split("");
            for (int i = 1; i < convertedWord.length ; i++) {
                String currentChar = convertedWord[i];
                String previousChar = convertedWord[i-1];

                    String alphabet = "a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,x,y,z,æ,ø,å";
                    String[] newAlphabet = alphabet.split(",");

                for (int j = 1; j <newAlphabet.length ; j++) {
                    String charInAlphabet = newAlphabet[j];
                    String previousInAlphabet = newAlphabet[j-1];

                    if(Objects.equals(charInAlphabet, currentChar) && Objects.equals(previousInAlphabet, previousChar)){

                        System.out.println("Two of the characters are after eachother in the alphabet");
                        return true;
                    }

                    }
            }
            return false;
        }

}
