package day05;
// 로또번호 생성기

import java.util.Random;

import util.ArrayUtil;

public class Ex08LottoNumbers {
    private static final int SIZE = 6;
    private static final int MAX = 45;
    public static void main(String[] args) {
        Random random = new Random();
        
        // 배열을 선언해보자
        int[] lottoNumbers = new int[SIZE];
        
        // 배열의 각 인덱스에
        // 랜덤을 이용한 난수를 넣어보자
        for(int i = 0; i < lottoNumbers.length; i++) {
            lottoNumbers[i] = random.nextInt(MAX) + 1;
        }
        
        ArrayUtil.print("lottoNumbers", lottoNumbers);
        // 위 코드에서의 문제점은 중복 제거가 되지 않았다는 점이다.
        // 중복을 제거하려면 어떻게 해야할까?
        // 중복제거를 할 때는 2가지 방법이 가능하다.
        // 1. 일단 숫자를 다 채워넣고 중복인 인덱스에 새로운 숫자 넣기
        System.out.println("=========중복제거 후=========");
        // 중복이란 무엇인가?
        // 인덱스가 다르지만 배열의 값이 같을 때 
        // 예를 들어
        // 38 8 19 16 16 8
        // 이렇게 숫자가 있을 경우 1번 인덱스와 5번 인덱스는
        // 인덱스는 다르지만 배열[인덱스]의 값이 같기 때문에 중복이 된다.
        
        // 따라서 우리는 이중 for문을 이용해서 i와 j가 다르지만
        // lottoNumbers[i]와 lottoNumbers[j]의 값이 같을 때에는
        // lottoNumbers[i]에 새로운 값을 넣어주고
        // 해당 값이 중복인지 아닌지 체크하게 할 것이다.
        for(int i = 0; i < lottoNumbers.length; i++) {
            
            for(int j = 0; j < lottoNumbers.length; j++) {
                // if를 통해서 i와 j가 다르지만
                // lottoNumbers[i]와 lottoNumbers[j]가 같으면
                // i에 새로운 숫자를 넣고
                // j를 -1로 초기화해서
                // 0번 인덱스부터 다시 체크하게 만들어주자
                if(i != j && lottoNumbers[i] == lottoNumbers[j]) {
                    int oldNumber = lottoNumbers[i];
                    lottoNumbers[i] = random.nextInt(MAX) + 1;
                    int newNumber = lottoNumbers[i];
                    System.out.printf("%d에 있던 %d를 %d로 바꿈\n", i, oldNumber, newNumber);
                    j = -1;
                }
            }
        }
        // 중복 제거가 됐는지 출력
        ArrayUtil.print("lottoNumbers", lottoNumbers);
               
        
        
        ArrayUtil.sortByASC(lottoNumbers);
        System.out.println("========오름차순 정렬========");
        ArrayUtil.print("lottoNumbers", lottoNumbers); 
    }
}


























