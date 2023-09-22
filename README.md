# java-pgo

An artificial example of how Java JIT can outperform staticly compiled C++ code. 

Java and C++ programs are identical. There is one integer command line argument expected. 
Here is the output:

### C++
```
Invoked with argument: 42
Elapsed: 1.37501s
Result: 0

Invoked with argument: 142
Elapsed: 1.36948s
Result: 5.21065e+11
```

### Java (17)

```
Invoked with argument: 42
Elapsed: 0.059s
Result: 0.0

Invoked with argument: 142
Elapsed: 1.691s
Result: 5.210653331146538E11
```
