package fr.dawan.quiz.repositories;

import fr.dawan.quiz.entities.BaseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface GenericRepository<T extends BaseEntity> extends JpaRepository<T,Long> {

    int removeById(long id);

}
