package pl.coderslab.charity;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pl.coderslab.charity.donation.DonationService;
import pl.coderslab.charity.institution.Institution;
import pl.coderslab.charity.institution.InstitutionService;

import java.util.List;


@Controller
@RequiredArgsConstructor
public class HomeController {
    public final DonationService donationService;
    public final InstitutionService institutionService;

    @GetMapping("/")
    public String homeAction(Model model){
        Integer sumOfAllDonations = donationService.sumOfAllDonations();
        Integer countOfAllDonations = donationService.countOfAllDonations();
        List<Institution> findAllInstitutions = institutionService.findAllInstitutions();

        model.addAttribute("sumOfAllDonations",sumOfAllDonations);
        model.addAttribute("countOfAllDonations", countOfAllDonations);
        model.addAttribute("findAllInstitutions", findAllInstitutions);

        return "index";
    }
}
