#!/usr/bin/env bash

GRAALVM_HOME=/Library/Java/JavaVirtualMachines/graalvm-ce-19.1.1/Contents/Home
JAVA_HOME=$GRAALVM_HOME

rm -rf classes/
mkdir -p classes
clj -e "(compile 'com.tomekw.cotd.core)"

$GRAALVM_HOME/bin/native-image \
	-cp $(clj -Spath) \
	-H:+ReportExceptionStackTraces \
	-H:+PrintClassInitialization \
	-H:Name=cotd \
	--initialize-at-build-time \
	--initialize-at-run-time=java.lang.Math\$RandomNumberGeneratorHolder \
	--report-unsupported-elements-at-runtime \
	--no-server \
	--no-fallback \
	--verbose \
	com.tomekw.cotd.core
