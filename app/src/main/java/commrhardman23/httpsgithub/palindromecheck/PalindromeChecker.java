package commrhardman23.httpsgithub.palindromecheck;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class PalindromeChecker extends AppCompatActivity {

    EditText edtxtUserWord;
    TextView txtvwResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_palindrome_checker);

        edtxtUserWord = (EditText) findViewById(R.id.edtxtUserWord);
        txtvwResult = (TextView) findViewById(R.id.txtvwResult);

    }

    /**
     * palindromeCheck is the method that gets called when the user clicks the button to check
     * whether the word they entered is a palindrome. It calls a recursive method to find out
     * whether the word is a palindrome.
     * @param vw is the button that is associated with this method
     */
    public void palindromeCheck(View vw){



         String userInput=edtxtUserWord.getText().toString();
        /**
         * is Palindrome checks if the word is Palindrome or not
         * @param userinput is what word the user puts check if its true or false
         * if statements, if palindrome is true displays a message and if the world palindrome is
         *false it displays a message
         *
         *
         */
        boolean isPalindrome = checkForPalindrome(userInput, 0, false);
        if (isPalindrome==false)
        {
            txtvwResult.setText("Your word is not a Palindrome");
        }
        else
        {
            txtvwResult.setText("Your word is a Palindrome");
        }




        //Set a variable equal to the user input

        //boolean isPalindrome = checkForPalindrome(userInput, 0, false);

        //Check whether isPalindrome is true or false and print out a statement accordingly

    }

    /**
     * checkForPalindrome is a recursive method that checks for whether an inputted word is a
     * palindrome
     * @param word is the word that will be checked for whether it is a palindrome or not
     * @param index is the index currently being checked
     * @param result is whether the word is a palindrome or not
     */
    private boolean checkForPalindrome(String word, int index, boolean result){

        int indexFromEnd = word.length()-(index+1);
        /**
         * This will check  whether the character at the index is equal to the character at the
         *indexFromTheEnd
         *
         *
         *
         */
        if (word.charAt(index)==word.charAt(indexFromEnd))
        {
           if (indexFromEnd==index || indexFromEnd==(index-1))
           {
               result=true;


           }
            else
           {
               result=checkForPalindrome(word,index+1,result);
           }
        }
        else
        {
            result=false;
        }

        /**
         * Set a variable called indexFromEnd that is the corresponding index from the end that
         * matches the index that you're at (i.e. word length = 10: index = 0 then indexFromEnd = 9,
         * index = 1 then indexFromEnd = 8, etc.).
         *
         * Check whether the character at the index is equal to the character at the indexFromTheEnd.
         * If it's not, set result to false.
         *
         * If it is, check for whether the index is one less than the indexFromEnd OR index is equal
         * to indexFromEnd. If it is, then what should you set result to? If it's not, set result to
         * call your recursive method.
         *
         * The last statement of your method should be to return result
         *
         */

        return result;

    }
}
