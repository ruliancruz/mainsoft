//Classe não utilizada

package classes;

import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;

public abstract class JanelaInterna extends javax.swing.JInternalFrame
{
 /**
 *
 * Abre a <code>JInternalFrame</code> no <code>JDesktopPane</code> e retorna <code>true</code>.
 * Caso o <code>JInternalFrame</code> já esteja aberto e visível, ele é trazido para a frente e retorna <code>false</code>.
 */
    public boolean abrirJanela(JInternalFrame janela, JDesktopPane painel)
    {
        if(!janela.isVisible())
        {
            painel.add(janela);
            janela.setVisible(true);
            return true;
        }
        else
        {
            janela.moveToFront();
            return false;
        }
    }
}
