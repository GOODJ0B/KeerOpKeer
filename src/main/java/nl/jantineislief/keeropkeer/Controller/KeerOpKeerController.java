package nl.jantineislief.keeropkeer.Controller;

import nl.jantineislief.keeropkeer.Model.Player;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class KeerOpKeerController {

    @GetMapping("/")
    public String getKeerOpKeer() {
        return "game";
    }


    @PostMapping("/getBoard")
    public @ResponseBody Player getBoard(@RequestParam String name){
        return new Player(name);
    }
}
