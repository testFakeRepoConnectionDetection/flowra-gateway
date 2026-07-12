package fixture;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/** Inbound API for Portail client; outbound routes to peer applications. */
@RestController
@RequestMapping("/api/v1/gateway")
public class IntegrationHints {

  // spring.cloud.gateway.routes → Service commandes, Paiements, Base clients
  // Documented callers: Portail client (see README)
}
