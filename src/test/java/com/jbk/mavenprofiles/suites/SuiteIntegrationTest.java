package com.jbk.mavenprofiles.suites;

import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectPackages("com.jbk.*")
@IncludeTags("IntegrationTest")
class SuiteIntegrationTest {
}
