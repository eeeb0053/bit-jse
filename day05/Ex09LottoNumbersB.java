package day05;
// 로또번호 생성기

import java.util.Random;
import util.ArrayUtil;

public class Ex09LottoNumbersB {
    private static final int SIZE = 6;
    private static final int MAX = 45;
    public static void main(String[] args) {
        Random random = new Random();
        
        // 배열을 선언해보자
        int[] lottoNumbers = new int[SIZE];
        
        // 배열의 각 인덱스에
        // 랜덤을 이용한 난수를 넣어보자
        
        // 2. 랜덤 숫자를 곧장 넣고 나중에 중복을 찾는게 아니라
        //    랜덤 숫자를 하나 생성하고 이미 존재하면
        //    다시 랜덤 숫자를 하나 만들고
        //    반복해서 배열에 존재하지 않는 숫자가 나오면
        //    그때 i에 해당 숫자를 넣어주는 방법을 사용
        
        
        for(int i = 0; i < lottoNumbers.length; i++) {
            int randomNumber = random.nextInt(MAX) + 1;
            
            while(ArrayUtil.contains(lottoNumbers, randomNumber)) {
                randomNumber = random.nextInt(MAX) + 1;
            }
            lottoNumbers[i] = randomNumber;
        }
        
        // 중복제거 버전1은
        // 무슨 숫자가 나오든 다 채워놓고
        // 중복인 곳을 찾아서 다시 난수를 입력하는 버전이엇다면
        // 중복제거 버전2는
        // 먼저 해당 숫자가 배열에 존재하는지 확인해서
        // 존재하지 않을 때만 배열에 추가하는 방식이다.

        System.out.println("========중복제거 ver.2========");
        ArrayUtil.print("lottoNumbers", lottoNumbers);
        
        ArrayUtil.sortByASC(lottoNumbers);
        System.out.println("=========오름차순 정렬=========");
        ArrayUtil.print("lottoNumbers", lottoNumbers); 
    }
}


























