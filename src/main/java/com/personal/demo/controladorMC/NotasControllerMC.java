package com.personal.demo.controladorMC;

import com.personal.demo.ServiceMC.NotasServiceMC;
import com.personal.demo.modeloMC.NotasMC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

    @PostMapping("/agregar")
    public String save(@RequestBody NotasMC nota, Model model){
        int id = serviceMC.Add(nota);
        if(id==0){
            return "No se pudo Registrar";
        }
        return "Se registro con exito";
    }

    @PostMapping("/actualizar/{id}")
	public String save(@RequestBody NotasMC nota,@PathVariable int id,Model model) {
		nota.setId(id);
		int r=serviceMC.Edit(nota);
		if(r==0) {
			return "No se pudo Actualizar!";
		}
		return "Se actualizó con éxito!";
	}

    @PostMapping("/eliminar/{id}")
	public String delete(@PathVariable int id,Model model) {
		int r=serviceMC.Delet(id);
		if(r==0) {
			return "Registro No Eliminado!";
		}
		return "Registro Eliminado!";
	}
}