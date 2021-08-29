package pl.coderslab.charity.Donation;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Service
@RequiredArgsConstructor
@RequestMapping("/donation")
public class DonationController {


    @GetMapping("/form")
    public String donationForm(){
        return "/donation/form";
    }

}
