package org.camel.example.route;

import org.apache.camel.Exchange;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
class RestApi extends RouteBuilder {
    @Override
    public void configure() {
        getContext().setTracing(true);
        restConfiguration().host("localhost").port(8080);
        rest("/api/").id("api-route").get("/bean").produces("application/json").to("direct:remoteService");
        from("direct:remoteService").routeId("direct-route").log("${body}").transform().simple("Hello");
    }
}
