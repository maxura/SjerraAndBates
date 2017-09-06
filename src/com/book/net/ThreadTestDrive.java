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
package com.book.net;

/**
 * //
 *
 * @author Musienko Maxim
 */
class MyRun implements Runnable {

    @Override
    public void run() {
        go();
    }

    public void go() {
        doMore();
    }

    public void doMore() {
        System.out.println("Vertex of the stack");
    }
}

public class ThreadTestDrive {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            Runnable threadJob = new MyRun();
            Thread myThreead = new Thread(threadJob);
            myThreead.start();
            System.out.println("Come back to method main");
        }
    }

}
