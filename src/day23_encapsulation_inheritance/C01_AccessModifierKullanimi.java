package day23_encapsulation_inheritance;

public class C01_AccessModifierKullanimi {
    public static void main(String[] args) {
        // baska package'daki bir class'dan class uyelerinin
        // sadece public olanlari kullanabiliriz
        // eger bulundugumuz class ile ulasmak istedigimiz class arasinda
        // parent-child iliskisi varsa class uyelerine erisim mumkundur
        System.out.println(C05_accessModifier.publicStaticSayi);
        C05_accessModifier.publicStaticMethod();
    }
}
