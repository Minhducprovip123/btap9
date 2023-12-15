package basic.dev;

import java.util.Scanner;

public class MainApp {
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

////		if (number > 0) {
////			System.out.println(number + " la so duong	");
////		} else if (number < 0) {
////			System.out.println(number + " la so am");
////		} else {
////			System.out.println(number + " khong phai la so duong cung khong la so nguyen am");
////		}
////
//////9.2
////		if (number % 5 == 0) {
////			System.out.println(number + "co chia het cho 5  ");
////
////		} else {
////			System.out.println(number + "khong chia het cho 5  ");
////
////		}if (number % 3 == 0) {
////			System.out.println(number+ "co chia het cho 3 ");
////		}else {
////			System.out.println(number+ "khong chia het cho 3 ");
////		}
////	
//
//
////9.3
//
//		
//if (number==1||number==3||number==5||number==7||number==8||number==10||number==12) {
//	System.out.println("thang"+number+"thang 31 ngay ");
//}else if (number==4||number==6||number==9||number==11) {
//	System.out.println("thang"+number+"thang co 30 ngay");
//}else if(number==2) {
//	System.out.println("Thang co 28 or 29 ngay ");
//}else {
//	System.out.println("Khong co thang nay ");
//}
//	
//		bai9.4
//		  Scanner scanner = new Scanner(System.in);
//	        System.out.print("Nhập hệ số bậc 2, a = ");
//	        float a=scanner.nextFloat();
//	        System.out.print("Nhập hệ số bậc 1, b = ");
//	        float b = scanner.nextFloat();
//	        System.out.print("Nhập hằng số tự do, c = ");
//	        float c = scanner.nextFloat();
//	        
//	    
//	     
//	   
//	  
//	        // kiểm tra các hệ số
//	        if (a == 0) {
//	            if (b == 0) {
//	                System.out.println("Phương trình vô nghiệm!");
//	            } else {
//	                System.out.println("Phương trình có một nghiệm: "
//	                        + "x = " + (-c / b));
//	            }
//	            return;
//	        }
//	        // tính delta
//	        float delta = b*b - 4*a*c;
//	        float x1;
//	        float x2;
//	        // tính nghiệm
//	        if (delta > 0) {
//	            x1 = (float) ((-b + Math.sqrt(delta)) / (2*a));
//	            x2 = (float) ((-b - Math.sqrt(delta)) / (2*a));
//	            System.out.println("Phương trình có 2 nghiệm là: "
//	                    + "x1 = " + x1 + " và x2 = " + x2);
//	        } else if (delta == 0) {
//	            x1 = (-b / (2 * a));
//	            System.out.println("Phương trình có nghiệm kép: "
//	                    + "x1 = x2 = " + x1);
//	        } else {
//	            System.out.println("Phương trình vô nghiệm!");
//	        }
Scanner sc=new Scanner(System.in);
		System.out.print("a");
		int a = sc.nextInt();

		System.out.print("b");
		int b = sc.nextInt();

		System.out.print("c");
		int c = sc.nextInt();
		if (a + b > c || a + c > b || b + c > a) {
			System.out.println(" a b c la 3 canh tam giac ");
		} else {
			System.out.println("a b c khong la 3 canh tam giac");
		}
	}
}
