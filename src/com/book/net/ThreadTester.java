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
public class ThreadTester {
    public static void main(String[] args) {
        Runnable threadJob = new MyRunable();
        Thread myThread = new Thread(threadJob);
        myThread.start();
        System.out.println("Come back to the main");
    }
}
