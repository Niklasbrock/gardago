package dat19v2.niklasbrock.gardatours.controller;

import dat19v2.niklasbrock.gardatours.model.Kunde;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CheckoutController {
    @PostMapping("/confirmation")
    public String confirmation(Kunde kunde){

        return "confirmation";
    }

}
