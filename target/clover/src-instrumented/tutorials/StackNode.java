/* $$ This file has been instrumented by Clover 4.3.1#20180921211537623 $$ */package tutorials;

public class StackNode<T> implements Stack<T> {public static class __CLR4_3_1aeaejxvtz8r7{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_3_1();if(20180921211537623L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.3.1#20180921211537623,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0070\u0068\u006f\u0075\u0064\u0061\u0069\u006c\u002f\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1562677739387L,8589935092L,395,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_3_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private Node<T> last;
    private int size;

    public StackNode() {try{__CLR4_3_1aeaejxvtz8r7.R.inc(374); __CLR4_3_1aeaejxvtz8r7.R.inc(375);this.last = null; __CLR4_3_1aeaejxvtz8r7.R.inc(376);this.size = 0; }finally{__CLR4_3_1aeaejxvtz8r7.R.flushNeeded();}}

    public void push(T item) {try{__CLR4_3_1aeaejxvtz8r7.R.inc(377);
        __CLR4_3_1aeaejxvtz8r7.R.inc(378);Node<T> toAdd = new Node<T>(item, last);
        __CLR4_3_1aeaejxvtz8r7.R.inc(379);last = toAdd;
        __CLR4_3_1aeaejxvtz8r7.R.inc(380);size++;
    }finally{__CLR4_3_1aeaejxvtz8r7.R.flushNeeded();}}

    public void pop() {try{__CLR4_3_1aeaejxvtz8r7.R.inc(381);
        __CLR4_3_1aeaejxvtz8r7.R.inc(382);if((((last != null)&&(__CLR4_3_1aeaejxvtz8r7.R.iget(383)!=0|true))||(__CLR4_3_1aeaejxvtz8r7.R.iget(384)==0&false))) {{ __CLR4_3_1aeaejxvtz8r7.R.inc(385);last = last.next; __CLR4_3_1aeaejxvtz8r7.R.inc(386);size--; }
    }}finally{__CLR4_3_1aeaejxvtz8r7.R.flushNeeded();}}

    public T peek() {try{__CLR4_3_1aeaejxvtz8r7.R.inc(387);
        __CLR4_3_1aeaejxvtz8r7.R.inc(388);if((((last != null)&&(__CLR4_3_1aeaejxvtz8r7.R.iget(389)!=0|true))||(__CLR4_3_1aeaejxvtz8r7.R.iget(390)==0&false))) {{ __CLR4_3_1aeaejxvtz8r7.R.inc(391);return last.value; }
        }__CLR4_3_1aeaejxvtz8r7.R.inc(392);return null;
    }finally{__CLR4_3_1aeaejxvtz8r7.R.flushNeeded();}}

    public int size() {try{__CLR4_3_1aeaejxvtz8r7.R.inc(393);
        __CLR4_3_1aeaejxvtz8r7.R.inc(394);return size;
    }finally{__CLR4_3_1aeaejxvtz8r7.R.flushNeeded();}}

}

class Node<T> {public static class __CLR4_3_1aeazjxvtz8r7{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{if(20180921211537623L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.3.1#20180921211537623,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0070\u0068\u006f\u0075\u0064\u0061\u0069\u006c\u002f\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1562677739387L,8589935092L,401,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_3_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    T value;
    Node<T> next;

    public Node(T value) {try{__CLR4_3_1aeazjxvtz8r7.R.inc(395);
        __CLR4_3_1aeazjxvtz8r7.R.inc(396);this.value = value;
        __CLR4_3_1aeazjxvtz8r7.R.inc(397);this.next = null;
    }finally{__CLR4_3_1aeazjxvtz8r7.R.flushNeeded();}}

    public Node(T value, Node<T> next) {try{__CLR4_3_1aeazjxvtz8r7.R.inc(398);
        __CLR4_3_1aeazjxvtz8r7.R.inc(399);this.value = value;
        __CLR4_3_1aeazjxvtz8r7.R.inc(400);this.next = next;
    }finally{__CLR4_3_1aeazjxvtz8r7.R.flushNeeded();}}
}