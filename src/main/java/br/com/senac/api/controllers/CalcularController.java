package br.com.senac.api.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/calcular")

public class CalcularController {

    @GetMapping("/soma")
    public ResponseEntity<Integer> soma(@RequestParam int a, @RequestParam int b){

        return ResponseEntity.ok(a+b);
    }

    @GetMapping("/subtracao")
    public ResponseEntity<Integer> subtracao(@RequestParam int c, @RequestParam int d){


        return ResponseEntity.ok(c-d);
    }

    @GetMapping("/divisao")
    public ResponseEntity<Integer> divisao(@RequestParam Integer e, @RequestParam Integer f){

        return ResponseEntity.ok( e/f);
    }

    @GetMapping("/multiplicar")
    public ResponseEntity<Integer> multiplicar(@RequestParam int g, @RequestParam int h){


        return ResponseEntity.ok(g*h);
    }


}
