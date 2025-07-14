package com.example.note;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 * Класс представляет методы для управлением заметкой.
 */
public class NoteService {
  private final Map<Integer, Note> notes = new HashMap<>();
  private int nextId = 1;

  /**
   * Добавляет новую заметку.
   *
   * @param title строка название заметки
   */
  public Note addNote(String title) {
    Note note = new Note(nextId++, title);

    notes.put(note.getId(), note);
    return note;
  }

  /**
   * Возвращает заметку по id.
   *
   * @param id ID заметк
   */
  public Optional<Note> getNoteById(int id) {
    return Optional.ofNullable(notes.get(id));
  }
}