import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class main {

    public static void main(String[] args) throws Exception{


        //Записываем данные  в файл .txt


         File file = new File("F:\\java_project\\text.txt");  //Здесь мы создаем файл
         FileOutputStream fileOutputStream = new FileOutputStream(file,true); //
         String text = "Этот текст мы сохраняем в файл при помощи FileOutputStream\r\n";

         fileOutputStream.write(text.getBytes(StandardCharsets.UTF_8)); //Здесь мы записываем даные из переменной в файл


         FileInputStream fileInputStream = new FileInputStream(file);
         BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream,200);

         int i;

         while((i=bufferedInputStream.read())!=-1){ //Здесь мы считываем файл и отправляем полученые данные в консоль для вывода
             System.out.print((char)i);
         }

         fileOutputStream.close(); //Закрываем поток

    }
}
