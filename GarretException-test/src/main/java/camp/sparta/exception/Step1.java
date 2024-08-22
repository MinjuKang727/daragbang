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
        } catch (CommonException e) {
            System.out.println(e.getMessage());
        }

    }

//    void fileReadAndWrite(String readFile, String writeFile) throws CommonException {
//        System.out.println("읽을 파일 : " + readFile);
//        System.out.println("작성할 파일 : " + writeFile);
//
//        try (OutputStream out = new FileOutputStream(writeFile)) {
//            try (InputStream in = new FileInputStream(readFile)) {
//                byte[] buffer = new byte[1024];
//
//                int n;
//                while ((n = in.read(buffer)) >= 0) {
//                    out.write(buffer, 0, n);
//                }
//            } catch (IOException e) {
//                throw new CommonException("INPUT_OUTPUT_ERROR", readFile + "파일 읽는 과정에서 IO발생", e.getCause());
//            }
//        } catch (IOException e) {
//            throw new CommonException("INPUT_OUTPUT_ERROR", writeFile + "파일 읽는 과정에서 IO발생", e.getCause());
//        }
//    }


    void fileReadAndWrite(String readFile, String writeFile) throws CommonException {
        System.out.println("읽을 파일 : " + readFile);
        System.out.println("작성할 파일 : " + writeFile);

        InputStream in = null;
        OutputStream out = null;

        try {
            out = new FileOutputStream(writeFile);

            try {
                in = new FileInputStream(readFile);

                byte[] buffer = new byte[1024];
                int n;
                while ((n = in.read(buffer)) >= 0) {
                    out.write(buffer, 0, n);
                }
            } catch (FileNotFoundException e) {
                throw new CommonException(Code.FILE_NOT_FOUND, readFile +" 파일이 존재하지 않습니다.", e.getCause());
            } catch (IOException e) {
                throw new CommonException(Code.INPUT_OUTPUT_ERROR, readFile + "파일 읽는 과정에서 IO발생", e.getCause());
            } finally {
                if (in != null) {
                    try {
                        in.close();
                    } catch (IOException e) {
                        System.out.println(e.getMessage());
                        e.printStackTrace();
    //                    throw new CommonException("INPUT_CLOSE_ERROR", readFile + " 파일을 닫는 과정에서 IO", e.getCause());
                        // finally에서 throw는 AntiPattern이므로 그냥 꿀꺽처리하자!
                        // finally에서는 throw, return 등 외부로 무언가를 던지는 것은 하지말자!
                    } finally {
                        in = null;  // 이건 안해도 됨.
                    }
                }
            }
        } catch (FileNotFoundException e) {
            throw new CommonException(Code.FILE_NOT_FOUND, writeFile + " 파일이 존재하지 않습니다.", e.getCause());
        } finally {
            if (out != null) {
                try {
                    out.close();
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                    e.printStackTrace();
                }
            }
        }
    }
}