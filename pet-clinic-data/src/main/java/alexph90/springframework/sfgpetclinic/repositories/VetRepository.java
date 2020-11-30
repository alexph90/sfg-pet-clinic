package alexph90.springframework.sfgpetclinic.repositories;

import alexph90.springframework.sfgpetclinic.model.Vet;
import org.springframework.data.repository.CrudRepository;

public interface VetRepository extends CrudRepository<Vet, Long> {
}
