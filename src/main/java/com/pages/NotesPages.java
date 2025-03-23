package com.pages;


import com.BaseClass;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public class NotesPages extends BaseClass {
    protected By getStartedBtn = By.xpath("//android.view.ViewGroup[@resource-id=\"com.notes.todolist.notebook.checklist.notepad.android.dev:id/btn_get_started\"]");
    protected By notesLauncherOption = By.xpath("//androidx.recyclerview.widget.RecyclerView[@resource-id=\"com.android.permissioncontroller:id/recycler_view\"]/android.widget.LinearLayout[1]/android.widget.LinearLayout[3]");

    protected By swipeScreenTitleLoc = By.xpath("//android.widget.FrameLayout[@resource-id=\"com.notes.todolist.notebook.checklist.notepad.android.dev:id/drag_layer\"]/android.view.ViewGroup");
    protected By myNotesHomeScreen = By.xpath("//android.widget.TextView[@resource-id=\"com.notes.todolist.notebook.checklist.notepad.android.dev:id/no_notes_title\"]");

    protected By createNotesIcon = By.xpath("//android.widget.ImageView[@resource-id=\"com.notes.todolist.notebook.checklist.notepad.android.dev:id/btn_create_note\"]");

    protected By createTextNoteIcon = By.xpath("//android.widget.ImageButton[@resource-id=\"com.notes.todolist.notebook.checklist.notepad.android.dev:id/btn_text_note\"]");

    protected By saveNotesBtn = By.xpath("//android.widget.TextView[@resource-id=\"com.notes.todolist.notebook.checklist.notepad.android.dev:id/btn_save\"]");

    protected By notesEditorLoc = By.xpath("//android.widget.EditText[@resource-id=\"editor\"]");

    protected By rateNotNow = By.xpath("//android.widget.TextView[@resource-id=\"com.notes.todolist.notebook.checklist.notepad.android.dev:id/not_now_btn\"]");

    protected By noteContentView = By.xpath("//android.widget.LinearLayout[@resource-id=\"com.notes.todolist.notebook.checklist.notepad.android.dev:id/note_content_preview\"]");

    protected By todoNoteBtn = By.xpath("//android.widget.ImageButton[@resource-id=\"com.notes.todolist.notebook.checklist.notepad.android.dev:id/btn_todo_note\"]");

    protected By todoNoteTitleLoc = By.xpath("//android.widget.EditText[@resource-id=\"com.notes.todolist.notebook.checklist.notepad.android.dev:id/note_title\"]");

    protected By addTodoItem = By.xpath("//android.widget.TextView[@resource-id=\"com.notes.todolist.notebook.checklist.notepad.android.dev:id/add_item\"]");

    protected By editTodoText = By.xpath("//android.widget.EditText[@resource-id=\"com.notes.todolist.notebook.checklist.notepad.android.dev:id/edit_text_id\"]");

    protected By todoTask2Loc = By.xpath("(//android.widget.EditText[@resource-id=\"com.notes.todolist.notebook.checklist.notepad.android.dev:id/edit_text_id\"])[2]");

    protected By todoTask3Loc = By.xpath("(//android.widget.EditText[@resource-id=\"com.notes.todolist.notebook.checklist.notepad.android.dev:id/edit_text_id\"])[3]");

    protected By todoContentPreview = By.xpath("//android.view.ViewGroup[@resource-id=\"com.notes.todolist.notebook.checklist.notepad.android.dev:id/note_content_preview\"]");
    //android.widget.TextView[@resource-id="com.notes.todolist.notebook.checklist.notepad.android.dev:id/btn_save"]

    protected By todosaveBtn = By.xpath("//android.widget.TextView[@resource-id=\"com.notes.todolist.notebook.checklist.notepad.android.dev:id/btn_save\"]");

}
