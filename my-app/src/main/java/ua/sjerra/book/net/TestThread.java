/**
 * ****************************************************************************
 * Copyright (c) 2012-2016 Codenvy, S.A.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * <p/>
 * Contributors:
 * Codenvy, S.A. - initial API and implementation
 * *****************************************************************************
 */
package ua.sjerra.book.net;

/**
 * //
 *
 * @author Musienko Maxim
 */
class Accum {
    private static Accum a = new Accum();

    private Accum() {

    }

    private int counter = 0;

    public void updateCounter(int add) {
        counter += add;
    }

    public int getCount() {
        return counter;
    }

    public static Accum getAccum() {
        return a;
    }

}

class ThreadOne implements Runnable {

    @Override
    public void run() {

    }
}

class ThreadTwo implements Runnable {

    @Override
    public void run() {
        Accum a =
    }
}

public class TestThread {
}
