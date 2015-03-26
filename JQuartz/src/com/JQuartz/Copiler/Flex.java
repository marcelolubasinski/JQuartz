/*
 * Este trabalho está licenciado sob uma Licença Creative Commons 
 * Atribuição-NãoComercial 4.0 Internacional.
 * Para ver uma cópia desta licença,
 * visite http://creativecommons.org/licenses/by-nc/4.0/.
 */
package com.JQuartz.Copiler;

import com.JQuartz.Copiler.Sdk.DSystem;

/**
 *
 * @author Gleison Morgado Vasconcelos
 * @since 1.7
 * @version 1.0
 * 
 */
public class Flex {
    
    private final DSystem sys;
    
    //Codigo
    String Source;
    
    //Palavras chaves
    String[] token = {
        "Echo_Ln",
        "Echo",
        "Exit"
    };   
    
    /**
     * Construtor
     * @param Source
    */
    public Flex(String Source){
        this.Source = Source;
        this.sys = new DSystem();
    }
    
    /**
     * Execulta o codigo
    */
    public void Run(){
        //Divide linha por linha do arquivo
        String[] line = this.Source.split("\n");
        
        //Percorre as linhas
        for(String cc : line){
            
            //Percorre os tokens
            for(int i = 0 ; i < token.length ; i++){
                //Achou um token
                if(cc.contains(token[i])){
                    
                    //Lista a Condição
                    ToToken(i, cc);
                  
                    break;
                }
            }
        }
    }
    
    /**
     * @param Token    
     * @param Source    
    */
    public void ToToken(int Token, String Source){
        
        switch(Token){
         
            case 0 :
                if(Source.contains("<-")) sys.EchoLn(Source);
                else /*Error*/;
                break;  
            case 1 :
                if(Source.contains("<-")) sys.Echo(Source);
                else /*Error*/;
                break;
            case 2 :
                if(Source.length() == 4) sys.Exit();
                break;
                
        }
    }
}
