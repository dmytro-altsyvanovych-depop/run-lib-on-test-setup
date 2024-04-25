scalaVersion := "2.13.12"

name := "tests"
organization := "test-projects"
version := "1.0"

libraryDependencies ++= Seq(
  "org.scala-lang.modules" %% "scala-parser-combinators" % "2.3.0",
  "io.github.embeddedkafka" %% "embedded-kafka" % "3.7.0" % Test,
  "org.specs2" %% "specs2-core" % "4.20.5" % Test
)

Test / testOptions += Tests.Setup { () =>
  _root_.io.github.embeddedkafka.EmbeddedKafka.start()
  println("Start EmbeddedKafka")
}

Test / testOptions += Tests.Cleanup { () =>
  _root_.io.github.embeddedkafka.EmbeddedKafka.stop()
  println("Stop EmbeddedKafka")
}
