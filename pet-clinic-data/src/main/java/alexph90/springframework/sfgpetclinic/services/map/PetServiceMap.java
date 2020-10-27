package alexph90.springframework.sfgpetclinic.services.map;

import alexph90.springframework.sfgpetclinic.model.Pet;
import alexph90.springframework.sfgpetclinic.services.CrudService;

import java.util.Set;

public class PetServiceMap extends AbstractMapService<Pet, Long> implements CrudService<Pet, Long> {

    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Pet save(Pet pet) {
        return super.save(pet.getId(), pet);
    }

    @Override
    public void delete(Pet pet) {
        super.delete(pet);
    }

    @Override
    void deleteById(Long aLong) {
        super.deleteById(aLong);
    }

}
