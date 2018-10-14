// Generated by Cap'n Proto compiler, DO NOT EDIT
// source: foo.capnp

package de.mkammerer.capnp.test;

public final class Capnp {
    public static class Person {
        public static final org.capnproto.StructSize STRUCT_SIZE = new org.capnproto.StructSize((short) 0, (short) 3);

        public static final class Factory extends org.capnproto.StructFactory<Builder, Reader> {
            public Factory() {
            }

            public final Reader constructReader(org.capnproto.SegmentReader segment, int data, int pointers, int dataSize, short pointerCount, int nestingLimit) {
                return new Reader(segment, data, pointers, dataSize, pointerCount, nestingLimit);
            }

            public final Builder constructBuilder(org.capnproto.SegmentBuilder segment, int data, int pointers, int dataSize, short pointerCount) {
                return new Builder(segment, data, pointers, dataSize, pointerCount);
            }

            public final org.capnproto.StructSize structSize() {
                return Person.STRUCT_SIZE;
            }

            public final Reader asReader(Builder builder) {
                return builder.asReader();
            }
        }

        public static final Factory factory = new Factory();
        public static final org.capnproto.StructList.Factory<Builder, Reader> listFactory =
                new org.capnproto.StructList.Factory<Builder, Reader>(factory);

        public static final class Builder extends org.capnproto.StructBuilder {
            Builder(org.capnproto.SegmentBuilder segment, int data, int pointers, int dataSize, short pointerCount) {
                super(segment, data, pointers, dataSize, pointerCount);
            }

            public final Reader asReader() {
                return new Reader(segment, data, pointers, dataSize, pointerCount, 0x7fffffff);
            }

            public final boolean hasFirstName() {
                return !_pointerFieldIsNull(0);
            }

            public final org.capnproto.Text.Builder getFirstName() {
                return _getPointerField(org.capnproto.Text.factory, 0, null, 0, 0);
            }

            public final void setFirstName(org.capnproto.Text.Reader value) {
                _setPointerField(org.capnproto.Text.factory, 0, value);
            }

            public final void setFirstName(String value) {
                _setPointerField(org.capnproto.Text.factory, 0, new org.capnproto.Text.Reader(value));
            }

            public final org.capnproto.Text.Builder initFirstName(int size) {
                return _initPointerField(org.capnproto.Text.factory, 0, size);
            }

            public final boolean hasLastName() {
                return !_pointerFieldIsNull(1);
            }

            public final org.capnproto.Text.Builder getLastName() {
                return _getPointerField(org.capnproto.Text.factory, 1, null, 0, 0);
            }

            public final void setLastName(org.capnproto.Text.Reader value) {
                _setPointerField(org.capnproto.Text.factory, 1, value);
            }

            public final void setLastName(String value) {
                _setPointerField(org.capnproto.Text.factory, 1, new org.capnproto.Text.Reader(value));
            }

            public final org.capnproto.Text.Builder initLastName(int size) {
                return _initPointerField(org.capnproto.Text.factory, 1, size);
            }

            public final de.mkammerer.capnp.test.Capnp.Address.Builder getAddress() {
                return _getPointerField(de.mkammerer.capnp.test.Capnp.Address.factory, 2, null, 0);
            }

            public final void setAddress(de.mkammerer.capnp.test.Capnp.Address.Reader value) {
                _setPointerField(de.mkammerer.capnp.test.Capnp.Address.factory, 2, value);
            }

            public final de.mkammerer.capnp.test.Capnp.Address.Builder initAddress() {
                return _initPointerField(de.mkammerer.capnp.test.Capnp.Address.factory, 2, 0);
            }
        }

        public static final class Reader extends org.capnproto.StructReader {
            Reader(org.capnproto.SegmentReader segment, int data, int pointers, int dataSize, short pointerCount, int nestingLimit) {
                super(segment, data, pointers, dataSize, pointerCount, nestingLimit);
            }

            public boolean hasFirstName() {
                return !_pointerFieldIsNull(0);
            }

            public org.capnproto.Text.Reader getFirstName() {
                return _getPointerField(org.capnproto.Text.factory, 0, null, 0, 0);
            }

