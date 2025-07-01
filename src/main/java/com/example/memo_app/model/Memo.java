package com.example.memo_app.model;

public class Memo {
    private int id;
    private String title;
    private String content;

    public Memo() {} // jdbc 가 참조하는 빈 생성자
    public Memo(int id, String title, String content) {
        this.id = id;
        this.title = title;
        this.content = content;
    }

    // getter
    public int getId() { return id; }
    public String getTitle() { return title; }
    public String getContent() { return content; }

    // setter
    public void setId(int id) { this.id = id; }
    public void setTitle(String title) { this.title = title; }
    public void setContent(String content) { this.content = content; }
}

