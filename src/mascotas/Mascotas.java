
package mascotas;

import java.util.*;


public class Mascotas {

    public static void main(String[] args) {
        List<Mascota> mascotas=new ArrayList<>();
        
        mascotas.add(new Gato("Micifuz"));
        mascotas.add(new Perro("Firulais"));
        mascotas.add(new Gato("Mechas"));
        mascotas.add(new Perro("Huesos"));
        mascotas.add(new Gato("Pancho"));
        mascotas.add(new Loro("Roberto"));
        
        for(Mascota m:mascotas){
            System.out.println(m.getNombre()+ " dice \""+m.hablar()+"\"");
        }
        
    }
    
}
