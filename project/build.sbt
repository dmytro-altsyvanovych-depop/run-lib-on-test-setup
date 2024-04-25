libraryDependencies += "io.github.embeddedkafka" %% "embedded-kafka-schema-registry" % "7.2.2"

resolvers ++= Seq(
  "confluent" at "https://packages.confluent.io/maven/",
  "jitpack" at "https://jitpack.io"
)
