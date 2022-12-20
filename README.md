# Polynomials and Rational Functions for KMath

KMath provides a way to work with uni- and multivariate polynomials and rational functions. It includes full support of arithmetic operations on integers, **constants** (elements of the ring that polynomials are built over), variables (for certain multivariate implementations), polynomials and rational functions encapsulated in the so-called **polynomial space** and **rational function space** and some other utilities, such as algebraic differentiation and substitution.

## Author

The project is created and maintained by [Gleb Minaev](https://github.com/lounres).

## Implementation

Implementation note can be found [in docs](/docs/polynomials.md)

# Features

 - [polynomial abstraction](src/commonMain/kotlin/space/kscience/kmath/functions/Polynomial.kt) : Abstraction for polynomial spaces.
 - [rational function abstraction](src/commonMain/kotlin/space/kscience/kmath/functions/RationalFunction.kt) : Abstraction for rational function spaces.
 - ["list" polynomials](src/commonMain/kotlin/space/kscience/kmath/functions/ListRationalFunction.kt) : List implementation of univariate polynomials.
 - ["list" rational functions](src/commonMain/kotlin/space/kscience/kmath/functions/ListPolynomial.kt) : List implementation of univariate rational functions.
 - ["list" polynomials' and rational functions' constructors](src/commonMain/kotlin/space/kscience/kmath/functions/listConstructors.kt) : Constructors for list polynomials and rational functions.
 - ["list" polynomials' and rational functions' utilities](src/commonMain/kotlin/space/kscience/kmath/functions/listUtil.kt) : Utilities for list polynomials and rational functions.
 - ["numbered" polynomials](src/commonMain/kotlin/space/kscience/kmath/functions/NumberedRationalFunction.kt) : Numbered implementation of multivariate polynomials.
 - ["numbered" rational functions](src/commonMain/kotlin/space/kscience/kmath/functions/NumberedPolynomial.kt) : Numbered implementation of multivariate rational functions.
 - ["numbered" polynomials' and rational functions' constructors](src/commonMain/kotlin/space/kscience/kmath/functions/numberedConstructors.kt) : Constructors for numbered polynomials and rational functions.
 - ["numbered" polynomials' and rational functions' utilities](src/commonMain/kotlin/space/kscience/kmath/functions/numberedUtil.kt) : Utilities for numbered polynomials and rational functions.
 - ["labeled" polynomials](src/commonMain/kotlin/space/kscience/kmath/functions/LabeledRationalFunction.kt) : Labeled implementation of multivariate polynomials.
 - ["labeled" rational functions](src/commonMain/kotlin/space/kscience/kmath/functions/LabeledPolynomial.kt) : Labeled implementation of multivariate rational functions.
 - ["labeled" polynomials' and rational functions' constructors](src/commonMain/kotlin/space/kscience/kmath/functions/labeledConstructors.kt) : Constructors for labeled polynomials and rational functions.
 - ["labeled" polynomials' and rational functions' utilities](src/commonMain/kotlin/space/kscience/kmath/functions/labeledUtil.kt) : Utilities for labeled polynomials and rational functions.


## Artifact:

The Maven coordinates of this project are `space.kscience:kmath-polynomial:1.0.0-kmath-0.3.1-dev-5`.

**Gradle Groovy:**
```groovy
repositories {
    maven { url 'https://repo.kotlin.link' }
    mavenCentral()
}

dependencies {
    implementation 'space.kscience:kmath-polynomial:1.0.0-kmath-0.3.1-dev-5'
}
```
**Gradle Kotlin DSL:**
```kotlin
repositories {
    maven("https://repo.kotlin.link")
    mavenCentral()
}

dependencies {
    implementation("space.kscience:kmath-polynomial:1.0.0-kmath-0.3.1-dev-5")
}
```