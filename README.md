Billing System
A simple yet functional command-line billing application built in Java, extended with a static HTML/CSS/JavaScript frontend for web-based interaction. This project simulates a point-of-sale (POS) system for a store called "SAI STORE," allowing users to input customer details, add items, and generate formatted bills with totals.
Perfect for demonstrating core Java OOP concepts, user input handling, and basic full-stack prototyping skills.

Features:

Java Backend: Console-based input for customer name/address, item details (name & price), and automated bill generation with totals.
Frontend: Dynamic web form to add items on-the-fly and display styled bills (no server required—pure client-side).
Modular design: Separate Item class for encapsulation; reusable displayBill method.
Handles multiple items (up to user-specified count) with basic validation.


Tech Stack:

Backend: Java (Core, OOP, Scanner for I/O, Arrays)
Frontend: HTML5, CSS3, Vanilla JavaScript (dynamic form generation & bill rendering)
Tools: VS Code/IntelliJ for development; Git for version control


Installation & Setup

1) Clone the Repo:
textgit clone https://github.com/zakirshaikh3004/billing-system.git
cd billing-system

2) Java Backend:

Ensure JDK 8+ is installed (e.g., java -version).
Compile: javac src/Item.java src/BillingSystem.java (or run directly in IDE).
No external dependencies.


3) Frontend:

Open billing-system.html in any modern browser (e.g., Chrome, Firefox).
No build tools needed—fully static.


Usage
Running the Java Backend (Console)

In terminal/IDE: java -cp src BillingSystem
Follow prompts:

Enter name, address, and total items.
For each item: Enter name and price.


View the formatted bill in console.


WELCOME...!
Enter your name: John Doe
Enter your address: 123 Main St
Enter total items: 2
Enter item name for item 1: Laptop
Enter price for item 1: 1000
Enter item name for item 2: Mouse
Enter price for item 2: 20


============================================
		ZAKIR'S STORE
============================================

Name: Zakir Shaikh		Address: Ambarnath

Id: 1	Name: Laptop	Price: 1000
------------------------------------------------
Id: 2	Name: Mouse	Price: 20
------------------------------------------------
			Total: 1020
------------------------------------------------

============================================
		!..VISIT AGAIN..!
============================================



Using the Frontend (Web)

1)Open billing-system.html in a browser.
2)Fill customer details and total items → Click Add Items.
3)Enter item names/prices → Click Generate Bill.
4)View the styled bill below the form.

Live Demo: Deployed on GitHub Pages 


Screenshots

1)Console Bill (Java): <img width="628" height="551" alt="image" src="https://github.com/user-attachments/assets/06d02cdc-705b-45c1-882b-2868a69ce88f" />

2)Web Bill (Frontend): <img width="1316" height="765" alt="image" src="https://github.com/user-attachments/assets/f458e93e-22c1-4c94-9df7-2985c81c8489" />


Project Structures:
billing-system/
├── src/
│   ├── Item.java          # Item model class
│   └── BillingSystem.java # Main logic & bill display
└── billing-system.html    # Frontend (HTML/CSS/JS in one file)
└── README.md              # This file


Future Improvements

1)Convert Java to Spring Boot REST API for true full-stack (with database like H2 for bill storage).
2)Add features: Discounts, inventory management, PDF export (e.g., via iText in Java or jsPDF in JS).
3)Frontend enhancements: React for better state management; backend integration via Fetch API.



Contributing

1)Fork the repo.
2)Create a feature branch (git checkout -b feature/amazing-feature).
3)Commit changes (git commit -m 'Add some amazing feature').
4)Push to branch (git push origin feature/amazing-feature).
5)Open a Pull Request.

Feedback welcome—feel free to raise issues!


License
MIT License © 2025 [Your Name]. See LICENSE for details (add a LICENSE file if needed).

Built by a fourth-year CS student for portfolio purposes. Questions? Reach out on LinkedIn.






