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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * //
 *
 * @author Musienko Maxim
 */
public class Jtext {
    static JTextField field = new JTextField(20);

    public static void main(String[] args) {
        Jtext gui = new Jtext();
        gui.go();
    }

    private void go() {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        panel.setBackground(Color.darkGray);
        field.setText("check in");
        System.out.println(field.getText());
        field.addActionListener(new Action());
        panel.add(field);
        frame.getContentPane().add(BorderLayout.EAST, panel);
        frame.setSize(250, 200);
        frame.setVisible(true);


    }

    class Action implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            e.getActionCommand().
            field.selectAll();
            field.requestFocus();
        }
    }

}
