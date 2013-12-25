/* An exception object is created when an error occurs
		 * It tells you what error occurred
		 * Here are many of the java exceptions
		 *
		 * java.lang.RuntimeException : exceptions that can be thrown during the normal
		 * operation of the Java Virtual Machine. These exceptions are your responsibility
		 * as a programmer
		 *
		 * ArithmeticException, ArrayStoreException, BufferOverflowException,
		 * BufferUnderflowException, CannotRedoException, CannotUndoException,
		 * ClassCastException, CMMException, ConcurrentModificationException,
		 * DOMException, EmptyStackException, IllegalArgumentException,
		 * IllegalMonitorStateException, IllegalPathStateException,
		 * IllegalStateException, ImagingOpException, IndexOutOfBoundsException,
		 * MissingResourceException, NegativeArraySizeException, NoSuchElementException,
		 * NullPointerException, ProfileDataException, ProviderException,
		 * RasterFormatException, SecurityException, SystemException,
		 * UndeclaredThrowableException, UnmodifiableSetException,
		 * UnsupportedOperationException
		 *
		 * java.lang.Exception : exceptions that are checked for by the java compiler
		 *
		 * AclNotFoundException, ActivationException, AlreadyBoundException,
		 * ApplicationException, AWTException, BackingStoreException,
		 * BadAttributeValueExpException, BadBinaryOpValueExpException,
		 * BadLocationException, BadStringOperationException,
		 * BrokenBarrierException, CertificateException, ClassNotFoundException,
		 * CloneNotSupportedException, DataFormatException,
		 * DatatypeConfigurationException, DestroyFailedException,
		 * ExecutionException, ExpandVetoException, FontFormatException,
		 * GeneralSecurityException, GSSException, IllegalAccessException,
		 * IllegalClassFormatException, InstantiationException,
		 * InterruptedException, IntrospectionException,
		 * InvalidApplicationException, InvalidMidiDataException,
		 * InvalidPreferencesFormatException, InvalidTargetObjectTypeException,
		 * InvocationTargetException, IOException, JAXBException, JMException,
		 * KeySelectorException, LastOwnerException, LineUnavailableException,
		 * MarshalException, MidiUnavailableException, MimeTypeParseException,
		 * MimeTypeParseException, NamingException, NoninvertibleTransformException,
		 * NoSuchFieldException, NoSuchMethodException, NotBoundException,
		 * NotOwnerException, ParseException, ParserConfigurationException,
		 * PrinterException, PrintException, PrivilegedActionException,
		 * PropertyVetoException, RefreshFailedException, RemarshalException,
		 * RuntimeException, SAXException, ScriptException, ServerNotActiveException,
		 * SOAPException, SQLException, TimeoutException, TooManyListenersException,
		 * TransformerException, TransformException, UnmodifiableClassException,
		 * UnsupportedAudioFileException, UnsupportedCallbackException,
		 * UnsupportedFlavorException, UnsupportedLookAndFeelException,
		 * URIReferenceException, URISyntaxException, UserException, XAException,
		 * XMLParseException, XMLSignatureException, XMLStreamException, XPathException
		 */

/* Common Exceptions
 * ArithmeticException: An arithmetic operation occurs with no answer
 * (Division by Zero)
 *
 * ClassNotFoundException: A class is called for that doesn't exist
 *
 * IllegalArgumentException: A method has been passed an illegal argument
 *
 * IndexOutOfBoundsException: Thrown when an index for an array, string is
 * called for, but doesn't exist
 *
 * InputMismatchException: (Part of NoSuchElementException) User enters the
 * wrong data type into a Scanner method
 *
 * IOException: An I/O operation failed
 */
import java.util.*;
import java.io.*;
public class Exceptions {

    static Scanner userInput = new Scanner(System.in);
    public static void main(String[] args){
        divideByZero(2);
        System.out.print("How old are you? ");
        int age = checkValidAge();

        if (age!=0){
            System.out.print("you are "+age);
        }
        try{
        getAFile("sdfg");
        }
        catch (IOException e){

        }
    }

    public static void getAFile(String filename) throws IOException{
        try {
            FileInputStream file = new FileInputStream(filename);
        }
        catch (FileNotFoundException e){
            System.out.println("cant find file");
        }


        catch(IOException e){
            System.out.println("IO Error");
        }

        //catch (ClassNotFoundException e){}

        catch(Exception e){
            System.out.println("Some Error");
        }

        finally {   //always called
            System.out.println("");
        }


    }

    public static int checkValidAge(){
        try{
            return userInput.nextInt();
        }
        catch (InputMismatchException e){
            userInput.next();
            System.out.println("not a num");
            return 0;
        }
    }

    public static void divideByZero(int a){
        try{
            System.out.println(a/0);
        }
        catch(ArithmeticException e){
            System.out.println("you can't " +e.getMessage() + " " + e.toString()+ " " );

        }
    }

}
