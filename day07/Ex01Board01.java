package day07;

import java.util.Scanner;
import util.ArrayUtil;
import util.ScannerUtil;

public class Ex01Board01 {
    private static final int MAX_SIZE = 5;

    public static void main(String[] args) {
        showMenu();
    }

    // 1. menu를 출력하는 showMenu() 메소드
    private static void showMenu() {
        // 게시글을 관리한 board배열 boardArray
        Board[] boardArray = new Board[0];
        // 입력을 담당한 Scanner 변수
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("=====================");
            System.out.println("     게시판관리프로그램    ");
            System.out.println("=====================");
            System.out.println("         1. 글쓰기");
            System.out.println("         2. 목록보기");
            System.out.println("         3. 종료");
            System.out.println("=====================");
            int userChoice = ScannerUtil.nextInt(scanner, "> ", 1, 3);
            if (userChoice == 1) {
                // 게시글을 작성하고 배열에 담아서 리턴해주는 메소드를 실행해서
                // 그 결과값으로 boardArray를 덮어씌워준다.
                boardArray = addBoard(scanner, boardArray);
            } else if (userChoice == 2) {
                // 목록보기 후 상세보기를 들어가 글을 삭제하거나 혹은 글을 수정할 수 있으니
                // 배열을 리턴해주는 목록보기 메소드를 실행해서
                // 그 결과값으로 boardArray를 덮어씌워준다.
                boardArray = selectAll(scanner, boardArray);
            } else if (userChoice == 3) {
                // 감사메세지 출력 후 break
                System.out.println("이용해주셔서 감사합니다.");
                break;
            }
        }
        
        // 스캐너 변수를 닫아준다.
        scanner.close();
    }

    // 파라미터로 받아온 배열에 새로운 글을 작성해서 담고 그걸 그대로 리턴해주는
    // addBorad() 메소드
    private static Board[] addBoard(Scanner scanner, Board[] boardArray) {
        if (ArrayUtil.size(boardArray) < MAX_SIZE) {
            // 칸이 남았으므로 입력

            // 게시글 정보를 담을 Board 변수 생성
            Board b = new Board();

            // 글 정보를 차례대로 넣어보자
            System.out.print("글번호: ");
            b.setId(scanner.nextInt());
            System.out.print("제목: ");
            b.setTitle(ScannerUtil.nextLine(scanner));
            System.out.print("내용: ");
            b.setContent(ScannerUtil.nextLine(scanner));
            System.out.print("작성자: ");
            b.setWriter(ScannerUtil.nextLine(scanner));

            // ArrayUtil에서 Board배열에 Board변수를 추가해주는 메소드를 호출해서
            // 정보가 추가된 b를 배열에 추가해주자
            boardArray = ArrayUtil.add(boardArray, b);
        } else {
            // 칸이 없으므로 경고메세지
            System.out.println("저장할 공간이 없습니다.");
        }
        
        // return ArrayUtil.add(boardArray, b);
        return boardArray;
    }

    // 파라미터로 넘어온 Board[]을 간략하게만 쭉 출력해주고
    // 그 후에 사용자로부터 입력을 받아서 추가적인 작업을 결정하는
    // selectAll() 메소드
    private static Board[] selectAll(Scanner scanner, Board[] boardArray) {
        // 만약 배열에 글이 없으면 메시지 출력
        if (ArrayUtil.size(boardArray) == 0) {
            System.out.println("아직 입력된 글이 없습니다.");
            return boardArray;
        }
        // 간략하게 글번호, 제목 정도만 출력을 쭉 해준다.
        System.out.println("==============================");
        for (int i = 0; i < boardArray.length; i++) {
            System.out.printf("%d. %s - %s\n", i + 1, boardArray[i].getWriter(), boardArray[i].getTitle());
        }
        System.out.println("==============================");
        int userChoice = ScannerUtil.nextInt(scanner, "조회할 글의 번호를 선택해주세요. (0 - 뒤로가기): ",
                                             0, boardArray.length) - 1;
        if (userChoice != -1) {
            // 상세보기 메소드를 호출해준다.
            boardArray = selectOne(scanner, boardArray, userChoice);
        }
        
        return boardArray;
    }

    // 객체를 개별보기하고 수정,삭제시에는 변경이 반영된 배열을 다시 호출된 곳으로 보내주는
    // selectOne() 메소드
    private static Board[] selectOne(Scanner scanner, Board[] boardArray, int index) {

        // 먼저 파라미터로 넘어온 boardArray에서 index를 사용해서
        // 사용자가 선택한 객체를 출력해보자
        // 우리가 코딩할 때 간편하게 쓰기 위해서
        // Board 변수를 만들어서 Board배열의 index번과 연결시켜준다.
        Board b = boardArray[index];
        System.out.println("==============================");
        System.out.printf("글번호: %d번 작성자: %s\n제목:%s\n", b.getId(), b.getWriter(), b.getTitle());
        System.out.println("------------------------------");
        System.out.printf("%s\n", b.getContent());
        System.out.println("==============================");
        int userChoice = ScannerUtil.nextInt(scanner, "1. 수정 2. 삭제 3. 목록으로 \n>> ", 1, 3);
        if (userChoice == 1) {
            // 수정하는 메소드 호출
            // 수정이 완료되고 나면 다시 개별보기로 돌아오게 만들어준다
            updateBoard(scanner, b);
            boardArray = selectOne(scanner, boardArray, index);
        } else if (userChoice == 2) {
            // 삭제하는 메소드 호출
            // 삭제가 완료되고 나면 다시 목록보기로 돌아오게 만들어준다.
            boardArray = deleteBoard(scanner, boardArray, index);
            boardArray = selectAll(scanner, boardArray);
        } else if (userChoice == 3) {
            // 목록 보여주기
            boardArray = selectAll(scanner, boardArray);
        }
        
        return boardArray;
    }
    
    // 파라미터로 넘어온 글을 수정하는 메소드
    private static void updateBoard(Scanner scanner, Board b) {
        System.out.println("==============================");
        System.out.println("             수정");
        System.out.println("==============================");
        System.out.println("글번호: " + b.getId() + "번");
        System.out.println("작성자: " + b.getWriter());
        System.out.print("제목: ");
        b.setTitle(ScannerUtil.nextLine(scanner));
        System.out.print("내용: ");
        b.setContent(ScannerUtil.nextLine(scanner));
    }
    
    // 파라미터로 넘어온 Board[]에서 해당 인덱스를 삭제하고
    // 다시 호출된 곳으로 배열을 보내주는
    // deleteBoard() 메소드
    private static Board[] deleteBoard(Scanner scanner, Board[] boardArray, int index) {
        // 사용자로부터 해당 게시물을 삭제할지 확인받는다
        System.out.print("해당 글을 정말 삭제하시겠습니까? y/n: ");
        String agree = ScannerUtil.nextLine(scanner);
        // 만약 사용자가 y를 눌렀으면 삭제
        // 그 외에는 그냥 무시
        if (agree.equals("y")) {
            boardArray = ArrayUtil.removeByIndex(boardArray, index);
        }

        return boardArray;
    }

}
