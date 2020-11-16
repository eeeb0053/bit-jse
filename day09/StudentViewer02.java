package day09;
// 학생관리 프로그램을
// ArrayList를 사용하여 작성하시오.

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

import day06.Student;
import util.ScannerUtil;

public class StudentViewer02 {
    private Scanner scanner;
    private ArrayList<Student> list;
    private int id;
    
    public StudentViewer02() {
        scanner = new Scanner(System.in);
        list = new ArrayList<>();
        id = 1;
    }
    
    public void showMenu() {
        while(true) {
            System.out.println("==== 학생 성적 관리 프로그램====");
            String message = "1. 학생 정보 입력 2. 목록보기 3. 종료\n> ";
            int userChoice = ScannerUtil.nextInt(scanner, message, 1, 3);
            if(userChoice == 1) {
                addStudent();
            }else if(userChoice == 2) {
                printAll();
            }else if(userChoice == 3) {
                System.out.println("이용해주셔서 감사합니다.");
                break;
            }
        }
    }
    
    private void addStudent() {
        Student s = new Student();
        
        s.setId(id++);
        System.out.print("이름: ");
        s.setName(ScannerUtil.nextLine(scanner));
        s.setKorean(ScannerUtil.nextInt(scanner, "국어: ", 0, 100));
        s.setEnglish(ScannerUtil.nextInt(scanner, "영어: ", 0, 100));
        s.setMath(ScannerUtil.nextInt(scanner, "수학: ", 0, 100));
        
        s.setWrittenDate(Calendar.getInstance());
        s.setUpdatedDate(Calendar.getInstance());
        
        list.add(s);  
    }
    
    private void printAll() {
        // list.size() == 0 도 됨
        if(list.isEmpty()) {
            System.out.println("등록된 학생이 없습니다.");
        }else {
            for(int i = 0; i < list.size(); i++) {
                System.out.printf("%d. %s\n", i+1, list.get(i).getName());
            }
            String message = "상세보기할 학생의 번호를 입력해주세요. (0은 뒤로가기)\n> ";
            int userChoice = ScannerUtil.nextInt(scanner, message, 0, list.size()) - 1;
            if(userChoice != -1) {
                printOne(userChoice);
            }
        }
    }
    
    private void printOne(int index) {
        SimpleDateFormat sdf = new SimpleDateFormat("yy-MM-dd HH:mm:ss");
        
        Student s = list.get(index);        
        s.printInfo();
        System.out.println("등록일: "+sdf.format(s.getWrittenDate().getTime()));
        System.out.println("수정일: "+sdf.format(s.getUpdatedDate().getTime()));
        System.out.println("================================");
        
        String message = "1. 수정 2. 삭제 3. 목록으로 \n> ";
        int userChoice = ScannerUtil.nextInt(scanner, message, 1, 3);
        if(userChoice == 1) {
            updateStudent(index);
        }else if(userChoice == 2) {
            deleteStudent(index);
        }else if(userChoice == 3) {
            printAll();
        }
    }
    
    private void updateStudent(int index) {
        list.get(index).setKorean(ScannerUtil.nextInt(scanner, "국어: ", 0, 100));
        list.get(index).setEnglish(ScannerUtil.nextInt(scanner, "영어: ", 0, 100));
        list.get(index).setMath(ScannerUtil.nextInt(scanner, "수학: ", 0, 100));

        list.get(index).setUpdatedDate(Calendar.getInstance());

        printOne(index);
    }
    
    private void deleteStudent(int index) {
        System.out.print("정말 삭제하시겠습니까? y/n > ");
        String agree = ScannerUtil.nextLine(scanner);
        
        if(agree.toLowerCase().equals("y")) {
            list.remove(index);
            printAll();
        }else {
            printOne(index);
        }
    }
}





