            public boolean hasLastName() {
                return !_pointerFieldIsNull(1);
            }

            public org.capnproto.Text.Reader getLastName() {
                return _getPointerField(org.capnproto.Text.factory, 1, null, 0, 0);
            }

            public boolean hasAddress() {
                return !_pointerFieldIsNull(2);
            }

            public de.mkammerer.capnp.test.Capnp.Address.Reader getAddress() {
                return _getPointerField(de.mkammerer.capnp.test.Capnp.Address.factory, 2, null, 0);
            }

        }

    }


    public static class Address {
        public static final org.capnproto.StructSize STRUCT_SIZE = new org.capnproto.StructSize((short) 1, (short) 3);

        public static final class Factory extends org.capnproto.StructFactory<Builder, Reader> {
            public Factory() {
            }

            public final Reader constructReader(org.capnproto.SegmentReader segment, int data, int pointers, int dataSize, short pointerCount, int nestingLimit) {
                return new Reader(segment, data, pointers, dataSize, pointerCount, nestingLimit);
            }

            public final Builder constructBuilder(org.capnproto.SegmentBuilder segment, int data, int pointers, int dataSize, short pointerCount) {
                return new Builder(segment, data, pointers, dataSize, pointerCount);
            }

            public final org.capnproto.StructSize structSize() {
                return Address.STRUCT_SIZE;
            }

            public final Reader asReader(Builder builder) {
                return builder.asReader();
            }
        }

        public static final Factory factory = new Factory();
        public static final org.capnproto.StructList.Factory<Builder, Reader> listFactory =
                new org.capnproto.StructList.Factory<Builder, Reader>(factory);

        public static final class Builder extends org.capnproto.StructBuilder {
            Builder(org.capnproto.SegmentBuilder segment, int data, int pointers, int dataSize, short pointerCount) {
                super(segment, data, pointers, dataSize, pointerCount);
            }

            public final Reader asReader() {
                return new Reader(segment, data, pointers, dataSize, pointerCount, 0x7fffffff);
            }

            public final boolean hasStreet() {
                return !_pointerFieldIsNull(0);
            }

            public final org.capnproto.Text.Builder getStreet() {
                return _getPointerField(org.capnproto.Text.factory, 0, null, 0, 0);
            }

            public final void setStreet(org.capnproto.Text.Reader value) {
                _setPointerField(org.capnproto.Text.factory, 0, value);
            }

            public final void setStreet(String value) {
                _setPointerField(org.capnproto.Text.factory, 0, new org.capnproto.Text.Reader(value));
            }

            public final org.capnproto.Text.Builder initStreet(int size) {
                return _initPointerField(org.capnproto.Text.factory, 0, size);
            }

            public final boolean hasZip() {
                return !_pointerFieldIsNull(1);
            }

            public final org.capnproto.Text.Builder getZip() {
                return _getPointerField(org.capnproto.Text.factory, 1, null, 0, 0);
            }

            public final void setZip(org.capnproto.Text.Reader value) {
                _setPointerField(org.capnproto.Text.factory, 1, value);
            }

            public final void setZip(String value) {
                _setPointerField(org.capnproto.Text.factory, 1, new org.capnproto.Text.Reader(value));
            }

            public final org.capnproto.Text.Builder initZip(int size) {
                return _initPointerField(org.capnproto.Text.factory, 1, size);
            }

            public final boolean hasCity() {
                return !_pointerFieldIsNull(2);
            }

            public final org.capnproto.Text.Builder getCity() {
                return _getPointerField(org.capnproto.Text.factory, 2, null, 0, 0);
            }

            public final void setCity(org.capnproto.Text.Reader value) {
                _setPointerField(org.capnproto.Text.factory, 2, value);
            }

            public final void setCity(String value) {
                _setPointerField(org.capnproto.Text.factory, 2, new org.capnproto.Text.Reader(value));
            }

            public final org.capnproto.Text.Builder initCity(int size) {
                return _initPointerField(org.capnproto.Text.factory, 2, size);
            }

            public final long getPhone() {
                return _getLongField(0);
            }

