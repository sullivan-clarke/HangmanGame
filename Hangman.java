/* Program Name: Hangman Program
 * Description: This program allows two users the play 
 * a game of hangman as many times as they would like. 
 */
package ProjectsCS101;
import java.util.Scanner;
import java.util.ArrayList;

/*
 * The instance variables are declared in order to be used throughout the program 
 * Some are declared as static in order to to allow them to obe utilized throughout the entire class itself
 */
public class Hangman {
    private static int limbsRemaining = 10;
    private StringBuilder word;
    private static boolean running = true;
    private static boolean playing = true;
    
    private static ArrayList<Character> AlphabetList = new ArrayList<Character>();
    private static char[] abc = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k','l', 'm', 'n',
                                'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};  
    
    //Constructor, used to create a word object that the methods can be called on
    public Hangman(StringBuilder word) {
        this.word = word;
    }
    
    /*
     * The checkLetter method applies a for loop in order to traverse through player 1's chosen word
     * and set the blanks to the specific letters that are found
     */
    public boolean checkLetter(char word, ArrayList<Character> list ) {
        boolean found = false;
        for (int i = 0; i < this.word.length(); i++){
            if (word == this.word.charAt(i)) {
                list.set(i, word);
                found = true;
            }    
        } return found;
    }

    //The remaining method is used to convey how many limbs are remaining
    public static void remaining() {
        System.out.println(limbsRemaining + " limbs remaining.");
    }

    //The dashPrint method uses a for loop to traverse through the array list of blanks and print them out to the user
    public void dashPrint(ArrayList<Character> list) {
        System.out.println();
        for (char c: list) {
            System.out.print(c + " ");
        }
        System.out.println();
    } 

    //The dashAdd method adds a blank to the array list in order to match the length of player 1's chosen word
    public void dashAdd(ArrayList<Character> list) {
        for (int i = 0; i < this.word.length(); i++) {
            list.add('_');
        }
    }

    //The lettersGuessed method prints the letters that player 2 has guessed using a for loop
    public void lettersGuessed(ArrayList<Character> list) {
        System.out.print("Letters guessed: ");
        for (char i: list) {
            System.out.print(i + " ");
        }
    }

    //The space method simply prints 25 blank lines in order to hide player 1's word
    public static void space() {
        String line = " ";
        for (int i = 0; i < 25; i++) {
            System.out.println(line);
        }
    }

    /*
     * The checkWin method is called after each iteration of the loop
     * Conditonals and a for loop are used in order to check if either player has won
     */
    public void checkWin(ArrayList<Character> list) {
        if (limbsRemaining == 0) {
            playing = false;
            System.out.println("Player 1 Wins!");
        }
        int counter = 0;
        for (int i = 0; i < this.word.length(); i++) {
            if (list.get(i) == this.word.charAt(i)) {
                counter++;
            }
        }
        if (counter == this.word.length()) {
            playing = false;
            for (int i = 0; i < this.word.length(); i++) {
                System.out.print(this.word.charAt(i) + " ");
            };
            System.out.println();
            System.out.println("Player 2 Wins!");
        }
    }

    //The reset method clears the existing array lists in order for the game to be played multiple times
    public void reset(ArrayList<Character> list1, ArrayList<Character> list2, StringBuilder word) {
        list1.clear();
        list2.clear(); 
        limbsRemaining = 10;
        playing = true;
        word.setLength(0);
    }

    public static void alphabetize() {
        for (int i = 0; i < abc.length; i++) {
            AlphabetList.add(abc[i]);
        }
    }

    
    
    public static void main(String[] args) {
        //The necessary variables are declared and the scanner is initialized
        char play2Letter;
        Scanner s = new Scanner(System.in);
        ArrayList<Character> guessedLetters = new ArrayList<Character>();
        ArrayList<Character> dashes = new ArrayList<Character>();
        alphabetize();

         //An outer do while loop is utilized in order control the program flow and if another round will be played
        do {
            System.out.print("Player 1, enter a word: ");
            String initialInput = s.next();
            String word = " ";

            if (initialInput.matches("[a-zA-z]+")) {
                word = initialInput;
            } else 
                while (!(initialInput.matches("[a-zA-Z]+"))) {
                System.out.print("Please enter a valid word: ");
                String tempWord2 = s.next().toLowerCase();
                if (tempWord2.matches("[a-zA-Z]+")) {
                    word = tempWord2;
                    break;
                } else continue;
            }

            word.toLowerCase();
            StringBuilder tarWord = new StringBuilder(word);
            Hangman play1Word = new Hangman(tarWord);
            space();
            play1Word.dashAdd(dashes);
        
            /*
            * An inner do while loop is used to control the game itself
            * and allows player 2 to be prompted to guess letters until a winner is declared
            */
            while (playing) {
                remaining(); 
                play1Word.lettersGuessed(guessedLetters);
                play1Word.dashPrint(dashes);
                System.out.print("Player 2, guess a letter: ");
                play2Letter = Character.toLowerCase(s.next().charAt(0));

                while (!AlphabetList.contains(play2Letter)) {
                    System.out.print("Please enter a letter: ");
                    char tempInput = s.next().charAt(0);
                    if (AlphabetList.contains(tempInput)) {
                        play2Letter = tempInput;
                        break;
                    } else continue;
                }
                if ((guessedLetters.contains(play2Letter))) {
                    System.out.println("You already guessed that letter.");
                    
                }
    
                if (!(guessedLetters.contains(play2Letter))) {
                    guessedLetters.add(play2Letter);
                    if (play1Word.checkLetter(play2Letter, dashes)) {
                    
                    } else 
                    limbsRemaining--;
                    play1Word.checkWin(dashes);
                } 
            }

            /*
            * The final conditional uses user intput and conditionals in order for the game to be played
            * as many times as the user would like 
            */
            System.out.print("Play again (y/n)? ");
            String input;
            while (true) {
                input = s.next().toLowerCase();
                if (input.equals("y")) {
                    play1Word.reset(dashes, guessedLetters, tarWord);
                    break;
                }  if (input.equals("n")) {
                    running = false;
                    s.close();
                    break;
                } else {
                    System.out.print("Please enter (y/n): ");
                }
                    
            } 

    
        } while (running);
    } 
    
}
