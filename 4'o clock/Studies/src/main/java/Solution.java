import java.util.HashMap;
import java.util.Map;

class Solution {
    public static int minSteps(String s, String t) {
        Map<Character, Integer> smp = new HashMap<Character, Integer>();
        Map<Character, Integer> tmp = new HashMap<Character, Integer>();
        int cnt = 0;

        for (char a : s.toCharArray()) {
            smp.put(a, smp.getOrDefault(a, 0) + 1);
            System.out.println(smp);
            
        }

        for (char a : t.toCharArray()) {
            tmp.put(a, tmp.getOrDefault(a, 0) + 1);
            System.out.println(tmp);
        }

        for (Map.Entry<Character, Integer> entry : smp.entrySet()) {
            char key = entry.getKey();
            if (tmp.containsKey(key)) {
                if (entry.getValue().equals(tmp.get(key))) {
                    cnt += entry.getValue();
                } else {
                    cnt += Math.min(entry.getValue(), tmp.get(key));
                }
            }
        }

        return s.length() - cnt;
    }
    public static void main(String[] args) {
		int i = minSteps("Chethan", "Ramesha");
		System.out.println(i);
	}
}
