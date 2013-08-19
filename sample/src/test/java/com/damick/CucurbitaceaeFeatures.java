/**
 * Copyright 2013 Jeffrey Damick. All rights reserved.
 */

package com.damick;

import org.junit.Ignore;
import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;

@Ignore // ignore so that the test task won't try to run it.
@RunWith(Cucumber.class)
@Cucumber.Options(
        features = { "pickling.feature" },
        //features = { "src/test/java/biz/neustar/ultra/rest/features/" + "status.feature" },
        //format = { "pretty", "html:build/reports/cucumber/cucumber-html-report", "json-pretty:cucumber-report.json" },
        monochrome = true)
public class CucurbitaceaeFeatures {

}
