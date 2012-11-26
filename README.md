# cotd

Clojure of the day: it displays random documentation for function from
`clojure.core` namespace.

## Installation

Download https://github.com/downloads/tomekw/cotd/cotd-0.1.0, make it
executable and place somewhere in your `PATH`.

## Usage

```sh
$ cotd
-------------------------
clojure.core/deref
([ref] [ref timeout-ms timeout-val])
  Also reader macro: @ref/@agent/@var/@atom/@delay/@future/@promise. Within a transaction,
  returns the in-transaction-value of ref, else returns the
  most-recently-committed value of ref. When applied to a var, agent
  or atom, returns its current state. When applied to a delay, forces
  it if not already forced. When applied to a future, will block if
  computation not complete. When applied to a promise, will block
  until a value is delivered.  The variant taking a timeout can be
  used for blocking references (futures and promises), and will return
  timeout-val if the timeout (in milliseconds) is reached before a
  value is available. See also - realized?.
```

## License

Copyright © 2012 Tomasz Wałkuski

Distributed under the Eclipse Public License, the same as Clojure.
