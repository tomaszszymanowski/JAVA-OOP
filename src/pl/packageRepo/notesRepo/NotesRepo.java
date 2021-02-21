package pl.packageRepo.notesRepo;

import pl.packageRepo.Note;

import java.util.Arrays;

public class NotesRepo {
    private Note[] notes = new Note[10];
    private int index=0;

    public void add(Note note){
        notes[index++] = note;
    }

    @Override
    public String toString() {
        return "NotesRepo{" +
                "notes=" + Arrays.toString(notes) +
                '}';
    }
}
