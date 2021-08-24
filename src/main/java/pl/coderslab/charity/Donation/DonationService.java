package pl.coderslab.charity.Donation;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class DonationService {
    private final DonationRepository donationRepository;

    public Integer sumOfAllDonations(){return donationRepository.SumOfAllDonations();}

    public Integer countOfAllDonations(){return donationRepository.CountOfAllDonations();}

}
