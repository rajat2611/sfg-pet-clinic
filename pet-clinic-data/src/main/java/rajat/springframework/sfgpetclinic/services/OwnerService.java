package rajat.springframework.sfgpetclinic.services;

import rajat.springframework.sfgpetclinic.model.Owner;


public interface OwnerService extends CrudService<Owner,Long> {

    Owner findByLastName(String lastname);

}
