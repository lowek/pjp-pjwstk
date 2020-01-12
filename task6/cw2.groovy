import groovy.swing.SwingBuilder
import java.awt.*


class ListBg<E> extends ArrayList<E> {

    @Override
    E get(int index) {
        return super.get(index % size());
    }
}

class cw2 {

    static void main(String[] args) {

        def i = 0
        def bg = new ListBg()

        bg.addAll(Color.BLACK, Color.LIGHT_GRAY, Color.GREEN)



        new SwingBuilder().edt {
            lookAndFeel('nimbus')
            frame(title: 'Button',
                    pack: true,
                    visible: true) {
                button(text: 'Change bg!',
                        background: bg.get(i),
                        actionPerformed: { event ->
                            event.getSource().setBackground(bg.get(++i))
                        }
                )
            }
        }
    }

}