            public final void setPhone(long value) {
                _setLongField(0, value);
            }

        }

        public static final class Reader extends org.capnproto.StructReader {
            Reader(org.capnproto.SegmentReader segment, int data, int pointers, int dataSize, short pointerCount, int nestingLimit) {
                super(segment, data, pointers, dataSize, pointerCount, nestingLimit);
            }

            public boolean hasStreet() {
                return !_pointerFieldIsNull(0);
            }

            public org.capnproto.Text.Reader getStreet() {
                return _getPointerField(org.capnproto.Text.factory, 0, null, 0, 0);
            }

            public boolean hasZip() {
                return !_pointerFieldIsNull(1);
            }

            public org.capnproto.Text.Reader getZip() {
                return _getPointerField(org.capnproto.Text.factory, 1, null, 0, 0);
            }

            public boolean hasCity() {
                return !_pointerFieldIsNull(2);
            }

            public org.capnproto.Text.Reader getCity() {
                return _getPointerField(org.capnproto.Text.factory, 2, null, 0, 0);
            }

            public final long getPhone() {
                return _getLongField(0);
            }

        }

    }


    public static final class Schemas {
        public static final org.capnproto.SegmentReader b_8dcd5215abc9cd54 =
                org.capnproto.GeneratedClassSupport.decodeRawBytes(
                        "\u0000\u0000\u0000\u0000\u0005\u0000\u0006\u0000" +
                                "\u0054\u00cd\u00c9\u00ab\u0015\u0052\u00cd\u008d" +
                                "\n\u0000\u0000\u0000\u0001\u0000\u0000\u0000" +
                                "\u003c\u0012\u007f\u00f7\u006d\u0058\u0016\u009d" +
                                "\u0003\u0000\u0007\u0000\u0000\u0000\u0000\u0000" +
                                "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
                                "\u0015\u0000\u0000\u0000\u008a\u0000\u0000\u0000" +
                                "\u001d\u0000\u0000\u0000\u0007\u0000\u0000\u0000" +
                                "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
                                "\u0019\u0000\u0000\u0000\u00af\u0000\u0000\u0000" +
                                "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
                                "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
                                "\u0066\u006f\u006f\u002e\u0063\u0061\u0070\u006e" +
                                "\u0070\u003a\u0050\u0065\u0072\u0073\u006f\u006e" +
                                "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
                                "\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000" +
                                "\u000c\u0000\u0000\u0000\u0003\u0000\u0004\u0000" +
                                "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
                                "\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0000" +
                                "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
                                "\u0045\u0000\u0000\u0000\u0052\u0000\u0000\u0000" +
                                "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
                                "\u0044\u0000\u0000\u0000\u0003\u0000\u0001\u0000" +
                                "\u0050\u0000\u0000\u0000\u0002\u0000\u0001\u0000" +
                                "\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0000" +
                                "\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0000" +
                                "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
                                "\u004d\u0000\u0000\u0000\u004a\u0000\u0000\u0000" +
                                "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
                                "\u004c\u0000\u0000\u0000\u0003\u0000\u0001\u0000" +
                                "\u0058\u0000\u0000\u0000\u0002\u0000\u0001\u0000" +
                                "\u0002\u0000\u0000\u0000\u0002\u0000\u0000\u0000" +
                                "\u0000\u0000\u0001\u0000\u0002\u0000\u0000\u0000" +
                                "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
                                "\u0055\u0000\u0000\u0000\u0042\u0000\u0000\u0000" +
                                "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
                                "\u0050\u0000\u0000\u0000\u0003\u0000\u0001\u0000" +
                                "\\\u0000\u0000\u0000\u0002\u0000\u0001\u0000" +
                                "\u0066\u0069\u0072\u0073\u0074\u004e\u0061\u006d" +
                                "\u0065\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
                                "\u000c\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
                                "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
                                "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
                                "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
                                "\u000c\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
                                "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
                                "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
                                "\u006c\u0061\u0073\u0074\u004e\u0061\u006d\u0065" +
                                "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
                                "\u000c\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
                                "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
                                "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
                                "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
                                "\u000c\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
                                "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
                                "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
                                "\u0061\u0064\u0064\u0072\u0065\u0073\u0073\u0000" +
                                "\u0010\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
                                "\u00c1\u00c5\u002f\u007e\u00e2\u00ea\u00c3\u0081" +
                                "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
                                "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
                                "\u0010\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
                                "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
                                "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" + "");
        public static final org.capnproto.SegmentReader b_81c3eae27e2fc5c1 =
                org.capnproto.GeneratedClassSupport.decodeRawBytes(
                        "\u0000\u0000\u0000\u0000\u0005\u0000\u0006\u0000" +
                                "\u00c1\u00c5\u002f\u007e\u00e2\u00ea\u00c3\u0081" +
                                "\n\u0000\u0000\u0000\u0001\u0000\u0001\u0000" +
                                "\u003c\u0012\u007f\u00f7\u006d\u0058\u0016\u009d" +
                                "\u0003\u0000\u0007\u0000\u0000\u0000\u0000\u0000" +
                                "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
                                "\u0015\u0000\u0000\u0000\u0092\u0000\u0000\u0000" +
                                "\u001d\u0000\u0000\u0000\u0007\u0000\u0000\u0000" +
                                "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
                                "\u0019\u0000\u0000\u0000\u00e7\u0000\u0000\u0000" +
                                "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
                                "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
                                "\u0066\u006f\u006f\u002e\u0063\u0061\u0070\u006e" +
                                "\u0070\u003a\u0041\u0064\u0064\u0072\u0065\u0073" +
                                "\u0073\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
                                "\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000" +
                                "\u0010\u0000\u0000\u0000\u0003\u0000\u0004\u0000" +
                                "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
                                "\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0000" +
                                "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
                                "\u0061\u0000\u0000\u0000\u003a\u0000\u0000\u0000" +
                                "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
                                "\\\u0000\u0000\u0000\u0003\u0000\u0001\u0000" +
                                "\u0068\u0000\u0000\u0000\u0002\u0000\u0001\u0000" +
                                "\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0000" +
                                "\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0000" +
                                "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
                                "\u0065\u0000\u0000\u0000\"\u0000\u0000\u0000" +
                                "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
                                "\u0060\u0000\u0000\u0000\u0003\u0000\u0001\u0000" +
                                "\u006c\u0000\u0000\u0000\u0002\u0000\u0001\u0000" +
                                "\u0002\u0000\u0000\u0000\u0002\u0000\u0000\u0000" +
                                "\u0000\u0000\u0001\u0000\u0002\u0000\u0000\u0000" +
                                "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
                                "\u0069\u0000\u0000\u0000\u002a\u0000\u0000\u0000" +
                                "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
                                "\u0064\u0000\u0000\u0000\u0003\u0000\u0001\u0000" +
                                "\u0070\u0000\u0000\u0000\u0002\u0000\u0001\u0000" +
                                "\u0003\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
                                "\u0000\u0000\u0001\u0000\u0003\u0000\u0000\u0000" +
                                "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
                                "\u006d\u0000\u0000\u0000\u0032\u0000\u0000\u0000" +
                                "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
                                "\u0068\u0000\u0000\u0000\u0003\u0000\u0001\u0000" +
                                "\u0074\u0000\u0000\u0000\u0002\u0000\u0001\u0000" +
                                "\u0073\u0074\u0072\u0065\u0065\u0074\u0000\u0000" +
                                "\u000c\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
                                "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
                                "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
                                "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
                                "\u000c\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
                                "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
                                "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
                                "\u007a\u0069\u0070\u0000\u0000\u0000\u0000\u0000" +
                                "\u000c\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
                                "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
                                "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
                                "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
                                "\u000c\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
                                "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
                                "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
                                "\u0063\u0069\u0074\u0079\u0000\u0000\u0000\u0000" +
                                "\u000c\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
                                "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
                                "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
                                "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
                                "\u000c\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
                                "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
                                "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
                                "\u0070\u0068\u006f\u006e\u0065\u0000\u0000\u0000" +
                                "\u0005\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
                                "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
                                "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
                                "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
                                "\u0005\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
                                "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" +
                                "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000" + "");
    }
}

