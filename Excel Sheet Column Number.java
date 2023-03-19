/*Given a string columnTitle that represents the column title as appears in an Excel sheet, return its corresponding column number.

For example:

A -> 1
B -> 2
C -> 3
...
Z -> 26
AA -> 27
AB -> 28 
...
*/
class Solution {
    public int titleToNumber(String columnTitle) {
        int sum = 0;
        for(char ch : columnTitle.toCharArray()) {
            int diff = ch-('A' - 1);
            sum = sum *26 + diff;
        }
        return sum;
    }
}
