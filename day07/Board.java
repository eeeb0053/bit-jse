package day07;

import java.util.Calendar;

// 게시판 관리 프로그램
// 게시판에는 
// 글번호, 제목, 내용, 작성자 4가지 정보가 필요하다.
// 글쓰기, 목록보기, 개별보기, 수정하기, 삭제하기 기능이 필요핟.

public class Board {
    private int id;
    private String title;
    private String content;
    private String writer;
    private Calendar writtenDate;
    private Calendar updatedDate;
    
    // getter setter 이클립스를 사용해서 자동으로 만들기
    // 소스 빈 창에 마우스 오른쪽 클릭 -> source 메뉴 -> generate getters/setters 클릭
    // 단 기존의 겟터셋터가 있을 경우 해당 필드에 대한 겟터셋터는 나오지 않는다.
    
    public Calendar getWrittenDate() {
        return writtenDate;
    }

    public void setWrittenDate(Calendar writtenDate) {
        this.writtenDate = writtenDate;
    }

    public Calendar getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Calendar updatedDate) {
        this.updatedDate = updatedDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }
   
    //toString() 오버라이드
    public String toString(){
        // 객체의 필드값을 출력하는 방법은 다양하다.
        
        return "글번호: "+id+
                ", 제목: "+title+
                ", 내용: "+content+
                ", 작성자: "+writer;
    }
    
    //equals() 오버라이드
    public boolean equals(Object o) {
        if(o instanceof Board) {
            Board b = (Board)o;
            
            if(id == b.id && writer.equals(b.writer)) {
                return true;
            }
        }         
        return false;
    }
    
}























