resolvers ++= Seq(
    DefaultMavenRepository,
    "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/"
)


addSbtPlugin("play" % "sbt-plugin" % "2.1.1")
