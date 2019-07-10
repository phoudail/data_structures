/* $$ This file has been instrumented by Clover 4.3.1#20180921211537623 $$ */package tutorials;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;



/**
 * Unit test for a second implementation of Linked Lists.
 */
public class LinkedListv2Test {static class __CLR4_3_1etetjxvvfl5n{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_3_1();if(20180921211537623L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.3.1#20180921211537623,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0070\u0068\u006f\u0075\u0064\u0061\u0069\u006c\u002f\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1562680181657L,8589935092L,627,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_3_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    LinkedListv2<Integer> list;

    @Before
    public void init() {try{__CLR4_3_1etetjxvvfl5n.R.inc(533);
        __CLR4_3_1etetjxvvfl5n.R.inc(534);list = new LinkedListv2<Integer>();
    }finally{__CLR4_3_1etetjxvvfl5n.R.flushNeeded();}}
 
    @Test
    public void addTest() {__CLR4_3_1etetjxvvfl5n.R.globalSliceStart(getClass().getName(),535);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_3_1ygj8liev();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_3_1etetjxvvfl5n.R.rethrow($CLV_t2$);}finally{__CLR4_3_1etetjxvvfl5n.R.globalSliceEnd(getClass().getName(),"tutorials.LinkedListv2Test.addTest",__CLR4_3_1_TEST_NAME_SNIFFER.getTestName(),535,$CLV_p$,$CLV_t$);}}private void  __CLR4_3_1ygj8liev(){try{__CLR4_3_1etetjxvvfl5n.R.inc(535);
        __CLR4_3_1etetjxvvfl5n.R.inc(536);list.add(5);
        __CLR4_3_1etetjxvvfl5n.R.inc(537);list.add(7);
        __CLR4_3_1etetjxvvfl5n.R.inc(538);int t = list.get(0);
        __CLR4_3_1etetjxvvfl5n.R.inc(539);int t2 = list.get(1);
        __CLR4_3_1etetjxvvfl5n.R.inc(540);assertEquals("The first value wasn't added.", 5, t);
        __CLR4_3_1etetjxvvfl5n.R.inc(541);assertEquals("The second value wasn't added.", 7, t2);
        __CLR4_3_1etetjxvvfl5n.R.inc(542);assertEquals("The list size didn't update properly.", 2, list.size());
    }finally{__CLR4_3_1etetjxvvfl5n.R.flushNeeded();}}

    @Test
    public void sizeTest() {__CLR4_3_1etetjxvvfl5n.R.globalSliceStart(getClass().getName(),543);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_3_1qkqj1if3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_3_1etetjxvvfl5n.R.rethrow($CLV_t2$);}finally{__CLR4_3_1etetjxvvfl5n.R.globalSliceEnd(getClass().getName(),"tutorials.LinkedListv2Test.sizeTest",__CLR4_3_1_TEST_NAME_SNIFFER.getTestName(),543,$CLV_p$,$CLV_t$);}}private void  __CLR4_3_1qkqj1if3(){try{__CLR4_3_1etetjxvvfl5n.R.inc(543);
        __CLR4_3_1etetjxvvfl5n.R.inc(544);assertEquals("The list's size at construction isn't 0.", 0, list.size());
        __CLR4_3_1etetjxvvfl5n.R.inc(545);list.add(7);
        __CLR4_3_1etetjxvvfl5n.R.inc(546);list.add(9);
        __CLR4_3_1etetjxvvfl5n.R.inc(547);list.add(12);
        __CLR4_3_1etetjxvvfl5n.R.inc(548);list.remove(7);
        __CLR4_3_1etetjxvvfl5n.R.inc(549);assertEquals("The list's size doesn't update properly.", 2, list.size());
        __CLR4_3_1etetjxvvfl5n.R.inc(550);LinkedListv2<Integer> list2 = new LinkedListv2<Integer>();
        __CLR4_3_1etetjxvvfl5n.R.inc(551);assertEquals("Creating a new list changes existing lists' sizes.", 2, list.size());
        __CLR4_3_1etetjxvvfl5n.R.inc(552);assertEquals("A new list's size isn't 0.", 0, list2.size());
    }finally{__CLR4_3_1etetjxvvfl5n.R.flushNeeded();}} 

