package studypresentation;

public class RemoveVowel {

}

class Solution {
    public String solution(String my_string) {
       
    	my_string = my_string.replaceAll("a", "");
        my_string = my_string.replaceAll("e", "");
        my_string = my_string.replaceAll("i", "");
        my_string = my_string.replaceAll("o", "");
        my_string = my_string.replaceAll("u", "");
        
        return my_string;
    }
}

class Solution2 {
    public String solution(String my_string) {
        return my_string.replaceAll("[aeiou]", "");
    }
}