package mnlogdemo.helpers

import spock.lang.Specification

class SomeHelperSpec extends Specification {

    void 'test multiplication'() {
        expect:
        28 == new SomeHelper().multiply(4, 7)
    }
}
