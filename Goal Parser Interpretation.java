/*You own a Goal Parser that can interpret a string command. The command consists of an alphabet of "G", "()" and/or "(al)" in some order. The Goal Parser will interpret "G" as the string "G", "()" as the string "o", and "(al)" as the string "al". The interpreted strings are then concatenated in the original order.

Given the string command, return the Goal Parser's interpretation of command.
*/

class Solution {
    public String interpret(String command) {
        String newString = "";
        for(int i = 0; i < command.length(); i++){
            if(command.charAt(i) == '(' && command.charAt(i + 1) == ')'){
                newString += "o";
                i += 1;
            }else if(command.charAt(i) == 'G'){
                    newString += "G";
            }else{
                newString+= "al";
                i += 3;
            }
        }
        return newString;
    }
}
