package com.userfiling.UserFiling.models;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FileTest {
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
        assertNull(myFile.getId());
    }

    @Test
    public void getName() {
        assertEquals("myFileName", myFile.getName());
    }

    @Test
    public void setName() {
        myFile.setName("leopard");
        assertEquals("leopard", myFile.getName());

    }

    @Test
    public void getExtension() {
        assertEquals("txt", myFile.getExtension());
    }

    @Test
    public void setExtension() {
        myFile.setExtension("jpg");
        assertEquals("jpg", myFile.getExtension());
    }

    @Test
    public void getSize() {
        assertEquals(0, myFile.getSize());
    }

    @Test
    public void setSize() {
        myFile.setSize(2048);
        assertEquals(2048, myFile.getSize());

    }

    @Test
    public void getFolder() {
        assertEquals(myFolder, myFile.getFolder());
    }

    @Test
    public void setFolder() {
        Folder folder2 = new Folder("moreFiles", myUser);
        myFile.setFolder(folder2);
        assertEquals(folder2, myFile.getFolder());
    }
}