package day05;
// 로또 게임 해보기
// 사용자가 숫자를 선택해서
// 컴퓨터가 만들어준 숫자들과 비교하여
// 6개 일치: 1등
// 5개 일치: 2등
// 4개: 3등
// 3개: 4등
// 이 출력되는 프로그램을 작성하시오.
// 단 사용자가 숫자를 선택할 때에는
// 불가능한 번호나 중복된 번호는 입력할 수 없게 프로그램을 작성하시오.

import java.util.Random;
import java.util.Scanner;
import util.ArrayUtil;
import util.ScannerUtil;

public class Ex10PlayLotto {
    private static final int SIZE = 6;
    private static final int MAX = 45;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        // 컴퓨터 생성 난수 저장 배열
        int[] lottoNumbers = new int[SIZE];
        // 사용자 입력 숫자 저장 배열
        int[] userNumbers = new int[SIZE];

        // 컴퓨터 배열에 난수 저장
        for(int i = 0; i < SIZE; i++) {
            int randomNumber = random.nextInt(MAX) + 1;
            
            while(ArrayUtil.contains(lottoNumbers, randomNumber)) {
                randomNumber = random.nextInt(MAX) + 1;
            }
            lottoNumbers[i] = randomNumber;
        }
        
        // 사용자 배열에 숫자 입력받기 (중복X, 범위 내에)
        for(int i = 0; i < SIZE; i++) {
            int number = ScannerUtil.nextInt(scanner, "숫자 "+(i+1)+": ", 1, MAX);
            
            while(ArrayUtil.contains(userNumbers, number)) {
                number = ScannerUtil.nextInt(scanner, "중복입니다. 숫자 "+(i+1)+": ", 1, MAX);           
            }
            userNumbers[i] = number;
        }
        
        ArrayUtil.sortByASC(userNumbers);
        ArrayUtil.sortByASC(lottoNumbers);
        
        // 점수계산
        // 주의할 점: 컴퓨터 숫자, 사용자 숫자가 값만 같으면 된다. (인덱스는 상관없다.)
        // ArrayUtil.contains()를 사용하여
        // true가 나올 때마다 점수를 1점씩 올린다.
        
        int count = 0;
        for(int i = 0; i < userNumbers.length; i++) {
            if(ArrayUtil.contains(lottoNumbers, userNumbers[i])) {
                count++;
            }
        }
        
        // 결과 출력
                
        if(count == 6) {
            System.out.println("[축하합니다. 1등입니다.]");
        }else if(count == 5) {
            System.out.println("[축하합니다. 2등입니다.]");
        }else if(count == 4) {
            System.out.println("[축하합니다. 3등입니다.]");
        }else if(count == 3) {
            System.out.println("[축하합니다. 4등입니다.]");
        }else {
            System.out.println("[꽝! 다음 기회에...]");
        }
        System.out.println(count+"개 맞으셨습니다.");
        
        System.out.printf("사용자 번호: %d, %d, %d, %d, %d, %d\n", userNumbers[0], userNumbers[1], userNumbers[2],
                                                            userNumbers[3], userNumbers[4], userNumbers[5]);
        System.out.printf("로또 번호: %d, %d, %d, %d, %d, %d\n", lottoNumbers[0], lottoNumbers[1], lottoNumbers[2],
                lottoNumbers[3], lottoNumbers[4], lottoNumbers[5]);
     
        scanner.close();    
    }
}
