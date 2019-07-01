/* $$ This file has been instrumented by Clover 4.3.1#20180921211537623 $$ */package tutorials;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;



/**
 * Unit test for implementation of Linked Lists.
 */
public class LinkedListTest {static class __CLR4_3_15b5bjxejscre{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_3_1();if(20180921211537623L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.3.1#20180921211537623,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0070\u0068\u006f\u0075\u0064\u0061\u0069\u006c\u002f\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1561632696953L,8589935092L,285,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_3_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    LinkedList<Integer> list;

    @Before
    public void init() {try{__CLR4_3_15b5bjxejscre.R.inc(191);
        __CLR4_3_15b5bjxejscre.R.inc(192);list = new LinkedList<Integer>();
    }finally{__CLR4_3_15b5bjxejscre.R.flushNeeded();}}
 
    @Test
    public void addTest() {__CLR4_3_15b5bjxejscre.R.globalSliceStart(getClass().getName(),193);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_3_1ygj8li5d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_3_15b5bjxejscre.R.rethrow($CLV_t2$);}finally{__CLR4_3_15b5bjxejscre.R.globalSliceEnd(getClass().getName(),"tutorials.LinkedListTest.addTest",__CLR4_3_1_TEST_NAME_SNIFFER.getTestName(),193,$CLV_p$,$CLV_t$);}}private void  __CLR4_3_1ygj8li5d(){try{__CLR4_3_15b5bjxejscre.R.inc(193);
        __CLR4_3_15b5bjxejscre.R.inc(194);list.add(5);
        __CLR4_3_15b5bjxejscre.R.inc(195);list.add(7);
        __CLR4_3_15b5bjxejscre.R.inc(196);int t = list.get(0);
        __CLR4_3_15b5bjxejscre.R.inc(197);int t2 = list.get(1);
        __CLR4_3_15b5bjxejscre.R.inc(198);assertEquals("The first value wasn't added.", 5, t);
        __CLR4_3_15b5bjxejscre.R.inc(199);assertEquals("The second value wasn't added.", 7, t2);
        __CLR4_3_15b5bjxejscre.R.inc(200);assertEquals("The list size didn't update properly.", 2, list.size());
    }finally{__CLR4_3_15b5bjxejscre.R.flushNeeded();}}

    @Test
    public void sizeTest() {__CLR4_3_15b5bjxejscre.R.globalSliceStart(getClass().getName(),201);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_3_1qkqj1i5l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_3_15b5bjxejscre.R.rethrow($CLV_t2$);}finally{__CLR4_3_15b5bjxejscre.R.globalSliceEnd(getClass().getName(),"tutorials.LinkedListTest.sizeTest",__CLR4_3_1_TEST_NAME_SNIFFER.getTestName(),201,$CLV_p$,$CLV_t$);}}private void  __CLR4_3_1qkqj1i5l(){try{__CLR4_3_15b5bjxejscre.R.inc(201);
        __CLR4_3_15b5bjxejscre.R.inc(202);assertEquals("The list's size at construction isn't 0.", 0, list.size());
        __CLR4_3_15b5bjxejscre.R.inc(203);list.add(7);
        __CLR4_3_15b5bjxejscre.R.inc(204);list.add(9);
        __CLR4_3_15b5bjxejscre.R.inc(205);list.add(12);
        __CLR4_3_15b5bjxejscre.R.inc(206);list.remove(7);
        __CLR4_3_15b5bjxejscre.R.inc(207);assertEquals("The list's size doesn't update properly.", 2, list.size());
        __CLR4_3_15b5bjxejscre.R.inc(208);LinkedList<Integer> list2 = new LinkedList<Integer>();
        __CLR4_3_15b5bjxejscre.R.inc(209);assertEquals("Creating a new list changes existing lists' sizes.", 2, list.size());
        __CLR4_3_15b5bjxejscre.R.inc(210);assertEquals("A new list's size isn't 0.", 0, list2.size());
    }finally{__CLR4_3_15b5bjxejscre.R.flushNeeded();}} 

