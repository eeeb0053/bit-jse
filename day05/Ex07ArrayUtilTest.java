package day05;

import util.ArrayUtil;

public class Ex07ArrayUtilTest {
    public static void main(String[] args) {
        // 배열을 초기화하는 방법
        // 1. int[] arr = new int[크기]
        //    각 인덱스마다 값을 넣어주기
        // 2. 즉석으로 배열을 만들어서 그 배열로 초기화하는 방법
        int[] arr = { 5, 1, 2, 3, 0 };
        // 위 코드는
        // int[] arr = new int[5]
        // arr[0] = 5;
        // arr[1] = 1;
        // ...
        // arr[4] = 8;
        // 과 같은 의미를 지닌다.

        // 위 방법의 단점은
        // 미리 값이 존재하지 않으면 사용할 수 없다.

        // ArrayUtil.print() 테스트
        System.out.println("=======출력 메소드 테스트=======");
        ArrayUtil.print("intArray", arr);
        System.out.println("===========================\n");

        // ArrayUtil.sortASC() 테스트
        System.out.println("====오름차순 정렬 메소드 테스트====");
        ArrayUtil.sortByASC(arr);
        ArrayUtil.print("intArray", arr);
        System.out.println("===========================\n");

        // ArrayUtil.sortDESC() 테스트
        System.out.println("====내림차순 정렬 메소드 테스트====");
        ArrayUtil.sortByDESC(arr);
        ArrayUtil.print("intArray", arr);
        System.out.println("===========================\n");

    }
}
