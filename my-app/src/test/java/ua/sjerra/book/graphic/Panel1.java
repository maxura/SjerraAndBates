/**
 * ****************************************************************************
 * Copyright (c) 2012-2015 Codenvy, S.A.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * <p/>
 * Contributors:
 * Codenvy, S.A. - initial API and implementation
 * *****************************************************************************
 */
package ua.sjerra.book.graphic;

import javax.swing.*;
import java.awt.*;

/**
 * //
 *
 * @author Musienko Maxim
 */
public class Panel1 {
    public static void main(String[] args) {
        Panel1 gui = new Panel1();
        gui.go();
    }

    private void go() {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        panel.setBackground(Color.darkGray);
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        JButton button = new JButton("shock me");
        JButton buttonTwo = new JButton("bliss");
        panel.add(button);
        panel.add(buttonTwo);

        frame.getContentPane().add(BorderLayout.EAST, panel);
        frame.setSize(250,200);
        frame.setVisible(true);
    }

}
