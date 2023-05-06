/*Given a characters array tasks, representing the tasks a CPU needs to do, where each letter represents a different task. Tasks could be done in any order. Each task is done in one unit of time. For each unit of time, the CPU could complete either one task or just be idle.

However, there is a non-negative integer n that represents the cooldown period between two same tasks (the same letter in the array), that is that there must be at least n units of time between any two same tasks.

Return the least number of units of times that the CPU will take to finish all the given tasks.
*/
class Solution {
    public int leastInterval(char[] tasks, int n) {
        int [] freq=new int[26];
        for(int t:tasks){
            freq[t - 'A']++;
        }
        Arrays.sort(freq);
        int max=freq[25];
        int idleTime=(max-1)*n;
        for(int i=freq.length-2;i>=0 && idleTime>0;--i){
            idleTime=idleTime-Math.min(max-1,freq[i]);
        }
        idleTime=Math.max(0,idleTime);
        return idleTime > 0 ? idleTime + tasks.length : tasks.length;
    }
}
