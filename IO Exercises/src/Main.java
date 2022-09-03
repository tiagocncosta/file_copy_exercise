import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        // OPEN AN INPUT STREAM WITH A FILE PATH AS THE SOURCE
        String fileName = "/Users/tiagocosta/Documents/Mindera_exercises/Academy/Bootcamp/IO Exercises/Resources/text_file";
        String outputName = "/Users/tiagocosta/Documents/Mindera_exercises/Academy/Bootcamp/IO Exercises/Resources/receive_file";

        FileInputStream inp = null;
        FileOutputStream out = null;
        byte[] buffer = new byte[1024];

        int num = 0;
        try {
            inp = new FileInputStream(fileName);
            out = new FileOutputStream(outputName, false); // append = false, apaga tudo e escreve de novo. append = true, adiciona ao que lá está..

            while ((num = inp.read(buffer)) != -1) {
                out.write(buffer, 0, num);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            closeStream(inp);// podia so ter metido inp.close()
            closeStream(out);

        }

    }


    public static void closeStream(Closeable stream) {
        try {
            stream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}










        /* try {
            FileInputStream fileInputStream = new FileInputStream(fileName);
            fileInputStream.read(buffer);
            fileInputStream.close();

            for (int i = 0; i < buffer.length ; i++) {
                System.out.print((char) buffer[i]);
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        }
    }*/

