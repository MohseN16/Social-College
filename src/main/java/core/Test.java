/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package core;

import core.security.crypto.AESEncryption;

/**
 *
 * @author mohsen
 */
public class Test {
public static void main(String[] args) throws Exception {
        String password = "{ name : 'mohsen' , password : 'password' }";
        String salt = "this is a simple clear salt";
        String passwordEnc = AESEncryption.encrypt(password);
        String passwordDec = AESEncryption.decrypt(passwordEnc);

        System.out.println("Salt Text : " + salt);
        System.out.println("Plain Text : " + password);
        System.out.println("Encrypted : " + passwordEnc);
        System.out.println("Decrypted : " + passwordDec);
    }
}
