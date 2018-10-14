@0x9d16586df77f123c;

using Java = import "schema/java.capnp";
$Java.package("de.mkammerer.capnp.test");
$Java.outerClassname("Capnp");

struct Person {
    firstName @0: Text;
    lastName @1: Text;
    address @2: Address;
}

struct Address {
    street @0: Text;
    zip @1: Text;
    city @2: Text;
    phone @3: Int64;
}