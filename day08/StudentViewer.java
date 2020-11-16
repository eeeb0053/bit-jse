package day08;

import java.util.Scanner;
import day06.Student;
import util.ArrayUtil;
import util.ScannerUtil;

// 학생 뷰어를 필드 안에 스캐너, 배열을 활용하여
// BoardViewer처럼 만들어보세요 .. 
public class StudentViewer {
    // 학생 목록을 저장하고 관리할 Student 배열
    private Student[] studentArray;
    // 입력을 담당해 줄 Scanner 필드
    private Scanner scanner;

    // 생성자를 사용하여 필드를 초기화
    public StudentViewer() {
        studentArray = new Student[0];
        scanner = new Scanner(System.in);
    }

    // 1. Menu 출력 메소드
    public void showMenu() {
        while (true) {
            System.out.println("========================");
            System.out.println("       성적관리프로그램");
            System.out.println("========================");
            String message = "1. 입력 2. 목록보기 3. 종료\n> ";
            int userChoice = ScannerUtil.nextInt(scanner, message, 1, 3);
            if (userChoice == 1) {
                addStudent();
            } else if (userChoice == 2) {
                selectAll();
            } else if (userChoice == 3) {
                System.out.println("이용해주셔서 감사합니다.");
                break;
            }

        }
    }

    // 2. addStudent()
    private void addStudent() {
        // studentArray = ArrayUtil.add(studentArray,
        // new Student(scanner.nextInt(),
        // ScannerUtil.nextLine(scanner),
        // ScannerUtil.nextInt(scanner, "국어: ", 0, 100),
        // ScannerUtil.nextInt(scanner, "영어: ", 0, 100),
        // ScannerUtil.nextInt(scanner, "수학: ", 0, 100)));

        Student s = new Student();

        System.out.print("번호: ");
        s.setId(scanner.nextInt());
        System.out.print("이름: ");
        s.setName(ScannerUtil.nextLine(scanner));
        s.setKorean(ScannerUtil.nextInt(scanner, "국어점수: ", 0, 100));
        s.setEnglish(ScannerUtil.nextInt(scanner, "영어점수: ", 0, 100));
        s.setMath(ScannerUtil.nextInt(scanner, "수학점수: ", 0, 100));

        studentArray = ArrayUtil.add(studentArray, s);
    }

    // 3. selectAll()
    private void selectAll() {
        /*
         * System.out.println("========================"); if (studentArray.length == 0)
         * { System.out.println("입력된 학생이 없습니다."); } else { for (int i = 0; i <
         * studentArray.length; i++) { System.out.printf("%d. %s\n", i + 1,
         * studentArray[i].getName()); }
         * System.out.println("========================");
         */
        
        printList();
        String message = "조회할 학생의 번호를 입력해주세요. (0은 뒤로가기)\n> ";
        int userChoice = ScannerUtil.nextInt(scanner, message, 0, studentArray.length) - 1;
        if (userChoice != -1) {
            selectOne(userChoice);
        }
    }


    private void printList() {
        if (studentArray.length == 0){
            System.out.println("입력된 학생이 없습니다.");
        }else{
            for (int i = 0; i < studentArray.length; i++) {
                System.out.printf("%d. %s\n", i + 1, studentArray[i].getName());
            }
        }
    }

    private void selectOne(int index) {
        
        printOne(index);
        String message = "1. 수정 2. 삭제 3. 목록으로\n> ";
        int userChoice = ScannerUtil.nextInt(scanner, message, 1, 3);
        if (userChoice == 1) {
            updateStudent(index);
            selectOne(index);
        } else if (userChoice == 2) {
            deleteStudent(index);
            selectAll();
        } else if (userChoice == 3) {
            selectAll();
        }
    }
    
    private void printOne(int index) {
        Student s = studentArray[index];

        System.out.println("=======================");
        System.out.printf("번호: %d번 이름: %s\n", s.getId(), s.getName());
        System.out.printf("국어: %03d점 영어: %03d점 수학:%03d점\n", s.getKorean(), s.getEnglish(), s.getMath());
        System.out.printf("총점: %03d점 평균: %.2f점\n", s.calculateSum(), s.calculateAverage());
        System.out.println("=======================");    
    }
        
        

    private void updateStudent(int index) {
        Student s = studentArray[index];

        System.out.println("==========수정===========");
        System.out.printf("번호: %d번 이름: %s\n", s.getId(), s.getName());
        s.setKorean(ScannerUtil.nextInt(scanner, "국어점수: ", 0, 100));
        s.setEnglish(ScannerUtil.nextInt(scanner, "영어점수: ", 0, 100));
        s.setMath(ScannerUtil.nextInt(scanner, "수학점수: ", 0, 100));
    }

    private void deleteStudent(int index) {
        System.out.print("해당 학생을 삭제하시겠습니까? y/n > ");
        String agree = ScannerUtil.nextLine(scanner);
        if (agree.equals("y")) {
            studentArray = ArrayUtil.removeByIndex(studentArray, index);
        }
    }
}























