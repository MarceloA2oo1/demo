package com.personal.demo.DaoMC;

import java.util.List;
import java.util.Map;

import com.personal.demo.intefacesMC.NotasInterfacesMC;
import com.personal.demo.modeloMC.NotasMC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class NotasMCDAO implements NotasInterfacesMC{

    @Autowired
    JdbcTemplate template;

    @Override
    public List<Map<String, Object>> listar() {
        List<Map<String, Object>>lista = template.queryForList("select * from notas");
        return lista;
    }

    @Override
    public List<Map<String, Object>> listar(int id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public NotasMC Add(NotasMC nota) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public NotasMC Edit(NotasMC nota) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void Delet(int id) {
        // TODO Auto-generated method stub
        
    }


}