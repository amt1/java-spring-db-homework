package com.userfiling.UserFiling.repositories;

import com.userfiling.UserFiling.models.File;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileRepository extends JpaRepository<File, Long> {
}
