# Garbage Collection Algorithms

## 1. Serial GC
- Single-threaded
- Suitable for small applications
- Causes long pauses

## 2. Parallel GC
- Multiple threads
- High throughput
- Used in many server apps

## 3. CMS (Deprecated)
- Low pause time
- Fragmentation issues

## 4. G1 GC (Default in modern Java)
- Divides heap into regions
- Predictable pause times
- Good balance of throughput & latency

## 5. ZGC
- Ultra-low latency
- Designed for large heaps
- Mostly concurrent
