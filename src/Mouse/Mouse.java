package Mouse;

public class Mouse{

    int dpi, anchura, altura, botones, posicionX, posicionY;
    boolean conexionBlue, conexionUsb, rueda;
    String tipoLector;

    public Mouse(int dpi, int anchura, int altura, int botones, boolean rueda, String tipoLector, boolean conexionBlue, boolean conexionUsb){

        this.posicionX = 0;
        this.posicionY = 0;
        this.botones = botones;
        this.dpi = dpi;
        this.anchura = anchura;
        this.altura = altura;
        this.rueda = rueda;
        this.tipoLector = tipoLector;
        this.conexionBlue = conexionBlue;
        this.conexionUsb = conexionUsb;

    }

    public void Mover(int x, int y){
        System.out.println("Moviendo posicion del cursor");
        int movX = x * this.dpi;
        int movY = y * this.dpi;
        this.posicionX += movX;
        this.posicionY += movY;
        System.out.println("La posicion del cursor es: " + this.posicionX + "," + this.posicionY);
    }


    
    public int getPosicionX() {
        return posicionX;
    }

    public void setPosicionX(int posicionX) {
        this.posicionX = posicionX;
    }

    public int getPosicionY() {
        return posicionY;
    }

    public void setPosicionY(int posicionY) {
        this.posicionY = posicionY;
    }

    public boolean isRueda() {
        return rueda;
    }

    public void setRueda(boolean rueda) {
        this.rueda = rueda;
    }

    public int getDpi() {
        return dpi;
    }

    public void setDpi(int dpi) {
        this.dpi = dpi;
    }

    public int getAnchura() {
        return anchura;
    }

    public void setAnchura(int anchura) {
        this.anchura = anchura;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getBotones() {
        return botones;
    }

    public void setBotones(int botones) {
        this.botones = botones;
    }

    public boolean isConexionBlue() {
        return conexionBlue;
    }

    public void setConexionBlue(boolean conexionBlue) {
        this.conexionBlue = conexionBlue;
    }

    public boolean isConexionUsb() {
        return conexionUsb;
    }

    public void setConexionUsb(boolean conexionUsb) {
        this.conexionUsb = conexionUsb;
    }

    public String getTipoLector() {
        return tipoLector;
    }

    public void setTipoLector(String tipoLector) {
        this.tipoLector = tipoLector;
    }

    @Override
    public String toString() {
        return "Mouse [dpi=" + dpi + ", anchura=" + anchura + ", altura=" + altura + ", botones=" + botones
                + ", posicionX=" + posicionX + ", posicionY=" + posicionY + ", conexionBlue=" + conexionBlue
                + ", conexionUsb=" + conexionUsb + ", rueda=" + rueda + ", tipoLector=" + tipoLector + "]";
    }

    

}