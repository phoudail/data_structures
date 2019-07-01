/* $$ This file has been instrumented by Clover 4.3.1#20180921211537623 $$ */package tutorials;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;



/**
 * Unit test for a second implementation of Linked Lists.
 */
public class LinkedListv2Test {static class __CLR4_3_17x7xjxejscs2{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_3_1();if(20180921211537623L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.3.1#20180921211537623,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0070\u0068\u006f\u0075\u0064\u0061\u0069\u006c\u002f\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1561632696953L,8589935092L,379,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_3_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    LinkedListv2<Integer> list;

    @Before
    public void init() {try{__CLR4_3_17x7xjxejscs2.R.inc(285);
        __CLR4_3_17x7xjxejscs2.R.inc(286);list = new LinkedListv2<Integer>();
    }finally{__CLR4_3_17x7xjxejscs2.R.flushNeeded();}}
 
    @Test
    public void addTest() {__CLR4_3_17x7xjxejscs2.R.globalSliceStart(getClass().getName(),287);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_3_1ygj8li7z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_3_17x7xjxejscs2.R.rethrow($CLV_t2$);}finally{__CLR4_3_17x7xjxejscs2.R.globalSliceEnd(getClass().getName(),"tutorials.LinkedListv2Test.addTest",__CLR4_3_1_TEST_NAME_SNIFFER.getTestName(),287,$CLV_p$,$CLV_t$);}}private void  __CLR4_3_1ygj8li7z(){try{__CLR4_3_17x7xjxejscs2.R.inc(287);
        __CLR4_3_17x7xjxejscs2.R.inc(288);list.add(5);
        __CLR4_3_17x7xjxejscs2.R.inc(289);list.add(7);
        __CLR4_3_17x7xjxejscs2.R.inc(290);int t = list.get(0);
        __CLR4_3_17x7xjxejscs2.R.inc(291);int t2 = list.get(1);
        __CLR4_3_17x7xjxejscs2.R.inc(292);assertEquals("The first value wasn't added.", 5, t);
        __CLR4_3_17x7xjxejscs2.R.inc(293);assertEquals("The second value wasn't added.", 7, t2);
        __CLR4_3_17x7xjxejscs2.R.inc(294);assertEquals("The list size didn't update properly.", 2, list.size());
    }finally{__CLR4_3_17x7xjxejscs2.R.flushNeeded();}}

    @Test
    public void sizeTest() {__CLR4_3_17x7xjxejscs2.R.globalSliceStart(getClass().getName(),295);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_3_1qkqj1i87();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_3_17x7xjxejscs2.R.rethrow($CLV_t2$);}finally{__CLR4_3_17x7xjxejscs2.R.globalSliceEnd(getClass().getName(),"tutorials.LinkedListv2Test.sizeTest",__CLR4_3_1_TEST_NAME_SNIFFER.getTestName(),295,$CLV_p$,$CLV_t$);}}private void  __CLR4_3_1qkqj1i87(){try{__CLR4_3_17x7xjxejscs2.R.inc(295);
        __CLR4_3_17x7xjxejscs2.R.inc(296);assertEquals("The list's size at construction isn't 0.", 0, list.size());
        __CLR4_3_17x7xjxejscs2.R.inc(297);list.add(7);
        __CLR4_3_17x7xjxejscs2.R.inc(298);list.add(9);
        __CLR4_3_17x7xjxejscs2.R.inc(299);list.add(12);
        __CLR4_3_17x7xjxejscs2.R.inc(300);list.remove(7);
        __CLR4_3_17x7xjxejscs2.R.inc(301);assertEquals("The list's size doesn't update properly.", 2, list.size());
        __CLR4_3_17x7xjxejscs2.R.inc(302);LinkedListv2<Integer> list2 = new LinkedListv2<Integer>();
        __CLR4_3_17x7xjxejscs2.R.inc(303);assertEquals("Creating a new list changes existing lists' sizes.", 2, list.size());
        __CLR4_3_17x7xjxejscs2.R.inc(304);assertEquals("A new list's size isn't 0.", 0, list2.size());
    }finally{__CLR4_3_17x7xjxejscs2.R.flushNeeded();}} 

