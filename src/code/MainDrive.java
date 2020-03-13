package code;

import java.util.Scanner;

public class MainDrive {
	
	public static void main(String[] args) {
		
		printMenu();
		
	}
	
	static void printMenu() {
		
		Scanner scan = new Scanner(System.in);
		
		while (true) {
			System.out.println("*****전화번호부*****");
			System.out.println("1. 전화번호 등록");
			System.out.println("2. 전화번호 목록 조회");
			System.out.println("0. 프로그램 종료");
			System.out.println("************************");
			System.out.print("메뉴 선택 : ");
			int userInput = scan.nextInt();
			
			if (userInput == 0) {
				System.out.println("프로그램을 종료합니다..");
				break;
			}
			else if (userInput == 1) {
				
			}
			else if (userInput == 2) {
				
			}
			else {
				System.out.println("잘못된 입력입니다.");
				System.out.println("1/2/0 중에 입력해주세요.");
			}
		}
		
		
	}

}
