package pl.coderslab.charity.user;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.coderslab.charity.donation.Donation;

import javax.validation.Valid;


@Service
@RequiredArgsConstructor
@RequestMapping("/register")
public class UserController {
    public final UserService userService;


    @GetMapping("/form")
    public String userRegisterFormGet(Model model){
        model.addAttribute("user", new User());
        return "/register/form";
    }

    @PostMapping("/form")
    public String userRegisterFormPost(User user, BindingResult result){
        userService.saveUser(user);
        return "redirect:/donation/form";
    }

}