    @Test
    public void removeTest() {__CLR4_3_17x7xjxejscs2.R.globalSliceStart(getClass().getName(),305);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_3_1z6dhod8h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_3_17x7xjxejscs2.R.rethrow($CLV_t2$);}finally{__CLR4_3_17x7xjxejscs2.R.globalSliceEnd(getClass().getName(),"tutorials.LinkedListv2Test.removeTest",__CLR4_3_1_TEST_NAME_SNIFFER.getTestName(),305,$CLV_p$,$CLV_t$);}}private void  __CLR4_3_1z6dhod8h(){try{__CLR4_3_17x7xjxejscs2.R.inc(305);
        __CLR4_3_17x7xjxejscs2.R.inc(306);list.remove(4);
        __CLR4_3_17x7xjxejscs2.R.inc(307);list.add(5);
        __CLR4_3_17x7xjxejscs2.R.inc(308);list.add(7);
        __CLR4_3_17x7xjxejscs2.R.inc(309);list.add(3);
        __CLR4_3_17x7xjxejscs2.R.inc(310);list.add(7);
        __CLR4_3_17x7xjxejscs2.R.inc(311);list.add(12);
        __CLR4_3_17x7xjxejscs2.R.inc(312);list.remove(7);
        __CLR4_3_17x7xjxejscs2.R.inc(313);boolean t = list.contains(7);
        __CLR4_3_17x7xjxejscs2.R.inc(314);assertTrue("The first occurence of the element wasn't removed.", list.get(1) != 7);
        __CLR4_3_17x7xjxejscs2.R.inc(315);assertEquals("The list size didn't update properly.", 4, list.size());
        __CLR4_3_17x7xjxejscs2.R.inc(316);assertTrue("All occurences of the element were removed, not just the first.", t);
        __CLR4_3_17x7xjxejscs2.R.inc(317);list.remove(9);
        __CLR4_3_17x7xjxejscs2.R.inc(318);assertEquals("Attempting to remove an element that doesn't occur changes the list.", 4, list.size());
        __CLR4_3_17x7xjxejscs2.R.inc(319);list.remove(5);
        __CLR4_3_17x7xjxejscs2.R.inc(320);assertTrue("The first element of the list wasn't removed.", !list.contains(5));
        __CLR4_3_17x7xjxejscs2.R.inc(321);assertEquals("The list size wasn't updated properly after removal of first element.", 3, list.size());
        __CLR4_3_17x7xjxejscs2.R.inc(322);list.remove(12);
        __CLR4_3_17x7xjxejscs2.R.inc(323);assertTrue("The first element of the list wasn't removed.", !list.contains(12));
        __CLR4_3_17x7xjxejscs2.R.inc(324);assertEquals("The list size wasn't updated properly after removal of last element.", 2, list.size());
    }finally{__CLR4_3_17x7xjxejscs2.R.flushNeeded();}}

    @Test
    public void removeAllTest() {__CLR4_3_17x7xjxejscs2.R.globalSliceStart(getClass().getName(),325);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_3_1ii5n1m91();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_3_17x7xjxejscs2.R.rethrow($CLV_t2$);}finally{__CLR4_3_17x7xjxejscs2.R.globalSliceEnd(getClass().getName(),"tutorials.LinkedListv2Test.removeAllTest",__CLR4_3_1_TEST_NAME_SNIFFER.getTestName(),325,$CLV_p$,$CLV_t$);}}private void  __CLR4_3_1ii5n1m91(){try{__CLR4_3_17x7xjxejscs2.R.inc(325);
        __CLR4_3_17x7xjxejscs2.R.inc(326);list.add(5);
        __CLR4_3_17x7xjxejscs2.R.inc(327);list.add(7);
        __CLR4_3_17x7xjxejscs2.R.inc(328);list.add(3);
        __CLR4_3_17x7xjxejscs2.R.inc(329);list.add(7);
        __CLR4_3_17x7xjxejscs2.R.inc(330);list.removeAll(7);
        __CLR4_3_17x7xjxejscs2.R.inc(331);boolean t = list.contains(7);
        __CLR4_3_17x7xjxejscs2.R.inc(332);assertTrue("Not all occurences of the element were removed.", !t);
        __CLR4_3_17x7xjxejscs2.R.inc(333);assertEquals("The list's size wasn't updated properly.", 2, list.size());
    }finally{__CLR4_3_17x7xjxejscs2.R.flushNeeded();}}

    @Test(expected = IndexOutOfBoundsException.class)
    public void getExceptTest() {__CLR4_3_17x7xjxejscs2.R.globalSliceStart(getClass().getName(),334);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_3_1bejons9a();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,103,101,116,69,120,99,101,112,116,84,101,115,116,58,32,91,73,110,100,101,120,79,117,116,79,102,66,111,117,110,100,115,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IndexOutOfBoundsException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_3_17x7xjxejscs2.R.rethrow($CLV_t2$);}finally{__CLR4_3_17x7xjxejscs2.R.globalSliceEnd(getClass().getName(),"tutorials.LinkedListv2Test.getExceptTest",__CLR4_3_1_TEST_NAME_SNIFFER.getTestName(),334,$CLV_p$,$CLV_t$);}}private void  __CLR4_3_1bejons9a(){try{__CLR4_3_17x7xjxejscs2.R.inc(334);
        __CLR4_3_17x7xjxejscs2.R.inc(335);list.add(5);
        __CLR4_3_17x7xjxejscs2.R.inc(336);list.add(7);
        __CLR4_3_17x7xjxejscs2.R.inc(337);list.add(3);
        __CLR4_3_17x7xjxejscs2.R.inc(338);list.get(3);
    }finally{__CLR4_3_17x7xjxejscs2.R.flushNeeded();}}

    @Test
    public void getTest() {__CLR4_3_17x7xjxejscs2.R.globalSliceStart(getClass().getName(),339);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_3_1h0mab59f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_3_17x7xjxejscs2.R.rethrow($CLV_t2$);}finally{__CLR4_3_17x7xjxejscs2.R.globalSliceEnd(getClass().getName(),"tutorials.LinkedListv2Test.getTest",__CLR4_3_1_TEST_NAME_SNIFFER.getTestName(),339,$CLV_p$,$CLV_t$);}}private void  __CLR4_3_1h0mab59f(){try{__CLR4_3_17x7xjxejscs2.R.inc(339);
        __CLR4_3_17x7xjxejscs2.R.inc(340);list.add(5);
        __CLR4_3_17x7xjxejscs2.R.inc(341);list.add(7);
        __CLR4_3_17x7xjxejscs2.R.inc(342);list.add(3);
        __CLR4_3_17x7xjxejscs2.R.inc(343);int t0 = list.get(0);
        __CLR4_3_17x7xjxejscs2.R.inc(344);int t1 = list.get(1);
        __CLR4_3_17x7xjxejscs2.R.inc(345);int t2 = list.get(2);
        __CLR4_3_17x7xjxejscs2.R.inc(346);assertEquals("The first value wasn't properly returned.", 5, t0);
        __CLR4_3_17x7xjxejscs2.R.inc(347);assertEquals("The second value wasn't properly returned.", 7, t1);
        __CLR4_3_17x7xjxejscs2.R.inc(348);assertEquals("The last value wasn't properly returned.", 3, t2);
    }finally{__CLR4_3_17x7xjxejscs2.R.flushNeeded();}}

    @Test(expected = IndexOutOfBoundsException.class)
    public void setExceptTest() {__CLR4_3_17x7xjxejscs2.R.globalSliceStart(getClass().getName(),349);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_3_1x4cky49p();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,115,101,116,69,120,99,101,112,116,84,101,115,116,58,32,91,73,110,100,101,120,79,117,116,79,102,66,111,117,110,100,115,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IndexOutOfBoundsException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_3_17x7xjxejscs2.R.rethrow($CLV_t2$);}finally{__CLR4_3_17x7xjxejscs2.R.globalSliceEnd(getClass().getName(),"tutorials.LinkedListv2Test.setExceptTest",__CLR4_3_1_TEST_NAME_SNIFFER.getTestName(),349,$CLV_p$,$CLV_t$);}}private void  __CLR4_3_1x4cky49p(){try{__CLR4_3_17x7xjxejscs2.R.inc(349);
        __CLR4_3_17x7xjxejscs2.R.inc(350);list.add(5);
        __CLR4_3_17x7xjxejscs2.R.inc(351);list.add(7);
        __CLR4_3_17x7xjxejscs2.R.inc(352);list.add(3);
        __CLR4_3_17x7xjxejscs2.R.inc(353);list.set(3, 7);
    }finally{__CLR4_3_17x7xjxejscs2.R.flushNeeded();}}

    @Test
    public void setTest() {__CLR4_3_17x7xjxejscs2.R.globalSliceStart(getClass().getName(),354);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_3_1d9rw0r9u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_3_17x7xjxejscs2.R.rethrow($CLV_t2$);}finally{__CLR4_3_17x7xjxejscs2.R.globalSliceEnd(getClass().getName(),"tutorials.LinkedListv2Test.setTest",__CLR4_3_1_TEST_NAME_SNIFFER.getTestName(),354,$CLV_p$,$CLV_t$);}}private void  __CLR4_3_1d9rw0r9u(){try{__CLR4_3_17x7xjxejscs2.R.inc(354);
        __CLR4_3_17x7xjxejscs2.R.inc(355);list.add(5);
        __CLR4_3_17x7xjxejscs2.R.inc(356);list.add(7);
        __CLR4_3_17x7xjxejscs2.R.inc(357);list.add(3);
        __CLR4_3_17x7xjxejscs2.R.inc(358);list.set(1, 9);
        __CLR4_3_17x7xjxejscs2.R.inc(359);assertEquals("The list size changed although it shouldn't have.", 3, list.size());
        __CLR4_3_17x7xjxejscs2.R.inc(360);assertEquals("The element wasn't properly modified.", 1, list.indexOf(9));
    }finally{__CLR4_3_17x7xjxejscs2.R.flushNeeded();}}

    @Test
    public void indexOfTest() {__CLR4_3_17x7xjxejscs2.R.globalSliceStart(getClass().getName(),361);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_3_19bvli6a1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_3_17x7xjxejscs2.R.rethrow($CLV_t2$);}finally{__CLR4_3_17x7xjxejscs2.R.globalSliceEnd(getClass().getName(),"tutorials.LinkedListv2Test.indexOfTest",__CLR4_3_1_TEST_NAME_SNIFFER.getTestName(),361,$CLV_p$,$CLV_t$);}}private void  __CLR4_3_19bvli6a1(){try{__CLR4_3_17x7xjxejscs2.R.inc(361);
        __CLR4_3_17x7xjxejscs2.R.inc(362);list.add(5);
        __CLR4_3_17x7xjxejscs2.R.inc(363);list.add(7);
        __CLR4_3_17x7xjxejscs2.R.inc(364);list.add(3);
        __CLR4_3_17x7xjxejscs2.R.inc(365);assertEquals("The first element wasn't found.", 0, list.indexOf(5));
        __CLR4_3_17x7xjxejscs2.R.inc(366);assertEquals("The last element wasn't found.", 2, list.indexOf(3));
        __CLR4_3_17x7xjxejscs2.R.inc(367);assertEquals("An element that isn't in the list was found.", -1, list.indexOf(9));
    }finally{__CLR4_3_17x7xjxejscs2.R.flushNeeded();}}

    @Test
    public void containsTest() {__CLR4_3_17x7xjxejscs2.R.globalSliceStart(getClass().getName(),368);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_3_1t1mb20a8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_3_17x7xjxejscs2.R.rethrow($CLV_t2$);}finally{__CLR4_3_17x7xjxejscs2.R.globalSliceEnd(getClass().getName(),"tutorials.LinkedListv2Test.containsTest",__CLR4_3_1_TEST_NAME_SNIFFER.getTestName(),368,$CLV_p$,$CLV_t$);}}private void  __CLR4_3_1t1mb20a8(){try{__CLR4_3_17x7xjxejscs2.R.inc(368);
        __CLR4_3_17x7xjxejscs2.R.inc(369);assertTrue("An empty list returned that it contained something.", !list.contains(9));
        __CLR4_3_17x7xjxejscs2.R.inc(370);list.add(9);
        __CLR4_3_17x7xjxejscs2.R.inc(371);list.add(7);
        __CLR4_3_17x7xjxejscs2.R.inc(372);list.add(43);
        __CLR4_3_17x7xjxejscs2.R.inc(373);assertTrue("An element that occurs in the list wasn't found.", list.contains(7));
        __CLR4_3_17x7xjxejscs2.R.inc(374);assertTrue("An element that doesn't exist in the list was found.", !list.contains(4));
    }finally{__CLR4_3_17x7xjxejscs2.R.flushNeeded();}}

    @Test
    public void isEmptyTest() {__CLR4_3_17x7xjxejscs2.R.globalSliceStart(getClass().getName(),375);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_3_1uqn198af();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_3_17x7xjxejscs2.R.rethrow($CLV_t2$);}finally{__CLR4_3_17x7xjxejscs2.R.globalSliceEnd(getClass().getName(),"tutorials.LinkedListv2Test.isEmptyTest",__CLR4_3_1_TEST_NAME_SNIFFER.getTestName(),375,$CLV_p$,$CLV_t$);}}private void  __CLR4_3_1uqn198af(){try{__CLR4_3_17x7xjxejscs2.R.inc(375);
        __CLR4_3_17x7xjxejscs2.R.inc(376);assertTrue("An empty list was found not empty.", list.isEmpty());
        __CLR4_3_17x7xjxejscs2.R.inc(377);list.add(5);
        __CLR4_3_17x7xjxejscs2.R.inc(378);assertTrue("A list with one element returned that it was empty.", !list.isEmpty());
    }finally{__CLR4_3_17x7xjxejscs2.R.flushNeeded();}}

}