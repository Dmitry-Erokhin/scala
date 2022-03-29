import sbt.Keys._
import sbt._

object Settings {
  val scalaVer   = "3.1.1"

  val shared: Seq[Setting[_]] = Seq(
    scalacOptions     ++= sharedScalacOptions,
    crossScalaVersions := List(scalaVer),
    scalaVersion       := scalaVer,
    ThisBuild / turbo  := true,
    compileOrder       := CompileOrder.JavaThenScala,
    organization       := "de.erokhin",
  )

  private lazy val sharedScalacOptions = Seq(
    "-deprecation",                  // emit warning and location for usages of deprecated APIs
    "-explain",                      // explain errors in more detail
    "-explain-types",                // explain type errors in more detail
    "-feature",                      // emit warning and location for usages of features that should be imported explicitly
    "-indent",                       // allow significant indentation.
    "-new-syntax",                   // require scala 3.0 new syntax.
    "-print-lines",                  // show source code line numbers.
    "-unchecked",                    // enable additional warnings where generated code depends on assumptions
    "-Ykind-projector",              // allow `*` as wildcard to be compatible with kind projector
    "-Xfatal-warnings",              // fail the compilation if there are any warnings
    "-Xmigration",                   // warn about constructs whose behavior may have changed since version
    "-language:existentials",        // Existential types (besides wildcard types) can be written and inferred
    "-language:experimental.macros", // Allow macro definition (besides implementation and application)
    "-language:higherKinds",         // Allow higher-kinded types
    "-language:implicitConversions", // Allow definition of implicit functions called views
    "-language:postfixOps"           // Enable postfixOps
  )
}
