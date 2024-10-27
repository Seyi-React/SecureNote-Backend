package com.oluwaseyi.security.tuts.Security_Covered;



import org.springframework.web.bind.annotation.*;



@RestController
//@RequestMapping("")
public class AuthController {



    @GetMapping("/api/public")
    public  String sayPublic () {
        return "Hello i'm public";
    }

    @GetMapping("/users")
    public String listOfUsers() {
        return "Here are the list of the users";
    }


}

