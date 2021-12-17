package com.jbk.mavenprofiles.service;

import com.jbk.mavenprofiles.suites.tags.IntegrationTest;
import org.junit.jupiter.api.Test;
import org.junit.platform.suite.api.Suite;

@Suite
class ControllerTest extends IntegrationTest {

    @Test
    void returnAnotherString() {
        System.out.println("Test IntegrationTest");
    }
}