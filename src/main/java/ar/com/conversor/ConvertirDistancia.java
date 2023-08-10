package ar.com.conversor;


public class ConvertirDistancia {
    private double resultado;
    public double convertirDistancia(String de, String a, double valorInicial){
        if(de == "Metros" && a == "Kilómetros"){
            this.resultado = valorInicial / 1000; 
        }
        if(de == "Metros" && a == "Milímetros"){
            this.resultado = valorInicial * 1000; 
        }
        if(de == "Metros" && a == "Centímetros"){
            this.resultado = valorInicial * 100; 
        }
        if(de == "Metros" && a == "Milla"){
            this.resultado = valorInicial / 1609; 
        }
        if(de == "Metros" && a == "Pie"){
            this.resultado = valorInicial * 3.281; 
        }
        if(de == "Metros" && a == "Yarda"){
            this.resultado = valorInicial * 1.094; 
        }
        if(de == "Metros" && a == "Pulgada"){
            this.resultado = valorInicial * 39.37; 
        }
        if(de == "Metros" && a == "Metros"){
            this.resultado = valorInicial; 
        }
        if(de == "Metros" && a == "Metros"){
            this.resultado = valorInicial; 
        }
        if(de == "Milímetros" && a == "Centímetros"){
            this.resultado = valorInicial * 10; 
        }
        if(de == "Milímetros" && a == "Metros"){
            this.resultado = valorInicial / 1000; 
        }
        if(de == "Milímetros" && a == "Kilómetros"){
            this.resultado = valorInicial / 1000000; 
        }
        if(de == "Milímetros" && a == "Milla"){
            this.resultado = valorInicial / 1.609e+6; 
        }
        if(de == "Milímetros" && a == "Pie"){
            this.resultado = valorInicial / 304.8; 
        }
        if(de == "Milímetros" && a == "Yarda"){
            this.resultado = valorInicial / 914.4; 
        }
        if(de == "Milímetros" && a == "Pulgada"){
            this.resultado = valorInicial / 25.4; 
        }
        if(de == "Milímetros" && a == "Milímetros"){
            this.resultado = valorInicial; 
        }
        if(de == "Centímetros" && a == "Milímetros"){
            this.resultado = valorInicial * 10; 
        }
        if(de == "Centímetros" && a == "Metros"){
            this.resultado = valorInicial / 100; 
        }
        if(de == "Centímetros" && a == "Kilómetros"){
            this.resultado = valorInicial / 100000; 
        }
        if(de == "Centímetros" && a == "Milla"){
            this.resultado = valorInicial / 160900; 
        }
        if(de == "Centímetros" && a == "Pie"){
            this.resultado = valorInicial / 30.48; 
        }
        if(de == "Centímetros" && a == "Yarda"){
            this.resultado = valorInicial / 91.44; 
        }
        if(de == "Centímetros" && a == "Pulgada"){
            this.resultado = valorInicial / 2.54; 
        }
        if(de == "Centímetros" && a == "Centímetros"){
            this.resultado = valorInicial; 
        }
        if(de == "Kilómetros" && a == "Milímetros"){
            this.resultado = valorInicial * 1e+6; 
        }
        if(de == "Kilómetros" && a == "Centímetros"){
            this.resultado = valorInicial * 100000; 
        }
        if(de == "Kilómetros" && a == "Metros"){
            this.resultado = valorInicial * 1000; 
        }
        if(de == "Kilómetros" && a == "Milla"){
            this.resultado = valorInicial / 1.609; 
        }
        if(de == "Kilómetros" && a == "Pie"){
            this.resultado = valorInicial * 3281; 
        }
        if(de == "Kilómetros" && a == "Yarda"){
            this.resultado = valorInicial * 1094; 
        }
        if(de == "Kilómetros" && a == "Pulgada"){
            this.resultado = valorInicial * 39370; 
        }
        if(de == "Kilómetros" && a == "Kilómetros"){
            this.resultado = valorInicial; 
        }
        if(de == "Milla" && a == "Milímetros"){
            this.resultado = valorInicial * 1.609e+6; 
        }
        if(de == "Milla" && a == "Centímetros"){
            this.resultado = valorInicial * 160900; 
        }
        if(de == "Milla" && a == "Metros"){
            this.resultado = valorInicial * 1609; 
        }
        if(de == "Milla" && a == "Kilómetros"){
            this.resultado = valorInicial * 1.609; 
        }
        if(de == "Milla" && a == "Pie"){
            this.resultado = valorInicial * 5280; 
        }
        if(de == "Milla" && a == "Yarda"){
            this.resultado = valorInicial * 1760; 
        }
        if(de == "Milla" && a == "Pulgada"){
            this.resultado = valorInicial * 63360; 
        }
        if(de == "Milla" && a == "Milla"){
            this.resultado = valorInicial; 
        }
        if(de == "Pie" && a == "Milímetros"){
            this.resultado = valorInicial * 304.8; 
        }
        if(de == "Pie" && a == "Centímetros"){
            this.resultado = valorInicial * 30.48; 
        }
        if(de == "Pie" && a == "Metros"){
            this.resultado = valorInicial / 3.281; 
        }
        if(de == "Pie" && a == "Kilómetros"){
            this.resultado = valorInicial / 3281; 
        }
        if(de == "Pie" && a == "Milla"){
            this.resultado = valorInicial / 5280; 
        }
        if(de == "Pie" && a == "Yarda"){
            this.resultado = valorInicial / 3; 
        }
        if(de == "Pie" && a == "Pulgada"){
            this.resultado = valorInicial * 12; 
        }
        if(de == "Pie" && a == "Pie"){
            this.resultado = valorInicial; 
        }
        if(de == "Yarda" && a == "Milímetros"){
            this.resultado = valorInicial * 914.4; 
        }
        if(de == "Yarda" && a == "Centímetros"){
            this.resultado = valorInicial * 91.44; 
        }
        if(de == "Yarda" && a == "Metros"){
            this.resultado = valorInicial / 1.094; 
        }
        if(de == "Yarda" && a == "Kilómetros"){
            this.resultado = valorInicial / 1094; 
        }
        if(de == "Yarda" && a == "Milla"){
            this.resultado = valorInicial / 1760; 
        }
        if(de == "Yarda" && a == "Pie"){
            this.resultado = valorInicial * 3; 
        }
        if(de == "Yarda" && a == "Pulgada"){
            this.resultado = valorInicial * 36; 
        }
        if(de == "Yarda" && a == "Yarda"){
            this.resultado = valorInicial; 
        }
        if(de == "Pulgada" && a == "Milímetros"){
            this.resultado = valorInicial * 25.4; 
        }
        if(de == "Pulgada" && a == "Centímetros"){
            this.resultado = valorInicial * 2.54; 
        }
        if(de == "Pulgada" && a == "Metros"){
            this.resultado = valorInicial / 39.37; 
        }
        if(de == "Pulgada" && a == "Kilómetros"){
            this.resultado = valorInicial / 39370; 
        }
        if(de == "Pulgada" && a == "Milla"){
            this.resultado = valorInicial / 63360; 
        }
        if(de == "Pulgada" && a == "Pie"){
            this.resultado = valorInicial / 12; 
        }
        if(de == "Pulgada" && a == "Yarda"){
            this.resultado = valorInicial / 36; 
        }
        if(de == "Pulgada" && a == "Pulgada"){
            this.resultado = valorInicial; 
        }
        return this.resultado;
    }
}
