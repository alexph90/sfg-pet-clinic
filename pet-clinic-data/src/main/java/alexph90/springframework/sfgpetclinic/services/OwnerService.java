package alexph90.springframework.sfgpetclinic.services;

import alexph90.springframework.sfgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
