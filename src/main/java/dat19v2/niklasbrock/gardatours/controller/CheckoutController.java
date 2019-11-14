package dat19v2.niklasbrock.gardatours.controller;

import dat19v2.niklasbrock.gardatours.model.Bestilling;
import dat19v2.niklasbrock.gardatours.model.Kunde;
import dat19v2.niklasbrock.gardatours.model.Rute;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;

@Controller
public class CheckoutController {
    @PostMapping("/checkout")
    public String checkout(Kunde kunde, HttpSession httpSession, Model model, int antal){
//        (Ruter) is called casting, eller at caste
        model.addAttribute("bestilling", new Bestilling(kunde, (Rute) httpSession.getAttribute("rute"), antal));
//        TODO Send det bestillings objekt til Databasen
        return "confirmation";
    }
}
