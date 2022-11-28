package replids;

public class JavaAndPython {
    public static void main(String[] args) {
        String str = "We study java not python";
        int java = 0;
        int python = 0;
        while (str.contains("java")) {
            if (str.contains("java")) {
                str = str.replaceFirst("java", "");
                java++;
            }
        }
            while (str.contains("python")){
            if (str.contains("python")){
                str = str.replaceFirst("python","");
                python++;
            }
        }
        boolean r1 = java==python;
        System.out.println(r1);
    }
}
