import java.util.*;

public class Test5 {
    public boolean isPossible(int n, List<List<Integer>> edges) {
        Map<Integer, Integer> graphs = new HashMap<>();
        for (int i = 0; i<edges.size(); i++) {
            int p = edges.get(i).get(0);
            int v = edges.get(i).get(1);
            if (graphs.containsKey(p)) {
                graphs.put(p, graphs.get(p)+1);
            } else {
                graphs.put(p, 1);
            }
            if (graphs.containsKey(v)) {
                graphs.put(v, graphs.get(v)-1);
            } else {
                graphs.put(v, -1);
            }
        }
        Iterator<Integer> iterator = graphs.keySet().iterator();
        Set<List<Integer>> remains = new HashSet<>();
        while (iterator.hasNext()) {
            Integer node = iterator.next();
            if (graphs.get(node)<0) {
                for (List<Integer> edge : edges) {
                    if (edge.get(1).equals(node)) {
                        remains.add(edge);
                    }
                }
            }
            if (graphs.get(node)>0) {
                for (List<Integer> edge : edges) {
                    if (edge.get(0).equals(node)) {
                        remains.add(edge);
                    }
                }
            }
        }
        List<List<Integer>> list = new ArrayList<>(remains);
        int size = remains.size();
        int count = 2;
        for (int i = 0; i<remains.size()-1; i++) {
            for (int j = i+1; j<remains.size(); j++) {
                if (count == 0) {
                    break;
                }
                List<Integer> tmp = new ArrayList<>();
                tmp.add(list.get(i).get(0));
                tmp.add(list.get(j).get(0));
                if (!list.contains(tmp)) {
                    size -= 2;
                    list.add(tmp);
                    count--;
                }
            }
        }
        return size<=0;
    }

    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(2);
        List<Integer> b = new ArrayList<>();
        b.add(3);
        b.add(4);
/*        List<Integer> c = new ArrayList<>();
        c.add(1);
        c.add(4);*/
        List<List<Integer>> list = new ArrayList<>();
        list.add(a);
        list.add(b);
        //list.add(c);
        System.out.println(new Test5().isPossible(2, list));
    }
}
