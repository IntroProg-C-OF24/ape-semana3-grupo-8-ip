package ejercicio07;
public class Ejercicio07 {
    public static void main(String[] args) {
        int var1 = 81;
        int var2 = 9;
        int var3 = 3;
        int var4 = 10;
        int var5 = 1;
        int var6 = 100;
        int var7 = 25;
        boolean respuesta = ((Math.sqrt(var1) + var2) / var3 == var2) || (var4 > var5) && (var6/var7 + Math.sqrt(var6)) == 0;
        System.out.println("La respuesta es: " + respuesta);
    }
    
}
