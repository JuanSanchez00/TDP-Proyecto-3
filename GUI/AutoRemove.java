package GUI;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class AutoRemove extends Thread {
    protected JLabel label;
    protected JPanel panel;

    public AutoRemove( JLabel label, JPanel panel ) {
        this.label = label;
        this.panel = panel;
    }

    public void run() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        this.panel.remove(this.label);
        this.stop();
    }
}