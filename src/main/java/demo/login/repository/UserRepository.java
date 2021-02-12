package demo.login.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import demo.login.data.User;

@Repository
public interface UserRepository extends JpaRepository<User, String> {

	Optional<User> findByEnrollmentNo(Long enrollmentNo);

	Boolean existsByEnrollmentNo(Long enrollmentNo);

}
