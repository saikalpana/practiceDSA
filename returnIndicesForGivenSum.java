package practiceDSA;

import java.util.HashMap;
import java.util.Map;

public class returnIndicesForGivenSum {
	
	public static void main(String args[]) {
		
		int[] a = {11,2,15,7};
		int sum = 9;
		int[] indices = twoSum(a, sum);
		System.out.println(" indices are " +indices[0]+" ," +indices[1]);
		
	}

	private static int[] twoSum(int[] a, int sum) {
		 
		HashMap<Integer, Integer> hashMap = new HashMap(); // key 2, value is 0(index)
		for(int i=0; i<a.length; i++) {
			if(hashMap.containsKey(sum-a[i])) {
				hashMap.entrySet().forEach((Map.Entry map ) ->System.out.println(" map are " +map.getKey()+" ," +map.getValue()));
				return new int[]{i,hashMap.get(sum-a[i])} ;
			}
			hashMap.put(a[i], i);
		}
		
		return null;
		
	}

}
