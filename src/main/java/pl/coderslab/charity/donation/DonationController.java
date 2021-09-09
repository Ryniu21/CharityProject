package pl.coderslab.charity.donation;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.coderslab.charity.category.Category;
import pl.coderslab.charity.category.CategoryService;
import pl.coderslab.charity.institution.Institution;
import pl.coderslab.charity.institution.InstitutionService;

import java.util.List;

@Service
@RequiredArgsConstructor
@RequestMapping("/donation")
public class DonationController {
    public final DonationService donationService;
    public final CategoryService categoryService;
    public final InstitutionService institutionService;

    @GetMapping("/form")
    public String donationForm(Model model){
        model.addAttribute("donation", new Donation());
        List<Category> categories = categoryService.findAllCategories();
        model.addAttribute("categories", categories);
        List<Institution> institutions = institutionService.findAllInstitutions();
        model.addAttribute("institutions", institutions);
        return "/donation/form";
    }

    @PostMapping("/form")
    public String donationForm(Donation donation, BindingResult result){
        donationService.saveDonation(donation);
        return "redirect:/donation/form-confirmation";
    }

    @GetMapping("/form/confirmation")
    public String donationFormConfirmation(Model model) {
        model.addAttribute("donation", new Donation());
        return "donation/form";
    }

}
