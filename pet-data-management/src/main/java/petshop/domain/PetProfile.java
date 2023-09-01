package petshop.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import petshop.PetDataManagementApplication;
import petshop.domain.PetProfileCreated;

@Entity
@Table(name = "PetProfile_table")
@Data
//<<< DDD / Aggregate Root
public class PetProfile {

    @Id
    private String petType;

    private int age;

    private String size;

    private String gender;

    private String preferences;

    private String needs;

    @ElementCollection
    private List<Allegy> allegies;

    @PostPersist
    public void onPostPersist() {
        PetProfileCreated petProfileCreated = new PetProfileCreated(this);
        petProfileCreated.publishAfterCommit();
    }

    @PrePersist
    public void onPrePersist() {}

    public static PetProfileRepository repository() {
        PetProfileRepository petProfileRepository = PetDataManagementApplication.applicationContext.getBean(
            PetProfileRepository.class
        );
        return petProfileRepository;
    }
}
//>>> DDD / Aggregate Root
