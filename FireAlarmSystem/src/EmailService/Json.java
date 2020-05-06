/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EmailService;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 *
 * @author DELL
 */
public class Json {
    
    public String Request(String jsonurl) {
        String responseOfJson = null;

        try {
            URL url = new URL(jsonurl);
            HttpURLConnection httpUrlCon = (HttpURLConnection) url.openConnection();
            if (httpUrlCon.getResponseCode() == 200) {
                InputStream inputStream = httpUrlCon.getInputStream();
                InputStreamReader streamReader = new InputStreamReader(inputStream);
                BufferedReader bufferReader = new BufferedReader(streamReader);
                String readline = bufferReader.readLine();
                responseOfJson = readline;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return responseOfJson;
    }
}
