package alexph90.springframework.sfgpetclinic.repositories;

import alexph90.springframework.sfgpetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
