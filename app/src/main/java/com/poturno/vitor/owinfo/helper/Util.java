package com.poturno.vitor.owinfo.helper;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Util {
    public static String convertInputStreamToString(InputStream inputStream){
        StringBuffer buffer = new StringBuffer();
        try{
            BufferedReader bufferedReader;
            String line;

            bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            while((line = bufferedReader.readLine())!=null){
                buffer.append(line);
            }

            bufferedReader.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        return buffer.toString();
    }
}
