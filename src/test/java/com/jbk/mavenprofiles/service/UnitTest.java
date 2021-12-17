package com.jbk.mavenprofiles.service;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.platform.suite.api.Suite;

@Suite
@Tag("UnitTest")
class UnitTest {

    @Test
    void returnString() {
        System.out.println("Test UnitTest");
    }
}