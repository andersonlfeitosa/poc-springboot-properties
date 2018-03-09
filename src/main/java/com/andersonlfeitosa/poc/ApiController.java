package com.andersonlfeitosa.poc;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

  @Value(value = "${param.nomeCompleto}")
  private String nomeCompleto;

  @Value(value = "${param.sobrenome}")
  private String sobrenome;

  @Value(value = "${param.nome}")
  private String nome;

  @GetMapping("/nome-completo")
  public String sayHello() {
    return "Olá '" + nomeCompleto + "'";
  }

  @GetMapping("/nome")
  public String sayHello2() {
    return "Olá '" + nome + "'";
  }

  @GetMapping("/sobrenome")
  public String sayHello3() {
    return "Olá '" + sobrenome + "'";
  }

}
