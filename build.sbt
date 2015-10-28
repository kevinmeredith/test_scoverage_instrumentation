organization := "net"

mainClass := Some("net.Foo")

exportJars := true

publishTo := Some(Resolver.file("file",  new File( "/Users/kmmere/Workspace/Work/scoverage_project/published" )) )