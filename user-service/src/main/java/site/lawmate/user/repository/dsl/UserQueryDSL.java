package site.lawmate.user.repository.dsl;

import java.util.List;
import java.util.Optional;

import site.lawmate.user.domain.model.User;
public interface UserQueryDSL {
    Boolean existsByIdDSL(Long id);
    Boolean existsByEmailDSL(String email);
    Long countDSL();
    List<User> findAllDSL();
    Optional<User> findByIdDSL(Long id);
    Optional<User> findByEmailDSL(String email);
}