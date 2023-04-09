package fp.firstS.pictureSaver.repository;

import fp.firstS.pictureSaver.domain.entities.UserRoleEntity;
import fp.firstS.pictureSaver.domain.enums.UserRoleEnum;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<UserRoleEntity, String> {
    Optional<UserRoleEntity> findByRole(UserRoleEnum role);
}
