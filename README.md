# CPU Job Scheduler Simulation

An event-driven CPU scheduling simulator built in Java using Maven.  
The project was created while studying Operating Systems concepts and exploring how discrete event simulation and modular scheduler design work in practice.

The simulator currently supports multiple non-preemptive CPU scheduling algorithms through a clean and extensible architecture.

---

## Features

- Event-driven simulation engine
- Modular scheduler interface
- Non-preemptive FCFS scheduling
- Non-preemptive SJF scheduling
- Priority queue–based event processing
- Clean package separation and extensible design
- Maven-based project structure

---

## Implemented Scheduling Algorithms

| Algorithm | Type |
|---|---|
| FCFS (First Come First Serve) | Non-preemptive |
| SJF (Shortest Job First) | Non-preemptive |

---

## Project Structure

```text
src/main/java/com/prasoon/scheduler
│
├── algorithms
│   ├── FCFScheduler.java
│   └── SJFScheduler.java
│
├── core
│   ├── Process.java
│   └── Scheduler.java
│
├── events
│   ├── Event.java
│   ├── ProcessArrivalEvent.java
│   └── ProcessCompletionEvent.java
│
├── simulation
│   └── SimulationEngine.java
│
└── Main.java
```

---

## Architecture Overview

The simulator uses a discrete event simulation model.

- Events are stored in a priority queue ordered by simulation time.
- The `SimulationEngine` processes events chronologically.
- Scheduling algorithms implement the common `Scheduler` interface.
- Processes are added to scheduler-specific ready queues.
- Different scheduling strategies can be swapped without modifying the simulation engine.

This separation allows the scheduling logic and simulation logic to remain independent and extensible.

---

## Sample Simulation

### Input Processes

| Process | Arrival Time | Burst Time |
|---|---|---|
| P1 | 0 | 5 |
| P2 | 2 | 3 |
| P3 | 4 | 2 |

---

### Sample Output

```text
Simulation started...
Processing event at time: 0
Time 0: Process P1 arrived.

Processing event at time: 2
Time 2: Process P2 arrived.

Processing event at time: 4
Time 4: Process P3 arrived.

Processing event at time: 5
Time 5: Process P2 completed.

Processing event at time: 5
Time 5: Process P1 completed.

Processing event at time: 6
Time 6: Process P3 completed.

Simulation finished.
```

---

## Build and Run

### Compile

```bash
mvn clean install
```

### Run

```bash
java -cp target/classes com.prasoon.scheduler.Main
```

---

## Technologies Used

- Java
- Maven
- Priority Queues
- Discrete Event Simulation
- Object-Oriented Design

---

## Motivation

This project was built to better understand:

- CPU scheduling algorithms
- Event-driven system design
- Simulation engines
- Maven project structure
- Modular and extensible Java architecture

---