package pl.coderslab.charity.donation;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class DonationService {
    private final DonationRepository donationRepository;

    public Integer sumOfAllDonations(){return donationRepository.sumOfAllDonations();}

    public Integer countOfAllDonations(){return donationRepository.countOfAllDonations();}

    public void saveDonation(Donation donation){donationRepository.save(donation);}

}
