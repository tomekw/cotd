# cotd

Clojure of the day: it displays random documentation for function from `clojure.core` namespace.

## Usage

Download the binary from the releases page: https://github.com/tomekw/cotd/releases.

```bash
$ ./cotd
-------------------------
clojure.core/read
([] [stream] [stream eof-error? eof-value] [stream eof-error? eof-value recursive?] [opts stream])
  Reads the next object from stream, which must be an instance of
  java.io.PushbackReader or some derivee.  stream defaults to the
  current value of *in*.

  Opts is a persistent map with valid keys:
    :read-cond - :allow to process reader conditionals, or
                 :preserve to keep all branches
    :features - persistent set of feature keywords for reader conditionals
    :eof - on eof, return value unless :eofthrow, then throw.
           if not specified, will throw

  Note that read can execute code (controlled by *read-eval*),
  and as such should be used only with trusted sources.

  For data structure interop use clojure.edn/read
```

## Building
Tweak `GRAALVM_HOME` and `JAVA_HOME` in `script/build.sh` and run it.
