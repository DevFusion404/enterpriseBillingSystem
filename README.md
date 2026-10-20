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

## 2. Refactoring Catalog

| Target File | Detected Smell | Refactoring Action | Confidence | Rollback |
|---|---|---|---|---|
| `src/com/enterprise/geometry/ShippingPackageGeometry.java` | `MagicNumber` (`3.14159`) | **Introduce Constant** (`PI_VALUE`) | **0.996** | **No** |
| `src/com/enterprise/network/PortParser.java` | Broad Catch Clause (`Exception e`) | **Replace Bare Except with Specific Exception** (`NumberFormatException`) | **0.999** | **No** |
| `src/com/enterprise/model/UserRegistration.java` | `TooManyParameters` (6 params) | **Introduce Parameter Object** (`RegistrationData`) | **0.929** | **No** |
| `src/com/enterprise/util/DataFormatter.java` | Cryptic Method Name (`calcDat`) | **Rename Method** (`calculateFormattedData`) | **0.997** | **No** |
| `src/com/enterprise/billing/VoucherService.java` | `MagicNumber` Threshold (`1000`) | **Introduce Constant** (`MIN_DISCOUNT_THRESHOLD`) | **0.997** | **No** |
| `src/com/enterprise/billing/BatchProcessor.java` | `LongMethod` | **Extract Method** (`calculateTotalSquared`) | **0.948** | **No** |
| `src/com/enterprise/io/ConfigReader.java` | Broad Catch in I/O (`Exception e`) | **Replace Bare Except with Specific Exception** (`IOException`) | **1.000** | **No** |
| `src/com/enterprise/billing/TaxCalculator.java` | `MagicNumber` (`0.15`) | **Introduce Constant** (`DEFAULT_TAX_RATE`) | **0.996** | **No** |
| `src/com/enterprise/billing/OrderStatusValidator.java` | Magic String Literal (`"PENDING"`) | **Introduce Constant** (`STATUS_PENDING`) | **0.996** | **No** |
| `src/com/enterprise/billing/InvoiceService.java` | Cryptic Method Name (`calcTot`) | **Rename Method** (`calculateTotal`) | **0.997** | **No** |

---

## 3. Live Demonstration

Run the automated Java transformation and verification demo:

```powershell
python enterprise_billing_system/demo_runner.py
```

Expected result:
```
TOTAL: 10/10 Java Transformations Passed with 100% Safety & 0 Rollbacks.
```
