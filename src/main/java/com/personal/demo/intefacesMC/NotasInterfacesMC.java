package com.personal.demo.intefacesMC;

import java.util.List;
import java.util.Map;

import com.personal.demo.modeloMC.NotasMC;

public interface NotasInterfacesMC {
    
    public List<Map<String, Object>> listar();
    public List<Map<String, Object>> listar(int id);
    public NotasMC Add(NotasMC nota);
    public NotasMC Edit(NotasMC nota);
    public void Delet(int id);
}
