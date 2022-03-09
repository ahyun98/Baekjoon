import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Baekjoon2309 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> dwarf = new ArrayList<Integer>();
		int total = 0;
		for (int i = 0; i < 9; i++) {
			dwarf.add(sc.nextInt());
			total+=dwarf.get(i);
		}
		total = total-100;
		int liar1=0;
		int liar2=0;
		for (int i = 0; i < dwarf.size()-1; i++) {
			for (int j = i+1; j < dwarf.size(); j++) {
				if(dwarf.get(i)+dwarf.get(j)==total) {
					liar1 = i;
					liar2 = j;
				}
			}
		}
		dwarf.remove(liar1);
		dwarf.remove(liar2-1);
		Collections.sort(dwarf);
		for (int i = 0; i < dwarf.size(); i++) {
			System.out.println(dwarf.get(i));
		}
		
		
	}
}
