package dat19v2.niklasbrock.gardatours.controller;

import dat19v2.niklasbrock.gardatours.model.Rute;
import dat19v2.niklasbrock.gardatours.service.RuteDAO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class UdvalgController {
    RuteDAO rutedao = new RuteDAO();
    List<Rute> ruter = rutedao.select();

    @GetMapping("/")
    public String home(ModelMap modelMap) {
        modelMap.clear();
        return "udvalg";
    }

    @GetMapping("/tour1")
    public String tour1(HttpSession httpSession, Model model) {
        model.addAttribute("rute", ruter.get( 0 ) );
        httpSession.setAttribute("rute", ruter.get( 0 ) );
        return "checkout";
    }

    @GetMapping("/tour2")
    public String tour2(HttpSession httpSession, Model model ) {
        model.addAttribute("rute", ruter.get( 1 ) );
        httpSession.setAttribute("rute", ruter.get( 1 ) );
        return "checkout";
    }
    @GetMapping("/tour3")
    public String tour3(HttpSession httpSession, Model model ) {
        model.addAttribute("rute", ruter.get( 2 ) );
        httpSession.setAttribute("rute", ruter.get( 2 ) );
        return "checkout";
    }
    @GetMapping("/tour4")
    public String tour5(HttpSession httpSession, Model model ) {
        model.addAttribute("rute", ruter.get( 3 ) );
        httpSession.setAttribute("rute", ruter.get( 3 ) );
        return "checkout";
    }
//    @GetMapping("/tourvalg")
//    public String tourvalg(HttpSession httpSession, Model model){
//
//    }
}
