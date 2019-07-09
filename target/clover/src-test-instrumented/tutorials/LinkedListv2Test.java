/* $$ This file has been instrumented by Clover 4.3.1#20180921211537623 $$ */package tutorials;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;



/**
 * Unit test for a second implementation of Linked Lists.
 */
public class LinkedListv2Test {static class __CLR4_3_1eqeqjxvtz8tw{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_3_1();if(20180921211537623L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.3.1#20180921211537623,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0070\u0068\u006f\u0075\u0064\u0061\u0069\u006c\u002f\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1562677739584L,8589935092L,624,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_3_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    LinkedListv2<Integer> list;

    @Before
    public void init() {try{__CLR4_3_1eqeqjxvtz8tw.R.inc(530);
        __CLR4_3_1eqeqjxvtz8tw.R.inc(531);list = new LinkedListv2<Integer>();
    }finally{__CLR4_3_1eqeqjxvtz8tw.R.flushNeeded();}}
 
    @Test
    public void addTest() {__CLR4_3_1eqeqjxvtz8tw.R.globalSliceStart(getClass().getName(),532);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_3_1ygj8lies();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_3_1eqeqjxvtz8tw.R.rethrow($CLV_t2$);}finally{__CLR4_3_1eqeqjxvtz8tw.R.globalSliceEnd(getClass().getName(),"tutorials.LinkedListv2Test.addTest",__CLR4_3_1_TEST_NAME_SNIFFER.getTestName(),532,$CLV_p$,$CLV_t$);}}private void  __CLR4_3_1ygj8lies(){try{__CLR4_3_1eqeqjxvtz8tw.R.inc(532);
        __CLR4_3_1eqeqjxvtz8tw.R.inc(533);list.add(5);
        __CLR4_3_1eqeqjxvtz8tw.R.inc(534);list.add(7);
        __CLR4_3_1eqeqjxvtz8tw.R.inc(535);int t = list.get(0);
        __CLR4_3_1eqeqjxvtz8tw.R.inc(536);int t2 = list.get(1);
        __CLR4_3_1eqeqjxvtz8tw.R.inc(537);assertEquals("The first value wasn't added.", 5, t);
        __CLR4_3_1eqeqjxvtz8tw.R.inc(538);assertEquals("The second value wasn't added.", 7, t2);
        __CLR4_3_1eqeqjxvtz8tw.R.inc(539);assertEquals("The list size didn't update properly.", 2, list.size());
    }finally{__CLR4_3_1eqeqjxvtz8tw.R.flushNeeded();}}

    @Test
    public void sizeTest() {__CLR4_3_1eqeqjxvtz8tw.R.globalSliceStart(getClass().getName(),540);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_3_1qkqj1if0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_3_1eqeqjxvtz8tw.R.rethrow($CLV_t2$);}finally{__CLR4_3_1eqeqjxvtz8tw.R.globalSliceEnd(getClass().getName(),"tutorials.LinkedListv2Test.sizeTest",__CLR4_3_1_TEST_NAME_SNIFFER.getTestName(),540,$CLV_p$,$CLV_t$);}}private void  __CLR4_3_1qkqj1if0(){try{__CLR4_3_1eqeqjxvtz8tw.R.inc(540);
        __CLR4_3_1eqeqjxvtz8tw.R.inc(541);assertEquals("The list's size at construction isn't 0.", 0, list.size());
        __CLR4_3_1eqeqjxvtz8tw.R.inc(542);list.add(7);
        __CLR4_3_1eqeqjxvtz8tw.R.inc(543);list.add(9);
        __CLR4_3_1eqeqjxvtz8tw.R.inc(544);list.add(12);
        __CLR4_3_1eqeqjxvtz8tw.R.inc(545);list.remove(7);
        __CLR4_3_1eqeqjxvtz8tw.R.inc(546);assertEquals("The list's size doesn't update properly.", 2, list.size());
        __CLR4_3_1eqeqjxvtz8tw.R.inc(547);LinkedListv2<Integer> list2 = new LinkedListv2<Integer>();
        __CLR4_3_1eqeqjxvtz8tw.R.inc(548);assertEquals("Creating a new list changes existing lists' sizes.", 2, list.size());
        __CLR4_3_1eqeqjxvtz8tw.R.inc(549);assertEquals("A new list's size isn't 0.", 0, list2.size());
    }finally{__CLR4_3_1eqeqjxvtz8tw.R.flushNeeded();}} 

