/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coursework;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 *
 * @author Dell
 */
public class Import {
    public static void main(String[] args) throws Exception {
        File file = new File("C:\\Users\\Dell\\Documents\\NetBeansProjects\\test\\text\\rock.txt");
        BufferedReader br = new  BufferedReader(new FileReader(file)); 
        String line;
        while ((line = br.readLine()) != null) 
        {
            System.out.println(line); 
            String[] data = line.split(" ",10);
            String[] array = {data[0],data[1]};
            
            
        }
        
     } 
}
    

