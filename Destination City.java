/*You are given the array paths, where paths[i] = [cityAi, cityBi] means there exists a direct path going from cityAi to cityBi. Return the destination city, that is, the city without any path outgoing to another city.

It is guaranteed that the graph of paths forms a line without any loop, therefore, there will be exactly one destination city.
*/

class Solution {
    public String destCity(List<List<String>> paths) {
    HashMap<String, Integer> map = new HashMap<>();
    for (int i=0; i<paths.size(); i++){
        map.put(paths.get(i).get(0), 1);
    }
    for (int i = 0; i < paths.size(); i++){
        if (map.get(paths.get(i).get(1)) == null){
            return paths.get(i).get(1);
        }
    }
    return "";
    }
}
