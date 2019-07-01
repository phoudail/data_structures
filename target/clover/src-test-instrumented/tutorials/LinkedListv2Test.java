/* $$ This file has been instrumented by Clover 4.3.1#20180921211537623 $$ */package tutorials;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;



/**
 * Unit test for a second implementation of Linked Lists.
 */
public class LinkedListv2Test {static class __CLR4_3_1b2b2jxkaws7x{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_3_1();if(20180921211537623L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.3.1#20180921211537623,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0070\u0068\u006f\u0075\u0064\u0061\u0069\u006c\u002f\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1561980584122L,8589935092L,492,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_3_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    LinkedListv2<Integer> list;

    @Before
    public void init() {try{__CLR4_3_1b2b2jxkaws7x.R.inc(398);
        __CLR4_3_1b2b2jxkaws7x.R.inc(399);list = new LinkedListv2<Integer>();
    }finally{__CLR4_3_1b2b2jxkaws7x.R.flushNeeded();}}
 
    @Test
    public void addTest() {__CLR4_3_1b2b2jxkaws7x.R.globalSliceStart(getClass().getName(),400);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_3_1ygj8lib4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_3_1b2b2jxkaws7x.R.rethrow($CLV_t2$);}finally{__CLR4_3_1b2b2jxkaws7x.R.globalSliceEnd(getClass().getName(),"tutorials.LinkedListv2Test.addTest",__CLR4_3_1_TEST_NAME_SNIFFER.getTestName(),400,$CLV_p$,$CLV_t$);}}private void  __CLR4_3_1ygj8lib4(){try{__CLR4_3_1b2b2jxkaws7x.R.inc(400);
        __CLR4_3_1b2b2jxkaws7x.R.inc(401);list.add(5);
        __CLR4_3_1b2b2jxkaws7x.R.inc(402);list.add(7);
        __CLR4_3_1b2b2jxkaws7x.R.inc(403);int t = list.get(0);
        __CLR4_3_1b2b2jxkaws7x.R.inc(404);int t2 = list.get(1);
        __CLR4_3_1b2b2jxkaws7x.R.inc(405);assertEquals("The first value wasn't added.", 5, t);
        __CLR4_3_1b2b2jxkaws7x.R.inc(406);assertEquals("The second value wasn't added.", 7, t2);
        __CLR4_3_1b2b2jxkaws7x.R.inc(407);assertEquals("The list size didn't update properly.", 2, list.size());
    }finally{__CLR4_3_1b2b2jxkaws7x.R.flushNeeded();}}

    @Test
    public void sizeTest() {__CLR4_3_1b2b2jxkaws7x.R.globalSliceStart(getClass().getName(),408);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_3_1qkqj1ibc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_3_1b2b2jxkaws7x.R.rethrow($CLV_t2$);}finally{__CLR4_3_1b2b2jxkaws7x.R.globalSliceEnd(getClass().getName(),"tutorials.LinkedListv2Test.sizeTest",__CLR4_3_1_TEST_NAME_SNIFFER.getTestName(),408,$CLV_p$,$CLV_t$);}}private void  __CLR4_3_1qkqj1ibc(){try{__CLR4_3_1b2b2jxkaws7x.R.inc(408);
        __CLR4_3_1b2b2jxkaws7x.R.inc(409);assertEquals("The list's size at construction isn't 0.", 0, list.size());
        __CLR4_3_1b2b2jxkaws7x.R.inc(410);list.add(7);
        __CLR4_3_1b2b2jxkaws7x.R.inc(411);list.add(9);
        __CLR4_3_1b2b2jxkaws7x.R.inc(412);list.add(12);
        __CLR4_3_1b2b2jxkaws7x.R.inc(413);list.remove(7);
        __CLR4_3_1b2b2jxkaws7x.R.inc(414);assertEquals("The list's size doesn't update properly.", 2, list.size());
        __CLR4_3_1b2b2jxkaws7x.R.inc(415);LinkedListv2<Integer> list2 = new LinkedListv2<Integer>();
        __CLR4_3_1b2b2jxkaws7x.R.inc(416);assertEquals("Creating a new list changes existing lists' sizes.", 2, list.size());
        __CLR4_3_1b2b2jxkaws7x.R.inc(417);assertEquals("A new list's size isn't 0.", 0, list2.size());
    }finally{__CLR4_3_1b2b2jxkaws7x.R.flushNeeded();}} 

