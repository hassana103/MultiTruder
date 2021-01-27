package burp;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JMenuItem;

/*###############################################################
 * @author Hassan Alipour
 ################################################################*/





public class HContextMenuFactory implements IContextMenuFactory{

    @Override
    public List<JMenuItem> createMenuItems(IContextMenuInvocation invocation) {
        
        if(invocation.getToolFlag()==0x00000004 && invocation.getSelectedMessages().length >= 2){
            List<JMenuItem> HMenu=new ArrayList<>();
            JMenuItem myItem= new JMenuItem("myMenuItem");
  
            HMenu.add(myItem);
            return HMenu;
        }
        return null;
    }

}
