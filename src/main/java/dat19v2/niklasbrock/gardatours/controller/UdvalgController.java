package dat19v2.niklasbrock.gardatours.controller;

import dat19v2.niklasbrock.gardatours.model.Ruter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpSession;

@Controller
public class UdvalgController {
    @GetMapping("/")
    public String home() {
        return "udvalg";
    }
    @GetMapping("/tour1")
    public String tour1(HttpSession httpSession, Model model) {
        Ruter rute = new Ruter("Garda til helvede", 666, "Du har valgt turen fra Garda til Helvede, en af vores mest luksuriøse valg");
        model.addAttribute("rute", rute);
        return "checkout";
    }
    @GetMapping("/tour2")
    public String tour2() {
        return "checkout";
    }
    @GetMapping("/tour3")
    public String tour3() {
        return "checkout";
    }
    @GetMapping("/tour4")
    public String tour5() {
        return "checkout";
    }
//    @GetMapping("/tourvalg")
//    public String tourvalg(HttpSession httpSession, Model model){
//
//    }
}
