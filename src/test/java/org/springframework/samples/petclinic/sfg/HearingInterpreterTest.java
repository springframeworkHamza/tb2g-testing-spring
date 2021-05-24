package org.springframework.samples.petclinic.sfg;


import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;

@ActiveProfiles("base-test")
@RunWith(SpringRunner.class)
@ContextConfiguration(classes = {BaseConfig.class, LaurelConfig.class})
class HearingInterpreterTest {

    @Autowired
    HearingInterpreter hearingInterpreter;

    @Disabled
    @Test
    void whatIHeard() {

        String word = hearingInterpreter.whatIHeard();

        assertEquals("Laurel", word);
    }

}