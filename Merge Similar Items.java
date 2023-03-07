/*You are given two 2D integer arrays, items1 and items2, representing two sets of items. Each array items has the following properties:

items[i] = [valuei, weighti] where valuei represents the value and weighti represents the weight of the ith item.
The value of each item in items is unique.
Return a 2D integer array ret where ret[i] = [valuei, weighti], with weighti being the sum of weights of all items with value valuei.

Note: ret should be returned in ascending order by value
*/
class Solution {
    public void mergeMap(int [][]items,Map<Integer,Integer>map){
        for(int[]item:items){
            int val=item[0];
            int weight=item[1];
            map.put(val,map.getOrDefault(val,0)+weight);
        }
    }
    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        List<List<Integer>> ans=new ArrayList<>();
        Map<Integer,Integer>map=new TreeMap<>();
        mergeMap(items1,map);
        mergeMap(items2,map);
        for(Integer val: map.keySet()){
            List<Integer> temp=new ArrayList<>();
            temp.add(val);
            temp.add(map.get(val));
            ans.add(temp);
        }
        return ans;
    }
}
