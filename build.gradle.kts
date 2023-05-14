import space.kscience.gradle.isInDevelopment
import space.kscience.gradle.useApache2Licence
import space.kscience.gradle.useSPCTeam

plugins {
    id("space.kscience.gradle.project")
    id("space.kscience.gradle.mpp")
    `maven-publish`
}

val kmathVersion: String by project.extra
val versionPrefix: String by project.extra("1.0.0")

allprojects {
    group = "space.kscience"
    version = "${versionPrefix}-kmath-$kmathVersion"
}


dependencies {
    dokkaPlugin("org.jetbrains.dokka:mathjax-plugin:${npmlibs.versions.dokka.get()}")
}

kscience {
    jvm()
    js()
    native()
    dependencies {
        api("space.kscience:kmath-core:$kmathVersion")
    }
}

ksciencePublish {
    pom("https://github.com/SciProgCentre/kmath-polynomial") {
        useApache2Licence()
        useSPCTeam()
    }
    github(githubProject = "kmath-polynomials", githubOrg = "SciProgCentre")
    space(
        if (isInDevelopment) {
            "https://maven.pkg.jetbrains.space/spc/p/sci/dev"
        } else {
            "https://maven.pkg.jetbrains.space/spc/p/sci/maven"
        }
    )
    sonatype()
}

description = "Polynomials, rational functions, and utilities"


readme {
    maturity = space.kscience.gradle.Maturity.PROTOTYPE
    propertyByTemplate("artifact", rootProject.file("docs/templates/ARTIFACT-TEMPLATE.md"))

    feature("polynomial abstraction", "src/commonMain/kotlin/space/kscience/kmath/functions/Polynomial.kt") {
        "Abstraction for polynomial spaces."
    }
    feature(
        "rational function abstraction",
        "src/commonMain/kotlin/space/kscience/kmath/functions/RationalFunction.kt"
    ) {
        "Abstraction for rational function spaces."
    }
    feature("\"list\" polynomials", "src/commonMain/kotlin/space/kscience/kmath/functions/ListRationalFunction.kt") {
        "List implementation of univariate polynomials."
    }
    feature("\"list\" rational functions", "src/commonMain/kotlin/space/kscience/kmath/functions/ListPolynomial.kt") {
        "List implementation of univariate rational functions."
    }
    feature(
        "\"list\" polynomials' and rational functions' constructors",
        "src/commonMain/kotlin/space/kscience/kmath/functions/listConstructors.kt"
    ) {
        "Constructors for list polynomials and rational functions."
    }
    feature(
        "\"list\" polynomials' and rational functions' utilities",
        "src/commonMain/kotlin/space/kscience/kmath/functions/listUtil.kt"
    ) {
        "Utilities for list polynomials and rational functions."
    }
    feature(
        "\"numbered\" polynomials",
        "src/commonMain/kotlin/space/kscience/kmath/functions/NumberedRationalFunction.kt"
    ) {
        "Numbered implementation of multivariate polynomials."
    }
    feature(
        "\"numbered\" rational functions",
        "src/commonMain/kotlin/space/kscience/kmath/functions/NumberedPolynomial.kt"
    ) {
        "Numbered implementation of multivariate rational functions."
    }
    feature(
        "\"numbered\" polynomials' and rational functions' constructors",
        "src/commonMain/kotlin/space/kscience/kmath/functions/numberedConstructors.kt"
    ) {
        "Constructors for numbered polynomials and rational functions."
    }
    feature(
        "\"numbered\" polynomials' and rational functions' utilities",
        "src/commonMain/kotlin/space/kscience/kmath/functions/numberedUtil.kt"
    ) {
        "Utilities for numbered polynomials and rational functions."
    }
    feature(
        "\"labeled\" polynomials",
        "src/commonMain/kotlin/space/kscience/kmath/functions/LabeledRationalFunction.kt"
    ) {
        "Labeled implementation of multivariate polynomials."
    }
    feature(
        "\"labeled\" rational functions",
        "src/commonMain/kotlin/space/kscience/kmath/functions/LabeledPolynomial.kt"
    ) {
        "Labeled implementation of multivariate rational functions."
    }
    feature(
        "\"labeled\" polynomials' and rational functions' constructors",
        "src/commonMain/kotlin/space/kscience/kmath/functions/labeledConstructors.kt"
    ) {
        "Constructors for labeled polynomials and rational functions."
    }
    feature(
        "\"labeled\" polynomials' and rational functions' utilities",
        "src/commonMain/kotlin/space/kscience/kmath/functions/labeledUtil.kt"
    ) {
        "Utilities for labeled polynomials and rational functions."
    }
}

readme {
    maturity = space.kscience.gradle.Maturity.EXPERIMENTAL
    readmeTemplate = file("docs/templates/README-TEMPLATE.md")
}
