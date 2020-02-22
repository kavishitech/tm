name := """DMS"""
organization := "TM"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.13.1"

libraryDependencies += guice
libraryDependencies += "mysql" % "mysql-connector-java" % "5.1.44"
