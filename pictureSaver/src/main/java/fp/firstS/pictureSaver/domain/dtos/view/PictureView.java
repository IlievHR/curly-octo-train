package fp.firstS.pictureSaver.domain.dtos.view;

public class PictureView {

    private Long id;

    private String author;

    private String imageUrl;

    public Long getId() {
        return id;
    }

    public PictureView setId(Long id) {
        this.id = id;
        return this;
    }

    public String getAuthor() {
        return author;
    }

    public PictureView setAuthor(String author) {
        this.author = author;
        return this;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public PictureView setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
}
