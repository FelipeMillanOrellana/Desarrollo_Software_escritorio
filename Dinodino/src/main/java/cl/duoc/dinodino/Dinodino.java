package cl.duoc.dinodino;

import cl.duoc.dinodino.DTO.Dinosaurio;
import cl.duoc.dinodino.DTO.EstegosaurioDTO;
import cl.duoc.dinodino.DTO.TiranosaurioDTO;
import cl.duoc.dinodino.DTO.VelocirraptorDTO;

public class Dinodino {

    public static void main(String[] args) {
        Dinosaurio dino = new Dinosaurio();
        dino.setId(1);
        dino.setNombre("Jorge");
        dino.setPeriodo("Mesozoica");
        dino.setCantPatas(4);
        dino.rugir("Guau");
        System.out.println(dino);
        
        VelocirraptorDTO velo= new VelocirraptorDTO();
        System.out.println(velo);
        
        TiranosaurioDTO tira=new TiranosaurioDTO();
        System.out.println(tira);
        
        EstegosaurioDTO este = new EstegosaurioDTO();
        System.out.println(este);
    }
}
