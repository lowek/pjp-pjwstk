import groovy.swing.SwingBuilder
import java.awt.BorderLayout as BL
import java.awt.Color
import java.awt.Font

class cw1 {
    static void main(String[] args) {
        def backgroundColor = new Color(255,255,210)
        Font font = new Font("Serif", Font.BOLD, 16)
        new SwingBuilder().edt {
            frame(title: 'Prosty edytor', size: [300, 300], show: true) {
                borderLayout()
                textArea(id:'TextArea', lineWrap:true,wrapStyleWord:true, columns:35, rows:4,editable:true, background: backgroundColor).setFont(font)
                button("Change background", constraints: BL.SOUTH)
            }
        }
    }

}
