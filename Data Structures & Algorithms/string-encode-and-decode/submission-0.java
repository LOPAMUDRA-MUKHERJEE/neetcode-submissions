class Solution {
    
    // Encodes a list of strings to a single string.
    public String encode(List<String> strs) {
        StringBuilder encodedString = new StringBuilder();
        for (String s : strs) {
            encodedString.append(s.length()).append('#').append(s);
        }
        return encodedString.toString();
    }

    // Decodes a single string to a list of strings.
    public List<String> decode(String str) {
        List<String> decodedStrings = new ArrayList<>();
        int i = 0;
        
        while (i < str.length()) {
            int j = i;
            // Find the delimiter '#' to get the length of the next string
            while (str.charAt(j) != '#') {
                j++;
            }
            
            // Extract the length
            int length = Integer.parseInt(str.substring(i, j));
            
            // Extract the string itself and add to the list
            i = j + 1; 
            decodedStrings.add(str.substring(i, i + length));
            
            // Move the pointer to the start of the next encoded string
            i = i + length;
        }
        
        return decodedStrings;
    }
}