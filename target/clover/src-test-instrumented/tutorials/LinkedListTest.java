/* $$ This file has been instrumented by Clover 4.3.1#20180921211537623 $$ */package tutorials;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;



/**
 * Unit test for implementation of Linked Lists.
 */
public class LinkedListTest {static class __CLR4_3_18g8gjxkaws7c{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_3_1();if(20180921211537623L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.3.1#20180921211537623,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0070\u0068\u006f\u0075\u0064\u0061\u0069\u006c\u002f\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1561980584122L,8589935092L,398,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_3_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    LinkedList<Integer> list;

    @Before
    public void init() {try{__CLR4_3_18g8gjxkaws7c.R.inc(304);
        __CLR4_3_18g8gjxkaws7c.R.inc(305);list = new LinkedList<Integer>();
    }finally{__CLR4_3_18g8gjxkaws7c.R.flushNeeded();}}
 
    @Test
    public void addTest() {__CLR4_3_18g8gjxkaws7c.R.globalSliceStart(getClass().getName(),306);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_3_1ygj8li8i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_3_18g8gjxkaws7c.R.rethrow($CLV_t2$);}finally{__CLR4_3_18g8gjxkaws7c.R.globalSliceEnd(getClass().getName(),"tutorials.LinkedListTest.addTest",__CLR4_3_1_TEST_NAME_SNIFFER.getTestName(),306,$CLV_p$,$CLV_t$);}}private void  __CLR4_3_1ygj8li8i(){try{__CLR4_3_18g8gjxkaws7c.R.inc(306);
        __CLR4_3_18g8gjxkaws7c.R.inc(307);list.add(5);
        __CLR4_3_18g8gjxkaws7c.R.inc(308);list.add(7);
        __CLR4_3_18g8gjxkaws7c.R.inc(309);int t = list.get(0);
        __CLR4_3_18g8gjxkaws7c.R.inc(310);int t2 = list.get(1);
        __CLR4_3_18g8gjxkaws7c.R.inc(311);assertEquals("The first value wasn't added.", 5, t);
        __CLR4_3_18g8gjxkaws7c.R.inc(312);assertEquals("The second value wasn't added.", 7, t2);
        __CLR4_3_18g8gjxkaws7c.R.inc(313);assertEquals("The list size didn't update properly.", 2, list.size());
    }finally{__CLR4_3_18g8gjxkaws7c.R.flushNeeded();}}

    @Test
    public void sizeTest() {__CLR4_3_18g8gjxkaws7c.R.globalSliceStart(getClass().getName(),314);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_3_1qkqj1i8q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_3_18g8gjxkaws7c.R.rethrow($CLV_t2$);}finally{__CLR4_3_18g8gjxkaws7c.R.globalSliceEnd(getClass().getName(),"tutorials.LinkedListTest.sizeTest",__CLR4_3_1_TEST_NAME_SNIFFER.getTestName(),314,$CLV_p$,$CLV_t$);}}private void  __CLR4_3_1qkqj1i8q(){try{__CLR4_3_18g8gjxkaws7c.R.inc(314);
        __CLR4_3_18g8gjxkaws7c.R.inc(315);assertEquals("The list's size at construction isn't 0.", 0, list.size());
        __CLR4_3_18g8gjxkaws7c.R.inc(316);list.add(7);
        __CLR4_3_18g8gjxkaws7c.R.inc(317);list.add(9);
        __CLR4_3_18g8gjxkaws7c.R.inc(318);list.add(12);
        __CLR4_3_18g8gjxkaws7c.R.inc(319);list.remove(7);
        __CLR4_3_18g8gjxkaws7c.R.inc(320);assertEquals("The list's size doesn't update properly.", 2, list.size());
        __CLR4_3_18g8gjxkaws7c.R.inc(321);LinkedList<Integer> list2 = new LinkedList<Integer>();
        __CLR4_3_18g8gjxkaws7c.R.inc(322);assertEquals("Creating a new list changes existing lists' sizes.", 2, list.size());
        __CLR4_3_18g8gjxkaws7c.R.inc(323);assertEquals("A new list's size isn't 0.", 0, list2.size());
    }finally{__CLR4_3_18g8gjxkaws7c.R.flushNeeded();}} 

