package zoret4.payme.web.handlers

import org.springframework.stereotype.Component
import org.springframework.web.reactive.function.server.ServerRequest
import org.springframework.web.reactive.function.server.ServerResponse.ok
import org.springframework.web.reactive.function.server.body
import reactor.core.publisher.Mono
import zoret4.payme.AppProperties

@Component
class PaymeHandler(val appProperties: AppProperties) {
    fun get(req: ServerRequest) = ok()
            .body(Mono.just("hi from payme ${appProperties.test}"))

}