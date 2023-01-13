package ch05;


public class GetMinMax {
public static void main(String[] args) {
	int num[] = {79,88,91,33,100,55,95};
	int mini;
	mini= num[0]; // 79
	int max; 
	max= num[0]; //79
	for(int i =1 ;i<num.length;i++) {
		if(num[i] < mini) {
		mini = num[i];
		}
		if(num[i]> max) {
			max = num[i];
		}
	}
	System.out.println("최댓값 : "+max);
	System.out.println("최솟값 : "+mini);
	
}
}
