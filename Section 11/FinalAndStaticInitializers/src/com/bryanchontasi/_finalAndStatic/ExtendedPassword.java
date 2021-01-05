package com.bryanchontasi._finalAndStatic;

/**
 * @author Bryan Chontasi
 * @created 05/01/2021 -  14:32
 * @project FinalAndStaticInitializers
 */
public class ExtendedPassword extends Password{

    private int decryptedPassword;

    public ExtendedPassword(int password) {
        super(password);
        this.decryptedPassword = password;
    }

//    @Override
//    public void storePassword() {
//        System.out.println("Saving password as " + this.decryptedPassword);
//    }
}
