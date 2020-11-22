package br.com.fluxocaixa.util;

import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;

public class GerenteDeJanelas {
    
    private static JDesktopPane jd1;
    
    public GerenteDeJanelas(JDesktopPane jd1){
        GerenteDeJanelas.jd1 = jd1;
    }
    
    public void abrirJanelas(JInternalFrame jint){
        if(jint.isVisible()){
            jint.toFront();
            jint.requestFocus();
        }else{
            jd1.add(jint);
            jint.setVisible(true);
        }
    }
    
}
