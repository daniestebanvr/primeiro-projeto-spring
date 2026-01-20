package dev.pantufa.CadastroDeSangue.Doador.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class DoadorController {

    @GetMapping("/sejaBemVindo")
    public String sejaBemVindo() {
        return "<h1>Esta é minha primeira mensagem. Seja Bem-Vindo!</h1>";
    }
}
