package com.userfiling.UserFiling.controllers;

import com.userfiling.UserFiling.models.File;
import com.userfiling.UserFiling.repositories.FileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class FileController {

    @Autowired
    FileRepository fileRepository;

    @RequestMapping(value = "/files", method = RequestMethod.GET)
    public List<File> getAllUsers(){
        return fileRepository.findAll();
    }
}
