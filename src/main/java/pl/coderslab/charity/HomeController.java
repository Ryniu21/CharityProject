package pl.coderslab.charity;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.coderslab.charity.Donation.Donation;
import pl.coderslab.charity.Donation.DonationService;
import pl.coderslab.charity.Institution.Institution;
import pl.coderslab.charity.Institution.InstitutionService;

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
