package code;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
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
				addPhoneNum();
			}
			else if (userInput == 2) {
				readAllContracts();
			}
			else {
				System.out.println("잘못된 입력입니다.");
				System.out.println("1/2/0 중에 입력해주세요.");
			}
		}
		
		
	}
	
	static void addPhoneNum() {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("**전화 번호 등록**");
		System.out.print("이름 : ");
		String name = scan.nextLine();
		
		System.out.print("생년 : ");
		int birthYear = scan.nextInt();
		scan.nextLine();
		
		System.out.print("폰번 : ");
		String phoneNum = scan.nextLine();
		
		File file = new File("phoneBook.txt");
		try {
			FileWriter fw = new FileWriter(file, true);
			BufferedWriter bw = new BufferedWriter(fw);
			
			bw.append(String.format("%s/%d/%s", name, birthYear, phoneNum));
			bw.newLine();
			
			bw.close();
			fw.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	static void readAllContracts() {
		File file = new File("phoneBook.txt");
		
		try {
			FileReader fr = new FileReader(file);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
