import java.io.*;


public class FileDeal implements AutoCloseable{

    private FileWriter fw;

    public static void createFile(String fullPath, String fileName, String content) {
            try {
                File file = new File("C:\\Users\\hp\\Cinema Management\\" + fullPath, fileName);
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
    public static void createNestedFolders(String fullPath) {
        File currentFolder = new File( "C:\\Users\\hp\\Cinema Management\\"+fullPath);

        if (!currentFolder.exists()) {
            boolean created = currentFolder.mkdirs();
            if (created) {
                System.out.println("تم إنشاء المجلد: " + currentFolder.getAbsolutePath());
            } else {
                System.out.println("فشل في إنشاء المجلد: " + currentFolder.getAbsolutePath());
            }
        } else {
            System.out.println("المجلد موجود بالفعل: " + currentFolder.getAbsolutePath());
        }
    }

    public static String readFile(String filePath) {
            StringBuilder content = new StringBuilder();

            try {
                File file = new File("C:\\Users\\hp\\Cinema Management\\" +filePath);
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


    @Override
    public void close() throws Exception {
        if (fw != null) {
            fw.close();
        }

    }
}
