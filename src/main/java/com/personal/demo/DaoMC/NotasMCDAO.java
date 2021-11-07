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
    public int Add(NotasMC nota) {
        String sql = "insert into notas(titulo,descripcion,fecha,usuario)values(?,?,?,?)";
		return template.update(sql, nota.getTitulo(), nota.getDescripcion(), nota.getFecha(), nota.getUsuario());
    }

    @Override
    public int Edit(NotasMC nota) {
        // TODO Auto-generated method stub
        String sql="update notas set titulo=?, descripcion=?, fecha=?, usuario=? where id=?";		
		return template.update(sql,nota.getTitulo(),nota.getDescripcion(),nota.getFecha(),nota.getUsuario(),nota.getId());
    }

    @Override
    public int Delet(int id) {
        // TODO Auto-generated method stub
        String sql="delete from notas where id=?";
		return template.update(sql,id);
    }


}