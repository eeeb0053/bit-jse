package day06;

import java.util.Scanner;

import util.ScannerUtil;

// 만약 모든 칸이 다 차있을 경우
// 0번 칸에 1번
// 1번 칸에 2번
// 2번 칸에 3번
// 이렇게 한칸씩 땡기고 
// 3번칸에 새로운 학생의 정보를 입력하도록 만들어보자
public class Ex08StaticArray02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student[] studentArray = new Student[4];
        
        while(true) {
            System.out.println("1.입력 2.출력 3.종료");
            int userChoice = ScannerUtil.nextInt(scanner, "> ",  1, 3);
            if(userChoice == 1) {
                int index = -1;
                for(int i = 0; i < studentArray.length; i++) {
                    if(studentArray[i] == null) {
                        index = i;
                        break;
                    }
                }
                if(index != -1) {
                    // 빈칸이 존재하므로 학생정보 입력
                    studentArray[index] = new Student();
                    System.out.print("번호: ");
                    studentArray[index].setId(scanner.nextInt());
                    System.out.print("이름: ");
                    studentArray[index].setName(ScannerUtil.nextLine(scanner));
                    studentArray[index].setKorean(ScannerUtil.nextInt(scanner, "국어: ", 0, 100));
                    studentArray[index].setEnglish(ScannerUtil.nextInt(scanner, "영어: ", 0, 100));
                    studentArray[index].setMath(ScannerUtil.nextInt(scanner, "수학: ", 0, 100));
                }else {
                    // 빈칸이 존재하지 않으므로
                    // 1칸씩 땡겨주고 3번칸에 새로운 학생 정보 입력
                    for(int i = 1; i < studentArray.length; i++) {
                        studentArray[i-1] = studentArray[i];   
                    }
                    index = 3;
                    studentArray[index] = new Student();
                    // 만약 여기서 studentArray[index] = new Student();가 없게 된다면?
                    // 위의 for문에서
                    // studentArray[i-1] = studentArray[i]를 통해서
                    // i-1번 칸에 i번째 칸의 "주소겂"을 덮어씌웠다.
                    // 그리고나서 3번째 칸을 초기화하지 않았기 때문에
                    // 2, 3번째 칸 모두 똑같은 주소를 보고 있고
                    // 따라서 3번을 "새로 입력"하는게 아니라
                    // 똑같은 위치의 정보를 "수정"하는게 되어서
                    // 2번과 3번 모두 같은 값이 출력된다.
                    
                    System.out.print("번호: ");
                    studentArray[index].setId(scanner.nextInt());
                    System.out.print("이름: ");
                    studentArray[index].setName(ScannerUtil.nextLine(scanner));
                    studentArray[index].setKorean(ScannerUtil.nextInt(scanner, "국어: ", 0, 100));
                    studentArray[index].setEnglish(ScannerUtil.nextInt(scanner, "영어: ", 0, 100));
                    studentArray[index].setMath(ScannerUtil.nextInt(scanner, "수학: ", 0, 100));
                }
            }else if(userChoice == 2) {
                for(int i = 0; i < studentArray.length; i++) {
                    if (studentArray[i] != null) {
                        int id = studentArray[i].getId();
                        String name = studentArray[i].getName();
                        int korean = studentArray[i].getKorean();
                        int english = studentArray[i].getEnglish();
                        int math = studentArray[i].getMath();
                        System.out.println("============================");
                        System.out.printf("번호: %d번 이름: %s\n", id, name);
                        System.out.printf("국어: %03d점 영어:%03d점 수학:%03d점\n", korean, english, math);
                        System.out.printf("총점: %03d점 평균: %.2f점\n", studentArray[i].calculateSum(),
                                studentArray[i].calculateAverage());
                        System.out.println("============================");
                    }
                }
            }else if(userChoice == 3) {
                System.out.println("이용해주셔서 감사합니다.");
                break;
            }
                
        }
        
        scanner.close();
    }
}











