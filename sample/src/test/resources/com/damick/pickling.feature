#
# Copyright 2013 Jeffrey Damick. All rights reserved.
#


Feature: Pickling

    Scenario: Pickle that cuke
        Given a cuke that is not pickled
          And there is an empty pickle jar
        When cuke is put in the pickle jar
        Then the cuke removed from the jar will be pickled
