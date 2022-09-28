package br.ulbra.entity;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author s.lucas
 */
public class BuscadorDeCep {
    
    public BuscadorDeCep(){
        
    }
    public void buscarCep(String cep, JTextField logradouro, JTextField bairro,JTextField cidade, JTextField estado) {
        String json;

        try {
            URL url = new URL("http://viacep.com.br/ws/" + cep + "/json");
            URLConnection urlConnection = url.openConnection();
            InputStream is = urlConnection.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(is));

            StringBuilder jsonSb = new StringBuilder();

            br.lines().forEach(l -> jsonSb.append(l.trim()));
            json = jsonSb.toString();


            json = json.replaceAll("[{},:]", "");
            json = json.replaceAll("\"", "\n");
            String array[] = new String[30];
            array = json.split("\n");

            String logradouroJSON = array[7];
            String bairroJSON = array[15];
            String cidadeJSON = array[19];
            String uf = array[23];

            logradouro.setText(logradouroJSON);
            bairro.setText(bairroJSON);
            cidade.setText(cidadeJSON);
            estado.setText(uf);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Cep não encontrado.");
        }
    }
}
