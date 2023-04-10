package fp.firstS.pictureSaver.service;

import fp.firstS.pictureSaver.domain.dtos.view.PictureView;
import fp.firstS.pictureSaver.domain.entities.PicturesEntity;
import fp.firstS.pictureSaver.repository.PictureRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class PictureService {

    private final PictureRepository pictureRepository;

    public PictureService(PictureRepository pictureRepository) {
        this.pictureRepository = pictureRepository;
    }


    public Page<PictureView> getAllPictures(Pageable pageable) {
        return
                pictureRepository.
                        findAll(pageable).
                        map(this::map);
    }

    private PictureView map(PicturesEntity picturesEntity) {
        return new PictureView()
                .setId(picturesEntity.getId())
                .setImageUrl(picturesEntity.getImageUrl())
                .setAuthor(picturesEntity.getAuthor());
    }
}
