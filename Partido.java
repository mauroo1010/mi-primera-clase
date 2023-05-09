public class Partido{
    private String nombreEstadio;
    private int numeroJugadores;
    private boolean dia;

    public Partido(String nombreEst, int numJug){
        nombreEstadio = nombreEst;
        numeroJugadores = numJug;
        dia = false;
    }

    public String getNombreEstadio(){
        return nombreEstadio;
    }

    public int getNumeroJugadores(){
        return numeroJugadores;
    }

    public boolean getDia(){
        return dia;
    }

    public void setNombreEstadio(String nuevoNombre){
        nombreEstadio = nuevoNombre;
    }

    public void setJugadoresJuegaPartido(int numeroRevulsivos){
        numeroJugadores= numeroJugadores - numeroRevulsivos;
    }

    public void setCambiarDia(){
        dia = !dia;
    }

    public void imprimirDetalles(){
        if(dia = false){
            System.out.println("Nombre del estadio: " + nombreEstadio + "| Numero de jugadores: " + numeroJugadores + "| dia: si");
        }
        else{
            System.out.println("Nombre del estadio: " + nombreEstadio + "| Numero de jugadores: " + numeroJugadores + "| dia: no");
        }
    }

    public String getDetalles(){
        String resultado = "";
        if(dia = false){
            resultado = "Nombre del estadio: " + nombreEstadio + "| Numero de jugadores: " + numeroJugadores + "| dia: si";
        }
        else{
            resultado = "Nombre del estadio: " + nombreEstadio + "| Numero de jugadores: " + numeroJugadores + "| dia: no";
        }
        return resultado;
    }
}