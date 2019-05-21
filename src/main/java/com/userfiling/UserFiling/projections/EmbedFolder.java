package com.userfiling.UserFiling.projections;

import com.userfiling.UserFiling.models.Folder;
import com.userfiling.UserFiling.models.User;
import org.springframework.data.rest.core.config.Projection;

import java.util.ArrayList;

@Projection(name = "EmbedFolder", types = User.class )
public interface EmbedFolder {
    String getTitle();
    ArrayList<Folder> getFolders();
}
