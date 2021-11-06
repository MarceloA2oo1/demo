package com.personal.demo.controladorMC;

import com.personal.demo.ServiceMC.NotasServiceMC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(path = "/notas")
public class NotasControllerMC {

    @Autowired
    NotasServiceMC serviceMC;

    @GetMapping("/listar")
    public List<Map<String, Object>> listar(){
        return serviceMC.listar();
    }
}