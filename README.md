# API Gateway (fixture)

HTTP entry point for the platform.

## Integrations (topology)

- Proxies to **Service commandes**, **Paiements**, and **Base clients**.
- Exposes `/api/v1/gateway` consumed by **Portail client**.

## Data transiting on flows (Data Model fixture)

| Peer | Kind | data_category | Notes |
|------|------|---------------|-------|
| Service commandes | API | `ORDER_PAYLOAD` | route `orders` |
| Paiements | API | `PAYMENT_REQUEST` | route `payments` |
| Base clients | API | `CUSTOMER_LOOKUP` | route `customers` |
| Portail client | API (inbound) | `ORDER_SUBMISSION` | documented caller |

See `TransitDataTypes.java` and `application.yml` route `data-category` keys.