    @Test
    public void removeTest() {__CLR4_3_18g8gjxkaws7c.R.globalSliceStart(getClass().getName(),324);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_3_1z6dhod90();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_3_18g8gjxkaws7c.R.rethrow($CLV_t2$);}finally{__CLR4_3_18g8gjxkaws7c.R.globalSliceEnd(getClass().getName(),"tutorials.LinkedListTest.removeTest",__CLR4_3_1_TEST_NAME_SNIFFER.getTestName(),324,$CLV_p$,$CLV_t$);}}private void  __CLR4_3_1z6dhod90(){try{__CLR4_3_18g8gjxkaws7c.R.inc(324);
        __CLR4_3_18g8gjxkaws7c.R.inc(325);list.remove(4);
        __CLR4_3_18g8gjxkaws7c.R.inc(326);list.add(5);
        __CLR4_3_18g8gjxkaws7c.R.inc(327);list.add(7);
        __CLR4_3_18g8gjxkaws7c.R.inc(328);list.add(3);
        __CLR4_3_18g8gjxkaws7c.R.inc(329);list.add(7);
        __CLR4_3_18g8gjxkaws7c.R.inc(330);list.add(12);
        __CLR4_3_18g8gjxkaws7c.R.inc(331);list.remove(7);
        __CLR4_3_18g8gjxkaws7c.R.inc(332);boolean t = list.contains(7);
        __CLR4_3_18g8gjxkaws7c.R.inc(333);assertTrue("The first occurence of the element wasn't removed.", list.get(1) != 7);
        __CLR4_3_18g8gjxkaws7c.R.inc(334);assertEquals("The list size didn't update properly.", 4, list.size());
        __CLR4_3_18g8gjxkaws7c.R.inc(335);assertTrue("All occurences of the element were removed, not just the first.", t);
        __CLR4_3_18g8gjxkaws7c.R.inc(336);list.remove(9);
        __CLR4_3_18g8gjxkaws7c.R.inc(337);assertEquals("Attempting to remove an element that doesn't occur changes the list.", 4, list.size());
        __CLR4_3_18g8gjxkaws7c.R.inc(338);list.remove(5);
        __CLR4_3_18g8gjxkaws7c.R.inc(339);assertTrue("The first element of the list wasn't removed.", !list.contains(5));
        __CLR4_3_18g8gjxkaws7c.R.inc(340);assertEquals("The list size wasn't updated properly after removal of first element.", 3, list.size());
        __CLR4_3_18g8gjxkaws7c.R.inc(341);list.remove(12);
        __CLR4_3_18g8gjxkaws7c.R.inc(342);assertTrue("The first element of the list wasn't removed.", !list.contains(12));
        __CLR4_3_18g8gjxkaws7c.R.inc(343);assertEquals("The list size wasn't updated properly after removal of last element.", 2, list.size());
    }finally{__CLR4_3_18g8gjxkaws7c.R.flushNeeded();}}

    @Test
    public void removeAllTest() {__CLR4_3_18g8gjxkaws7c.R.globalSliceStart(getClass().getName(),344);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_3_1ii5n1m9k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_3_18g8gjxkaws7c.R.rethrow($CLV_t2$);}finally{__CLR4_3_18g8gjxkaws7c.R.globalSliceEnd(getClass().getName(),"tutorials.LinkedListTest.removeAllTest",__CLR4_3_1_TEST_NAME_SNIFFER.getTestName(),344,$CLV_p$,$CLV_t$);}}private void  __CLR4_3_1ii5n1m9k(){try{__CLR4_3_18g8gjxkaws7c.R.inc(344);
        __CLR4_3_18g8gjxkaws7c.R.inc(345);list.add(5);
        __CLR4_3_18g8gjxkaws7c.R.inc(346);list.add(7);
        __CLR4_3_18g8gjxkaws7c.R.inc(347);list.add(3);
        __CLR4_3_18g8gjxkaws7c.R.inc(348);list.add(7);
        __CLR4_3_18g8gjxkaws7c.R.inc(349);list.removeAll(7);
        __CLR4_3_18g8gjxkaws7c.R.inc(350);boolean t = list.contains(7);
        __CLR4_3_18g8gjxkaws7c.R.inc(351);assertTrue("Not all occurences of the element were removed.", !t);
        __CLR4_3_18g8gjxkaws7c.R.inc(352);assertEquals("The list's size wasn't updated properly.", 2, list.size());
    }finally{__CLR4_3_18g8gjxkaws7c.R.flushNeeded();}}

    @Test(expected = IndexOutOfBoundsException.class)
    public void getExceptTest() {__CLR4_3_18g8gjxkaws7c.R.globalSliceStart(getClass().getName(),353);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_3_1bejons9t();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,103,101,116,69,120,99,101,112,116,84,101,115,116,58,32,91,73,110,100,101,120,79,117,116,79,102,66,111,117,110,100,115,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IndexOutOfBoundsException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_3_18g8gjxkaws7c.R.rethrow($CLV_t2$);}finally{__CLR4_3_18g8gjxkaws7c.R.globalSliceEnd(getClass().getName(),"tutorials.LinkedListTest.getExceptTest",__CLR4_3_1_TEST_NAME_SNIFFER.getTestName(),353,$CLV_p$,$CLV_t$);}}private void  __CLR4_3_1bejons9t(){try{__CLR4_3_18g8gjxkaws7c.R.inc(353);
        __CLR4_3_18g8gjxkaws7c.R.inc(354);list.add(5);
        __CLR4_3_18g8gjxkaws7c.R.inc(355);list.add(7);
        __CLR4_3_18g8gjxkaws7c.R.inc(356);list.add(3);
        __CLR4_3_18g8gjxkaws7c.R.inc(357);list.get(3);
    }finally{__CLR4_3_18g8gjxkaws7c.R.flushNeeded();}}

    @Test
    public void getTest() {__CLR4_3_18g8gjxkaws7c.R.globalSliceStart(getClass().getName(),358);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_3_1h0mab59y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_3_18g8gjxkaws7c.R.rethrow($CLV_t2$);}finally{__CLR4_3_18g8gjxkaws7c.R.globalSliceEnd(getClass().getName(),"tutorials.LinkedListTest.getTest",__CLR4_3_1_TEST_NAME_SNIFFER.getTestName(),358,$CLV_p$,$CLV_t$);}}private void  __CLR4_3_1h0mab59y(){try{__CLR4_3_18g8gjxkaws7c.R.inc(358);
        __CLR4_3_18g8gjxkaws7c.R.inc(359);list.add(5);
        __CLR4_3_18g8gjxkaws7c.R.inc(360);list.add(7);
        __CLR4_3_18g8gjxkaws7c.R.inc(361);list.add(3);
        __CLR4_3_18g8gjxkaws7c.R.inc(362);int t0 = list.get(0);
        __CLR4_3_18g8gjxkaws7c.R.inc(363);int t1 = list.get(1);
        __CLR4_3_18g8gjxkaws7c.R.inc(364);int t2 = list.get(2);
        __CLR4_3_18g8gjxkaws7c.R.inc(365);assertEquals("The first value wasn't properly returned.", 5, t0);
        __CLR4_3_18g8gjxkaws7c.R.inc(366);assertEquals("The second value wasn't properly returned.", 7, t1);
        __CLR4_3_18g8gjxkaws7c.R.inc(367);assertEquals("The last value wasn't properly returned.", 3, t2);
    }finally{__CLR4_3_18g8gjxkaws7c.R.flushNeeded();}}

    @Test(expected = IndexOutOfBoundsException.class)
    public void setExceptTest() {__CLR4_3_18g8gjxkaws7c.R.globalSliceStart(getClass().getName(),368);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_3_1x4cky4a8();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,115,101,116,69,120,99,101,112,116,84,101,115,116,58,32,91,73,110,100,101,120,79,117,116,79,102,66,111,117,110,100,115,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IndexOutOfBoundsException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_3_18g8gjxkaws7c.R.rethrow($CLV_t2$);}finally{__CLR4_3_18g8gjxkaws7c.R.globalSliceEnd(getClass().getName(),"tutorials.LinkedListTest.setExceptTest",__CLR4_3_1_TEST_NAME_SNIFFER.getTestName(),368,$CLV_p$,$CLV_t$);}}private void  __CLR4_3_1x4cky4a8(){try{__CLR4_3_18g8gjxkaws7c.R.inc(368);
        __CLR4_3_18g8gjxkaws7c.R.inc(369);list.add(5);
        __CLR4_3_18g8gjxkaws7c.R.inc(370);list.add(7);
        __CLR4_3_18g8gjxkaws7c.R.inc(371);list.add(3);
        __CLR4_3_18g8gjxkaws7c.R.inc(372);list.set(3, 7);
    }finally{__CLR4_3_18g8gjxkaws7c.R.flushNeeded();}}

    @Test
    public void setTest() {__CLR4_3_18g8gjxkaws7c.R.globalSliceStart(getClass().getName(),373);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_3_1d9rw0rad();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_3_18g8gjxkaws7c.R.rethrow($CLV_t2$);}finally{__CLR4_3_18g8gjxkaws7c.R.globalSliceEnd(getClass().getName(),"tutorials.LinkedListTest.setTest",__CLR4_3_1_TEST_NAME_SNIFFER.getTestName(),373,$CLV_p$,$CLV_t$);}}private void  __CLR4_3_1d9rw0rad(){try{__CLR4_3_18g8gjxkaws7c.R.inc(373);
        __CLR4_3_18g8gjxkaws7c.R.inc(374);list.add(5);
        __CLR4_3_18g8gjxkaws7c.R.inc(375);list.add(7);
        __CLR4_3_18g8gjxkaws7c.R.inc(376);list.add(3);
        __CLR4_3_18g8gjxkaws7c.R.inc(377);list.set(1, 9);
        __CLR4_3_18g8gjxkaws7c.R.inc(378);assertEquals("The list size changed although it shouldn't have.", 3, list.size());
        __CLR4_3_18g8gjxkaws7c.R.inc(379);assertEquals("The element wasn't properly modified.", 1, list.indexOf(9));
    }finally{__CLR4_3_18g8gjxkaws7c.R.flushNeeded();}}

    @Test
    public void indexOfTest() {__CLR4_3_18g8gjxkaws7c.R.globalSliceStart(getClass().getName(),380);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_3_19bvli6ak();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_3_18g8gjxkaws7c.R.rethrow($CLV_t2$);}finally{__CLR4_3_18g8gjxkaws7c.R.globalSliceEnd(getClass().getName(),"tutorials.LinkedListTest.indexOfTest",__CLR4_3_1_TEST_NAME_SNIFFER.getTestName(),380,$CLV_p$,$CLV_t$);}}private void  __CLR4_3_19bvli6ak(){try{__CLR4_3_18g8gjxkaws7c.R.inc(380);
        __CLR4_3_18g8gjxkaws7c.R.inc(381);list.add(5);
        __CLR4_3_18g8gjxkaws7c.R.inc(382);list.add(7);
        __CLR4_3_18g8gjxkaws7c.R.inc(383);list.add(3);
        __CLR4_3_18g8gjxkaws7c.R.inc(384);assertEquals("The first element wasn't found.", 0, list.indexOf(5));
        __CLR4_3_18g8gjxkaws7c.R.inc(385);assertEquals("The last element wasn't found.", 2, list.indexOf(3));
        __CLR4_3_18g8gjxkaws7c.R.inc(386);assertEquals("An element that isn't in the list was found.", -1, list.indexOf(9));
    }finally{__CLR4_3_18g8gjxkaws7c.R.flushNeeded();}}

    @Test
    public void containsTest() {__CLR4_3_18g8gjxkaws7c.R.globalSliceStart(getClass().getName(),387);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_3_1t1mb20ar();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_3_18g8gjxkaws7c.R.rethrow($CLV_t2$);}finally{__CLR4_3_18g8gjxkaws7c.R.globalSliceEnd(getClass().getName(),"tutorials.LinkedListTest.containsTest",__CLR4_3_1_TEST_NAME_SNIFFER.getTestName(),387,$CLV_p$,$CLV_t$);}}private void  __CLR4_3_1t1mb20ar(){try{__CLR4_3_18g8gjxkaws7c.R.inc(387);
        __CLR4_3_18g8gjxkaws7c.R.inc(388);assertTrue("An empty list returned that it contained something.", !list.contains(9));
        __CLR4_3_18g8gjxkaws7c.R.inc(389);list.add(9);
        __CLR4_3_18g8gjxkaws7c.R.inc(390);list.add(7);
        __CLR4_3_18g8gjxkaws7c.R.inc(391);list.add(43);
        __CLR4_3_18g8gjxkaws7c.R.inc(392);assertTrue("An element that occurs in the list wasn't found.", list.contains(7));
        __CLR4_3_18g8gjxkaws7c.R.inc(393);assertTrue("An element that doesn't exist in the list was found.", !list.contains(4));
    }finally{__CLR4_3_18g8gjxkaws7c.R.flushNeeded();}}

    @Test
    public void isEmptyTest() {__CLR4_3_18g8gjxkaws7c.R.globalSliceStart(getClass().getName(),394);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_3_1uqn198ay();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_3_18g8gjxkaws7c.R.rethrow($CLV_t2$);}finally{__CLR4_3_18g8gjxkaws7c.R.globalSliceEnd(getClass().getName(),"tutorials.LinkedListTest.isEmptyTest",__CLR4_3_1_TEST_NAME_SNIFFER.getTestName(),394,$CLV_p$,$CLV_t$);}}private void  __CLR4_3_1uqn198ay(){try{__CLR4_3_18g8gjxkaws7c.R.inc(394);
        __CLR4_3_18g8gjxkaws7c.R.inc(395);assertTrue("An empty list was found not empty.", list.isEmpty());
        __CLR4_3_18g8gjxkaws7c.R.inc(396);list.add(5);
        __CLR4_3_18g8gjxkaws7c.R.inc(397);assertTrue("A list with one element returned that it was empty.", !list.isEmpty());
    }finally{__CLR4_3_18g8gjxkaws7c.R.flushNeeded();}}

}