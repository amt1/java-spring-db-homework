package com.userfiling.UserFiling.components;

import com.userfiling.UserFiling.models.File;
import com.userfiling.UserFiling.models.Folder;
import com.userfiling.UserFiling.models.User;
import com.userfiling.UserFiling.repositories.FileRepository;
import com.userfiling.UserFiling.repositories.FolderRepository;
import com.userfiling.UserFiling.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    UserRepository userRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    FileRepository fileRepository;


    public DataLoader() {

    }
    public void run(ApplicationArguments args) {

//        User annabel = new User("Annabel");
//        userRepository.save(annabel);
//
//        User stanley = new User("Stanley");
//        userRepository.save(stanley);
//
//        Folder filmAcademy = new Folder("Film Academy", annabel);
//        folderRepository.save(filmAcademy);
//
//        Folder stMarks = new Folder("St Marks", annabel);
//        folderRepository.save(stMarks);
//
//        Folder blackDog = new Folder("Black Dog", annabel);
//        folderRepository.save(blackDog);
//
//        Folder syt = new Folder("SYT", stanley);
//        folderRepository.save(syt);
//
//        File functions = new File("functions", "php", filmAcademy, 300);
//        fileRepository.save(functions);
//
//        File headshot = new File("headshot", "jpg", syt, 500);
//        fileRepository.save(headshot);
//
//        File script = new File("script", "doc", syt, 2000);
//        fileRepository.save(script);
//
//        File setAside = new File("Set Aside in the Springtime", "jpg", blackDog, 1000);
//        fileRepository.save(setAside);
//
//        File downAmong = new File("Down Among the Ice Islands", "jpg", blackDog, 800);
//        fileRepository.save(downAmong);
//
//        File salome = new File("Considering Salome", "jpg", blackDog, 1000);
//        fileRepository.save(salome);
//

    }
}
