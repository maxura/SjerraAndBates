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
package ua.sjerra.book.serialization;

import java.io.Serializable;

/**
 * //
 *
 * @author Musienko Maxim
 */
public class DungeonGame implements Serializable {
    public    int   x = 3;
    transient long  y = 4;
    private   short z = 5;




    int getX() {
        return x;
    }

    long getY() {
        return y;
    }

    short getZ() {
        return z;
    }


}
