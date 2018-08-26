package mnlogdemo.helpers

import groovy.util.logging.Slf4j

import javax.inject.Singleton

@Singleton
@Slf4j
class SomeHelper {

    int multiply(int x, int y) {
        int product = x * y

        log.debug "$x times $y is $product"
        log.trace "$x times $y is $product"

        product
    }
}
