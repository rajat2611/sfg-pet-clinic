package rajat.springframework.sfgpetclinic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import rajat.springframework.sfgpetclinic.model.Owner;
import rajat.springframework.sfgpetclinic.model.Pet;
import rajat.springframework.sfgpetclinic.model.PetType;
import rajat.springframework.sfgpetclinic.model.Vet;
import rajat.springframework.sfgpetclinic.services.OwnerService;
import rajat.springframework.sfgpetclinic.services.PetTypeService;
import rajat.springframework.sfgpetclinic.services.VetService;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }


    @Override
    public void run(String... args) throws Exception {

        PetType dog = new PetType();
        dog.setName("Dog");
        PetType savedDogPetType = petTypeService.save(dog);

        PetType cat = new PetType();
        cat.setName("Cat");
        PetType savedCatPetType = petTypeService.save(cat);

        Owner owner1 = new Owner();
        owner1.setFirstName("Anish");
        owner1.setLastName("Ranjan");
        owner1.setAddress("Mission");
        owner1.setCity("Kansas");
        owner1.setTelephone("789456123");

        Pet anishsPet = new Pet();
        anishsPet.setName("Junior");
        anishsPet.setPetType(savedDogPetType);
        anishsPet.setOwner(owner1);
        anishsPet.setBirthDate(LocalDate.now());
        owner1.getPets().add(anishsPet);

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Nitika");
        owner2.setLastName("Rajinder");
        owner2.setAddress("Somewhere");
        owner2.setCity("Atlanta");
        owner2.setTelephone("741258963");

        Pet nitikasCat = new Pet();
        nitikasCat.setName("June");
        nitikasCat.setOwner(owner2);
        nitikasCat.setBirthDate(LocalDate.now());
        nitikasCat.setPetType(savedCatPetType);
        owner2.getPets().add(nitikasCat);

        ownerService.save(owner2);

        System.out.println("Loaded owners...");

        Vet vet1 = new Vet();
        vet1.setFirstName("sam");
        vet1.setLastName("axe");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Anmol");
        vet2.setLastName("Khandekar");

        vetService.save(vet2);

        System.out.println("Loaded  Vets...");
    }
}
