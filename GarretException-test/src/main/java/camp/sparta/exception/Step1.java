package camp.sparta.exception;

import java.io.*;
import java.util.Scanner;

public class Step1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String readFile = sc.nextLine();
        String writeFile = sc.nextLine();

        Step1 step1 = new Step1();
        try {
            step1.fileReadAndWrite(readFile, writeFile);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

    }

    void fileReadAndWrite(String readFile, String writeFile) throws RuntimeException {
        System.out.println("읽을 파일 : " + readFile);
        System.out.println("작성할 파일 : " + writeFile);

        InputStream in = null;
        OutputStream out = null;
        String file = readFile;  // 에러 원인
        try {
            in = new FileInputStream(readFile);
            file = writeFile;
            out = new FileOutputStream(writeFile);

            byte[] buffer = new byte[1024];
            int n;

            while ((n = in.read(buffer)) >= 0) {
                out.write(buffer, 0, n);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(file + " (지정된 파일을 찾을 수 없습니다.)", e.getCause());
        } catch (IOException e) {
            throw new RuntimeException("파일 읽기 혹은 쓰기에서 에러가 발생했습니다.", e.getCause());
        } finally {
            try {
                if (in != null) {
                    in.close();
                }

                if (out != null) {
                    out.close();
                }
            } catch (IOException e) {
                throw new RuntimeException("I/O Stream close failed!", e.getCause());
            }
        }
    }
}