import java.util.regex.Pattern;
class Solution {
    public boolean detectCapitalUse(String word) {
        
        Pattern allCaps = Pattern.compile("([A-Z]+)");
        Pattern allSmall = Pattern.compile("[a-z]+");
        Pattern firstCaps = Pattern.compile("^[A-Z]{1}[a-z]+$");
        
        return allCaps.matcher(word).matches() || allSmall.matcher(word).matches() 
            || firstCaps.matcher(word).matches();
        
    }
}