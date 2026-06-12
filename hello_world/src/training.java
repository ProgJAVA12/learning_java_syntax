import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

import static java.nio.file.Files.createFile;
import static java.nio.file.Files.writeString;
import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;

public class training {

    private static Map<Integer, String> test = new HashMap<>();

    static void main() throws IOException {


        String s = "";
        Path file = Files.createFile(Path.of("F:\\java_project\\hello_world"));// Создаем обьект который хранит путь файла
        System.out.println(Files.exists(file));

        for(int i = 0; i < 10; i++){
            test.put(i,"hello");
        }
        for(int i = 0;i < test.size() - 1;i ++){
            s += (test.get(i) + ";") ;
        }
        Files.writeString(Path.of("F:\\java_project\\hello_world\\.txt"),s ,StandardCharsets.UTF_8);


        String a = Files.readString(Path.of("F:\\java_project\\hello_world\\.txt"), StandardCharsets.UTF_8);
        String[] b = a.split(";");
        System.out.println(Arrays.toString(b));
}
}
