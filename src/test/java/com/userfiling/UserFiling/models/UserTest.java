package com.userfiling.UserFiling.models;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserTest {
    File myFile;
    Folder myFolder;
    User myUser;

    @Before
    public void before(){
        myUser = new User("myName");
        myFolder = new Folder("myFolderName", myUser);
        myFile = new File("myFileName", "txt", myFolder, 0);
    }
    @Test
    public void getId() {
        assertNull(myUser.getId());
    }

    @Test
    public void getName() {
        assertEquals("myName", myUser.getName());
    }

    @Test
    public void setName() {
        myUser.setName("Stanley");
        assertEquals("Stanley", myUser.getName());

    }

    @Test
    public void getFolders() {
        assertEquals(0, myUser.getFolders().size());
    }

    @Test
    public void addFolder() {
        myUser.addFolder(myFolder);
        Folder folder2 = new Folder("myStuff", myUser);
        myUser.addFolder(folder2);
        assertEquals(folder2, myUser.getFolders().get(1));
    }
}