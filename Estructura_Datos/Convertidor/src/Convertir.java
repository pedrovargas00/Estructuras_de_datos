import java.util.*;

public class Convertir {
    
    Scanner in = new Scanner(System.in);
    //protected int datoEntrada; 
    protected double datoEntrada, datoSalida;
    protected String tipoDato, tipoSalida;
            
    public Convertir(){
        datoEntrada = 0;
        datoSalida = 0;
        tipoDato = "";
        tipoSalida = "";
    }

    public double getDatoEntrada() {
        return datoEntrada;
    }

    public void setDatoEntrada(double datoEntrada) {
        this.datoEntrada = datoEntrada;
    }

    public double getDatoSalida() {
        return datoSalida;
    }

    public void setDatoSalida(double datoSalida) {
        this.datoSalida = datoSalida;
    }

    public String getTipoDato() {
        return tipoDato;
    }

    public void setTipoDato(String tipoDato) {
        this.tipoDato = tipoDato;
    }

    public String getTipoSalida() {
        return tipoSalida;
    }

    public void setTipoSalida(String tipoSalida) {
        this.tipoSalida = tipoSalida;
    }

    
    
    //Conversion de bytes a cualquier cosa.
    public void bytes(String opcion){
        
        int sel;
        double aux;
        
        /*System.out.println("Conversion.\n1.- Kilobytes.\n2.- Megabytes.");
        System.out.println("3.- Gigabytes.\n4.- Terabytes");
        System.out.println("Seleccione el tipo de almacenamiento que desea obtener: ");
        sel = in.nextInt();*/
        
        switch(opcion){
            case "KBytes":
                datoSalida = datoEntrada/1024;
                tipoSalida = "Kilobytes";
                System.out.println("Dato convertido");
                System.out.println(""+ datoEntrada +" "+ tipoDato +" es "+ datoSalida +" "+ tipoSalida);
                break;
            case "MBytes":
                datoSalida = datoEntrada/1048576;
                tipoSalida = "Megabytes";
                System.out.println("Dato convertido");
                System.out.println(""+ datoEntrada +" "+ tipoDato +" es "+ datoSalida +" "+ tipoSalida);
                break;
            case "GBytes":
                datoSalida = datoEntrada/1073741824;
                tipoSalida = "Gigabytes";
                System.out.println("Dato convertido");
                System.out.println(""+ datoEntrada +" "+ tipoDato +" es "+ datoSalida +" "+ tipoSalida);
                break;
            case "TBytes":
                aux = datoEntrada/1073741824;
                datoSalida = aux/1024;
                tipoSalida = "Terabytes";
                System.out.println("Dato convertido");
                System.out.println(""+ datoEntrada +" "+ tipoDato +" es "+ datoSalida +" "+ tipoSalida);
                break;
            default:
                System.out.println("Selección incorrecta");
                break;
        }
    }
    
    //Conversion de kilobyte a cualquier cosa.
    public void kilobyte(String opcion){
        
        /*int sel;
        
        System.out.println("Conversion.\n1.- Bytes.\n2.- Megabytes.");
        System.out.println("3.- Gigabytes.\n4.- Terabytes");
        System.out.println("Seleccione el tipo de almacenamiento que desea obtener: ");
        sel = in.nextInt();*/
        
        switch(opcion){
            case "Bytes":
                datoSalida = datoEntrada*1024;
                tipoSalida = "bytes";
                System.out.println("Dato convertido");
                System.out.println(""+ datoEntrada +" "+ tipoDato +" es "+ datoSalida +" "+ tipoSalida);
                break;
            case "MBytes":
                datoSalida = datoEntrada/1024;
                tipoSalida = "Megabytes";
                System.out.println("Dato convertido");
                System.out.println(""+ datoEntrada +" "+ tipoDato +" es "+ datoSalida +" "+ tipoSalida);
                break;
            case "GBytes":
                datoSalida = datoEntrada/1048576;
                tipoSalida = "Gigabytes";
                System.out.println("Dato convertido");
                System.out.println(""+ datoEntrada +" "+ tipoDato +" es "+ datoSalida +" "+ tipoSalida);
                break;
            case "TBytes":
                datoSalida = datoEntrada/1073741824;
                tipoSalida = "Terabytes";
                System.out.println("Dato convertido");
                System.out.println(""+ datoEntrada +" "+ tipoDato +" es "+ datoSalida +" "+ tipoSalida);
                break;
            default:
                System.out.println("Selección incorrecta");
                break;
        }
    }
    
