import groovy.swing.SwingBuilder
import java.awt.BorderLayout
import java.awt.Dimension
import java.awt.FlowLayout


class cw3 {

    static void main(String[] args) {

        new SwingBuilder().edt {
            lookAndFeel('nimbus')
            frame(title: 'Layouts',
                    pack: true,
                    visible: true,
                    defaultCloseOperation: EXIT_ON_CLOSE) {
                hbox() {

                    button(text: 'Flow Layout',
                            actionPerformed: { event ->
                                return new SwingBuilder().edt {
                                    lookAndFeel('nimbus')
                                    frame(title: 'Example',
                                            pack: true,
                                            visible: true,
                                            preferredSize: new Dimension(500, 100)) {
                                        panel(layout: new FlowLayout(FlowLayout.CENTER)) {
                                            button(text: 'Przycisk 1', constraints: BorderLayout.WEST)
                                            button(text: 'Przycisk 2', constraints: BorderLayout.NORTH)
                                            button(text: 'Przycisk 3', constraints: BorderLayout.EAST)
                                            button(text: 'Przycisk 4', constraints: BorderLayout.SOUTH)
                                            button(text: 'Przycisk 5', constraints: BorderLayout.CENTER)
                                        }
                                    }
                                }
                            }
                    )
                    button(text: 'Border Layout',
                            actionPerformed: { event ->
                                return new SwingBuilder().edt {
                                    lookAndFeel('nimbus')
                                    frame(title: 'Example',
                                            pack: true,
                                            visible: true) {
                                        panel(layout: new BorderLayout()) {
                                            button(text: 'Przycisk 1', constraints: BorderLayout.WEST)
                                            button(text: 'Przycisk 2', constraints: BorderLayout.NORTH)
                                            button(text: 'Przycisk 3', constraints: BorderLayout.EAST)
                                            button(text: 'Przycisk 4', constraints: BorderLayout.SOUTH)
                                            button(text: 'Przycisk 5', constraints: BorderLayout.CENTER)
                                        }
                                    }
                                }
                            }
                    )
                }
            }
        }

    }
}