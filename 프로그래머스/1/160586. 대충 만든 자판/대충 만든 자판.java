import java.util.HashMap;
import java.util.Map;
class Solution {
    public int[] solution(String[] keymap, String[] targets) {
    	int[] result = new int[targets.length];
    	HashMap<Character, Integer> key = new HashMap<>();
    	int count =0;
    	for(String keymap1 : keymap) {
    		for (int i = 0; i < keymap1.length(); i++) {
    			char character = keymap1.charAt(i);
                int currentMin = key.getOrDefault(character, Integer.MAX_VALUE);
				key.put(keymap1.charAt(i), Math.min(currentMin, i+1));
				
			}
    	}

    		for(String target : targets) {
        		for (int j = 0; j < target.length(); j++) {
        			if (key.containsKey(target.charAt(j))) {
    					result[count]+=key.get(target.charAt(j));
    					
    				}else {
    					result[count] = -1;
                        break;
    				}
    			}
        		count++;
        	}	

    	
    	
    	return result;
    }
}