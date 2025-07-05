## Empty project

### Prerequisites
You upgraded Kotlin to version 2.0 or higher.\
Since you are using compose, of course you have connected the compiler plugin according to this documentation
https://developer.android.com/develop/ui/compose/compiler

---

### Story 1
Imagine you have added a few product flavors to your project.\
In this test project 50 flavors.\
Eventually, you noticed that incremental builds were taking a bit longer than before adding the product flavors.

### Let's profile the build
To build the project for "ITest1" flavor we typically use next command:\
`gradle assembleItest1Debug`

### Test 1
Incremental build with no codebase changes. (50 flavor in the project)
```text
BUILD SUCCESSFUL in 6s
34 actionable tasks: 34 up-to-date
```

### Test 2
Incremental build with 1 line change in MainActivity.kt. (50 flavor in the project)
```text
BUILD SUCCESSFUL in 7s
34 actionable tasks: 4 executed, 30 up-to-date
```

---

### Story 2
Let's try to leave only 1 product flavor, for example "ITest1".\

Again use the same command to build the project:\
`gradle assembleItest1Debug`

### Test 3
Incremental build with no codebase changes. (1 flavor in the project)
```text
BUILD SUCCESSFUL in 529ms
34 actionable tasks: 34 up-to-date
```

### Test 4
Incremental build with 1 line change in MainActivity.kt. (1 flavor in the project)
```text
BUILD SUCCESSFUL in 1s
34 actionable tasks: 4 executed, 30 up-to-date
```

### Conclusion:
The amount of product flavors affects build time by some reason.

---