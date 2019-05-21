package com.userfiling.UserFiling.controllers;

import com.userfiling.UserFiling.models.Folder;
import com.userfiling.UserFiling.repositories.FolderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class FolderController {

    @Autowired
    FolderRepository folderRepository;

    @RequestMapping(value = "/folders", method = RequestMethod.GET)
    public List<Folder> getAllUsers(){
        return folderRepository.findAll();
    }

}
