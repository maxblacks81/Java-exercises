package com.edu.java;

public class TestDataUniqueValues {	
	
	
	static int[] array = {10,20,30,40,50,60,70,80,90,80,70,40,10,20};
	
	static int[] get_array(){
		int[] unique_values;
		int[] temp_values = new int[array.length];
		int pos = 0; 
		boolean found = false;
		
		for(int i=0; i<array.length; i++) {
			temp_values[i] = -1;
		}
		
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array.length && !found; j++) {
				if(array[i] == temp_values[j]) {
					found = true;
				}
			}
			if (found == false) {
				temp_values[pos] = array[i];
				pos++;
			}
		}
		
		unique_values = new int[pos];
		for(int i=0; i<pos; i++) {
			if (temp_values[i] > 0)
				unique_values[i] = temp_values[i];
		}
		
		return unique_values;
	}
	
	static int get_expected_result() {
		int min_idx = 0;
        for (int i = 1; i < array.length; ++i) {
            if (array[i] < array[min_idx]) {
                min_idx = i;
            }
        }
        return min_idx;
	}
}
