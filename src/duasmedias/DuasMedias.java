
package duasmedias;

public class DuasMedias {
    double n1, n2, n3, n4, n5, n6, media, media2, media3;
    public static void main(String[] args) {
        // Cálculo de duas médias
        DuasMedias calc = new DuasMedias();
        
        calc.n1 = 5;
        calc.n2 = 9;
        calc.n3 = 3;
        calc.n4 = 6;
        calc.n5 = 7;
        calc.n6 = 8;
        System.out.println(calc.n1 + calc.n2 + calc.n3 + calc.n4 + calc.n5 + calc.n6);
        calc.media = (calc.n1 + calc.n2 + calc.n3) / 3;
        System.out.println("Média 1 = (5 + 9 + 3)/3 é " + calc.media);
        calc.media2 = (calc.n4 + calc.n5 + calc.n6) / 3;
        System.out.println("Média 2 = (6 + 7 + 8)/3 é " + calc.media2);
        calc.media3 = (calc.media + calc.media2) / 2;
        System.out.println("Média 3 = (Média 1 + Média)/2 é " + calc.media3);
    }
    
}
