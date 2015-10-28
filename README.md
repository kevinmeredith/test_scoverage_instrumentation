### Purpose

Will the 'instrumentation', i.e. enriched byte code added by 'scoverage' to analyze code coverage,
become part of the deployed app, i.e. JAR, by running `sbt clean coverage test coverageOff publish`.

### Necessary Changes

Make sure to change the `publishTo` location in the `build.sbt`.