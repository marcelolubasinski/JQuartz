/*
 * Este trabalho está licenciado sob uma Licença Creative Commons 
 * Atribuição-NãoComercial 4.0 Internacional.
 * Para ver uma cópia desta licença,
 * visite http://creativecommons.org/licenses/by-nc/4.0/.
 */
package com.JQuartz.Copiler.Sdk;

/**
 *
 * @author Gleison Morgado Vasconcelos
 * @since 1.7
 * @version 1.0
 * 
 */
public class DSystem {
    
    //Current print 
    public void Echo(String Line){
        String Value;
        Value = NextWord(Line,"\\<-");        
        System.out.print(Value);
    }
    
    //Current println
    public void EchoLn(String Line){
        String Value;
        Value = NextWord(Line,"\\<-");        
        System.out.println(Value);
    }
    
    //Current exit(0)
    public void Exit(){
        System.exit(0);
    }
  
    /**
     * @param Line    
     * @param arg0     
     * @param arg1     
     * @return      
     */
    public String CenterWord(String Line, String arg0, String arg1){
        String[] arg2 = Line.split(arg0);
        String[] arg3 = arg2[1].split(arg1);
        return arg3[0];
    }
    
    /**
     * @param Line
     * @param arg0
     * @return 
     */
    public String NextWord(String Line, String arg0){
        String[] arg1 = Line.split(arg0);
        
        if(arg1[1].startsWith(" "))
            arg1[1] = arg1[1].replaceFirst(" ", "");
        
        return arg1[1];
    }
    
    /**
     * @param Line
     * @param arg0
     * @return 
     */
    public String BackWord(String Line, String arg0){
        String[] arg1 = Line.split(arg0);
        
        if(arg1[0].startsWith(" "))
            arg1[0] = arg1[1].replaceFirst(" ", "");
        
        return arg1[0];
    }
    
}
