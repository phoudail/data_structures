/* $$ This file has been instrumented by Clover 4.3.1#20180921211537623 $$ */package tutorials;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
import org.junit.Before;

public class QueueArrayTest {static class __CLR4_3_1hchcjxvtz8u7{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_3_1();if(20180921211537623L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.3.1#20180921211537623,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0070\u0068\u006f\u0075\u0064\u0061\u0069\u006c\u002f\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1562677739584L,8589935092L,656,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_3_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    QueueArray<Integer> tqueue;

    @Before
    public void init() {try{__CLR4_3_1hchcjxvtz8u7.R.inc(624);
        __CLR4_3_1hchcjxvtz8u7.R.inc(625);tqueue = new QueueArray<Integer>();
    }finally{__CLR4_3_1hchcjxvtz8u7.R.flushNeeded();}}


    @Test
    public void constrTest() {__CLR4_3_1hchcjxvtz8u7.R.globalSliceStart(getClass().getName(),626);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_3_1igzmbshe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_3_1hchcjxvtz8u7.R.rethrow($CLV_t2$);}finally{__CLR4_3_1hchcjxvtz8u7.R.globalSliceEnd(getClass().getName(),"tutorials.QueueArrayTest.constrTest",__CLR4_3_1_TEST_NAME_SNIFFER.getTestName(),626,$CLV_p$,$CLV_t$);}}private void  __CLR4_3_1igzmbshe(){try{__CLR4_3_1hchcjxvtz8u7.R.inc(626);
        __CLR4_3_1hchcjxvtz8u7.R.inc(627);assertEquals("", 0, tqueue.size());
        __CLR4_3_1hchcjxvtz8u7.R.inc(628);assertTrue("", tqueue.peek() == null);
    }finally{__CLR4_3_1hchcjxvtz8u7.R.flushNeeded();}}

    @Test
    public void addTest() {__CLR4_3_1hchcjxvtz8u7.R.globalSliceStart(getClass().getName(),629);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_3_1ygj8lihh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_3_1hchcjxvtz8u7.R.rethrow($CLV_t2$);}finally{__CLR4_3_1hchcjxvtz8u7.R.globalSliceEnd(getClass().getName(),"tutorials.QueueArrayTest.addTest",__CLR4_3_1_TEST_NAME_SNIFFER.getTestName(),629,$CLV_p$,$CLV_t$);}}private void  __CLR4_3_1ygj8lihh(){try{__CLR4_3_1hchcjxvtz8u7.R.inc(629);
        __CLR4_3_1hchcjxvtz8u7.R.inc(630);tqueue.add(5);
        __CLR4_3_1hchcjxvtz8u7.R.inc(631);int peek = tqueue.peek();
        __CLR4_3_1hchcjxvtz8u7.R.inc(632);assertEquals("The first element wasn't added properly.", 5, peek);
        __CLR4_3_1hchcjxvtz8u7.R.inc(633);assertEquals("The size wasn't updated for the first element.", 1, tqueue.size());
        __CLR4_3_1hchcjxvtz8u7.R.inc(634);tqueue.add(7);
        __CLR4_3_1hchcjxvtz8u7.R.inc(635);peek = tqueue.peek();
        __CLR4_3_1hchcjxvtz8u7.R.inc(636);assertEquals("The second element wasn't added properly.", 5, peek);
        __CLR4_3_1hchcjxvtz8u7.R.inc(637);assertEquals("The size wasn't updated for the second element.", 2, tqueue.size());
        __CLR4_3_1hchcjxvtz8u7.R.inc(638);while((((tqueue.size() < 10)&&(__CLR4_3_1hchcjxvtz8u7.R.iget(639)!=0|true))||(__CLR4_3_1hchcjxvtz8u7.R.iget(640)==0&false))) {{
            __CLR4_3_1hchcjxvtz8u7.R.inc(641);tqueue.add(3);
        }
        }__CLR4_3_1hchcjxvtz8u7.R.inc(642);tqueue.add(9);
        __CLR4_3_1hchcjxvtz8u7.R.inc(643);peek = tqueue.peek();
        __CLR4_3_1hchcjxvtz8u7.R.inc(644);assertEquals("The elements weren't added properly beyond initial array size.", 5, peek);
        __CLR4_3_1hchcjxvtz8u7.R.inc(645);assertEquals("The size wasn't updated after array size update.", 11, tqueue.size());
    }finally{__CLR4_3_1hchcjxvtz8u7.R.flushNeeded();}}
    
    @Test
    public void removeTest() {__CLR4_3_1hchcjxvtz8u7.R.globalSliceStart(getClass().getName(),646);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_3_1z6dhodhy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_3_1hchcjxvtz8u7.R.rethrow($CLV_t2$);}finally{__CLR4_3_1hchcjxvtz8u7.R.globalSliceEnd(getClass().getName(),"tutorials.QueueArrayTest.removeTest",__CLR4_3_1_TEST_NAME_SNIFFER.getTestName(),646,$CLV_p$,$CLV_t$);}}private void  __CLR4_3_1z6dhodhy(){try{__CLR4_3_1hchcjxvtz8u7.R.inc(646);
        __CLR4_3_1hchcjxvtz8u7.R.inc(647);tqueue.remove();
        __CLR4_3_1hchcjxvtz8u7.R.inc(648);assertEquals("The method changed the default size (expected 0).", 0, tqueue.size());
        __CLR4_3_1hchcjxvtz8u7.R.inc(649);assertTrue("The method changed the default empty element.", tqueue.peek() == null);
        __CLR4_3_1hchcjxvtz8u7.R.inc(650);tqueue.add(5);
        __CLR4_3_1hchcjxvtz8u7.R.inc(651);tqueue.add(7);
        __CLR4_3_1hchcjxvtz8u7.R.inc(652);tqueue.remove();
        __CLR4_3_1hchcjxvtz8u7.R.inc(653);int peek = tqueue.peek();
        __CLR4_3_1hchcjxvtz8u7.R.inc(654);assertEquals("The size didn't updated properly after element removal.", 1, tqueue.size());
        __CLR4_3_1hchcjxvtz8u7.R.inc(655);assertEquals("The element wasn't properly removed.", 7, peek);
    }finally{__CLR4_3_1hchcjxvtz8u7.R.flushNeeded();}}
}