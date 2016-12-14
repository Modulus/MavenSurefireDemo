package surefire.demo

import spock.lang.Specification

/**
 * Created by joska131 on 14.12.2016.
 */
class SpockIT extends Specification {
    def "Should run with integration tests"(){
        expect:
            false == false
    }
}
