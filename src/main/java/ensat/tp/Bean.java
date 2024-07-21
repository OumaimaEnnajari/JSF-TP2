package ensat.tp;

import java.util.List;
import java.util.ArrayList;

public class Bean {
	private int nombre;  
	  
    public int getNombre() {  
        return nombre;  
    }  
  
    public void setNombre(int nombre) {  
        this.nombre = nombre;  
    }  
  
    public List<Integer> getNombresSuivants() {  
        int nb = 5;  
        List<Integer> t = new ArrayList<>(nb);  
        for (int i = nombre; i < nombre + nb; i++) {  
            t.add(i);  
        }  
        return t;  
    }  
}
