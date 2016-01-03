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
package main.java.ua.sjerra.book.serialization;

import javax.swing.*;
import java.util.ArrayList;

/**
 * //
 *
 * @author Musienko Maxim
 */
public class QuizCardBuilder {
    private JTextArea           question;
    private JTextArea           answer;
    private ArrayList<QuizCard> cardList;
    private JFrame              frame;

    public static void main(String[] args) {
        QuizCardBuilder builder = new QuizCardBuilder();
        builder.go();
    }

    public void go() {
    }

}
