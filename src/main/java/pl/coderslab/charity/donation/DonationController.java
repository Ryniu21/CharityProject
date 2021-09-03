package pl.coderslab.charity.donation;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.coderslab.charity.category.Category;
import pl.coderslab.charity.category.CategoryService;

import java.util.List;

@Service
@RequiredArgsConstructor
@RequestMapping("/donation")
public class DonationController {
    public final DonationService donationService;
    public final CategoryService categoryService;

    @GetMapping("/form")
    public String donationForm(Model model){
        model.addAttribute("donation", new Donation());
        List<Category> categories = categoryService.findAllCategories();
        model.addAttribute("categories", categories);
        return "/donation/form";
    }

    @PostMapping("/form")
    @ResponseBody
    public String donationForm(Donation donation){
        return donation.toString();
    }

}
