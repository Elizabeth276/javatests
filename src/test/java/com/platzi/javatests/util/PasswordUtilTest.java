package com.platzi.javatests.util;
import org.junit.Test;

import javax.swing.*;

import static com.platzi.javatests.util.PasswordUtil.SecurytyLevel.*;
import static org.junit.Assert.*;


public class PasswordUtilTest {


@Test
    public void es_WEAKdebil_cuando_tiene_menos_de_8_letras(){

    assertEquals(WEAK, PasswordUtil.assesPassword("abcdg"));


}
    @Test
    public void es_WEAKdebil_cuando_tiene_solo_letras(){

        assertEquals(WEAK, PasswordUtil.assesPassword("abcdefgh"));


    }

    @Test
    public void es_MEDIUM_cuando_tiene_letras_y_numeros(){

        assertEquals(MEDIUM, PasswordUtil.assesPassword("abcd1234"));


    }

    @Test
    public void es_STROONG_cuando_tiene_letras_numeros_y_simbolos(){

        assertEquals(STROONG, PasswordUtil.assesPassword("abcd1234!"));


    }
    //@Test
    //public  void es_STROONG_cuando_tiene_letras_simbolos(){
    //assertEquals(STROONG, PasswordUtil.assesPassword("abcd!*"));

    //}



}