## What is this?

A small example project to work with [Cap'n'proto](https://capnproto.org/index.html) and Java.

## Usage

1. Install cap'n'proto 
    1. On Fedora you can `dnf install capnproto capnproto-devel`
1. Install [cap'n'proto for Java](https://dwrensha.github.io/capnproto-java/index.html)
    1. Put the `capnpc-java` binary somewhere on your `$PATH`
1. The schema is stored in `src/main/capnp/foo.capnp`
1. Execute the `build.sh` to compile the schema to Java files
    1. The generated java file is stored in `src/main/java/de/mkammerer/capnp/test/Capnp.java`
1. See `Main` class for reading / writing

## License

[CC0](https://creativecommons.org/publicdomain/zero/1.0/)