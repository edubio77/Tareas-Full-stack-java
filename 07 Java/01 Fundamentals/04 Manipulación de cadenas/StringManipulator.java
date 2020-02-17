public class StringManipulator {
    public String trimAndConcat(String str1, String str2) {
        String str = str1.trim() + str2.trim();
        return str;

    }
    public String getIndexOrNull(String str3, char letra) {
        Integer valor = str3.indexOf(letra);
        return String.valueOf(valor);

    }
    public String getIndexOrNull(String str4, String str5) {
        Integer valor2 = str4.indexOf(str5);
        return String.valueOf(valor2);
    }
    public String concatSubstring(String str6, int int1, int int2, String str7) {
        String str8 = str6.substring(int1, int2);
        String palabra = str8 + str7;
        return palabra;
    }
}