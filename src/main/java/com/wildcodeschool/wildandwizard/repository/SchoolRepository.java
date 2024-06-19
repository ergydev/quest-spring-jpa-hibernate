package com.wildcodeschool.wildandwizard.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.wildcodeschool.wildandwizard.entity.School;
import java.util.Optional;

@Repository
public interface SchoolRepository extends JpaRepository<School, Long>{
    Optional<School> findById(Long id);
    void deleteById(Long id);
}
