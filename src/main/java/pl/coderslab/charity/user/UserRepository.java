package pl.coderslab.charity.user;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.coderslab.charity.donation.Donation;

public interface UserRepository  extends JpaRepository<Donation, Long> {
}
