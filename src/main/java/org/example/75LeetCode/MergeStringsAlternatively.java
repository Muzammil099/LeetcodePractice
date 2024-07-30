class Solution {
    public String mergeAlternately(String word1, String word2) {

        //using string builder for creating mutable string
        StringBuilder temp = new StringBuilder("");
        int len1 = word1.length();
        int len2 = word2.length();
        int len = Math.min(len1 , len2);
        for(int i = 0 ; i < len ; i++){
            temp.append(word1.charAt(i)); 
            temp.append(word2.charAt(i));
        }

        //append last substring of either word1 or 2 based on their length
        return (len1 > len2) ? temp.append(word1.substring(len)).toString() : temp.append(word2.substring(len)).toString();
    }
}