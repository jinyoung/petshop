package petshop.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import petshop.SocialMediaInteractionApplication;
import petshop.domain.SocialMediaPostShared;

@Entity
@Table(name = "SocialMediaPost_table")
@Data
//<<< DDD / Aggregate Root
public class SocialMediaPost {

    @Id
    private String postId;

    private String content;

    private String imageUrl;

    @PostPersist
    public void onPostPersist() {
        SocialMediaPostShared socialMediaPostShared = new SocialMediaPostShared(
            this
        );
        socialMediaPostShared.publishAfterCommit();
    }

    @PrePersist
    public void onPrePersist() {}

    public static SocialMediaPostRepository repository() {
        SocialMediaPostRepository socialMediaPostRepository = SocialMediaInteractionApplication.applicationContext.getBean(
            SocialMediaPostRepository.class
        );
        return socialMediaPostRepository;
    }
}
//>>> DDD / Aggregate Root
