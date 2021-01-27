package burp;

import burp.IBurpExtender;
import burp.IBurpExtenderCallbacks;
import javax.swing.JFrame;

/*###############################################################
 * @author Hassan Alipour
 ################################################################*/




public class BurpExtender implements IBurpExtender {
    
    public void registerExtenderCallbacks (IBurpExtenderCallbacks callbacks){
        // your extension code here}}
        
        callbacks.setExtensionName("MultiTruder");
        callbacks.registerContextMenuFactory(new HContextMenuFactory());
        callbacks.registerMenuItem("myMenuItem", new IMenuItemHandler() {
            @Override
            public void menuItemClicked(String menuItemCaption, IHttpRequestResponse[] messageInfo) {
                JFrame j=new JFrame("clicked...");
                j.setVisible(true);
                j.show();
            }
        });
    }
}
    
