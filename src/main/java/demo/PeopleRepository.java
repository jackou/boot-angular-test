package demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;

/**
 * @author jaakkoe
 */
@RepositoryRestResource(path = "people")
public interface PeopleRepository extends JpaRepository<Person, Long> {
}
