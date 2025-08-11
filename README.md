# Hybrid-AutomationFramework
## Description
This is a scalable Hybrid Automation Framework developed using Java, Selenium WebDriver, TestNG, and Maven. The project follows the Page Object Model (POM) design pattern and uses a data-driven approach for flexibility and maintainability. The automation is performed on the OrangeHRM Demo Website, simulating real-world web testing scenarios.

### Features
1.Page Object Model for better structure and reusability
2.Data-driven testing using TestNG parameters
3.Utilities for common actions (e.g., screenshot capture)
4.Maven integration for dependency management
5.TestNG for parallel execution and reporting
6.Easy integration with CI/CD tools like Jenkins
7.Designed with future scalability in mind

### 📂 Project Structure
├── BaseTest/               → Setup and teardown logic  
├── Pages/                  → Page classes for UI elements & actions  
├── Test/                   → TestNG test classes  
├── Utilities/              → Helper classes like screenshot utility  
├── testng.xml              → Test suite configuration  
└── pom.xml                 → Maven dependencies and build setup  