    @Test
    public void removeTest() {__CLR4_3_1eqeqjxvtz8tw.R.globalSliceStart(getClass().getName(),550);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_3_1z6dhodfa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_3_1eqeqjxvtz8tw.R.rethrow($CLV_t2$);}finally{__CLR4_3_1eqeqjxvtz8tw.R.globalSliceEnd(getClass().getName(),"tutorials.LinkedListv2Test.removeTest",__CLR4_3_1_TEST_NAME_SNIFFER.getTestName(),550,$CLV_p$,$CLV_t$);}}private void  __CLR4_3_1z6dhodfa(){try{__CLR4_3_1eqeqjxvtz8tw.R.inc(550);
        __CLR4_3_1eqeqjxvtz8tw.R.inc(551);list.remove(4);
        __CLR4_3_1eqeqjxvtz8tw.R.inc(552);list.add(5);
        __CLR4_3_1eqeqjxvtz8tw.R.inc(553);list.add(7);
        __CLR4_3_1eqeqjxvtz8tw.R.inc(554);list.add(3);
        __CLR4_3_1eqeqjxvtz8tw.R.inc(555);list.add(7);
        __CLR4_3_1eqeqjxvtz8tw.R.inc(556);list.add(12);
        __CLR4_3_1eqeqjxvtz8tw.R.inc(557);list.remove(7);
        __CLR4_3_1eqeqjxvtz8tw.R.inc(558);boolean t = list.contains(7);
        __CLR4_3_1eqeqjxvtz8tw.R.inc(559);assertTrue("The first occurence of the element wasn't removed.", list.get(1) != 7);
        __CLR4_3_1eqeqjxvtz8tw.R.inc(560);assertEquals("The list size didn't update properly.", 4, list.size());
        __CLR4_3_1eqeqjxvtz8tw.R.inc(561);assertTrue("All occurences of the element were removed, not just the first.", t);
        __CLR4_3_1eqeqjxvtz8tw.R.inc(562);list.remove(9);
        __CLR4_3_1eqeqjxvtz8tw.R.inc(563);assertEquals("Attempting to remove an element that doesn't occur changes the list.", 4, list.size());
        __CLR4_3_1eqeqjxvtz8tw.R.inc(564);list.remove(5);
        __CLR4_3_1eqeqjxvtz8tw.R.inc(565);assertTrue("The first element of the list wasn't removed.", !list.contains(5));
        __CLR4_3_1eqeqjxvtz8tw.R.inc(566);assertEquals("The list size wasn't updated properly after removal of first element.", 3, list.size());
        __CLR4_3_1eqeqjxvtz8tw.R.inc(567);list.remove(12);
        __CLR4_3_1eqeqjxvtz8tw.R.inc(568);assertTrue("The first element of the list wasn't removed.", !list.contains(12));
        __CLR4_3_1eqeqjxvtz8tw.R.inc(569);assertEquals("The list size wasn't updated properly after removal of last element.", 2, list.size());
    }finally{__CLR4_3_1eqeqjxvtz8tw.R.flushNeeded();}}

    @Test
    public void removeAllTest() {__CLR4_3_1eqeqjxvtz8tw.R.globalSliceStart(getClass().getName(),570);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_3_1ii5n1mfu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_3_1eqeqjxvtz8tw.R.rethrow($CLV_t2$);}finally{__CLR4_3_1eqeqjxvtz8tw.R.globalSliceEnd(getClass().getName(),"tutorials.LinkedListv2Test.removeAllTest",__CLR4_3_1_TEST_NAME_SNIFFER.getTestName(),570,$CLV_p$,$CLV_t$);}}private void  __CLR4_3_1ii5n1mfu(){try{__CLR4_3_1eqeqjxvtz8tw.R.inc(570);
        __CLR4_3_1eqeqjxvtz8tw.R.inc(571);list.add(5);
        __CLR4_3_1eqeqjxvtz8tw.R.inc(572);list.add(7);
        __CLR4_3_1eqeqjxvtz8tw.R.inc(573);list.add(3);
        __CLR4_3_1eqeqjxvtz8tw.R.inc(574);list.add(7);
        __CLR4_3_1eqeqjxvtz8tw.R.inc(575);list.removeAll(7);
        __CLR4_3_1eqeqjxvtz8tw.R.inc(576);boolean t = list.contains(7);
        __CLR4_3_1eqeqjxvtz8tw.R.inc(577);assertTrue("Not all occurences of the element were removed.", !t);
        __CLR4_3_1eqeqjxvtz8tw.R.inc(578);assertEquals("The list's size wasn't updated properly.", 2, list.size());
    }finally{__CLR4_3_1eqeqjxvtz8tw.R.flushNeeded();}}

    @Test(expected = IndexOutOfBoundsException.class)
    public void getExceptTest() {__CLR4_3_1eqeqjxvtz8tw.R.globalSliceStart(getClass().getName(),579);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_3_1bejonsg3();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,103,101,116,69,120,99,101,112,116,84,101,115,116,58,32,91,73,110,100,101,120,79,117,116,79,102,66,111,117,110,100,115,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IndexOutOfBoundsException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_3_1eqeqjxvtz8tw.R.rethrow($CLV_t2$);}finally{__CLR4_3_1eqeqjxvtz8tw.R.globalSliceEnd(getClass().getName(),"tutorials.LinkedListv2Test.getExceptTest",__CLR4_3_1_TEST_NAME_SNIFFER.getTestName(),579,$CLV_p$,$CLV_t$);}}private void  __CLR4_3_1bejonsg3(){try{__CLR4_3_1eqeqjxvtz8tw.R.inc(579);
        __CLR4_3_1eqeqjxvtz8tw.R.inc(580);list.add(5);
        __CLR4_3_1eqeqjxvtz8tw.R.inc(581);list.add(7);
        __CLR4_3_1eqeqjxvtz8tw.R.inc(582);list.add(3);
        __CLR4_3_1eqeqjxvtz8tw.R.inc(583);list.get(3);
    }finally{__CLR4_3_1eqeqjxvtz8tw.R.flushNeeded();}}

    @Test
    public void getTest() {__CLR4_3_1eqeqjxvtz8tw.R.globalSliceStart(getClass().getName(),584);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_3_1h0mab5g8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_3_1eqeqjxvtz8tw.R.rethrow($CLV_t2$);}finally{__CLR4_3_1eqeqjxvtz8tw.R.globalSliceEnd(getClass().getName(),"tutorials.LinkedListv2Test.getTest",__CLR4_3_1_TEST_NAME_SNIFFER.getTestName(),584,$CLV_p$,$CLV_t$);}}private void  __CLR4_3_1h0mab5g8(){try{__CLR4_3_1eqeqjxvtz8tw.R.inc(584);
        __CLR4_3_1eqeqjxvtz8tw.R.inc(585);list.add(5);
        __CLR4_3_1eqeqjxvtz8tw.R.inc(586);list.add(7);
        __CLR4_3_1eqeqjxvtz8tw.R.inc(587);list.add(3);
        __CLR4_3_1eqeqjxvtz8tw.R.inc(588);int t0 = list.get(0);
        __CLR4_3_1eqeqjxvtz8tw.R.inc(589);int t1 = list.get(1);
        __CLR4_3_1eqeqjxvtz8tw.R.inc(590);int t2 = list.get(2);
        __CLR4_3_1eqeqjxvtz8tw.R.inc(591);assertEquals("The first value wasn't properly returned.", 5, t0);
        __CLR4_3_1eqeqjxvtz8tw.R.inc(592);assertEquals("The second value wasn't properly returned.", 7, t1);
        __CLR4_3_1eqeqjxvtz8tw.R.inc(593);assertEquals("The last value wasn't properly returned.", 3, t2);
    }finally{__CLR4_3_1eqeqjxvtz8tw.R.flushNeeded();}}

    @Test(expected = IndexOutOfBoundsException.class)
    public void setExceptTest() {__CLR4_3_1eqeqjxvtz8tw.R.globalSliceStart(getClass().getName(),594);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_3_1x4cky4gi();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,115,101,116,69,120,99,101,112,116,84,101,115,116,58,32,91,73,110,100,101,120,79,117,116,79,102,66,111,117,110,100,115,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IndexOutOfBoundsException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_3_1eqeqjxvtz8tw.R.rethrow($CLV_t2$);}finally{__CLR4_3_1eqeqjxvtz8tw.R.globalSliceEnd(getClass().getName(),"tutorials.LinkedListv2Test.setExceptTest",__CLR4_3_1_TEST_NAME_SNIFFER.getTestName(),594,$CLV_p$,$CLV_t$);}}private void  __CLR4_3_1x4cky4gi(){try{__CLR4_3_1eqeqjxvtz8tw.R.inc(594);
        __CLR4_3_1eqeqjxvtz8tw.R.inc(595);list.add(5);
        __CLR4_3_1eqeqjxvtz8tw.R.inc(596);list.add(7);
        __CLR4_3_1eqeqjxvtz8tw.R.inc(597);list.add(3);
        __CLR4_3_1eqeqjxvtz8tw.R.inc(598);list.set(3, 7);
    }finally{__CLR4_3_1eqeqjxvtz8tw.R.flushNeeded();}}

    @Test
    public void setTest() {__CLR4_3_1eqeqjxvtz8tw.R.globalSliceStart(getClass().getName(),599);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_3_1d9rw0rgn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_3_1eqeqjxvtz8tw.R.rethrow($CLV_t2$);}finally{__CLR4_3_1eqeqjxvtz8tw.R.globalSliceEnd(getClass().getName(),"tutorials.LinkedListv2Test.setTest",__CLR4_3_1_TEST_NAME_SNIFFER.getTestName(),599,$CLV_p$,$CLV_t$);}}private void  __CLR4_3_1d9rw0rgn(){try{__CLR4_3_1eqeqjxvtz8tw.R.inc(599);
        __CLR4_3_1eqeqjxvtz8tw.R.inc(600);list.add(5);
        __CLR4_3_1eqeqjxvtz8tw.R.inc(601);list.add(7);
        __CLR4_3_1eqeqjxvtz8tw.R.inc(602);list.add(3);
        __CLR4_3_1eqeqjxvtz8tw.R.inc(603);list.set(1, 9);
        __CLR4_3_1eqeqjxvtz8tw.R.inc(604);assertEquals("The list size changed although it shouldn't have.", 3, list.size());
        __CLR4_3_1eqeqjxvtz8tw.R.inc(605);assertEquals("The element wasn't properly modified.", 1, list.indexOf(9));
    }finally{__CLR4_3_1eqeqjxvtz8tw.R.flushNeeded();}}

    @Test
    public void indexOfTest() {__CLR4_3_1eqeqjxvtz8tw.R.globalSliceStart(getClass().getName(),606);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_3_19bvli6gu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_3_1eqeqjxvtz8tw.R.rethrow($CLV_t2$);}finally{__CLR4_3_1eqeqjxvtz8tw.R.globalSliceEnd(getClass().getName(),"tutorials.LinkedListv2Test.indexOfTest",__CLR4_3_1_TEST_NAME_SNIFFER.getTestName(),606,$CLV_p$,$CLV_t$);}}private void  __CLR4_3_19bvli6gu(){try{__CLR4_3_1eqeqjxvtz8tw.R.inc(606);
        __CLR4_3_1eqeqjxvtz8tw.R.inc(607);list.add(5);
        __CLR4_3_1eqeqjxvtz8tw.R.inc(608);list.add(7);
        __CLR4_3_1eqeqjxvtz8tw.R.inc(609);list.add(3);
        __CLR4_3_1eqeqjxvtz8tw.R.inc(610);assertEquals("The first element wasn't found.", 0, list.indexOf(5));
        __CLR4_3_1eqeqjxvtz8tw.R.inc(611);assertEquals("The last element wasn't found.", 2, list.indexOf(3));
        __CLR4_3_1eqeqjxvtz8tw.R.inc(612);assertEquals("An element that isn't in the list was found.", -1, list.indexOf(9));
    }finally{__CLR4_3_1eqeqjxvtz8tw.R.flushNeeded();}}

    @Test
    public void containsTest() {__CLR4_3_1eqeqjxvtz8tw.R.globalSliceStart(getClass().getName(),613);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_3_1t1mb20h1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_3_1eqeqjxvtz8tw.R.rethrow($CLV_t2$);}finally{__CLR4_3_1eqeqjxvtz8tw.R.globalSliceEnd(getClass().getName(),"tutorials.LinkedListv2Test.containsTest",__CLR4_3_1_TEST_NAME_SNIFFER.getTestName(),613,$CLV_p$,$CLV_t$);}}private void  __CLR4_3_1t1mb20h1(){try{__CLR4_3_1eqeqjxvtz8tw.R.inc(613);
        __CLR4_3_1eqeqjxvtz8tw.R.inc(614);assertTrue("An empty list returned that it contained something.", !list.contains(9));
        __CLR4_3_1eqeqjxvtz8tw.R.inc(615);list.add(9);
        __CLR4_3_1eqeqjxvtz8tw.R.inc(616);list.add(7);
        __CLR4_3_1eqeqjxvtz8tw.R.inc(617);list.add(43);
        __CLR4_3_1eqeqjxvtz8tw.R.inc(618);assertTrue("An element that occurs in the list wasn't found.", list.contains(7));
        __CLR4_3_1eqeqjxvtz8tw.R.inc(619);assertTrue("An element that doesn't exist in the list was found.", !list.contains(4));
    }finally{__CLR4_3_1eqeqjxvtz8tw.R.flushNeeded();}}

    @Test
    public void isEmptyTest() {__CLR4_3_1eqeqjxvtz8tw.R.globalSliceStart(getClass().getName(),620);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_3_1uqn198h8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_3_1eqeqjxvtz8tw.R.rethrow($CLV_t2$);}finally{__CLR4_3_1eqeqjxvtz8tw.R.globalSliceEnd(getClass().getName(),"tutorials.LinkedListv2Test.isEmptyTest",__CLR4_3_1_TEST_NAME_SNIFFER.getTestName(),620,$CLV_p$,$CLV_t$);}}private void  __CLR4_3_1uqn198h8(){try{__CLR4_3_1eqeqjxvtz8tw.R.inc(620);
        __CLR4_3_1eqeqjxvtz8tw.R.inc(621);assertTrue("An empty list was found not empty.", list.isEmpty());
        __CLR4_3_1eqeqjxvtz8tw.R.inc(622);list.add(5);
        __CLR4_3_1eqeqjxvtz8tw.R.inc(623);assertTrue("A list with one element returned that it was empty.", !list.isEmpty());
    }finally{__CLR4_3_1eqeqjxvtz8tw.R.flushNeeded();}}

}