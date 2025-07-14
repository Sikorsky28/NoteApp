package com.example.note;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

/**
 * Класс для тестирования методов для работы с добавлением заметок.
 */
public class NoteServiceTest {

    @Test
    void shouldAddNoteAndFindById() {
        NoteService service = new NoteService();
        Note note = service.addNote("Test");
        assertNotNull(service.getNoteById(note.getId()).orElse(null));
    }

    @Test
    void shouldReturnEmptyIfNoteNotFound() {
        NoteService service = new NoteService();
        assertTrue(service.getNoteById(999).isEmpty());
    }
}
