package com.userfiling.UserFiling.models;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FolderTest {
    Folder myFolder;
    User myUser;
    File myFile;

    @Before
    public void before(){
        myUser = new User("myName");
        myFolder = new Folder("myFolderName", myUser);
        myFile = new File("myFileName", "txt", myFolder, 0);
    }

    @Test
    public void getId() {
        assertNull(myFolder.getId());
    }

    @Test
    public void getTitle() {
        assertEquals("myFolderName", myFolder.getTitle());
    }

    @Test
    public void setTitle() {
        myFolder.setTitle("myNewFolderName");
        assertEquals("myNewFolderName", myFolder.getTitle());

    }

    @Test
    public void getFiles() {
        assertEquals(0, myFolder.getFiles().size());

    }

    @Test
    public void addFile() {
        myFolder.addFile(myFile);
        assertEquals(myFile, myFolder.getFiles().get(0));
    }

    @Test
    public void getUser() {
        assertEquals(myUser, myFolder.getUser());
    }

    @Test
    public void setUser() {
        User user2 = new User("Freddy");
        myFolder.setUser(user2);
        assertEquals(user2, myFolder.getUser());
    }
}