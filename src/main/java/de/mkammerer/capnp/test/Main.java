package de.mkammerer.capnp.test;

import org.capnproto.MessageBuilder;
import org.capnproto.MessageReader;
import org.capnproto.SerializePacked;

import java.io.IOException;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Main {
    private static final String OUTPUT_FILE = "person.bin";

    public static void main(String[] args) throws IOException {
        write();

        read();
    }

    private static void write() throws IOException {
        MessageBuilder message = new MessageBuilder();

        Capnp.Person.Builder person = message.initRoot(Capnp.Person.factory);
        person.setFirstName("First");
        person.setLastName("Last");
        Capnp.Address.Builder address = person.initAddress();
        address.setCity("City");
        address.setStreet("Street");
        address.setZip("Zip");
        address.setPhone(12345);

        try (WritableByteChannel channel = Files.newByteChannel(Paths.get(OUTPUT_FILE), StandardOpenOption.CREATE, StandardOpenOption.WRITE)) {
            SerializePacked.writeToUnbuffered(channel, message);
        }
    }

    private static void read() throws IOException {
        MessageReader message;
        try (ReadableByteChannel channel = Files.newByteChannel(Paths.get(OUTPUT_FILE), StandardOpenOption.READ)) {
            message = SerializePacked.readFromUnbuffered(channel);
        }

        Capnp.Person.Reader person = message.getRoot(Capnp.Person.factory);
        System.out.println("First name: " + person.getFirstName());
        System.out.println("Last name: " + person.getLastName());
        System.out.println("Street: " + person.getAddress().getStreet());
        System.out.println("Zip: " + person.getAddress().getZip());
        System.out.println("City: " + person.getAddress().getCity());
        System.out.println("Phone: " + person.getAddress().getPhone());
    }
}
