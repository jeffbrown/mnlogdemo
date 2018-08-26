package mnlogdemo.helpers

import io.micronaut.context.BeanContext
import io.micronaut.context.BeanLocator
import spock.lang.AutoCleanup
import spock.lang.Shared
import spock.lang.Specification


class SomeHelperSpec extends Specification {

    @Shared
    @AutoCleanup
    BeanLocator locator = BeanContext.run()

    @Shared
    SomeHelper helper = locator.getBean(SomeHelper)

    void 'test multiplication'() {
        expect:
        28 == helper.multiply(4, 7)
    }
}