    @Test
    public void removeTest() {__CLR4_3_1b2b2jxkaws7x.R.globalSliceStart(getClass().getName(),418);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_3_1z6dhodbm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_3_1b2b2jxkaws7x.R.rethrow($CLV_t2$);}finally{__CLR4_3_1b2b2jxkaws7x.R.globalSliceEnd(getClass().getName(),"tutorials.LinkedListv2Test.removeTest",__CLR4_3_1_TEST_NAME_SNIFFER.getTestName(),418,$CLV_p$,$CLV_t$);}}private void  __CLR4_3_1z6dhodbm(){try{__CLR4_3_1b2b2jxkaws7x.R.inc(418);
        __CLR4_3_1b2b2jxkaws7x.R.inc(419);list.remove(4);
        __CLR4_3_1b2b2jxkaws7x.R.inc(420);list.add(5);
        __CLR4_3_1b2b2jxkaws7x.R.inc(421);list.add(7);
        __CLR4_3_1b2b2jxkaws7x.R.inc(422);list.add(3);
        __CLR4_3_1b2b2jxkaws7x.R.inc(423);list.add(7);
        __CLR4_3_1b2b2jxkaws7x.R.inc(424);list.add(12);
        __CLR4_3_1b2b2jxkaws7x.R.inc(425);list.remove(7);
        __CLR4_3_1b2b2jxkaws7x.R.inc(426);boolean t = list.contains(7);
        __CLR4_3_1b2b2jxkaws7x.R.inc(427);assertTrue("The first occurence of the element wasn't removed.", list.get(1) != 7);
        __CLR4_3_1b2b2jxkaws7x.R.inc(428);assertEquals("The list size didn't update properly.", 4, list.size());
        __CLR4_3_1b2b2jxkaws7x.R.inc(429);assertTrue("All occurences of the element were removed, not just the first.", t);
        __CLR4_3_1b2b2jxkaws7x.R.inc(430);list.remove(9);
        __CLR4_3_1b2b2jxkaws7x.R.inc(431);assertEquals("Attempting to remove an element that doesn't occur changes the list.", 4, list.size());
        __CLR4_3_1b2b2jxkaws7x.R.inc(432);list.remove(5);
        __CLR4_3_1b2b2jxkaws7x.R.inc(433);assertTrue("The first element of the list wasn't removed.", !list.contains(5));
        __CLR4_3_1b2b2jxkaws7x.R.inc(434);assertEquals("The list size wasn't updated properly after removal of first element.", 3, list.size());
        __CLR4_3_1b2b2jxkaws7x.R.inc(435);list.remove(12);
        __CLR4_3_1b2b2jxkaws7x.R.inc(436);assertTrue("The first element of the list wasn't removed.", !list.contains(12));
        __CLR4_3_1b2b2jxkaws7x.R.inc(437);assertEquals("The list size wasn't updated properly after removal of last element.", 2, list.size());
    }finally{__CLR4_3_1b2b2jxkaws7x.R.flushNeeded();}}

    @Test
    public void removeAllTest() {__CLR4_3_1b2b2jxkaws7x.R.globalSliceStart(getClass().getName(),438);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_3_1ii5n1mc6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_3_1b2b2jxkaws7x.R.rethrow($CLV_t2$);}finally{__CLR4_3_1b2b2jxkaws7x.R.globalSliceEnd(getClass().getName(),"tutorials.LinkedListv2Test.removeAllTest",__CLR4_3_1_TEST_NAME_SNIFFER.getTestName(),438,$CLV_p$,$CLV_t$);}}private void  __CLR4_3_1ii5n1mc6(){try{__CLR4_3_1b2b2jxkaws7x.R.inc(438);
        __CLR4_3_1b2b2jxkaws7x.R.inc(439);list.add(5);
        __CLR4_3_1b2b2jxkaws7x.R.inc(440);list.add(7);
        __CLR4_3_1b2b2jxkaws7x.R.inc(441);list.add(3);
        __CLR4_3_1b2b2jxkaws7x.R.inc(442);list.add(7);
        __CLR4_3_1b2b2jxkaws7x.R.inc(443);list.removeAll(7);
        __CLR4_3_1b2b2jxkaws7x.R.inc(444);boolean t = list.contains(7);
        __CLR4_3_1b2b2jxkaws7x.R.inc(445);assertTrue("Not all occurences of the element were removed.", !t);
        __CLR4_3_1b2b2jxkaws7x.R.inc(446);assertEquals("The list's size wasn't updated properly.", 2, list.size());
    }finally{__CLR4_3_1b2b2jxkaws7x.R.flushNeeded();}}

    @Test(expected = IndexOutOfBoundsException.class)
    public void getExceptTest() {__CLR4_3_1b2b2jxkaws7x.R.globalSliceStart(getClass().getName(),447);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_3_1bejonscf();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,103,101,116,69,120,99,101,112,116,84,101,115,116,58,32,91,73,110,100,101,120,79,117,116,79,102,66,111,117,110,100,115,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IndexOutOfBoundsException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_3_1b2b2jxkaws7x.R.rethrow($CLV_t2$);}finally{__CLR4_3_1b2b2jxkaws7x.R.globalSliceEnd(getClass().getName(),"tutorials.LinkedListv2Test.getExceptTest",__CLR4_3_1_TEST_NAME_SNIFFER.getTestName(),447,$CLV_p$,$CLV_t$);}}private void  __CLR4_3_1bejonscf(){try{__CLR4_3_1b2b2jxkaws7x.R.inc(447);
        __CLR4_3_1b2b2jxkaws7x.R.inc(448);list.add(5);
        __CLR4_3_1b2b2jxkaws7x.R.inc(449);list.add(7);
        __CLR4_3_1b2b2jxkaws7x.R.inc(450);list.add(3);
        __CLR4_3_1b2b2jxkaws7x.R.inc(451);list.get(3);
    }finally{__CLR4_3_1b2b2jxkaws7x.R.flushNeeded();}}

    @Test
    public void getTest() {__CLR4_3_1b2b2jxkaws7x.R.globalSliceStart(getClass().getName(),452);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_3_1h0mab5ck();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_3_1b2b2jxkaws7x.R.rethrow($CLV_t2$);}finally{__CLR4_3_1b2b2jxkaws7x.R.globalSliceEnd(getClass().getName(),"tutorials.LinkedListv2Test.getTest",__CLR4_3_1_TEST_NAME_SNIFFER.getTestName(),452,$CLV_p$,$CLV_t$);}}private void  __CLR4_3_1h0mab5ck(){try{__CLR4_3_1b2b2jxkaws7x.R.inc(452);
        __CLR4_3_1b2b2jxkaws7x.R.inc(453);list.add(5);
        __CLR4_3_1b2b2jxkaws7x.R.inc(454);list.add(7);
        __CLR4_3_1b2b2jxkaws7x.R.inc(455);list.add(3);
        __CLR4_3_1b2b2jxkaws7x.R.inc(456);int t0 = list.get(0);
        __CLR4_3_1b2b2jxkaws7x.R.inc(457);int t1 = list.get(1);
        __CLR4_3_1b2b2jxkaws7x.R.inc(458);int t2 = list.get(2);
        __CLR4_3_1b2b2jxkaws7x.R.inc(459);assertEquals("The first value wasn't properly returned.", 5, t0);
        __CLR4_3_1b2b2jxkaws7x.R.inc(460);assertEquals("The second value wasn't properly returned.", 7, t1);
        __CLR4_3_1b2b2jxkaws7x.R.inc(461);assertEquals("The last value wasn't properly returned.", 3, t2);
    }finally{__CLR4_3_1b2b2jxkaws7x.R.flushNeeded();}}

    @Test(expected = IndexOutOfBoundsException.class)
    public void setExceptTest() {__CLR4_3_1b2b2jxkaws7x.R.globalSliceStart(getClass().getName(),462);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_3_1x4cky4cu();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,115,101,116,69,120,99,101,112,116,84,101,115,116,58,32,91,73,110,100,101,120,79,117,116,79,102,66,111,117,110,100,115,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IndexOutOfBoundsException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_3_1b2b2jxkaws7x.R.rethrow($CLV_t2$);}finally{__CLR4_3_1b2b2jxkaws7x.R.globalSliceEnd(getClass().getName(),"tutorials.LinkedListv2Test.setExceptTest",__CLR4_3_1_TEST_NAME_SNIFFER.getTestName(),462,$CLV_p$,$CLV_t$);}}private void  __CLR4_3_1x4cky4cu(){try{__CLR4_3_1b2b2jxkaws7x.R.inc(462);
        __CLR4_3_1b2b2jxkaws7x.R.inc(463);list.add(5);
        __CLR4_3_1b2b2jxkaws7x.R.inc(464);list.add(7);
        __CLR4_3_1b2b2jxkaws7x.R.inc(465);list.add(3);
        __CLR4_3_1b2b2jxkaws7x.R.inc(466);list.set(3, 7);
    }finally{__CLR4_3_1b2b2jxkaws7x.R.flushNeeded();}}

    @Test
    public void setTest() {__CLR4_3_1b2b2jxkaws7x.R.globalSliceStart(getClass().getName(),467);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_3_1d9rw0rcz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_3_1b2b2jxkaws7x.R.rethrow($CLV_t2$);}finally{__CLR4_3_1b2b2jxkaws7x.R.globalSliceEnd(getClass().getName(),"tutorials.LinkedListv2Test.setTest",__CLR4_3_1_TEST_NAME_SNIFFER.getTestName(),467,$CLV_p$,$CLV_t$);}}private void  __CLR4_3_1d9rw0rcz(){try{__CLR4_3_1b2b2jxkaws7x.R.inc(467);
        __CLR4_3_1b2b2jxkaws7x.R.inc(468);list.add(5);
        __CLR4_3_1b2b2jxkaws7x.R.inc(469);list.add(7);
        __CLR4_3_1b2b2jxkaws7x.R.inc(470);list.add(3);
        __CLR4_3_1b2b2jxkaws7x.R.inc(471);list.set(1, 9);
        __CLR4_3_1b2b2jxkaws7x.R.inc(472);assertEquals("The list size changed although it shouldn't have.", 3, list.size());
        __CLR4_3_1b2b2jxkaws7x.R.inc(473);assertEquals("The element wasn't properly modified.", 1, list.indexOf(9));
    }finally{__CLR4_3_1b2b2jxkaws7x.R.flushNeeded();}}

    @Test
    public void indexOfTest() {__CLR4_3_1b2b2jxkaws7x.R.globalSliceStart(getClass().getName(),474);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_3_19bvli6d6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_3_1b2b2jxkaws7x.R.rethrow($CLV_t2$);}finally{__CLR4_3_1b2b2jxkaws7x.R.globalSliceEnd(getClass().getName(),"tutorials.LinkedListv2Test.indexOfTest",__CLR4_3_1_TEST_NAME_SNIFFER.getTestName(),474,$CLV_p$,$CLV_t$);}}private void  __CLR4_3_19bvli6d6(){try{__CLR4_3_1b2b2jxkaws7x.R.inc(474);
        __CLR4_3_1b2b2jxkaws7x.R.inc(475);list.add(5);
        __CLR4_3_1b2b2jxkaws7x.R.inc(476);list.add(7);
        __CLR4_3_1b2b2jxkaws7x.R.inc(477);list.add(3);
        __CLR4_3_1b2b2jxkaws7x.R.inc(478);assertEquals("The first element wasn't found.", 0, list.indexOf(5));
        __CLR4_3_1b2b2jxkaws7x.R.inc(479);assertEquals("The last element wasn't found.", 2, list.indexOf(3));
        __CLR4_3_1b2b2jxkaws7x.R.inc(480);assertEquals("An element that isn't in the list was found.", -1, list.indexOf(9));
    }finally{__CLR4_3_1b2b2jxkaws7x.R.flushNeeded();}}

    @Test
    public void containsTest() {__CLR4_3_1b2b2jxkaws7x.R.globalSliceStart(getClass().getName(),481);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_3_1t1mb20dd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_3_1b2b2jxkaws7x.R.rethrow($CLV_t2$);}finally{__CLR4_3_1b2b2jxkaws7x.R.globalSliceEnd(getClass().getName(),"tutorials.LinkedListv2Test.containsTest",__CLR4_3_1_TEST_NAME_SNIFFER.getTestName(),481,$CLV_p$,$CLV_t$);}}private void  __CLR4_3_1t1mb20dd(){try{__CLR4_3_1b2b2jxkaws7x.R.inc(481);
        __CLR4_3_1b2b2jxkaws7x.R.inc(482);assertTrue("An empty list returned that it contained something.", !list.contains(9));
        __CLR4_3_1b2b2jxkaws7x.R.inc(483);list.add(9);
        __CLR4_3_1b2b2jxkaws7x.R.inc(484);list.add(7);
        __CLR4_3_1b2b2jxkaws7x.R.inc(485);list.add(43);
        __CLR4_3_1b2b2jxkaws7x.R.inc(486);assertTrue("An element that occurs in the list wasn't found.", list.contains(7));
        __CLR4_3_1b2b2jxkaws7x.R.inc(487);assertTrue("An element that doesn't exist in the list was found.", !list.contains(4));
    }finally{__CLR4_3_1b2b2jxkaws7x.R.flushNeeded();}}

    @Test
    public void isEmptyTest() {__CLR4_3_1b2b2jxkaws7x.R.globalSliceStart(getClass().getName(),488);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_3_1uqn198dk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_3_1b2b2jxkaws7x.R.rethrow($CLV_t2$);}finally{__CLR4_3_1b2b2jxkaws7x.R.globalSliceEnd(getClass().getName(),"tutorials.LinkedListv2Test.isEmptyTest",__CLR4_3_1_TEST_NAME_SNIFFER.getTestName(),488,$CLV_p$,$CLV_t$);}}private void  __CLR4_3_1uqn198dk(){try{__CLR4_3_1b2b2jxkaws7x.R.inc(488);
        __CLR4_3_1b2b2jxkaws7x.R.inc(489);assertTrue("An empty list was found not empty.", list.isEmpty());
        __CLR4_3_1b2b2jxkaws7x.R.inc(490);list.add(5);
        __CLR4_3_1b2b2jxkaws7x.R.inc(491);assertTrue("A list with one element returned that it was empty.", !list.isEmpty());
    }finally{__CLR4_3_1b2b2jxkaws7x.R.flushNeeded();}}

}