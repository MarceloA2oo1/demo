package com.personal.demo.ServiceMC;

import java.util.List;
import java.util.Map;

import com.personal.demo.DaoMC.NotasMCDAO;
import com.personal.demo.intefacesMC.NotasInterfacesMC;
import com.personal.demo.modeloMC.NotasMC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NotasServiceMC implements NotasInterfacesMC{

    @Autowired
    NotasMCDAO notaDao;

    @Override
    public List<Map<String, Object>> listar() {
        return notaDao.listar();
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
