import sbt._

object Dependencies {

  object versions {
    val logback                 = "1.2.11"
    val logStashLogbackEncoder  = "7.0.1"
    val zio                     = "2.0.0-RC2"
    val zioConfig               = "3.0.0-RC3"
    val zioLogging              = "2.0.0-RC5"
  }

  private val zio        = "dev.zio" %% "zio" % versions.zio
  private val zioStreams = "dev.zio" %% "zio-streams" % versions.zio

  private val zioTest         = "dev.zio" %% "zio-test" % versions.zio
  private val zioTestSbt      = "dev.zio" %% "zio-test-sbt" % versions.zio
  private val zioTestMagnolia = "dev.zio" %% "zio-test-magnolia" % versions.zio

  private val zioConfig         = "dev.zio" %% "zio-config" % versions.zioConfig
  private val zioConfigMagnolia = "dev.zio" %% "zio-config-magnolia" % versions.zioConfig
  private val zioConfigTypesafe = "dev.zio" %% "zio-config-typesafe" % versions.zioConfig

  private val logback         = "ch.qos.logback" % "logback-classic" % versions.logback
  private val logStashLogback = "net.logstash.logback" % "logstash-logback-encoder" % versions.logStashLogbackEncoder
  private val zioLoggingSlf4j = "dev.zio" %% "zio-logging-slf4j" % versions.zioLogging


  val learn: Seq[ModuleID] = Seq(
    zio,
    zioStreams,
    zioConfig,
    zioConfigMagnolia,
    zioConfigTypesafe,
    logback,
    logStashLogback,
    zioLoggingSlf4j,
  ) map (_ % "compile")

  val cookbook: Seq[ModuleID] = learn
}
