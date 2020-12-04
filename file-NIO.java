What is NIO?⭐️
    Non-Blocking I/O: Java provides a different way to work with I/O than the standard I/O Apis.
            -> NIO supports buffer-oriented and channel based approach for I/O operations.
            -> NIO introduced in java 1.4 and with JDK 7, NIO system is expanded.
            -> NIO is widely used in the File handling.

What are fundamental components of NIO?
    Java NIO has these fundamental components:
        1. Channels
        2. Buffers
        3. Selectors
        4. Non-blocking I/O

    Channel and Buffers: Data is written from a buffer to a channel and read from a channel to a buffer.

    Selectors: Selectors are used to monitor the multiple channels for the events like
               when data is arrived, connection is opened.

    Non-Blocking I/O: In NIO, Threads are allowed to go on and do something else in mean time of
                      performing any task.

In which Package the NIO classes are present?
    java.nio.*
      -> also there are sub-packages inside this Package.
            java.nio.charset
            java.nio.channels
            java.nio.file
            ..and many more

What is Channel? How many channels are there in java?⭐️
    In NIO, channel is the medium to transport data efficiently.
    Channel in an Interface which provides access to low-level I/O services in a controlled way.
    Methods:
    1. isOpen() : this Tells whether or not this channel is open.
    2. close() : closes the channel.

    Channels:
      DatagramChannel
      SocketChannel
      FileChannel
      ServerSocketChannel

Which channel is used for reading data from files?
    FileChannel. It is used for reading data from files.
    -> We cannot create its object directly as it is an abstract class.
        for object creation - getChannel() method is used.

What other channels are used for?
    DatagramChannel is used to read and write data over the network via User Datagram protocol (UDP).
    SocketChannel can read write data over network via Transmission Control protocol (TCP).
    ServerSocketChannel allows user to listen the incoming TCP connections, same as a web server.

    Note that, for every incoming connection a socket channel is created.

What are NIO Buffers?⭐️
    NIO buffers are used to make interaction with NIO channels.
    Block of memory into which we can write data, from which we can read data.
    👉🏻 In NIO system this memory block is wrapped with an NIO buffer object.

How many Buffers we have in java?
    There is a buffer type for every primitive type.
      1. CharBuffer
      2. DoubleBuffer
      3. IntBuffer
      4. LongBuffer
      5. ShortBuffer
      6. FloatBuffer

    There is ByteBuffer which is Mostly used buffer type.
      7. ByteBuffer

How to create ByteBuffer?
    To create ByteBuffer, we have to allocate a buffer. For that we invoke allocate() method,

    ByteBuffer b = ByteBuffer.allocate(capacity);

    to write data, we use put() method.

How to transfer data between channels and buffers?

    public class Demo {
    	public static void main(String[] args) throws IOException {
    		FileInputStream input = new FileInputStream("File1.txt");
    		ReadableByteChannel src = input.getChannel();

    		FileOutputStream output = new FileOutputStream("File2.txt");
    		WritableByteChannel dest = output.getChannel();

    		copy(src,dest);
    		input.close();
    		output.close();
    	}

    	private static void copy(ReadableByteChannel src, WritableByteChannel dest) throws IOException {
    		ByteBuffer b = ByteBuffer.allocate(1024*20);
    		while (src.read(b) != -1)
            {
                // The buffer is used to drained
                b.flip();
                // keep sure that buffer was fully drained
                while (b.hasRemaining())
                {
                    dest.write(b);
                }
                b.clear(); // Now the buffer is empty, ready for the filling
            }
    	}
    }
    This will write file1 data to file2.

Can we transfer data between channels?⭐️
    Yes. In Java NIO we can directly transfer the data from one channel to another.

    Methods present in FileChannel:
      1. FileChannel.transferTo() method
      2. FileChannel.transferFrom() method

    The transferTo(position, count, target) method allows the data transfer from a FileChannel
    into some other channel.

    The transferFrom(src, position, count) method allows the data transfer from a source channel
    into the FileChannel.

What do you understand by Scattering reads and Gathering writes?⭐️
    'Scattering read' is reading the data from a single channel into multiple buffers.
    'Gathering write' is writing the data from a multiple buffers into a single channel.

    We have ScatteringByteChannel, and GatheringByteChannel channels for this.

What Selectors are for?
    Selectors are used for handling multiple channels using a single thread.

    Selectors are created as,
    Selector selector = Selector.open();

    -> invoke the register() method on various channels objects to register our interest in various
    I/O events.

What is difference between IO and NIO?⭐️
    -> The important distinction between IO and NIO is that,
    Original IO deals with data in streams, whereas NIO deals with data in blocks.
    IO is stream oriented and NIO is buffer oriented.

    -> IO streams are blocking whereas NIO can be blocking or non-blocking.

What do threads do in the mean time?
    Threads spend their time performing IO on other channels.
    -> In NIO a single thread can manage multiple channels of input and output.

    NIO have Selectors for selecting or registering in different channels.

-> you may also get asked some queries like,

If you have three sockets, then how many threads you will need to handle that?
    So answer to this is, using NIO we can operate on multiple channels using the same thread.

What is the byte order of ByteBuffer?
    Byte order is the order in which a multi-byte quantity is stored into the memory.
    There are two types of Byte order,
    1. Big-Endian
    2. Little-Endian

    👉🏻 Byte Buffer has big-endian as its default byte order..

What is the difference between Direct and Non-Direct buffer in java?⭐️
    A byteBuffer is either direct or non-direct.
    If it is Direct byte buffer, then JVM will perform native I/O operations directly upon it.

    Direct byte buffer can be created:
    -> by invoking the allocateDirect() factory method of this class.
    -> by mapping a region of a file directly into memory.

    👉🏻 Non direct buffer is just a wrapper around byte array and it resides in Java heap memory,
      whereas Direct buffer resides outside of JVM and memory is not allocated from heap!

What is the memory mapped buffer in Java?
    MappedByteBuffer is a subclass of ByteBuffer, which is actually a Direct Byte Buffer whose content
    is a memory mapped region of a file.

    It is created by FileChannel.map() method.

What is the difference between ByteBuffer and CharBuffer in Java?
    A ByteBuffer is a buffer that holds (8-bit) byte values and CharBuffer holds (16 bit) char values..
