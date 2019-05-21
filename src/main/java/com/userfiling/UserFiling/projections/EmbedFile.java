package com.userfiling.UserFiling.projections;

import com.userfiling.UserFiling.models.File;
import com.userfiling.UserFiling.models.Folder;
import org.springframework.data.rest.core.config.Projection;

import java.util.ArrayList;

@Projection(name = "EmbedFile", types = Folder.class )
public interface EmbedFile {
    String getName();
    String getExtension();
    Folder getFolder();
    long getSize();
    ArrayList<File> getFiles();
}
