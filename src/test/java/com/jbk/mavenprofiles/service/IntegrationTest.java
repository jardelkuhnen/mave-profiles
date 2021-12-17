package com.jbk.mavenprofiles.service;

import com.jbk.mavenprofiles.tags.IntegrationTesTag;
import org.junit.experimental.categories.Category;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.platform.suite.api.Suite;

@Suite
class IntegrationTest extends IntegrationTesTag {

    @Test
    void returnAnotherString() {
        System.out.println("Test IntegrationTest");
    }
}