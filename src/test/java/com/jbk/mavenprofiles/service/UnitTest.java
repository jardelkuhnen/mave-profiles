package com.jbk.mavenprofiles.service;

import com.jbk.mavenprofiles.tags.UnitTestTag;
import org.junit.jupiter.api.Test;
import org.junit.platform.suite.api.Suite;

@Suite
class UnitTest extends UnitTestTag {

    @Test
    void returnString() {
        System.out.println("Test UnitTest");
    }
}