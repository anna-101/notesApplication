package com.tests;

import com.BaseClass;
import com.actions.NotesAction;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;


import java.net.MalformedURLException;

public class NotesAppTest extends BaseClass {
    static NotesAction notesAction;

    @BeforeClass
    public static void init() throws MalformedURLException {
        notesAction = new NotesAction();
        notesAction.init();
    }

    @Test
    public void onboardingTest(){
        notesAction.getStarted();
        notesAction.selectNotesLauncher();
        notesAction.verifyScreenLaunch();
    }

    @Test
    public void createVerifyTextNoteTest(){
        //notesAction.verifyScreenLaunch();
        notesAction.createNote();
        notesAction.verifyNotesCreated();
    }

    @Test
    public void createVerifyToDoListTest(){
        notesAction.createToDoList();
        notesAction.verifyTodoCreated();
    }

   @AfterClass
    public static void tearDown(){
        notesAction.quit();
    }

}
