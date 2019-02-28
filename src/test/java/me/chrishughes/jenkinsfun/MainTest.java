package me.chrishughes.jenkinsfun;

import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void sayHi() {
        assertEquals("Hi",Main.sayHi());
    }
}