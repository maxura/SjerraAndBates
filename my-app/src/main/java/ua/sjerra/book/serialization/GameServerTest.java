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
package sjerra.book.serialization;

import java.io.*;

/**
 * //
 *
 * @author Musienko Maxim
 */
public class GameServerTest {
    public static void main(String[] args) {
       GameCharacter one = new GameCharacter(50, "Elf",new String[]{"Arch", "Sword", "Castet"});
       GameCharacter two = new GameCharacter(50, "Troll",new String[]{"Bare hends", "Big ax"});
       GameCharacter three = new GameCharacter(120, "Mag",new String[]{"Spells", "Invisibility"});
        try{
            ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("d:\\game.ser"));
            os.writeObject(one);
            os.writeObject(two);
            os.writeObject(three);
            os.close();
   }
        catch (IOException ex){
            ex.printStackTrace();
        }
        one=null;
        two=null;
        three=null;

        try{
            ObjectInputStream is = new ObjectInputStream(new FileInputStream("d:\\game.ser"));
            GameCharacter oneRestore = (GameCharacter)is.readObject();
            GameCharacter twoRestore = (GameCharacter)is.readObject();
            GameCharacter threeRestore = (GameCharacter)is.readObject();

            System.out.println("First restore: " + oneRestore.getType());
            System.out.println("Second restore: " + twoRestore.getType());
            System.out.println("Three restore "+ threeRestore.getType());

        }
        catch(Exception ex){ex.printStackTrace();}

    }


}
