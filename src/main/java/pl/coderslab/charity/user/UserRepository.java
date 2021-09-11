package pl.coderslab.charity.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.coderslab.charity.donation.Donation;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface UserRepository  extends JpaRepository<User, Long> {
}
