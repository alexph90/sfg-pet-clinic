package alexph90.springframework.sfgpetclinic.repositories;

import alexph90.springframework.sfgpetclinic.model.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
