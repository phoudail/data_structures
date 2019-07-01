/* $$ This file has been instrumented by Clover 4.3.1#20180921211537623 $$ */package tutorials;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
import org.junit.Before;

public class QueueArrayTest {static class __CLR4_3_1dodojxkaws86{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_3_1();if(20180921211537623L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.3.1#20180921211537623,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0070\u0068\u006f\u0075\u0064\u0061\u0069\u006c\u002f\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1561980584122L,8589935092L,524,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_3_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    QueueArray<Integer> tqueue;

    @Before
    public void init() {try{__CLR4_3_1dodojxkaws86.R.inc(492);
        __CLR4_3_1dodojxkaws86.R.inc(493);tqueue = new QueueArray<Integer>();
    }finally{__CLR4_3_1dodojxkaws86.R.flushNeeded();}}


    @Test
    public void constrTest() {__CLR4_3_1dodojxkaws86.R.globalSliceStart(getClass().getName(),494);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_3_1igzmbsdq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_3_1dodojxkaws86.R.rethrow($CLV_t2$);}finally{__CLR4_3_1dodojxkaws86.R.globalSliceEnd(getClass().getName(),"tutorials.QueueArrayTest.constrTest",__CLR4_3_1_TEST_NAME_SNIFFER.getTestName(),494,$CLV_p$,$CLV_t$);}}private void  __CLR4_3_1igzmbsdq(){try{__CLR4_3_1dodojxkaws86.R.inc(494);
        __CLR4_3_1dodojxkaws86.R.inc(495);assertEquals("", 0, tqueue.size());
        __CLR4_3_1dodojxkaws86.R.inc(496);assertTrue("", tqueue.peek() == null);
    }finally{__CLR4_3_1dodojxkaws86.R.flushNeeded();}}

    @Test
    public void addTest() {__CLR4_3_1dodojxkaws86.R.globalSliceStart(getClass().getName(),497);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_3_1ygj8lidt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_3_1dodojxkaws86.R.rethrow($CLV_t2$);}finally{__CLR4_3_1dodojxkaws86.R.globalSliceEnd(getClass().getName(),"tutorials.QueueArrayTest.addTest",__CLR4_3_1_TEST_NAME_SNIFFER.getTestName(),497,$CLV_p$,$CLV_t$);}}private void  __CLR4_3_1ygj8lidt(){try{__CLR4_3_1dodojxkaws86.R.inc(497);
        __CLR4_3_1dodojxkaws86.R.inc(498);tqueue.add(5);
        __CLR4_3_1dodojxkaws86.R.inc(499);int peek = tqueue.peek();
        __CLR4_3_1dodojxkaws86.R.inc(500);assertEquals("The first element wasn't added properly.", 5, peek);
        __CLR4_3_1dodojxkaws86.R.inc(501);assertEquals("The size wasn't updated for the first element.", 1, tqueue.size());
        __CLR4_3_1dodojxkaws86.R.inc(502);tqueue.add(7);
        __CLR4_3_1dodojxkaws86.R.inc(503);peek = tqueue.peek();
        __CLR4_3_1dodojxkaws86.R.inc(504);assertEquals("The second element wasn't added properly.", 5, peek);
        __CLR4_3_1dodojxkaws86.R.inc(505);assertEquals("The size wasn't updated for the second element.", 2, tqueue.size());
        __CLR4_3_1dodojxkaws86.R.inc(506);while((((tqueue.size() < 10)&&(__CLR4_3_1dodojxkaws86.R.iget(507)!=0|true))||(__CLR4_3_1dodojxkaws86.R.iget(508)==0&false))) {{
            __CLR4_3_1dodojxkaws86.R.inc(509);tqueue.add(3);
        }
        }__CLR4_3_1dodojxkaws86.R.inc(510);tqueue.add(9);
        __CLR4_3_1dodojxkaws86.R.inc(511);peek = tqueue.peek();
        __CLR4_3_1dodojxkaws86.R.inc(512);assertEquals("The elements weren't added properly beyond initial array size.", 5, peek);
        __CLR4_3_1dodojxkaws86.R.inc(513);assertEquals("The size wasn't updated after array size update.", 11, tqueue.size());
    }finally{__CLR4_3_1dodojxkaws86.R.flushNeeded();}}
    
    @Test
    public void removeTest() {__CLR4_3_1dodojxkaws86.R.globalSliceStart(getClass().getName(),514);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_3_1z6dhodea();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_3_1dodojxkaws86.R.rethrow($CLV_t2$);}finally{__CLR4_3_1dodojxkaws86.R.globalSliceEnd(getClass().getName(),"tutorials.QueueArrayTest.removeTest",__CLR4_3_1_TEST_NAME_SNIFFER.getTestName(),514,$CLV_p$,$CLV_t$);}}private void  __CLR4_3_1z6dhodea(){try{__CLR4_3_1dodojxkaws86.R.inc(514);
        __CLR4_3_1dodojxkaws86.R.inc(515);tqueue.remove();
        __CLR4_3_1dodojxkaws86.R.inc(516);assertEquals("The method changed the default size (expected 0).", 0, tqueue.size());
        __CLR4_3_1dodojxkaws86.R.inc(517);assertTrue("The method changed the default empty element.", tqueue.peek() == null);
        __CLR4_3_1dodojxkaws86.R.inc(518);tqueue.add(5);
        __CLR4_3_1dodojxkaws86.R.inc(519);tqueue.add(7);
        __CLR4_3_1dodojxkaws86.R.inc(520);tqueue.remove();
        __CLR4_3_1dodojxkaws86.R.inc(521);int peek = tqueue.peek();
        __CLR4_3_1dodojxkaws86.R.inc(522);assertEquals("The size didn't updated properly after element removal.", 1, tqueue.size());
        __CLR4_3_1dodojxkaws86.R.inc(523);assertEquals("The element wasn't properly removed.", 7, peek);
    }finally{__CLR4_3_1dodojxkaws86.R.flushNeeded();}}
}