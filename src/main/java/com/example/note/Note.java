package com.example.note;

/**
 * Класс представляет заметку с заголовком, текстом и тегами.
 */
public class Note {
    private final int id;
    private String title;

    /**
     * Конструктор класса.
     */
    public Note(int id, String title) {
        this.id = id;
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
