package example

import org.slf4j.LoggerFactory
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import java.util.*

/**
 * Created by gabrielqueiroz on 4/24/17.
 */
@SpringBootApplication
open class Application

fun main (args: Array<String>) {
    val context = SpringApplication.run(Application::class.java, *args)
    val log = LoggerFactory.getLogger("Application")
    Arrays.stream(context.getBeanDefinitionNames()).forEach { bean -> log.info("BEAN: {}", bean) }
}

