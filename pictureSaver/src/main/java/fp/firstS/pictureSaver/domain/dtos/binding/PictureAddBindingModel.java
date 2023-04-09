package fp.firstS.pictureSaver.domain.dtos.binding;

import jakarta.validation.constraints.NotEmpty;

public class PictureAddBindingModel {

    private Long id;

    @NotEmpty
    private String author;
    @NotEmpty
    private String imageUrl;

    public Long getId() {
        return id;
    }

    public PictureAddBindingModel setId(Long id) {
        this.id = id;
        return this;
    }

    public String getAuthor() {
        return author;
    }

    public PictureAddBindingModel setAuthor(String author) {
        this.author = author;
        return this;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public PictureAddBindingModel setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
}
