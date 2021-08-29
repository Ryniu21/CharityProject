package pl.coderslab.charity.Institution;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pl.coderslab.charity.Donation.Donation;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public interface InstitutionRepository extends JpaRepository<Institution, Long> {

    @Query("SELECT i FROM Institution i")
    List<Institution> findAllInstitutions();
}
