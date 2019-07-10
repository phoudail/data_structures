/* $$ This file has been instrumented by Clover 4.3.1#20180921211537623 $$ */package tutorials;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
import org.junit.Before;

/**
 * Unit test for implementation of stacks
 */
public class StackNodeTest {static class __CLR4_3_1k6k6jxvvfl6a{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_3_1();if(20180921211537623L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.3.1#20180921211537623,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0070\u0068\u006f\u0075\u0064\u0061\u0069\u006c\u002f\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1562680181657L,8589935092L,758,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_3_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    StackNode<Integer> tstack;

    @Before
    public void init() {try{__CLR4_3_1k6k6jxvvfl6a.R.inc(726);
        __CLR4_3_1k6k6jxvvfl6a.R.inc(727);tstack = new StackNode<Integer>();
    }finally{__CLR4_3_1k6k6jxvvfl6a.R.flushNeeded();}}

    @Test
    public void constrTest() {__CLR4_3_1k6k6jxvvfl6a.R.globalSliceStart(getClass().getName(),728);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_3_1igzmbsk8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_3_1k6k6jxvvfl6a.R.rethrow($CLV_t2$);}finally{__CLR4_3_1k6k6jxvvfl6a.R.globalSliceEnd(getClass().getName(),"tutorials.StackNodeTest.constrTest",__CLR4_3_1_TEST_NAME_SNIFFER.getTestName(),728,$CLV_p$,$CLV_t$);}}private void  __CLR4_3_1igzmbsk8(){try{__CLR4_3_1k6k6jxvvfl6a.R.inc(728);
        __CLR4_3_1k6k6jxvvfl6a.R.inc(729);assertEquals("The default size isn't 0.", 0, tstack.size());
        __CLR4_3_1k6k6jxvvfl6a.R.inc(730);assertTrue("The stack isn't empty at construction.", tstack.peek() == null);
    }finally{__CLR4_3_1k6k6jxvvfl6a.R.flushNeeded();}}

    @Test
    public void pushTest() {__CLR4_3_1k6k6jxvvfl6a.R.globalSliceStart(getClass().getName(),731);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_3_1dnq3qlkb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_3_1k6k6jxvvfl6a.R.rethrow($CLV_t2$);}finally{__CLR4_3_1k6k6jxvvfl6a.R.globalSliceEnd(getClass().getName(),"tutorials.StackNodeTest.pushTest",__CLR4_3_1_TEST_NAME_SNIFFER.getTestName(),731,$CLV_p$,$CLV_t$);}}private void  __CLR4_3_1dnq3qlkb(){try{__CLR4_3_1k6k6jxvvfl6a.R.inc(731);
        __CLR4_3_1k6k6jxvvfl6a.R.inc(732);tstack.push(5);
        __CLR4_3_1k6k6jxvvfl6a.R.inc(733);int peek = tstack.peek();
        __CLR4_3_1k6k6jxvvfl6a.R.inc(734);assertEquals("The first element wasn't added properly.", 5, peek);
        __CLR4_3_1k6k6jxvvfl6a.R.inc(735);assertEquals("The size wasn't updated for the first element.", 1, tstack.size());
        __CLR4_3_1k6k6jxvvfl6a.R.inc(736);tstack.push(7);
        __CLR4_3_1k6k6jxvvfl6a.R.inc(737);peek = tstack.peek();
        __CLR4_3_1k6k6jxvvfl6a.R.inc(738);assertEquals("The second element wasn't added properly.", 7, peek);
        __CLR4_3_1k6k6jxvvfl6a.R.inc(739);assertEquals("The size wasn't updated for the second element.", 2, tstack.size());
        __CLR4_3_1k6k6jxvvfl6a.R.inc(740);while((((tstack.size() < 10)&&(__CLR4_3_1k6k6jxvvfl6a.R.iget(741)!=0|true))||(__CLR4_3_1k6k6jxvvfl6a.R.iget(742)==0&false))) {{
            __CLR4_3_1k6k6jxvvfl6a.R.inc(743);tstack.push(3);
        }
        }__CLR4_3_1k6k6jxvvfl6a.R.inc(744);tstack.push(9);
        __CLR4_3_1k6k6jxvvfl6a.R.inc(745);peek = tstack.peek();
        __CLR4_3_1k6k6jxvvfl6a.R.inc(746);assertEquals("The element wasn't added properly beyond initial array size.", 9, peek);
        __CLR4_3_1k6k6jxvvfl6a.R.inc(747);assertEquals("The size wasn't updated after array size update.", 11, tstack.size());
    }finally{__CLR4_3_1k6k6jxvvfl6a.R.flushNeeded();}}
    
    @Test
    public void popTest() {__CLR4_3_1k6k6jxvvfl6a.R.globalSliceStart(getClass().getName(),748);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_3_1ap7mhiks();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_3_1k6k6jxvvfl6a.R.rethrow($CLV_t2$);}finally{__CLR4_3_1k6k6jxvvfl6a.R.globalSliceEnd(getClass().getName(),"tutorials.StackNodeTest.popTest",__CLR4_3_1_TEST_NAME_SNIFFER.getTestName(),748,$CLV_p$,$CLV_t$);}}private void  __CLR4_3_1ap7mhiks(){try{__CLR4_3_1k6k6jxvvfl6a.R.inc(748);
        __CLR4_3_1k6k6jxvvfl6a.R.inc(749);tstack.pop();
        __CLR4_3_1k6k6jxvvfl6a.R.inc(750);assertEquals("The method changed the default size (expected 0).", 0, tstack.size());
        __CLR4_3_1k6k6jxvvfl6a.R.inc(751);assertTrue("The method changed the default empty element.", tstack.peek() == null);
        __CLR4_3_1k6k6jxvvfl6a.R.inc(752);tstack.push(5);
        __CLR4_3_1k6k6jxvvfl6a.R.inc(753);tstack.push(7);
        __CLR4_3_1k6k6jxvvfl6a.R.inc(754);tstack.pop();
        __CLR4_3_1k6k6jxvvfl6a.R.inc(755);int peek = tstack.peek();
        __CLR4_3_1k6k6jxvvfl6a.R.inc(756);assertEquals("The size didn't updated properly after element removal.", 1, tstack.size());
        __CLR4_3_1k6k6jxvvfl6a.R.inc(757);assertEquals("The element wasn't properly removed.", 5, peek);
    }finally{__CLR4_3_1k6k6jxvvfl6a.R.flushNeeded();}}

}