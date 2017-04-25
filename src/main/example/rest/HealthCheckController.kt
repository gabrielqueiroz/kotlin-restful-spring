package example.rest

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 * Created by gabrielqueiroz on 4/24/17.
 */
@RestController
class HealthCheckController {

    @RequestMapping("/health")
    fun health(): String {
        return "My Kotlin RESTFul Application using Spring is running"
    }
}