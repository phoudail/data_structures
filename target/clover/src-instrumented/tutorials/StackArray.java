/* $$ This file has been instrumented by Clover 4.3.1#20180921211537623 $$ */package tutorials;

import java.util.Arrays;

public class StackArray<T> implements Stack<T> {public static class __CLR4_3_16z6zjxkaws5n{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_3_1();if(20180921211537623L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.3.1#20180921211537623,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0070\u0068\u006f\u0075\u0064\u0061\u0069\u006c\u002f\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1561980583896L,8589935092L,275,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_3_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private Box<T>[] array;
    private int top;

    public StackArray() {try{__CLR4_3_16z6zjxkaws5n.R.inc(251);
        __CLR4_3_16z6zjxkaws5n.R.inc(252);array = new Box[10];
        __CLR4_3_16z6zjxkaws5n.R.inc(253);top = -1;
    }finally{__CLR4_3_16z6zjxkaws5n.R.flushNeeded();}}

    public void push(T item) {try{__CLR4_3_16z6zjxkaws5n.R.inc(254);
        __CLR4_3_16z6zjxkaws5n.R.inc(255);top++;
        __CLR4_3_16z6zjxkaws5n.R.inc(256);if((((top >= array.length)&&(__CLR4_3_16z6zjxkaws5n.R.iget(257)!=0|true))||(__CLR4_3_16z6zjxkaws5n.R.iget(258)==0&false))) {{
            __CLR4_3_16z6zjxkaws5n.R.inc(259);array = Arrays.copyOf(array, array.length * 2);
        }
        }__CLR4_3_16z6zjxkaws5n.R.inc(260);array[top] = new Box<T>(item);
    }finally{__CLR4_3_16z6zjxkaws5n.R.flushNeeded();}}

    public void pop() {try{__CLR4_3_16z6zjxkaws5n.R.inc(261);
        __CLR4_3_16z6zjxkaws5n.R.inc(262);if((((top > -1)&&(__CLR4_3_16z6zjxkaws5n.R.iget(263)!=0|true))||(__CLR4_3_16z6zjxkaws5n.R.iget(264)==0&false))) {{
            __CLR4_3_16z6zjxkaws5n.R.inc(265);array[top] = null;
            __CLR4_3_16z6zjxkaws5n.R.inc(266);top--;
        }
    }}finally{__CLR4_3_16z6zjxkaws5n.R.flushNeeded();}}

    public T peek() {try{__CLR4_3_16z6zjxkaws5n.R.inc(267);
        __CLR4_3_16z6zjxkaws5n.R.inc(268);if((((top > -1)&&(__CLR4_3_16z6zjxkaws5n.R.iget(269)!=0|true))||(__CLR4_3_16z6zjxkaws5n.R.iget(270)==0&false))) {{
            __CLR4_3_16z6zjxkaws5n.R.inc(271);return array[top].value;
        }
        }__CLR4_3_16z6zjxkaws5n.R.inc(272);return null;
    }finally{__CLR4_3_16z6zjxkaws5n.R.flushNeeded();}}

    public int size() {try{__CLR4_3_16z6zjxkaws5n.R.inc(273);
        __CLR4_3_16z6zjxkaws5n.R.inc(274);return top + 1;
    }finally{__CLR4_3_16z6zjxkaws5n.R.flushNeeded();}}

}

class Box<T> {public static class __CLR4_3_16z7njxkaws5n{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{if(20180921211537623L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.3.1#20180921211537623,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0070\u0068\u006f\u0075\u0064\u0061\u0069\u006c\u002f\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1561980583896L,8589935092L,277,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_3_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    T value;
    public Box(T value) {try{__CLR4_3_16z7njxkaws5n.R.inc(275); __CLR4_3_16z7njxkaws5n.R.inc(276);this.value = value; }finally{__CLR4_3_16z7njxkaws5n.R.flushNeeded();}}
}