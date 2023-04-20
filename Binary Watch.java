/*A binary watch has 4 LEDs on the top to represent the hours (0-11), and 6 LEDs on the bottom to represent the minutes (0-59). Each LED represents a zero or one, with the least significant bit on the right.

For example, the below binary watch reads "4:51".
Given an integer turnedOn which represents the number of LEDs that are currently on (ignoring the PM), return all possible times the watch could represent. You may return the answer in any order.

The hour must not contain a leading zero.

For example, "01:00" is not valid. It should be "1:00".
The minute must be consist of two digits and may contain a leading zero.

For example, "10:2" is not valid. It should be "10:02".
 
*/
class Solution {
    public List<String> readBinaryWatch(int turnedOn) {
        ArrayList<String> result=new ArrayList<>();
        for (int hour=0; hour<12; hour++) {
            for (int min=0; min<60; min++) {
                if (Integer.bitCount(hour) + Integer.bitCount(min) == turnedOn){
                    if(min<10) {
                        result.add(String.format("%d:0%d", hour, min));
                    }
                    else{
                        result.add(String.format("%d:%d", hour, min));
                    }
                }
            }
        }
        return result;
    }
}
