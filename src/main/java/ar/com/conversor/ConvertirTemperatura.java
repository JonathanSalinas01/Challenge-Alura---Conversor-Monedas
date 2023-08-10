package ar.com.conversor;

public class ConvertirTemperatura {
    private double resultado;
    
    public double convertirTemepratura(String de, String a, double valorInicial){
        if(de == "Grados Celcius" && a == "Grados Farenheit"){
            this.resultado = ((valorInicial * 9 / 5) + 32);
        }
        if(de == "Grados Celcius" && a == "Grados Kelvin"){
            this.resultado = valorInicial + 273.15;
        }
        if(de == "Grados Celcius" && a == "Grados Celcius"){
            this.resultado = valorInicial;
        }
        if(de == "Grados Farenheit" && a == "Grados Celcius"){
            this.resultado = ((valorInicial - 32) * 5 / 9);
        }
        if(de == "Grados Farenheit" && a == "Grados Kelvin"){
            this.resultado = ((valorInicial - 32) * 5 / 9 + 273.15);
        }
        if(de == "Grados Farenheit" && a == "Grados Farenheit"){
            this.resultado = valorInicial;
        }
        if(de == "Grados Kelvin" && a == "Grados Celcius"){
            this.resultado = valorInicial - 273.15;
        }
        if(de == "Grados Kelvin" && a == "Grados Farenheit"){
            this.resultado = (valorInicial - 273.15) * 9 / 5 + 32;
        }
        if(de == "Grados Kelvin" && a == "Grados Kelvin"){
            this.resultado = valorInicial;
        }
        return this.resultado;
    }
}
