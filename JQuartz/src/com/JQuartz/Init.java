/*
 * Este trabalho está licenciado sob uma Licença Creative Commons 
 * Atribuição-NãoComercial 4.0 Internacional.
 * Para ver uma cópia desta licença,
 * visite http://creativecommons.org/licenses/by-nc/4.0/.
 */
package com.JQuartz;

import com.JQuartz.Copiler.Flex;

/**
 *
 * @author Gleison Morgado Vasconcelos
 * @since 1.7
 * @version 1.0
 * 
 */
public class Init {
    public static void main(String[] args) {
        String line = "Echo_Ln <- Olá"+
                "\n"+
                "Exit"+
                "\n"
                +
                "Echo_Ln <- nao vai acontecer";
        
        Flex start = new Flex(line);
        start.Run();
    }
}
