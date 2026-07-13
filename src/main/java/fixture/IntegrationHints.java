package fixture;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Inbound API for Portail client; outbound routes to peer applications.
 *
 * <p>Route data_category values: ORDER_PAYLOAD, PAYMENT_REQUEST, CUSTOMER_LOOKUP (see
 * fixture.flow.TransitDataTypes).
 */
@RestController
@RequestMapping("/api/v1/gateway")
public class IntegrationHints {

  // spring.cloud.gateway.routes → Service commandes (ORDER_PAYLOAD), Paiements (PAYMENT_REQUEST),
  // Base clients (CUSTOMER_LOOKUP)
  // Inbound from Portail client carries ORDER_SUBMISSION
}
