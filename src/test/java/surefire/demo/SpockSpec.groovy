package surefire.demo

import spock.lang.Specification

/**
 * Created by joska131 on 14.12.2016.
 */
class SpockSpec extends Specification{

    def "Should run with unit tests"(){
        expect:
            true == true
    }
}
