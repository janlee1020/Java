// Janet Lee
// HW3
public class WordGuess {
    public static String makeUserWord(String theWord){
//Takes the word the player is trying to guess and generates a pattern of '*' values to
//represent letters that have not yet been guessed. For example, if the word were "dog" this
//method would return "***".
      String userWord= "";
      for (int i=0; i < theWord.length(); i++) {
        userWord=userWord + "*";
      }
      return userWord;
          
    }
    public static boolean isInWord(char guess, String theWord){
//Returns true if the guessed character is in the word, false otherwise. For example, if the
//guess were 'x' and the word were "xylophone" this method would return true.
      boolean found = false;
      for (int i=0; i < theWord.length(); i++) {
         if (guess == theWord.charAt(i)) {
           found=true;
         }
      }
      return found;
    }
           
        
    public static String updateUserWord(char guess, String userWord, String theWord){
//Returns a userWord with all occurrences of '*' corresponding to the current guess replaced
//with that guess. For example, if the word was "fetch" and the user word was "****h" and the
//user guessed 'e', the return string would be "*e**h".
      String update = "";
      for (int i=0; i < theWord.length(); i++) {
        if (theWord.charAt(i)==guess) {
          update= update + guess;
        }

        else {
          update = update + userWord.charAt(i);
        }
      }
      return update; 
    }

    public static String updateGuesses(String guesses, char guess){
//Updates the list of guesses with the current guess. The update should only add the guess if
//it does not already exist in the list. The new guess must be placed at the end of the existing
//list of guesses. For example, if guesses were "tabg" and the current guess were 'f', this
//method would return "tabgf".
      if (isInWord(guess, guesses)==false) {
        guesses = guesses + guess + " ";
      }
      return guesses;
    }
    public static String displayUserWord(String userWord){
//Returns a String that is the userWord with spaces between each letter and each '*'
//replaced with an '_'. For example, if the userWord is "fe***" this method would return "f e _
//_ _". Note that there is no space before the 'f' and after the last '_'.
      String space = "";
      for (int i=0; i < userWord.length(); i++) {
         if (userWord.charAt(i) == '*')
         {
           space = space + " _ ";
         }
         else {
           space = space + userWord.charAt(i);
         }
      }
      return space;
    }
             
    public static String displayGuesses(int strikes, String guesses){
//Returns a String in the form "Strikes: %d\tGuesses: %s", with the list of guesses separated
//by spaces. For example, if there were 3 strikes and guesses were "bcd", this method would
//return"Strikes: 3\tGuesses: b c d".
      return String.format("Strikes: %d \t Guesses: %s", strikes, guesses);
    }
}
        
       
    
    
    