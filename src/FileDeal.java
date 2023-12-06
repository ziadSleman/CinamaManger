import java.io.*;


public class FileDeal {

        public static void createFile(String fullPath, String fileName, String content) {
            try {
                File file = new File(fullPath, fileName);
                if (!file.exists()) {
                    FileWriter fw = new FileWriter(file);
                    fw.write(content);
                    fw.flush();
                    fw.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        public static String readFile(String filePath) {
            StringBuilder content = new StringBuilder();

            try {
                File file = new File(filePath);
                if (file.exists()) {
                    BufferedReader br = new BufferedReader(new FileReader(file));
                    String line;
                    while ((line = br.readLine()) != null) {
                        content.append(line).append("\n");
                    }
                    br.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            return content.toString();
        }



}
