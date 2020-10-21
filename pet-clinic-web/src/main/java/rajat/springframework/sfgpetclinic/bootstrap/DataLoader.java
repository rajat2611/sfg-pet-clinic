package rajat.springframework.sfgpetclinic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import rajat.springframework.sfgpetclinic.model.Owner;
import rajat.springframework.sfgpetclinic.model.Vet;
import rajat.springframework.sfgpetclinic.services.OwnerService;
import rajat.springframework.sfgpetclinic.services.VetService;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }


    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Anish");
        owner1.setLastName("Ranjan");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Nitika");
        owner2.setLastName("Rajinder");

        ownerService.save(owner2);

        System.out.println("Loaded owners...");

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("sam");
        vet1.setLastName("axe");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setFirstName("Anmol");
        vet2.setLastName("Khandekar");

        vetService.save(vet2);

        System.out.println("Loaded  Vets...");
    }
}
