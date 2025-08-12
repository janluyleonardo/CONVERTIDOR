/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yeferson Chaparro
 */
public class generarexcel {

    public static generarclase g = new generarclase();

    public static void main(String[] args) {
        String[][] entrada = new String[4][4];
        entrada[0][0] = "Nombre";
        entrada[0][1] = "S.Nombre";
        entrada[0][2] = "AP.apellido";
        entrada[0][3] = "AM.apellido";
        String ruta = "Escritorio";
        g.generarExcel(entrada, ruta);

    }

}