    @Test
    public void removeTest() {__CLR4_3_15b5bjxejscre.R.globalSliceStart(getClass().getName(),211);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_3_1z6dhod5v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_3_15b5bjxejscre.R.rethrow($CLV_t2$);}finally{__CLR4_3_15b5bjxejscre.R.globalSliceEnd(getClass().getName(),"tutorials.LinkedListTest.removeTest",__CLR4_3_1_TEST_NAME_SNIFFER.getTestName(),211,$CLV_p$,$CLV_t$);}}private void  __CLR4_3_1z6dhod5v(){try{__CLR4_3_15b5bjxejscre.R.inc(211);
        __CLR4_3_15b5bjxejscre.R.inc(212);list.remove(4);
        __CLR4_3_15b5bjxejscre.R.inc(213);list.add(5);
        __CLR4_3_15b5bjxejscre.R.inc(214);list.add(7);
        __CLR4_3_15b5bjxejscre.R.inc(215);list.add(3);
        __CLR4_3_15b5bjxejscre.R.inc(216);list.add(7);
        __CLR4_3_15b5bjxejscre.R.inc(217);list.add(12);
        __CLR4_3_15b5bjxejscre.R.inc(218);list.remove(7);
        __CLR4_3_15b5bjxejscre.R.inc(219);boolean t = list.contains(7);
        __CLR4_3_15b5bjxejscre.R.inc(220);assertTrue("The first occurence of the element wasn't removed.", list.get(1) != 7);
        __CLR4_3_15b5bjxejscre.R.inc(221);assertEquals("The list size didn't update properly.", 4, list.size());
        __CLR4_3_15b5bjxejscre.R.inc(222);assertTrue("All occurences of the element were removed, not just the first.", t);
        __CLR4_3_15b5bjxejscre.R.inc(223);list.remove(9);
        __CLR4_3_15b5bjxejscre.R.inc(224);assertEquals("Attempting to remove an element that doesn't occur changes the list.", 4, list.size());
        __CLR4_3_15b5bjxejscre.R.inc(225);list.remove(5);
        __CLR4_3_15b5bjxejscre.R.inc(226);assertTrue("The first element of the list wasn't removed.", !list.contains(5));
        __CLR4_3_15b5bjxejscre.R.inc(227);assertEquals("The list size wasn't updated properly after removal of first element.", 3, list.size());
        __CLR4_3_15b5bjxejscre.R.inc(228);list.remove(12);
        __CLR4_3_15b5bjxejscre.R.inc(229);assertTrue("The first element of the list wasn't removed.", !list.contains(12));
        __CLR4_3_15b5bjxejscre.R.inc(230);assertEquals("The list size wasn't updated properly after removal of last element.", 2, list.size());
    }finally{__CLR4_3_15b5bjxejscre.R.flushNeeded();}}

    @Test
    public void removeAllTest() {__CLR4_3_15b5bjxejscre.R.globalSliceStart(getClass().getName(),231);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_3_1ii5n1m6f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_3_15b5bjxejscre.R.rethrow($CLV_t2$);}finally{__CLR4_3_15b5bjxejscre.R.globalSliceEnd(getClass().getName(),"tutorials.LinkedListTest.removeAllTest",__CLR4_3_1_TEST_NAME_SNIFFER.getTestName(),231,$CLV_p$,$CLV_t$);}}private void  __CLR4_3_1ii5n1m6f(){try{__CLR4_3_15b5bjxejscre.R.inc(231);
        __CLR4_3_15b5bjxejscre.R.inc(232);list.add(5);
        __CLR4_3_15b5bjxejscre.R.inc(233);list.add(7);
        __CLR4_3_15b5bjxejscre.R.inc(234);list.add(3);
        __CLR4_3_15b5bjxejscre.R.inc(235);list.add(7);
        __CLR4_3_15b5bjxejscre.R.inc(236);list.removeAll(7);
        __CLR4_3_15b5bjxejscre.R.inc(237);boolean t = list.contains(7);
        __CLR4_3_15b5bjxejscre.R.inc(238);assertTrue("Not all occurences of the element were removed.", !t);
        __CLR4_3_15b5bjxejscre.R.inc(239);assertEquals("The list's size wasn't updated properly.", 2, list.size());
    }finally{__CLR4_3_15b5bjxejscre.R.flushNeeded();}}

    @Test(expected = IndexOutOfBoundsException.class)
    public void getExceptTest() {__CLR4_3_15b5bjxejscre.R.globalSliceStart(getClass().getName(),240);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_3_1bejons6o();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,103,101,116,69,120,99,101,112,116,84,101,115,116,58,32,91,73,110,100,101,120,79,117,116,79,102,66,111,117,110,100,115,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IndexOutOfBoundsException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_3_15b5bjxejscre.R.rethrow($CLV_t2$);}finally{__CLR4_3_15b5bjxejscre.R.globalSliceEnd(getClass().getName(),"tutorials.LinkedListTest.getExceptTest",__CLR4_3_1_TEST_NAME_SNIFFER.getTestName(),240,$CLV_p$,$CLV_t$);}}private void  __CLR4_3_1bejons6o(){try{__CLR4_3_15b5bjxejscre.R.inc(240);
        __CLR4_3_15b5bjxejscre.R.inc(241);list.add(5);
        __CLR4_3_15b5bjxejscre.R.inc(242);list.add(7);
        __CLR4_3_15b5bjxejscre.R.inc(243);list.add(3);
        __CLR4_3_15b5bjxejscre.R.inc(244);list.get(3);
    }finally{__CLR4_3_15b5bjxejscre.R.flushNeeded();}}

    @Test
    public void getTest() {__CLR4_3_15b5bjxejscre.R.globalSliceStart(getClass().getName(),245);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_3_1h0mab56t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_3_15b5bjxejscre.R.rethrow($CLV_t2$);}finally{__CLR4_3_15b5bjxejscre.R.globalSliceEnd(getClass().getName(),"tutorials.LinkedListTest.getTest",__CLR4_3_1_TEST_NAME_SNIFFER.getTestName(),245,$CLV_p$,$CLV_t$);}}private void  __CLR4_3_1h0mab56t(){try{__CLR4_3_15b5bjxejscre.R.inc(245);
        __CLR4_3_15b5bjxejscre.R.inc(246);list.add(5);
        __CLR4_3_15b5bjxejscre.R.inc(247);list.add(7);
        __CLR4_3_15b5bjxejscre.R.inc(248);list.add(3);
        __CLR4_3_15b5bjxejscre.R.inc(249);int t0 = list.get(0);
        __CLR4_3_15b5bjxejscre.R.inc(250);int t1 = list.get(1);
        __CLR4_3_15b5bjxejscre.R.inc(251);int t2 = list.get(2);
        __CLR4_3_15b5bjxejscre.R.inc(252);assertEquals("The first value wasn't properly returned.", 5, t0);
        __CLR4_3_15b5bjxejscre.R.inc(253);assertEquals("The second value wasn't properly returned.", 7, t1);
        __CLR4_3_15b5bjxejscre.R.inc(254);assertEquals("The last value wasn't properly returned.", 3, t2);
    }finally{__CLR4_3_15b5bjxejscre.R.flushNeeded();}}

    @Test(expected = IndexOutOfBoundsException.class)
    public void setExceptTest() {__CLR4_3_15b5bjxejscre.R.globalSliceStart(getClass().getName(),255);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_3_1x4cky473();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,115,101,116,69,120,99,101,112,116,84,101,115,116,58,32,91,73,110,100,101,120,79,117,116,79,102,66,111,117,110,100,115,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IndexOutOfBoundsException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_3_15b5bjxejscre.R.rethrow($CLV_t2$);}finally{__CLR4_3_15b5bjxejscre.R.globalSliceEnd(getClass().getName(),"tutorials.LinkedListTest.setExceptTest",__CLR4_3_1_TEST_NAME_SNIFFER.getTestName(),255,$CLV_p$,$CLV_t$);}}private void  __CLR4_3_1x4cky473(){try{__CLR4_3_15b5bjxejscre.R.inc(255);
        __CLR4_3_15b5bjxejscre.R.inc(256);list.add(5);
        __CLR4_3_15b5bjxejscre.R.inc(257);list.add(7);
        __CLR4_3_15b5bjxejscre.R.inc(258);list.add(3);
        __CLR4_3_15b5bjxejscre.R.inc(259);list.set(3, 7);
    }finally{__CLR4_3_15b5bjxejscre.R.flushNeeded();}}

    @Test
    public void setTest() {__CLR4_3_15b5bjxejscre.R.globalSliceStart(getClass().getName(),260);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_3_1d9rw0r78();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_3_15b5bjxejscre.R.rethrow($CLV_t2$);}finally{__CLR4_3_15b5bjxejscre.R.globalSliceEnd(getClass().getName(),"tutorials.LinkedListTest.setTest",__CLR4_3_1_TEST_NAME_SNIFFER.getTestName(),260,$CLV_p$,$CLV_t$);}}private void  __CLR4_3_1d9rw0r78(){try{__CLR4_3_15b5bjxejscre.R.inc(260);
        __CLR4_3_15b5bjxejscre.R.inc(261);list.add(5);
        __CLR4_3_15b5bjxejscre.R.inc(262);list.add(7);
        __CLR4_3_15b5bjxejscre.R.inc(263);list.add(3);
        __CLR4_3_15b5bjxejscre.R.inc(264);list.set(1, 9);
        __CLR4_3_15b5bjxejscre.R.inc(265);assertEquals("The list size changed although it shouldn't have.", 3, list.size());
        __CLR4_3_15b5bjxejscre.R.inc(266);assertEquals("The element wasn't properly modified.", 1, list.indexOf(9));
    }finally{__CLR4_3_15b5bjxejscre.R.flushNeeded();}}

    @Test
    public void indexOfTest() {__CLR4_3_15b5bjxejscre.R.globalSliceStart(getClass().getName(),267);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_3_19bvli67f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_3_15b5bjxejscre.R.rethrow($CLV_t2$);}finally{__CLR4_3_15b5bjxejscre.R.globalSliceEnd(getClass().getName(),"tutorials.LinkedListTest.indexOfTest",__CLR4_3_1_TEST_NAME_SNIFFER.getTestName(),267,$CLV_p$,$CLV_t$);}}private void  __CLR4_3_19bvli67f(){try{__CLR4_3_15b5bjxejscre.R.inc(267);
        __CLR4_3_15b5bjxejscre.R.inc(268);list.add(5);
        __CLR4_3_15b5bjxejscre.R.inc(269);list.add(7);
        __CLR4_3_15b5bjxejscre.R.inc(270);list.add(3);
        __CLR4_3_15b5bjxejscre.R.inc(271);assertEquals("The first element wasn't found.", 0, list.indexOf(5));
        __CLR4_3_15b5bjxejscre.R.inc(272);assertEquals("The last element wasn't found.", 2, list.indexOf(3));
        __CLR4_3_15b5bjxejscre.R.inc(273);assertEquals("An element that isn't in the list was found.", -1, list.indexOf(9));
    }finally{__CLR4_3_15b5bjxejscre.R.flushNeeded();}}

    @Test
    public void containsTest() {__CLR4_3_15b5bjxejscre.R.globalSliceStart(getClass().getName(),274);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_3_1t1mb207m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_3_15b5bjxejscre.R.rethrow($CLV_t2$);}finally{__CLR4_3_15b5bjxejscre.R.globalSliceEnd(getClass().getName(),"tutorials.LinkedListTest.containsTest",__CLR4_3_1_TEST_NAME_SNIFFER.getTestName(),274,$CLV_p$,$CLV_t$);}}private void  __CLR4_3_1t1mb207m(){try{__CLR4_3_15b5bjxejscre.R.inc(274);
        __CLR4_3_15b5bjxejscre.R.inc(275);assertTrue("An empty list returned that it contained something.", !list.contains(9));
        __CLR4_3_15b5bjxejscre.R.inc(276);list.add(9);
        __CLR4_3_15b5bjxejscre.R.inc(277);list.add(7);
        __CLR4_3_15b5bjxejscre.R.inc(278);list.add(43);
        __CLR4_3_15b5bjxejscre.R.inc(279);assertTrue("An element that occurs in the list wasn't found.", list.contains(7));
        __CLR4_3_15b5bjxejscre.R.inc(280);assertTrue("An element that doesn't exist in the list was found.", !list.contains(4));
    }finally{__CLR4_3_15b5bjxejscre.R.flushNeeded();}}

    @Test
    public void isEmptyTest() {__CLR4_3_15b5bjxejscre.R.globalSliceStart(getClass().getName(),281);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_3_1uqn1987t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_3_15b5bjxejscre.R.rethrow($CLV_t2$);}finally{__CLR4_3_15b5bjxejscre.R.globalSliceEnd(getClass().getName(),"tutorials.LinkedListTest.isEmptyTest",__CLR4_3_1_TEST_NAME_SNIFFER.getTestName(),281,$CLV_p$,$CLV_t$);}}private void  __CLR4_3_1uqn1987t(){try{__CLR4_3_15b5bjxejscre.R.inc(281);
        __CLR4_3_15b5bjxejscre.R.inc(282);assertTrue("An empty list was found not empty.", list.isEmpty());
        __CLR4_3_15b5bjxejscre.R.inc(283);list.add(5);
        __CLR4_3_15b5bjxejscre.R.inc(284);assertTrue("A list with one element returned that it was empty.", !list.isEmpty());
    }finally{__CLR4_3_15b5bjxejscre.R.flushNeeded();}}

}