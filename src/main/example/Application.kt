package example

import org.slf4j.LoggerFactory
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import java.util.*
import java.util.Arrays.sort

/**
 * Created by gabrielqueiroz on 4/24/17.
 */
@SpringBootApplication
open class Application

fun main (args: Array<String>) {
    val context = SpringApplication.run(Application::class.java, *args)
    val beans   = context.getBeanDefinitionNames()
    sort(beans)
    Arrays.stream(beans).forEach{ bean -> LoggerFactory.getLogger(Application::class.java).info("BEAN: {}", bean) }
}

