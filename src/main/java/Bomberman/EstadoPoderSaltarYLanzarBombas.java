package Bomberman;

public class EstadoPoderSaltarYLanzarBombas extends EstadoPoderLanzarBombas {

    public EstadoPoderSaltarYLanzarBombas(int alcance, int velocidadExplosion){
        super(alcance,velocidadExplosion);
    }

    @Override
    public boolean tienePoderSaltarPared(){return true;}

    @Override
    public boolean tienePoderLanzarBombas(){return true;}
}