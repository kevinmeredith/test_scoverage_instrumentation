### Purpose

Will the 'instrumentation', i.e. enriched byte code added by 'scoverage' to analyze code coverage,
become part of the deployed app, i.e. JAR, by running `sbt clean coverage test coverageOff publish`.

### Test

```
$sbt clean coverage test coverageOff publish // publishes to local folder
$
$cd net/scoverage_project_2.10/0.1-SNAPSHOT
$java -jar scoverage_project_2.10-0.1-SNAPSHOT.jar
Exception in thread "main" java.lang.NoClassDefFoundError: scoverage/Invoker$
	  at net.Foo$.main(Foo.scala:8)
	  at net.Foo.main(Foo.scala)
Caused by: java.lang.ClassNotFoundException: scoverage.Invoker$
       at java.net.URLClassLoader.findClass(URLClassLoader.java:381)
       at java.lang.ClassLoader.loadClass(ClassLoader.java:424)
       at sun.misc.Launcher$AppClassLoader.loadClass(Launcher.java:331)
       at java.lang.ClassLoader.loadClass(ClassLoader.java:357)
       ... 2 more
```

### How to Run this Test on your machine?

Make sure to change the `publishTo` location in the `build.sbt`.

