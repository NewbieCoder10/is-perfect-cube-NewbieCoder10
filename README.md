## Value

* Basic implementation: 10 points
* Basic unit tests: 5 points
* Extra credit: None

## Basic task

Perfect cubes are integers which are the result of some integer raised to the 3<sup>rd</sup> power. For example, 1 = 1<sup>3</sup>, 8 = 2<sup>3</sup>, 27 = 3<sup>3</sup>, 64 = 4<sup>3</sup>, etc. Thus, 1, 8, 27, 64, &hellip; are perfect cubes.

Your task is to complete the implementation of a method that takes a `long` input parameter, and returns the `boolean` value `true` if the value of the parameter is a perfect cube, and `false` otherwise.

### Implementation

In the `edu.cnm.deepdive.Cube` class, the `isPerfectCube` method is declared with the following signature, return type, and modifiers:
 
```java
public static boolean isPerfectCube(long input)
```

For more method declaration details, see the [Javadoc documentation](docs/api/edu/cnm/deepdive/Cube.html#isPerfectCube(long)).

For the basic task, complete the implementation of this method, according to the following specifications:

* If `input` is a perfect cube, `isPerfectCube(input)` must return `true`; if `input` is not a perfect cube, it must return `false`.

* Remember that a negative number has a negative cube root. Thus, `input` may be negative, and no exception should be thrown in that case.

### Unit tests

For unit testing credit, use JUnit5 to verify your code with the following inputs and expected outputs.

(Note that the numbers below are formatted with underscores as digit group separators, which the Java parser recognizes in numeric literals; however, your test code is not required to include them.)

| `input` | Expected return value |
|--------:|----------------------:|
| `0` | `true` |
| `-1` | `true` |
| `4_096` | `true` |
| `549_755_813_888` | `true` |
| `4` | `false` |
| `65_536` | `false` |

In evaluating your implementation, we reserve the right to include additional test cases; code that satisfies the requirements stated above should pass all such additional tests.
 
### Hints

* The `Cube.isPerfectCube` method to be completed is `static`. There is no need to create instances of `Square` (and arguably no benefit in doing so).  

* You may find it useful to create one or more additional `static` methods as "helpers"; the problem can be solved without doing so, however.

* Do not hesitate to declare any constants (`static final` fields) that you feel might simplify or clarify your code.

* The method to be completed includes a `TODO` comment to that effect.
