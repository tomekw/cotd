#!/bin/sh

# TODO: Rewrite this as a Leiningen task

rm -rf bin
mkdir bin
lein uberjar
echo "#!/bin/sh" > bin/cotd
echo 'exec java -jar $0 "$@"' >> bin/cotd
cat target/cotd-*-standalone.jar >> bin/cotd
chmod +x bin/cotd
