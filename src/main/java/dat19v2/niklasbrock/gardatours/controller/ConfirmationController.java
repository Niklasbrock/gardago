package dat19v2.niklasbrock.gardatours.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ConfirmationController {
    @GetMapping("/confirmation")
            public String confirmation() {
                return "confirmation";
            }
}
