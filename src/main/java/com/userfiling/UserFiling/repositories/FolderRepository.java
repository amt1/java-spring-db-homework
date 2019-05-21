package com.userfiling.UserFiling.repositories;

import com.userfiling.UserFiling.models.Folder;
import com.userfiling.UserFiling.projections.EmbedFile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(excerptProjection = EmbedFile.class)
public interface FolderRepository extends JpaRepository<Folder, Long> {
}
