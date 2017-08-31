package learn

import groovy.swing.SwingBuilder

/**
 * Created by Wuxiang on 2017/2/6.
 */
import java.awt.BorderLayout as BL

def swing = new SwingBuilder()
count = 0
def textlabel
def frame = swing.frame(title: 'Frame', size:[999,999]) {
    borderLayout()
    textlabel = label(
            text: "Clicked ${count} time(s).",
            constraints: BL.NORTH)
    button(text: 'Click Me',
            actionPerformed: {
                count++; textlabel.text =
                        "Clicked ${count} time(s)."; println "clicked"
            },
            constraints: BL.SOUTH)
}
frame.pack()
frame.show()