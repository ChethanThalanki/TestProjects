package com.chethan.testProjects;

import java.io.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        readWriteFile();
    }
    public static void readWriteFile()
    {
        String content = null;
        File readFile = new File("input.txt");
        File writeFile = new File("output.txt");
        StringBuffer buff = new StringBuffer();
        int i=0;

        try(BufferedReader br = new BufferedReader(new FileReader(readFile))) {
            for(String line; (line = br.readLine()) != null; ) {
                // process the line.
                buff.append("'" + line + "', ");
                i++;
                if(i%4==0){
                    buff.append("\n");
                }
            }
            // line is not visible here.
        }catch (IOException e) {
            e.printStackTrace();
        }
        try{
            if (!writeFile.exists()) {
                writeFile.createNewFile();
            }
            FileWriter fw = new FileWriter(writeFile.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);
            System.out.println(buff);
            if(i%4==0){
                bw.write(String.valueOf(buff.substring(0,buff.length()-3)));
            }else{
                bw.write(String.valueOf(buff.substring(0,buff.length()-2)));
            }
            bw.close();
        }catch (IOException e) {
            e.printStackTrace();
        }

    }
}
