package com.actions;

import com.pages.NotesPages;
import io.appium.java_client.android.AndroidDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class NotesAction extends NotesPages {

    public void getStarted(){
        driver.findElement(getStartedBtn).click();
    }

    public void selectNotesLauncher(){
        driver.findElement(notesLauncherOption).click();
    }

    public void verifyScreenLaunch(){
        driver.findElement(swipeScreenTitleLoc).click();
        awaitForElementPresent(myNotesHomeScreen);
        //driver.findElement(myNotesHomeScreen);
    }

    public void createNote(){
        String title = "This is my first note";
        awaitForElementToBeClickable(createNotesIcon);
        driver.findElement(createNotesIcon).click();
        driver.findElement(createTextNoteIcon).click();
        driver.findElement(todoNoteTitleLoc).sendKeys("Note1");
        driver.findElement(notesEditorLoc).sendKeys(title);
        awaitForElementPresent(todoNoteBtn);
        driver.findElement(todosaveBtn).click();
    }

    public void verifyNotesCreated(){
        if(awaitForElementPresent(rateNotNow)){
            driver.findElement(rateNotNow).click();
        }
        awaitForElementPresent(noteContentView);
    }

    public void createToDoList(){
        String title = "My To-do";
        driver.findElement(createNotesIcon).click();
        driver.findElement(todoNoteBtn).click();
        driver.findElement(todoNoteTitleLoc).sendKeys(title);
        addTodo(editTodoText,"Task1");
        addTodo(todoTask2Loc,"Task2");
        addTodo(todoTask3Loc,"Task3");
        driver.findElement(todosaveBtn).click();
    }

    public void addTodo(By element, String task){
        driver.findElement(element).sendKeys(task);
        driver.findElement(addTodoItem).click();
    }

    public void verifyTodoCreated(){
        Assert.assertTrue(awaitForElementPresent(todoContentPreview));
    }

}
