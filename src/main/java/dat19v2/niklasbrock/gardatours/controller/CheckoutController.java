package dat19v2.niklasbrock.gardatours.controller;

import dat19v2.niklasbrock.gardatours.model.Bestilling;
import dat19v2.niklasbrock.gardatours.model.Kunde;
import dat19v2.niklasbrock.gardatours.model.Ruter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CheckoutController {
    @PostMapping("/confirmation")
    public String checkout(Kunde kunde, Model model){
//        (Ruter) is called casting, eller at caste
        Bestilling bestilling = new Bestilling(kunde, (Ruter) model.getAttribute("rute"), 1);
        return "confirmation";
    }

}
