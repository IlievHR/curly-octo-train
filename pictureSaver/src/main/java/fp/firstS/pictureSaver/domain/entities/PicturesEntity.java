package fp.firstS.pictureSaver.domain.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "pictures")
public class PicturesEntity  extends BaseEntity {

    @Column(nullable = false)
    private String author;
    @Column(nullable = false, columnDefinition = "TEXT")
    private String imageUrl;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private UserEntity user;



    public String getAuthor() {
        return author;
    }

    public PicturesEntity setAuthor(String author) {
        this.author = author;
        return this;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public PicturesEntity setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }

    public UserEntity getUser() {
        return user;
    }

    public PicturesEntity setUser(UserEntity user) {
        this.user = user;
        return this;
    }

}
