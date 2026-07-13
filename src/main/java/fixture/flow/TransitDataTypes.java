package fixture.flow;

/** Data categories routed by the gateway toward peer applications. */
public final class TransitDataTypes {

  public static final String ROUTE_ORDERS = "ORDER_PAYLOAD";
  public static final String ROUTE_PAYMENTS = "PAYMENT_REQUEST";
  public static final String ROUTE_CUSTOMERS = "CUSTOMER_LOOKUP";

  /** Inbound from Portail client */
  public static final String INBOUND_FROM_PORTAL = "ORDER_SUBMISSION";

  private TransitDataTypes() {}
}
