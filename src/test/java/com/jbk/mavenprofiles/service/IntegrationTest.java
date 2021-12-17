package com.jbk.mavenprofiles.service;

import org.junit.experimental.categories.Category;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.platform.suite.api.Suite;

@Suite
@Tag("IntegrationTest")
class IntegrationTest {

    @Test
    void returnAnotherString() {
        System.out.println("Test IntegrationTest");
    }
}