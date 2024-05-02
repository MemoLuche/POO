package Electrodomesticos;

public class Television extends Electrodomesticos{

    boolean estado;
    String[] canalesVideo = {"HDMI", "VGA", "RCA", "ANTENA"};
    String canalVideo;
    int resolucion;
    int seleccionCanal;

    public Television(double precio, double peso, double altura, double longitud, int resolucion, String color, boolean estado){
        super(precio, peso, altura, longitud, color);

        this.resolucion = resolucion;
        this.estado = estado;
        this.canalVideo = canalesVideo[0];
    }
    
    public Television(double precio, double peso){
        super(precio, peso, 0, 0, null);

    }

    public Television(){
        super(0, 0, 0, 0, null);

    }

    public void prender(){

        if (this.estado = true){
            System.out.println("Ya esta prendida");
        } else {
            this.estado = true;
            System.out.println("Ya se prendio");
        }

    }
    
    public void apagar(){

        if (this.estado = true){
            this.estado = false;
            System.out.println("Ya se apago");
        } else {
            System.out.println("Ya esta apagada");
        }

    }

    public void cambiarCanal(int opcion){

        int i = 1;
        for (String canal : canalesVideo) {
            System.out.println(i + ". Canal:" + canal);
            i++;
        }
        this.canalVideo = canalesVideo[opcion - 1];
        System.out.println("Opcion deseada: " + opcion);
        System.out.println("Ya se cambio el canal a " + this.canalVideo);

    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String[] getCanalesVideo() {
        return canalesVideo;
    }

    public void setCanalesVideo(String[] canalesVideo) {
        this.canalesVideo = canalesVideo;
    }

    public String getCanalVideo() {
        return canalVideo;
    }

    public void setCanalVideo(String canalVideo) {
        this.canalVideo = canalVideo;
    }

    public int getSeleccionCanal() {
        return seleccionCanal;
    }

    public void setSeleccionCanal(int seleccionCanal) {
        this.seleccionCanal = seleccionCanal;
    }

    @Override
    public String toString() {
        return "Television [precio=" + precio + ", peso=" + peso + ", altura=" + altura + ", estado=" + estado
                + ", longitud=" + longitud + ", color=" + color
                + ", canalVideo=" + canalVideo + ", resolucion=" + resolucion + ", seleccionCanal=" + seleccionCanal
                + "]";
    }

}
