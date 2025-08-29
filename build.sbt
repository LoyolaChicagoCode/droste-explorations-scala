name := "droste-explorations-scala"

version := "0.2"

libraryDependencies ++= Seq(
  "io.higherkindness" %% "droste-core" % "0.9.0",
  "io.chrisdavenport" %% "cats-scalacheck" % "0.3.2" % Test,
  "org.typelevel" %% "cats-laws" % "2.12.0" % Test
)
