package io.takima.demo.controllers;

import io.takima.demo.models.Cv;
import io.takima.demo.models.Utilisateur;
import io.takima.demo.service.CvService;
import io.takima.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@CrossOrigin("*")
public class WebController {

    @Autowired
    private CvService cvService;

    @Autowired
    private UserService userService;

    @PostMapping("/mysave")
    public Utilisateur saveUser(@RequestBody Utilisateur utilisateur){
        return userService.save(utilisateur);
    }

    @DeleteMapping("/mydeleteUser/{idu}")
    public void deleteUser(@PathVariable Long idu) {
        userService.deleteUser(idu);
    }

    @PostMapping("/myaddUser")
    public Utilisateur addUser(@RequestBody Utilisateur utilisateur) {
        return userService.addUser(utilisateur);
    }

    @GetMapping("/myfindAllCv")
    public List<Cv> findAllCv() {
        return cvService.findAllCv() ;
    }

    @DeleteMapping("/mydeleteCv/{id}")
    public void deleteCv(@PathVariable Long idu,@RequestBody Cv cv) {
        cvService.deleteCv(idu);
    }

    @PostMapping("/myaddCv")
    public void addCv(@RequestBody Cv cv) {
        cvService.save2(cv);
    }

    //khass tzid les webservices signup sign in hna

}