    @Test
    public void removeTest() {__CLR4_3_1etetjxvvfl5n.R.globalSliceStart(getClass().getName(),553);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_3_1z6dhodfd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_3_1etetjxvvfl5n.R.rethrow($CLV_t2$);}finally{__CLR4_3_1etetjxvvfl5n.R.globalSliceEnd(getClass().getName(),"tutorials.LinkedListv2Test.removeTest",__CLR4_3_1_TEST_NAME_SNIFFER.getTestName(),553,$CLV_p$,$CLV_t$);}}private void  __CLR4_3_1z6dhodfd(){try{__CLR4_3_1etetjxvvfl5n.R.inc(553);
        __CLR4_3_1etetjxvvfl5n.R.inc(554);list.remove(4);
        __CLR4_3_1etetjxvvfl5n.R.inc(555);list.add(5);
        __CLR4_3_1etetjxvvfl5n.R.inc(556);list.add(7);
        __CLR4_3_1etetjxvvfl5n.R.inc(557);list.add(3);
        __CLR4_3_1etetjxvvfl5n.R.inc(558);list.add(7);
        __CLR4_3_1etetjxvvfl5n.R.inc(559);list.add(12);
        __CLR4_3_1etetjxvvfl5n.R.inc(560);list.remove(7);
        __CLR4_3_1etetjxvvfl5n.R.inc(561);boolean t = list.contains(7);
        __CLR4_3_1etetjxvvfl5n.R.inc(562);assertTrue("The first occurence of the element wasn't removed.", list.get(1) != 7);
        __CLR4_3_1etetjxvvfl5n.R.inc(563);assertEquals("The list size didn't update properly.", 4, list.size());
        __CLR4_3_1etetjxvvfl5n.R.inc(564);assertTrue("All occurences of the element were removed, not just the first.", t);
        __CLR4_3_1etetjxvvfl5n.R.inc(565);list.remove(9);
        __CLR4_3_1etetjxvvfl5n.R.inc(566);assertEquals("Attempting to remove an element that doesn't occur changes the list.", 4, list.size());
        __CLR4_3_1etetjxvvfl5n.R.inc(567);list.remove(5);
        __CLR4_3_1etetjxvvfl5n.R.inc(568);assertTrue("The first element of the list wasn't removed.", !list.contains(5));
        __CLR4_3_1etetjxvvfl5n.R.inc(569);assertEquals("The list size wasn't updated properly after removal of first element.", 3, list.size());
        __CLR4_3_1etetjxvvfl5n.R.inc(570);list.remove(12);
        __CLR4_3_1etetjxvvfl5n.R.inc(571);assertTrue("The first element of the list wasn't removed.", !list.contains(12));
        __CLR4_3_1etetjxvvfl5n.R.inc(572);assertEquals("The list size wasn't updated properly after removal of last element.", 2, list.size());
    }finally{__CLR4_3_1etetjxvvfl5n.R.flushNeeded();}}

    @Test
    public void removeAllTest() {__CLR4_3_1etetjxvvfl5n.R.globalSliceStart(getClass().getName(),573);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_3_1ii5n1mfx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_3_1etetjxvvfl5n.R.rethrow($CLV_t2$);}finally{__CLR4_3_1etetjxvvfl5n.R.globalSliceEnd(getClass().getName(),"tutorials.LinkedListv2Test.removeAllTest",__CLR4_3_1_TEST_NAME_SNIFFER.getTestName(),573,$CLV_p$,$CLV_t$);}}private void  __CLR4_3_1ii5n1mfx(){try{__CLR4_3_1etetjxvvfl5n.R.inc(573);
        __CLR4_3_1etetjxvvfl5n.R.inc(574);list.add(5);
        __CLR4_3_1etetjxvvfl5n.R.inc(575);list.add(7);
        __CLR4_3_1etetjxvvfl5n.R.inc(576);list.add(3);
        __CLR4_3_1etetjxvvfl5n.R.inc(577);list.add(7);
        __CLR4_3_1etetjxvvfl5n.R.inc(578);list.removeAll(7);
        __CLR4_3_1etetjxvvfl5n.R.inc(579);boolean t = list.contains(7);
        __CLR4_3_1etetjxvvfl5n.R.inc(580);assertTrue("Not all occurences of the element were removed.", !t);
        __CLR4_3_1etetjxvvfl5n.R.inc(581);assertEquals("The list's size wasn't updated properly.", 2, list.size());
    }finally{__CLR4_3_1etetjxvvfl5n.R.flushNeeded();}}

    @Test(expected = IndexOutOfBoundsException.class)
    public void getExceptTest() {__CLR4_3_1etetjxvvfl5n.R.globalSliceStart(getClass().getName(),582);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_3_1bejonsg6();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,103,101,116,69,120,99,101,112,116,84,101,115,116,58,32,91,73,110,100,101,120,79,117,116,79,102,66,111,117,110,100,115,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IndexOutOfBoundsException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_3_1etetjxvvfl5n.R.rethrow($CLV_t2$);}finally{__CLR4_3_1etetjxvvfl5n.R.globalSliceEnd(getClass().getName(),"tutorials.LinkedListv2Test.getExceptTest",__CLR4_3_1_TEST_NAME_SNIFFER.getTestName(),582,$CLV_p$,$CLV_t$);}}private void  __CLR4_3_1bejonsg6(){try{__CLR4_3_1etetjxvvfl5n.R.inc(582);
        __CLR4_3_1etetjxvvfl5n.R.inc(583);list.add(5);
        __CLR4_3_1etetjxvvfl5n.R.inc(584);list.add(7);
        __CLR4_3_1etetjxvvfl5n.R.inc(585);list.add(3);
        __CLR4_3_1etetjxvvfl5n.R.inc(586);list.get(3);
    }finally{__CLR4_3_1etetjxvvfl5n.R.flushNeeded();}}

    @Test
    public void getTest() {__CLR4_3_1etetjxvvfl5n.R.globalSliceStart(getClass().getName(),587);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_3_1h0mab5gb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_3_1etetjxvvfl5n.R.rethrow($CLV_t2$);}finally{__CLR4_3_1etetjxvvfl5n.R.globalSliceEnd(getClass().getName(),"tutorials.LinkedListv2Test.getTest",__CLR4_3_1_TEST_NAME_SNIFFER.getTestName(),587,$CLV_p$,$CLV_t$);}}private void  __CLR4_3_1h0mab5gb(){try{__CLR4_3_1etetjxvvfl5n.R.inc(587);
        __CLR4_3_1etetjxvvfl5n.R.inc(588);list.add(5);
        __CLR4_3_1etetjxvvfl5n.R.inc(589);list.add(7);
        __CLR4_3_1etetjxvvfl5n.R.inc(590);list.add(3);
        __CLR4_3_1etetjxvvfl5n.R.inc(591);int t0 = list.get(0);
        __CLR4_3_1etetjxvvfl5n.R.inc(592);int t1 = list.get(1);
        __CLR4_3_1etetjxvvfl5n.R.inc(593);int t2 = list.get(2);
        __CLR4_3_1etetjxvvfl5n.R.inc(594);assertEquals("The first value wasn't properly returned.", 5, t0);
        __CLR4_3_1etetjxvvfl5n.R.inc(595);assertEquals("The second value wasn't properly returned.", 7, t1);
        __CLR4_3_1etetjxvvfl5n.R.inc(596);assertEquals("The last value wasn't properly returned.", 3, t2);
    }finally{__CLR4_3_1etetjxvvfl5n.R.flushNeeded();}}

    @Test(expected = IndexOutOfBoundsException.class)
    public void setExceptTest() {__CLR4_3_1etetjxvvfl5n.R.globalSliceStart(getClass().getName(),597);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_3_1x4cky4gl();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,115,101,116,69,120,99,101,112,116,84,101,115,116,58,32,91,73,110,100,101,120,79,117,116,79,102,66,111,117,110,100,115,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IndexOutOfBoundsException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_3_1etetjxvvfl5n.R.rethrow($CLV_t2$);}finally{__CLR4_3_1etetjxvvfl5n.R.globalSliceEnd(getClass().getName(),"tutorials.LinkedListv2Test.setExceptTest",__CLR4_3_1_TEST_NAME_SNIFFER.getTestName(),597,$CLV_p$,$CLV_t$);}}private void  __CLR4_3_1x4cky4gl(){try{__CLR4_3_1etetjxvvfl5n.R.inc(597);
        __CLR4_3_1etetjxvvfl5n.R.inc(598);list.add(5);
        __CLR4_3_1etetjxvvfl5n.R.inc(599);list.add(7);
        __CLR4_3_1etetjxvvfl5n.R.inc(600);list.add(3);
        __CLR4_3_1etetjxvvfl5n.R.inc(601);list.set(3, 7);
    }finally{__CLR4_3_1etetjxvvfl5n.R.flushNeeded();}}

    @Test
    public void setTest() {__CLR4_3_1etetjxvvfl5n.R.globalSliceStart(getClass().getName(),602);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_3_1d9rw0rgq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_3_1etetjxvvfl5n.R.rethrow($CLV_t2$);}finally{__CLR4_3_1etetjxvvfl5n.R.globalSliceEnd(getClass().getName(),"tutorials.LinkedListv2Test.setTest",__CLR4_3_1_TEST_NAME_SNIFFER.getTestName(),602,$CLV_p$,$CLV_t$);}}private void  __CLR4_3_1d9rw0rgq(){try{__CLR4_3_1etetjxvvfl5n.R.inc(602);
        __CLR4_3_1etetjxvvfl5n.R.inc(603);list.add(5);
        __CLR4_3_1etetjxvvfl5n.R.inc(604);list.add(7);
        __CLR4_3_1etetjxvvfl5n.R.inc(605);list.add(3);
        __CLR4_3_1etetjxvvfl5n.R.inc(606);list.set(1, 9);
        __CLR4_3_1etetjxvvfl5n.R.inc(607);assertEquals("The list size changed although it shouldn't have.", 3, list.size());
        __CLR4_3_1etetjxvvfl5n.R.inc(608);assertEquals("The element wasn't properly modified.", 1, list.indexOf(9));
    }finally{__CLR4_3_1etetjxvvfl5n.R.flushNeeded();}}

    @Test
    public void indexOfTest() {__CLR4_3_1etetjxvvfl5n.R.globalSliceStart(getClass().getName(),609);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_3_19bvli6gx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_3_1etetjxvvfl5n.R.rethrow($CLV_t2$);}finally{__CLR4_3_1etetjxvvfl5n.R.globalSliceEnd(getClass().getName(),"tutorials.LinkedListv2Test.indexOfTest",__CLR4_3_1_TEST_NAME_SNIFFER.getTestName(),609,$CLV_p$,$CLV_t$);}}private void  __CLR4_3_19bvli6gx(){try{__CLR4_3_1etetjxvvfl5n.R.inc(609);
        __CLR4_3_1etetjxvvfl5n.R.inc(610);list.add(5);
        __CLR4_3_1etetjxvvfl5n.R.inc(611);list.add(7);
        __CLR4_3_1etetjxvvfl5n.R.inc(612);list.add(3);
        __CLR4_3_1etetjxvvfl5n.R.inc(613);assertEquals("The first element wasn't found.", 0, list.indexOf(5));
        __CLR4_3_1etetjxvvfl5n.R.inc(614);assertEquals("The last element wasn't found.", 2, list.indexOf(3));
        __CLR4_3_1etetjxvvfl5n.R.inc(615);assertEquals("An element that isn't in the list was found.", -1, list.indexOf(9));
    }finally{__CLR4_3_1etetjxvvfl5n.R.flushNeeded();}}

    @Test
    public void containsTest() {__CLR4_3_1etetjxvvfl5n.R.globalSliceStart(getClass().getName(),616);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_3_1t1mb20h4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_3_1etetjxvvfl5n.R.rethrow($CLV_t2$);}finally{__CLR4_3_1etetjxvvfl5n.R.globalSliceEnd(getClass().getName(),"tutorials.LinkedListv2Test.containsTest",__CLR4_3_1_TEST_NAME_SNIFFER.getTestName(),616,$CLV_p$,$CLV_t$);}}private void  __CLR4_3_1t1mb20h4(){try{__CLR4_3_1etetjxvvfl5n.R.inc(616);
        __CLR4_3_1etetjxvvfl5n.R.inc(617);assertTrue("An empty list returned that it contained something.", !list.contains(9));
        __CLR4_3_1etetjxvvfl5n.R.inc(618);list.add(9);
        __CLR4_3_1etetjxvvfl5n.R.inc(619);list.add(7);
        __CLR4_3_1etetjxvvfl5n.R.inc(620);list.add(43);
        __CLR4_3_1etetjxvvfl5n.R.inc(621);assertTrue("An element that occurs in the list wasn't found.", list.contains(7));
        __CLR4_3_1etetjxvvfl5n.R.inc(622);assertTrue("An element that doesn't exist in the list was found.", !list.contains(4));
    }finally{__CLR4_3_1etetjxvvfl5n.R.flushNeeded();}}

    @Test
    public void isEmptyTest() {__CLR4_3_1etetjxvvfl5n.R.globalSliceStart(getClass().getName(),623);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_3_1uqn198hb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_3_1etetjxvvfl5n.R.rethrow($CLV_t2$);}finally{__CLR4_3_1etetjxvvfl5n.R.globalSliceEnd(getClass().getName(),"tutorials.LinkedListv2Test.isEmptyTest",__CLR4_3_1_TEST_NAME_SNIFFER.getTestName(),623,$CLV_p$,$CLV_t$);}}private void  __CLR4_3_1uqn198hb(){try{__CLR4_3_1etetjxvvfl5n.R.inc(623);
        __CLR4_3_1etetjxvvfl5n.R.inc(624);assertTrue("An empty list was found not empty.", list.isEmpty());
        __CLR4_3_1etetjxvvfl5n.R.inc(625);list.add(5);
        __CLR4_3_1etetjxvvfl5n.R.inc(626);assertTrue("A list with one element returned that it was empty.", !list.isEmpty());
    }finally{__CLR4_3_1etetjxvvfl5n.R.flushNeeded();}}

}