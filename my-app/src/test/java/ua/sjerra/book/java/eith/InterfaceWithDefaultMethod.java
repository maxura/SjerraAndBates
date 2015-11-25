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
package ua.sjerra.book.java.eith;

/**
 * //
 *
 * @author Musienko Maxim
 */
public class InterfaceWithDefaultMethod implements InderfaceWithDefMethod {


    public static void main(String[] args) {
        System.out.println(new InterfaceWithDefaultMethod().getAge());
    }
}
