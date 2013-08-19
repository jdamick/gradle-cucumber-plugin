/**
 * Copyright 2013 Jeffrey Damick. All rights reserved.
 */

package com.damick;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Ignore;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

@Ignore
public class PicklingTest {
    private PickleJar pickleJar;
    private Cucurbitaceae cuke;

    @Before
    public void cukeSetup() {
        // to illustrate Before..
        cuke = new Cucurbitaceae();
    }

    @Given(".*cuke that is not pickled.*")
    public void notPickled() {
        assertNotNull(cuke);
        assertFalse(cuke.isPickled());
    }

    @Given(".*there is an empty pickle jar.*")
    public void pickleJar() {
        pickleJar = new PickleJar();
        assertNotNull(pickleJar);
        assertTrue(pickleJar.isEmpty());
    }

    @When("cuke is put in the pickle jar")
    public void pickleCuke() {
        pickleJar.add(cuke);
    }

    @Then(".*cuke removed from the jar will be pickled")
    public void removePickle() {
        Cucurbitaceae removedCuke = pickleJar.remove();
        assertTrue(removedCuke.isPickled());
    }
}
