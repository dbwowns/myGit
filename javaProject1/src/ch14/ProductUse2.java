package ch14;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductUse2 {
	public static void main(String[] args) {

		String exit ="";
		Scanner scanner  =new Scanner(System.in);
		List<Product> list = new ArrayList<>();


		while (true) {
			Product pr = new Product();
			pr.input();
			
			list.add(pr);
			
			System.out.print("계속하려면 아무키나 누르시오.(exit 입력시 종료)");
			exit = scanner.next();
			if(exit.equals("exit")) {
				break;
			}
			
		}
		

			System.out.println("제품번호\t제품명\t제조사\t단가(천원)\t\t수량\t금액(천원)");
			System.out.println("----------------------------------------------------------------");
			for(int i =0 ; i<list.size(); i++	) {
				Product p = list.get(i);
				System.out.println(p.getProductNum()+"\t"+p.getProductName()+"\t"+p.getProductPress()+"\t"+p.getPrice()
				+"\t"+"\t"+p.getAmount()+"\t"+p.getMoney());
			}
			System.out.println("----------------------------------------------------------------");

		}
	}
