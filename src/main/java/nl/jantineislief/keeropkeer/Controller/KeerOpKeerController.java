package nl.jantineislief.keeropkeer.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class KeerOpKeerController {

    @GetMapping("/")
    public String getKeerOpKeer() {
        return "game";
    }

}
