# Airplane and Airport Management System (Java)

## 📄 Description
This project models a simple **Airplane and Airport Management System** using **Java and Object-Oriented Programming** principles. It allows users to manage airplane properties, schedule flights, and board passengers into appropriate seat classes based on capacity and destination.

## 🛫 Key Features
- Create and configure **Airplane** objects with name, origin, destination, capacity, and flight times
- Automatically divides seats: 10% for First Class and 90% for Economic Class
- Add and validate **Passengers** based on seat class and destination
- Display passenger manifest by class
- Prevent overbooking per class or flight

## 🔍 Core Classes
### ✅ `AirPlane.java`
- Manages airplane attributes, scheduling, seating, and passenger list
- Enforces seating constraints (10% First Class / 90% Economic)
- Handles passenger assignment and list display

### ✅ `AirPortTest.java`
- Provides a demo interface for creating planes and adding passengers via console input
- Tests functionality of airplane setup and booking logic

## 🔄 How to Run
### 📅 Compile:
```bash
javac AirPlane.java Passengers.java AirPortTest.java
```

### 🔢 Run:
```bash
java AirPortTest
```

## 📈 Sample Output
```text
Ethiopian will take off at 14 and land at 19
The plane name: RwandAir
The plane origin: Kigali
The plane destination: Nairobi
The passenger name: Faith
The passenger origin: Kigali
The passenger destination: Nairobi
The passenger seat class: economic
The plane RwandAir is taking off from Kigali at in destination of Nairobi with a capacity of 20
In RwandAir we have 1 passenger(s) on board. 0 in the first class and 1 in the economic class.
...
```

## 📝 Notes
- Seat assignment is based on capacity rules and passenger destination match
- Uses static counters to manage overall passengers and per-class limits

## 🌟 Future Enhancements
- GUI-based passenger check-in
- Dynamic passenger removal or seat change
- Airport-level aggregation of multiple airplanes

---
Contributions welcome to expand airport features or refactor logic for scalability! ✈️

Clovis Mushagalusa CIRUBAKADERHA
