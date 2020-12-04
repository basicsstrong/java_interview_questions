//File IO

L1-00:55 What is IO stream? What are the types of IO streams?
    Java I/O Stream is an abstraction that either produces or consumes data.
    Streams are flows of data, that we can either read from or write to!

    There are two types of I/O Streams:
    -> Character Streams
    -> Byte Streams

L1-01:57 What are the classes available for the different streams in java?
    For Character streams there are two abstract classes present in java IO ..
    1. java.io.Reader
    2. java.io.Writer

    Similarly for Byte Streams:
    1. java.io.InputStream
    2. java.io.OutputStream

L1-02:29 How these streams differ from each other?
    The InputStream classes receive data from various resources like
    a file, a pipe, a string, an array of bytes, and many other resources.

    OutputStream defines stream byte output. The destination may be
    an array of bytes, a file or any channel.

    Character streams have Reader and Writer:
    Which actually responsible for the flow of unicode characters. These takes information from a file
    and sends back to file!

L1-03:13 What happens if any error occurs in case?
    All of the stream classes throw IOException in case of any errors.

L1-03:26 How we can create any file?
    By creating an object of file class, we create a java file object to represent any resource.
      File f = new File("file.txt");
    To create a file in the current working directory:
      f.createNewFile();
    To create a new directory:
      f.mkdir();

L1-06:31 What if we use single slash while specifying file path?
    In windows, compiler takes single slash as escape. So single slash cannot be used to specify path..
    instead of that we can use '//'

    File f = new File("D://Documents//file.txt");

L1-07:14 How to select all text files under any directory?
    File.listFiles() method returns an array of File objects contained in the particular directory.

L2-00:01 What are different writers available for Character streams?
    There are three writers available for char streams:
      1.FileWriter
      2.BufferedWriter
      3.PrintWriter

L2-00:17 What is difference between fileWriter and BufferedWriter?
    With FileWriter we write character data or text data to any file.

      FileWriter fw = new FileWriter("File.txt");
      Fw.write("any string");
      fw.flush();
      fw.close();

    for appending the text that will be written with this object..

      FileWriter fw = new FileWriter("File.txt",true);

    BufferedWriter:
      BufferedWriter uses internal buffer to write data into file, other than this,
      It is similar to FileWriter.
      -> BufferedWriter can not communicate with file directly. We have to use other writer with it.

      BufferedWriter bw = new BufferedWriter(fw);
      bw.write("Writing with BufferedWriter");
      bw.flush();
      bw.close();

      In file writer we have to provide additional line separator (\n) to write in new line.
      But in BufferedWriter we have a method newLine() to provide line separator.

L2-03:55 When we had these two writers, What is the need of PrintWriter then?
    PrintWriter is the most enhanced writer. It overcomes the little limitations that we had with
    filewriter and bufferedWriter.
    For example,
      We were allowed to write char, string types only with those writers.
    -> What if we want to write data of different data types?
        PrintWriter allows us to do so.

    -> PrintWriter can communicate directly to file and also can communicate via any other writer..

          PrintWriter pw = new PrintWriter("File.txt");
          PrintWriter pw = new PrintWriter(new FileWriter("File.txt"));

          PrintWriter pw = new PrintWriter("abc.txt");
          pw.write(100);	//this will write d to file
          Pw.println(100);	//this will write int 100 and will separate line.
          pw.println(true);	//this will write boolean true and separate line..
          pw.flush();
          pw.close();

L2-05:05 Why we use flush() and close()?
    Flush() method is used to clear all the data characters stored in the buffer and clear the buffer.
    It flushes the stream so that we get assured that the data has properly written to file.

    Close() method is used to close the character stream and it releases system resources associated
    with the stream.

    Note that, flush method is applicable for all the Writers and close() is for all readers and writers..

L3-00:01 How to read any file?
    There are two readers to read the file:
      FileReader
      BufferedReader

