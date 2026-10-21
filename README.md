# Enterprise Billing & Settlement Ledger (`enterprise_billing_system`)

An enterprise-grade Java settlement and billing engine designed for financial transactions, client invoice generation, batch reconciliation, and corporate taxation.

---

## 1. Project Structure

```
enterprise_billing_system/
├── pom.xml                                                 # Maven build POM
├── src/
│   └── com/enterprise/
│       ├── Main.java                                       # Application orchestrator
│       ├── billing/
│       │   ├── InvoiceService.java                         # Invoice line-item calculation
│       │   ├── BatchProcessor.java                         # Settlement batch loop logic
│       │   ├── VoucherService.java                         # VIP promotional discount limits
│       │   ├── TaxCalculator.java                          # Corporate tax rate computations
│       │   └── OrderStatusValidator.java                   # Ledger order status checker
│       ├── geometry/
│       │   └── ShippingPackageGeometry.java                # Cylindrical box volume engine
│       ├── model/
│       │   └── UserRegistration.java                       # Client account onboarding
│       ├── network/
│       │   └── PortParser.java                             # Payment gateway port parsing
│       ├── io/
│       │   └── ConfigReader.java                           # Properties loader from disk
│       └── util/
│           └── DataFormatter.java                          # Financial report formatter
├── refactoring_plan.json                                   # SCTVA / RDP automated refactoring plan
├── demo_runner.py                                          # Live demonstration script
└── README.md
```

---

