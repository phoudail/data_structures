/* $$ This file has been instrumented by Clover 4.3.1#20180921211537623 $$ */package tutorials;


public class QueueNode<T> implements Queue<T> {public static class __CLR4_3_18q8qjxvvfl2i{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_3_1();if(20180921211537623L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.3.1#20180921211537623,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0070\u0068\u006f\u0075\u0064\u0061\u0069\u006c\u002f\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1562680181490L,8589935092L,346,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_3_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private int size;
    private Node<T> last;
    private Node<T> first;

    public QueueNode() {try{__CLR4_3_18q8qjxvvfl2i.R.inc(314);
        __CLR4_3_18q8qjxvvfl2i.R.inc(315);size = 0;
        __CLR4_3_18q8qjxvvfl2i.R.inc(316);last = null;
        __CLR4_3_18q8qjxvvfl2i.R.inc(317);first = null;
    }finally{__CLR4_3_18q8qjxvvfl2i.R.flushNeeded();}}

    public void add(T item) {try{__CLR4_3_18q8qjxvvfl2i.R.inc(318);
        __CLR4_3_18q8qjxvvfl2i.R.inc(319);Node<T> toAdd = new Node<T>(item);
        __CLR4_3_18q8qjxvvfl2i.R.inc(320);if((((last != null)&&(__CLR4_3_18q8qjxvvfl2i.R.iget(321)!=0|true))||(__CLR4_3_18q8qjxvvfl2i.R.iget(322)==0&false))) {{
            __CLR4_3_18q8qjxvvfl2i.R.inc(323);last.next = toAdd;
            __CLR4_3_18q8qjxvvfl2i.R.inc(324);last = toAdd;
        } }else {{
            __CLR4_3_18q8qjxvvfl2i.R.inc(325);first = toAdd;
            __CLR4_3_18q8qjxvvfl2i.R.inc(326);last = toAdd;
        }
        }__CLR4_3_18q8qjxvvfl2i.R.inc(327);size++;
    }finally{__CLR4_3_18q8qjxvvfl2i.R.flushNeeded();}}

    public void remove() {try{__CLR4_3_18q8qjxvvfl2i.R.inc(328);
        __CLR4_3_18q8qjxvvfl2i.R.inc(329);if((((first != null)&&(__CLR4_3_18q8qjxvvfl2i.R.iget(330)!=0|true))||(__CLR4_3_18q8qjxvvfl2i.R.iget(331)==0&false))) {{ 
            __CLR4_3_18q8qjxvvfl2i.R.inc(332);if((((first == last)&&(__CLR4_3_18q8qjxvvfl2i.R.iget(333)!=0|true))||(__CLR4_3_18q8qjxvvfl2i.R.iget(334)==0&false))) {{
                __CLR4_3_18q8qjxvvfl2i.R.inc(335);last = last.next;
            } 
            }__CLR4_3_18q8qjxvvfl2i.R.inc(336);first = first.next; __CLR4_3_18q8qjxvvfl2i.R.inc(337);size--;
        }
    }}finally{__CLR4_3_18q8qjxvvfl2i.R.flushNeeded();}}

    public T peek() {try{__CLR4_3_18q8qjxvvfl2i.R.inc(338);
        __CLR4_3_18q8qjxvvfl2i.R.inc(339);if((((first != null)&&(__CLR4_3_18q8qjxvvfl2i.R.iget(340)!=0|true))||(__CLR4_3_18q8qjxvvfl2i.R.iget(341)==0&false))) {{ __CLR4_3_18q8qjxvvfl2i.R.inc(342);return first.value; }
        }__CLR4_3_18q8qjxvvfl2i.R.inc(343);return null;
    }finally{__CLR4_3_18q8qjxvvfl2i.R.flushNeeded();}}

    public int size() {try{__CLR4_3_18q8qjxvvfl2i.R.inc(344);
        __CLR4_3_18q8qjxvvfl2i.R.inc(345);return size;
    }finally{__CLR4_3_18q8qjxvvfl2i.R.flushNeeded();}}

}