L3-00:13 Difference between FileReader BufferedReader?
    FileReader reads the data from a file in the forms of characters..

    FileReader fr = new FR("abc.txt");
    char[] ch = new char[(int)f.length()];
    fr.read(ch);	//this will copy data from file into char array

    for(char ch1: ch){
      Sysout ch1;
    }

    With file reader we read data character by character, not line by line.
    For that, we have BufferedReader.

    BufferedReader allows us to read file by char and by line too.

      BufferedReader br = new BufferedReader(new FR("abc.txt"));
      String line = br.readLine();
      while(line!=null){
        System.out.println(line);
        line = br.readLine();
      }
      br.close();

    BufferedReader is most efficient reader for reading the file because it buffers the input from the
    specified file.

    -> Compared to FileReader, BufferedReader reads large chunks of data from file at once and
    keep this data in a buffer.
    When we ask for the next character or line of data, it gets retrieved from that buffer..
    This makes bufferedReader most efficient..

L5-00:06 Explain Hierarchy of Reader-Writer.

When to use ByteStreams?
    Byte oriented streams process data byte by byte, so byte stream is suitable for processing raw data
    like binary files.
    And when we have text files, then the character streams are useful.

When to use what: FileInputStream and FileReader.
    Both InputStream and Reader are used to read data from the source (either file or socket).

    InputStream is used to read binary data, while Reader is used to read text data, that is,
    Unicode characters.

    We should prefer Readers instead of InputStreams in case of text files.
    Buffered reader is suggested to use to read text files and FileInputStream is used to read raw
    streams of bytes from any source, which can be file or socket in java.

When to use what: FileOutputStream and FileWriter
    To write something to a file, we use FileOutputStream, FileWriter etc.
    With FileOutputStream class, we can write byte oriented as well as character oriented data.
    But Note that it is always preferred to use FileWriter/PrintWriter to write character data to file.

What are the FilterOutputStream and FilterInputStream?
    FilterOutputStream is another implementation of OutputStream.
    It further has different implementation classes: BufferedOutputStream
                                                     DataOutputStream
    It is used less individually.!

    Similarly, FilterInputStream have subclasses: BufferedInputStream
                                                  DataInputStream

Which superstructure Class allows reading data from an input byte stream in the format of primitive data
types?
    'DataInputStream' Class is used to read primitive data.
    Methods: readInt(), readByte(), readChar(), readDouble(), readBoolean()

    DataInputStream Class can not communicate directly to files.. we can use this as,

      DataInputStream dInput = new DataInputStream(new FileInputStream("File.txt"));

    and similarly, DataOutputStream is used to write Primitives to file.

How BufferedOutputStream is different from BufferedWriter?
    They are almost similar but BufferedOutputStream is used to write raw bytes whereas
    BufferedWriter writes characters.
    BufferedWriter: Provides buffering for Writer Instances which makes performance fast.
    BufferedOutputStream: Used for buffering output streams. Internally it uses buffer to store data.

    Methods to write data,
    write(int b): for writing specified byte to stream
    write(byte[] b, int off, int len): to write bytes from specified byte array starting with given offset

What is difference between InputStreamReader and BufferedReader?
    -> InputStreamReader creates a new stream object that can be used to read data from the specified source.
    It reads bytes and decodes them into characters.
    BufferedReader is an "abstraction" that reads text from a character-input stream.
    It 'buffers' characters so as to provide efficient reading of characters and lines.

    -> BufferedReader reads a couple of characters from the specified stream and stores it in a buffer.
    This makes input faster.
    InputStreamReader reads only one character from specified stream and remaining characters still remain
    in the stream.

What do you know about add-on classes?
    Add-on classes provides additional properties to the existing threads.
    Examples of classes: BufferedOutputStream , BufferedInputStream ,
    BufferedWriter – buffers the stream and improves performance.

What class-add-on allows you to speed up reading / writing by using a buffer?
    java.io.BufferedInputStream (InputStream in) || BufferedInputStream (InputStream in, int size),

    java.io.BufferedOutputStream (OutputStream out) || BufferedOutputStream (OutputStream out, int size),

    java.io.BufferedReader (Reader r) || BufferedReader (Reader in, int sz),

    java.io.BufferedWriter (Writer out) || BufferedWriter (Writer out, int sz)

What classes allow you to convert byte streams to character and back?
    OutputStreamWriter
    InputStreamReader

Will this code compile?
ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(new File("newFile.txt")));
    Yes

Explain hierarchy of InputStream and OutputStream.
