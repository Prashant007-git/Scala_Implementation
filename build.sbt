ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.10"
libraryDependencies ++= {
    CrossVersion.partialVersion(scalaVersion.value) match {
        case Some((2, major)) if major <= 12 =>
            Seq()
        case _ =>
            Seq("org.scala-lang.modules" %% "scala-parallel-collections" % "1.0.4")
    }
}
lazy val root = (project in file("."))
  .settings(
    name := "ScalaImplement"
)
