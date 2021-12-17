package com.jbk.mavenprofiles.service;

import com.jbk.mavenprofiles.suites.tags.UnitTest;
import org.junit.jupiter.api.Test;
import org.junit.platform.suite.api.Suite;

@Suite
class ServiceTest extends UnitTest {

    @Test
    void returnString() {
        System.out.println("Test UnitTest");
    }
}