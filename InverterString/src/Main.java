public class Main {
    public static void main(String[] args) {

        String string = "palavra";
        reverte(string);
    }
    static void reverte(String s) {
        StringBuilder saida = new StringBuilder();

        for (int i = s.length() - 1; i >= 0; i--) {
            saida.append(String.valueOf(s.charAt(i)));
        }
        System.out.println("Resultado: " + saida);
    }
}
