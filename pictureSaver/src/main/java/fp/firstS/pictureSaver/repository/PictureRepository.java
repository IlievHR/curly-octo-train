package fp.firstS.pictureSaver.repository;

import fp.firstS.pictureSaver.domain.entities.PicturesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PictureRepository extends JpaRepository<PicturesEntity, Long> {

    Optional<PicturesEntity> findPictureEntityById(Long id);
}
