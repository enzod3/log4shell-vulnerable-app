package fr.christophetd.log4shell.vulnerableapp;


import fr.christophetd.log4shell.vulnerableapp.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@RestController
public class MainController {

    private static final Logger logger = LogManager.getLogger("testlogger");

    // @GetMapping("/")
    // public String index(@RequestHeader("User-Agent") String ua) {
    //     logger.info("Received a request with UA " + ua);
    //     return "Testing";
    // }

    @PostMapping("/signIn")
    public String processForm(User user) {
        logger.info("New sign in request with email: " + user.getEmail());
        return "Signed in with email: "+ user.getEmail();
    }



}