package webprog.oblig2_;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

@RestController
public class KinoBilletController {
    /*Liste<Her skriver jeg Type> variabler =new ArryList();*/
   List<Billet> allebilletter =new ArrayList<>();

    @PostMapping("/kjopbillet")
    public void kjop( Billet billett){
         allebilletter.add(billett);
    }


    @GetMapping("/hentbiletter")
    public List<Billet> Billet(){
        return allebilletter;
    }

    @GetMapping("/slettAlleBilletter")
    public void slett(){
        allebilletter.clear();
    }
    }





