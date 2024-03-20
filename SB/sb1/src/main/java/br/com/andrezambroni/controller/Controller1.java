package br.com.andrezambroni.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/Controller1")

public class Controller1 {

  @GetMapping("/primeiroMetodo/{id}")
  public String primeiroMetodo(@PathVariable String id){
    return "O parametro é" + id;

  }

  @GetMapping("/metodoComQueryParams")
  public String metodoComQueryParams(@RequestParam String id) {
      return "O parametro com metodo query params é: " + id; 
  }
  
}
