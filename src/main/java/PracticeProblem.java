import java.util.Arrays;

public class PracticeProblem {

	public static void main(String args[]) {
	}

	public static void selectionSortName(String[] names, int[] ages){
		//iterate through all n-1 elements
		for(int i = 0; i < names.length-1;i++){

			//set the lowest/to-be-replaced index as i
			int low = i;

			//iterate through all indexes past i
			for(int j = i+1; j < names.length; j++){

				//why does compareToIgnoreCase exist :facepalm: im too lazy to change it
				if(names[j].toLowerCase().compareTo(names[low].toLowerCase()) < 0){
					//if names[j] comes earlier than names[low], set j to low
					low = j;
				}
			}

			//swap names/ages[i] with names/ages[low]
			String temp = names[i];
			int tempAge = ages[i];

			names[i] = names[low];
			names[low] = temp;

			ages[i] = ages[low];
			ages[low] = tempAge;
		}

	}

	public static void selectionSortAge(String[] names, int[] ages){

		//iterate through n-1 lemons
		for(int i = 0; i < ages.length-1;i++){
			//set the first lemon (by default the sourest)
			int low = i;

			//iterate through all the other lemons besides the sorted ones	
			for(int j = i+1; j < ages.length; j++){
				if(ages[j] < ages[low]){
					//if lemon is more sour than the sourest, set it to the sourest
					low = j;
				}
			}

			//swap the i-th and the sourest lemon
			String temp = names[i];
			int tempAge = ages[i];

			names[i] = names[low];
			names[low] = temp;

			ages[i] = ages[low];
			ages[low] = tempAge;
		}

	}
}