    //Conversion de megabyte a cualquir cosa.
    public void megabyte(String opcion){
        
        /*int sel;
        
        System.out.println("Conversion.\n1.- Bytes.\n2.- kilobytes.");
        System.out.println("3.- Gigabytes.\n4.- Terabytes");
        System.out.println("Seleccione el tipo de almacenamiento que desea obtener: ");
        sel = in.nextInt();*/
        
        switch(opcion){
            case "Bytes":
                datoSalida = datoEntrada*1048576;
                tipoSalida = "bytes";
                System.out.println("Dato convertido");
                System.out.println(""+ datoEntrada +" "+ tipoDato +" es "+ datoSalida +" "+ tipoSalida);
                break;
            case "KBytes":
                datoSalida = datoEntrada*1024;
                tipoSalida = "Kilobytes";
                System.out.println("Dato convertido");
                System.out.println(""+ datoEntrada +" "+ tipoDato +" es "+ datoSalida +" "+ tipoSalida);
                break;
            case "GBytes":
                datoSalida = datoEntrada/1024;
                tipoSalida = "Gigabytes";
                System.out.println("Dato convertido");
                System.out.println(""+ datoEntrada +" "+ tipoDato +" es "+ datoSalida +" "+ tipoSalida);
                break;
            case "TBytes":
                datoSalida = datoEntrada/1048576;
                tipoSalida = "Terabytes";
                System.out.println("Dato convertido");
                System.out.println(""+ datoEntrada +" "+ tipoDato +" es "+ datoSalida +" "+ tipoSalida);
                break;
            default:
                System.out.println("Selección incorrecta");
                break;
        }
    }
    
    //Conversion de gigabytes a cualquier cosa.
    public void gigabyte(String opcion){
        
        /*int sel;
        
        System.out.println("Conversion.\n1.- Bytes.\n2.- kilobytes.");
        System.out.println("3.- Megabytes.\n4.- Terabytes");
        System.out.println("Seleccione el tipo de almacenamiento que desea obtener: ");
        sel = in.nextInt();*/
        
        switch(opcion){
            case "Bytes":
                datoSalida = datoEntrada*(1073741824);
                tipoSalida = "bytes";
                System.out.println("Dato convertido");
                System.out.println(""+ datoEntrada +" "+ tipoDato +" es "+ datoSalida +" "+ tipoSalida);
                break;
            case "KBytes":
                datoSalida = datoEntrada*(1048576);
                tipoSalida = "Kilobytes";
                System.out.println("Dato convertido");
                System.out.println(""+ datoEntrada +" "+ tipoDato +" es "+ datoSalida +" "+ tipoSalida);
                break;
            case "MBytes":
                datoSalida = datoEntrada*1024;
                tipoSalida = "Megabytes";
                System.out.println("Dato convertido");
                System.out.println(""+ datoEntrada +" "+ tipoDato +" es "+ datoSalida +" "+ tipoSalida);
                break;
            case "TBytes":
                datoSalida = datoEntrada/1024;
                tipoSalida = "Terabytes";
                System.out.println("Dato convertido");
                System.out.println(""+ datoEntrada +" "+ tipoDato +" es "+ datoSalida +" "+ tipoSalida);
                break;
            default:
                System.out.println("Selección incorrecta");
                break;
        }
    }
    
    //Conversion de terabyte a cualquier cosa.
    public void terabyte(String opcion){
        
        //int sel;
        double aux;
        
        /*System.out.println("Conversion.\n1.- Bytes.\n2.- Kilobytes.");
        System.out.println("3.- Megabytes.\n4.- Gigabytes");
        System.out.println("Seleccione el tipo de almacenamiento que desea obtener: ");
        sel = in.nextInt();*/
        
        switch(opcion){
            case "Bytes":
                aux = datoEntrada*(1073741824);
                datoSalida = aux*1024;
                tipoSalida = "Bytes";
                System.out.println("Dato convertido");
                System.out.println(""+ datoEntrada +" "+ tipoDato +" es "+ datoSalida +" "+ tipoSalida);
                break;
            case "KBytes":
                datoSalida = datoEntrada*(1073741824);
                tipoSalida = "Kilobytes";
                System.out.println("Dato convertido");
                System.out.println(""+ datoEntrada +" "+ tipoDato +" es "+ datoSalida +" "+ tipoSalida);
                break;
            case "MBytes":
                datoSalida = datoEntrada*(1048576);
                tipoSalida = "Megabytes";
                System.out.println("Dato convertido");
                System.out.println(""+ datoEntrada +" "+ tipoDato +" es "+ datoSalida +" "+ tipoSalida);
                break;
            case "GBytes":
                datoSalida = datoEntrada*1024;
                tipoSalida = "Gigabytes";
                System.out.println("Dato convertido");
                System.out.println(""+ datoEntrada +" "+ tipoDato +" es "+ datoSalida +" "+ tipoSalida);
                break;
            default:
                System.out.println("Selección incorrecta");
                break;
        }
    }
}