package Arrays;

import java.util.*;

public class FindDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={1, 6, 5, 2, 3, 3, 2};
//		int n= arr.length;
//		ArrayList<Integer>dup=new ArrayList<Integer>();
//		for(int i=0;i<n;i++) {
//			for(int j=i+1;j<n;j++) {
//				if(arr[i]==arr[j]) {
//					dup.add(arr[i]);
//				}
//			}
//		}
//		System.out.println(dup);//o(n*n)
		
		Map<Integer, Integer> freqMap = new HashMap<>();
        List<Integer> result = new ArrayList<>();
        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            if (entry.getValue() > 1) {
                result.add(entry.getKey());
            }
        }

        // Print the list of duplicates
        System.out.println("Duplicates: " + result);//o(n)
	}

}
