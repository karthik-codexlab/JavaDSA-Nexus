# Java Reactive Programming (Core Java)

This module demonstrates **Reactive Programming concepts using pure Java**
without external frameworks such as Reactor or RxJava.

The goal is to understand **how reactive systems work internally**, not just
how to use libraries.

---

## What is Reactive Programming?

Reactive programming is a programming paradigm focused on:
- Asynchronous execution
- Non-blocking data flow
- Backpressure handling
- Event-driven communication

Instead of pulling data, consumers **react** to data pushed by producers.

---

## Key Concepts Demonstrated

### 1. Publisher
A component that produces data asynchronously.

### 2. Subscriber
A component that consumes data and controls the rate using backpressure.

### 3. Subscription
The communication contract between publisher and subscriber.

### 4. Backpressure
The ability of the subscriber to signal how much data it can handle.

---

## Java Flow API

Java provides reactive support via:
