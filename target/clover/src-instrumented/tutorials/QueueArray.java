/* $$ This file has been instrumented by Clover 4.3.1#20180921211537623 $$ */package tutorials;

import java.util.Arrays;

public class QueueArray<T> implements Queue<T> {public static class __CLR4_3_17y7yjxvvfl2e{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_3_1();if(20180921211537623L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.3.1#20180921211537623,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0070\u0068\u006f\u0075\u0064\u0061\u0069\u006c\u002f\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1562680181490L,8589935092L,314,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_3_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private Box<T>[] array;
    int last;
    
    public QueueArray() {try{__CLR4_3_17y7yjxvvfl2e.R.inc(286);
        __CLR4_3_17y7yjxvvfl2e.R.inc(287);array = new Box[10];
        __CLR4_3_17y7yjxvvfl2e.R.inc(288);last = -1;
    }finally{__CLR4_3_17y7yjxvvfl2e.R.flushNeeded();}}

    public void add(T item) {try{__CLR4_3_17y7yjxvvfl2e.R.inc(289);
        __CLR4_3_17y7yjxvvfl2e.R.inc(290);last++;
        __CLR4_3_17y7yjxvvfl2e.R.inc(291);if((((last >= array.length)&&(__CLR4_3_17y7yjxvvfl2e.R.iget(292)!=0|true))||(__CLR4_3_17y7yjxvvfl2e.R.iget(293)==0&false))) {{
            __CLR4_3_17y7yjxvvfl2e.R.inc(294);array = Arrays.copyOf(array, array.length * 2);
        }
        }__CLR4_3_17y7yjxvvfl2e.R.inc(295);array[last] = new Box<T>(item);
    }finally{__CLR4_3_17y7yjxvvfl2e.R.flushNeeded();}}

    public void remove() {try{__CLR4_3_17y7yjxvvfl2e.R.inc(296);
        __CLR4_3_17y7yjxvvfl2e.R.inc(297);if((((last != -1)&&(__CLR4_3_17y7yjxvvfl2e.R.iget(298)!=0|true))||(__CLR4_3_17y7yjxvvfl2e.R.iget(299)==0&false))) {{
            __CLR4_3_17y7yjxvvfl2e.R.inc(300);for(int i = 0; (((i < last)&&(__CLR4_3_17y7yjxvvfl2e.R.iget(301)!=0|true))||(__CLR4_3_17y7yjxvvfl2e.R.iget(302)==0&false)); i++) {{
                __CLR4_3_17y7yjxvvfl2e.R.inc(303);array[i] = array[i+1];
            }
            }__CLR4_3_17y7yjxvvfl2e.R.inc(304);array[last] = null;
            __CLR4_3_17y7yjxvvfl2e.R.inc(305);last--;
        }
    }}finally{__CLR4_3_17y7yjxvvfl2e.R.flushNeeded();}}

    public T peek() {try{__CLR4_3_17y7yjxvvfl2e.R.inc(306);
        __CLR4_3_17y7yjxvvfl2e.R.inc(307);if((((array[0] != null)&&(__CLR4_3_17y7yjxvvfl2e.R.iget(308)!=0|true))||(__CLR4_3_17y7yjxvvfl2e.R.iget(309)==0&false))) {{ __CLR4_3_17y7yjxvvfl2e.R.inc(310);return array[0].value; }
        }__CLR4_3_17y7yjxvvfl2e.R.inc(311);return null;
    }finally{__CLR4_3_17y7yjxvvfl2e.R.flushNeeded();}}

    public int size() {try{__CLR4_3_17y7yjxvvfl2e.R.inc(312);
        __CLR4_3_17y7yjxvvfl2e.R.inc(313);return last + 1;
    }finally{__CLR4_3_17y7yjxvvfl2e.R.flushNeeded();}}

}
