.DEFAULT_GOAL := build

build:
	env JAVA_HOME=/Library/Java/JavaVirtualMachines/graalvm-ce-19.1.1/Contents/Home GRAALVM_HOME=/Library/Java/JavaVirtualMachines/graalvm-ce-19.1.1/Contents/Home clj -A:native-image
