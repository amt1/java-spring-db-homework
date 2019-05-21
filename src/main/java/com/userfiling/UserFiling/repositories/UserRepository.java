package com.userfiling.UserFiling.repositories;

import com.userfiling.UserFiling.models.User;
import com.userfiling.UserFiling.projections.EmbedFolder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(excerptProjection = EmbedFolder.class)
public interface UserRepository extends JpaRepository<User, Long> {
}
