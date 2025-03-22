# Centralized Mutual Exclusion Algorithm Simulation Application

---

## Overview

This project simulates a centralized mutual exclusion algorithm for a clothing brand with multiple clients. It demonstrates how to manage shared resources such as products in a centeralized inventory in a distributed system using a central coordinator.

- **Resource (Main Server) Application:** Acts as a centeralized database holding products and ensures real time inventory updates. 
- **Coordinator (Intermediate Server) Application:** Acts as a live mediator by maintaining temporary stock levels and handling FIFO ordering in real time.
- **Process (Client) Applications:** Simulate customers browsing products and sending a purchase requests.

---

## How It Works

1. **Client Interaction:**  
   - Customers launch the client application and enter their name on the welcome screen.
   - A connection is established with the coordinator, which registers the customer.

2. **Coordinator Operation:**
   - The Intermediate Server connects to the Main server and requests a copy of the products currently avaliable in the inventory
   - Registers the customers by assigning a unique ID, Socket connection, Input and Output data streams for each customer 
   - Holds a temporary stock level for each product and processes purchase requests live using a FIFO mechanism.
   - No explicit queuing of customers occurs; instead, requests are handled immediately as they come in (Real time).
   - Has a GUI console that displays current customer status in real time.

4. **Resource Access and Update:**  
   - When a product is selected, the coordinator immediately reserves the item from its temporary stock.
   - Only when a customer confirms a purchase the coordinator send a message to the Main Server to update the actual inventory.
   - The customer is notified of the successful purchase, and all GUIs update accordingly.

---

## Design Highlights

- **Live FIFO Handling with Temporary Stock Levels:**  
  The intermediate server processes purchase requests in real time using a live FIFO approach and manages a temporary stock level to quickly respond to customers.

- **Centralized Mutual Exclusion:**  
  A single coordinator gives access to shared resources according to the number of customers requesting it, preventing concurrent modification.

- **GUI Visualization:**  
  Each component includes a user-friendly interface to monitor and control the simulation.

- **Scalability and Fault Tolerance:**  
  The centralized approach simplifies control and consistency but can bottleneck as the system gets bigger.

---

## Setup and Running the Application

### Prerequisites

- Java Development Kit (JDK) 8 or later.
- An IDE (e.g., NetBeans, Eclipse) or any other tool to compile and run Java applications.

### How to Run

1. **Main Server (Resource Application):**  
   - Run `SingleThreadServer.java` from the `MainServer` package.  
     The server listens on port 3000 and manages product inventory.

2. **Intermediate Server (Coordinator Application):**  
   - Run `MiddleServer.java` from the `IntermediateServer` package.  
     It connects to the Main Server, maintains temporary stock levels, and processes live purchase requests on port 2000.

3. **Client (Process Application):**  
   - Run `Customer.java` from the `ClientSide` package (which opens `WelcomePage.java`).
   - Enter your name to connect and begin interacting with the store.
   - Note: Multiple clients can be ran simultaneously 

---

## Conclusion

This simulation is an educational tool that demonstrates centralized mutual exclusion in a distributed system. It shows how a central coordinator can effectively manage resource access in real time using temporary stock levels and live FIFO processing, ensuring consistency and fairness while providing a clear, interactive user interface. This project was created as a part of the Distrubuted Systems course provided by The British University In Egypt.

---

## Relative Media

<div align="center">
    <img src="Images/HalemStore Logo.png" alt="Screenshot 1" width="28%"/>
    <img src="Images/The British University In Egypt.png" alt="Screenshot 2" width="45%"/>
</div>

----
