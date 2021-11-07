package com.personal.demo.intefacesMC;

import java.util.List;
import java.util.Map;

import com.personal.demo.modeloMC.NotasMC;

public interface NotasInterfacesMC {
    
    public List<Map<String, Object>> listar();
    public List<Map<String, Object>> listar(int id);
    public int Add(NotasMC nota);
    public int Edit(NotasMC nota);
    public int Delet(int id);
}
