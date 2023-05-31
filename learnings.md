maven kann man installieren  
aber man kann auch den maven wrapper hernehmen der in .mvn drinnen ist
springboot ermöglicht das, maven hat dann richtige version, die richtige java version muss
für maven dann gesetzt werden, mit zb `export JAVA_HOME=/opt/homebrew/opt/openjdk@17/libexec/openjdk.jdk/Contents/Home/`

im pom.xml steht auch java version drin, sollte übereinstimmen sonst probleme (build und clean, start, stop)
