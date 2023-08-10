package ar.com.conversor;

public class Convertir {
    private double resultado;
    
    public double convertir(String de, String a, double valorInicial){
        if(de == "Peso Argentino" && a == "Dolar"){
            this.resultado = Math.round((valorInicial * 0.0036) * 100d) / 100d ;
        }
        
        if(de == "Peso Argentino" && a == "Euro"){
            this.resultado = Math.round((valorInicial * 0.0033) * 100d) / 100d ;
        }
        
        if(de == "Peso Argentino" && a == "Libra"){
            this.resultado = Math.round((valorInicial * 0.0028) * 100d) / 100d ;
        }
        if(de == "Peso Argentino" && a == "Peso Argentino"){
            this.resultado = valorInicial;
        }
        
        if(de == "Dolar" && a == "Peso Argentino"){
        this.resultado = Math.round((valorInicial * 276.0071) * 100d) / 100d ;
        }
        
        if(de == "Dolar" && a == "Dolar"){
        this.resultado = valorInicial;
        }
        
        if(de == "Dolar" && a == "Euro"){
        this.resultado = Math.round((valorInicial * 0.9070) * 100d) / 100d ;
        }
        
        if(de == "Dolar" && a == "Libra"){
        this.resultado = Math.round((valorInicial * 0.7844) * 100d) / 100d ;
        }
        
        if(de == "Euro" && a == "Peso Argentino"){
        this.resultado = Math.round((valorInicial * 304.3392) * 100d) / 100d ;
        }
        
        if(de == "Euro" && a == "Dolar"){
        this.resultado = Math.round((valorInicial * 1.1027) * 100d) / 100d ;
        }
        
        if(de == "Euro" && a == "Euro"){
        this.resultado = valorInicial;
        }
        
        if(de == "Euro" && a == "Libra"){
        this.resultado = Math.round((valorInicial * 0.8650) * 100d) / 100d ;
        }
        
        if(de == "Libra" && a == "Peso Argentino"){
        this.resultado = Math.round((valorInicial * 351.8536) * 100d) / 100d ;
        }
        
        if(de == "Libra" && a == "Dolar"){
        this.resultado = Math.round((valorInicial * 1.2748) * 100d) / 100d ;
        }
        
        if(de == "Libra" && a == "Euro"){
        this.resultado = Math.round((valorInicial * 1.1562) * 100d) / 100d ;
        }
        
        if(de == "Libra" && a == "Libra"){
        this.resultado = valorInicial;
        }
        
        return this.resultado;
    }
    
}
   

