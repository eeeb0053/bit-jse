package day08;

import java.util.Scanner;

import util.ScannerUtil;

public class Ex03NextIntTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("숫자: ");
        int number = ScannerUtil.nextInt(scanner);
        
        System.out.println("number: "+number);
        
        scanner.close();
    }
}
