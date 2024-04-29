package Temperatura;

public class ConvertidorTemperatura {

    double temperatura;
    String unidadInicial, unidadFinal;

    public ConvertidorTemperatura(double temperatura, String unidadInicial, String unidadFinal) {

        this.temperatura = temperatura;
        this.unidadInicial = unidadInicial;
        this.unidadFinal = unidadFinal;

    }

    public double convertir() {
        if (unidadInicial.equals("Celsius")) {
            if (unidadFinal.equals("Fahrenheit")) {
                return (9.0 / 5.0) * temperatura + 32;
            } else if (unidadFinal.equals("Kelvin")) {
                return temperatura + 273.15;
            }
        } else if (unidadInicial.equals("Fahrenheit")) {
            if (unidadFinal.equals("Celsius")) {
                return (5.0 / 9.0) * (temperatura - 32);
            } else if (unidadFinal.equals("Kelvin")) {
                return (5.0 / 9.0) * (temperatura - 32) + 273.15;
            }
        } else if (unidadInicial.equals("Kelvin")) {
            if (unidadFinal.equals("Celsius")) {
                return temperatura - 273.15;
            } else if (unidadFinal.equals("Fahrenheit")) {
                return (9.0 / 5.0) * (temperatura - 273.15) + 32;
            }
        }
        return temperatura; // Retorna la temperatura sin cambios si las unidades son las mismas
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public String getUnidadInicial() {
        return unidadInicial;
    }

    public void setUnidadInicial(String unidadInicial) {
        this.unidadInicial = unidadInicial;
    }

    public String getUnidadFinal() {
        return unidadFinal;
    }

    public void setUnidadFinal(String unidadFinal) {
        this.unidadFinal = unidadFinal;
    }

}
