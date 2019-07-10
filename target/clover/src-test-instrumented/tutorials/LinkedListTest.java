/* $$ This file has been instrumented by Clover 4.3.1#20180921211537623 $$ */package tutorials;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;



/**
 * Unit test for implementation of Linked Lists.
 */
public class LinkedListTest {static class __CLR4_3_1c7c7jxvvfl5b{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_3_1();if(20180921211537623L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.3.1#20180921211537623,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0070\u0068\u006f\u0075\u0064\u0061\u0069\u006c\u002f\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1562680181657L,8589935092L,533,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_3_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    LinkedList<Integer> list;

    @Before
    public void init() {try{__CLR4_3_1c7c7jxvvfl5b.R.inc(439);
        __CLR4_3_1c7c7jxvvfl5b.R.inc(440);list = new LinkedList<Integer>();
    }finally{__CLR4_3_1c7c7jxvvfl5b.R.flushNeeded();}}
 
    @Test
    public void addTest() {__CLR4_3_1c7c7jxvvfl5b.R.globalSliceStart(getClass().getName(),441);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_3_1ygj8lic9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_3_1c7c7jxvvfl5b.R.rethrow($CLV_t2$);}finally{__CLR4_3_1c7c7jxvvfl5b.R.globalSliceEnd(getClass().getName(),"tutorials.LinkedListTest.addTest",__CLR4_3_1_TEST_NAME_SNIFFER.getTestName(),441,$CLV_p$,$CLV_t$);}}private void  __CLR4_3_1ygj8lic9(){try{__CLR4_3_1c7c7jxvvfl5b.R.inc(441);
        __CLR4_3_1c7c7jxvvfl5b.R.inc(442);list.add(5);
        __CLR4_3_1c7c7jxvvfl5b.R.inc(443);list.add(7);
        __CLR4_3_1c7c7jxvvfl5b.R.inc(444);int t = list.get(0);
        __CLR4_3_1c7c7jxvvfl5b.R.inc(445);int t2 = list.get(1);
        __CLR4_3_1c7c7jxvvfl5b.R.inc(446);assertEquals("The first value wasn't added.", 5, t);
        __CLR4_3_1c7c7jxvvfl5b.R.inc(447);assertEquals("The second value wasn't added.", 7, t2);
        __CLR4_3_1c7c7jxvvfl5b.R.inc(448);assertEquals("The list size didn't update properly.", 2, list.size());
    }finally{__CLR4_3_1c7c7jxvvfl5b.R.flushNeeded();}}

    @Test
    public void sizeTest() {__CLR4_3_1c7c7jxvvfl5b.R.globalSliceStart(getClass().getName(),449);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_3_1qkqj1ich();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_3_1c7c7jxvvfl5b.R.rethrow($CLV_t2$);}finally{__CLR4_3_1c7c7jxvvfl5b.R.globalSliceEnd(getClass().getName(),"tutorials.LinkedListTest.sizeTest",__CLR4_3_1_TEST_NAME_SNIFFER.getTestName(),449,$CLV_p$,$CLV_t$);}}private void  __CLR4_3_1qkqj1ich(){try{__CLR4_3_1c7c7jxvvfl5b.R.inc(449);
        __CLR4_3_1c7c7jxvvfl5b.R.inc(450);assertEquals("The list's size at construction isn't 0.", 0, list.size());
        __CLR4_3_1c7c7jxvvfl5b.R.inc(451);list.add(7);
        __CLR4_3_1c7c7jxvvfl5b.R.inc(452);list.add(9);
        __CLR4_3_1c7c7jxvvfl5b.R.inc(453);list.add(12);
        __CLR4_3_1c7c7jxvvfl5b.R.inc(454);list.remove(7);
        __CLR4_3_1c7c7jxvvfl5b.R.inc(455);assertEquals("The list's size doesn't update properly.", 2, list.size());
        __CLR4_3_1c7c7jxvvfl5b.R.inc(456);LinkedList<Integer> list2 = new LinkedList<Integer>();
        __CLR4_3_1c7c7jxvvfl5b.R.inc(457);assertEquals("Creating a new list changes existing lists' sizes.", 2, list.size());
        __CLR4_3_1c7c7jxvvfl5b.R.inc(458);assertEquals("A new list's size isn't 0.", 0, list2.size());
    }finally{__CLR4_3_1c7c7jxvvfl5b.R.flushNeeded();}} 

    @Test
    public void removeTest() {__CLR4_3_1c7c7jxvvfl5b.R.globalSliceStart(getClass().getName(),459);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_3_1z6dhodcr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_3_1c7c7jxvvfl5b.R.rethrow($CLV_t2$);}finally{__CLR4_3_1c7c7jxvvfl5b.R.globalSliceEnd(getClass().getName(),"tutorials.LinkedListTest.removeTest",__CLR4_3_1_TEST_NAME_SNIFFER.getTestName(),459,$CLV_p$,$CLV_t$);}}private void  __CLR4_3_1z6dhodcr(){try{__CLR4_3_1c7c7jxvvfl5b.R.inc(459);
        __CLR4_3_1c7c7jxvvfl5b.R.inc(460);list.remove(4);
        __CLR4_3_1c7c7jxvvfl5b.R.inc(461);list.add(5);
        __CLR4_3_1c7c7jxvvfl5b.R.inc(462);list.add(7);
        __CLR4_3_1c7c7jxvvfl5b.R.inc(463);list.add(3);
        __CLR4_3_1c7c7jxvvfl5b.R.inc(464);list.add(7);
        __CLR4_3_1c7c7jxvvfl5b.R.inc(465);list.add(12);
        __CLR4_3_1c7c7jxvvfl5b.R.inc(466);list.remove(7);
        __CLR4_3_1c7c7jxvvfl5b.R.inc(467);boolean t = list.contains(7);
        __CLR4_3_1c7c7jxvvfl5b.R.inc(468);assertTrue("The first occurence of the element wasn't removed.", list.get(1) != 7);
        __CLR4_3_1c7c7jxvvfl5b.R.inc(469);assertEquals("The list size didn't update properly.", 4, list.size());
        __CLR4_3_1c7c7jxvvfl5b.R.inc(470);assertTrue("All occurences of the element were removed, not just the first.", t);
        __CLR4_3_1c7c7jxvvfl5b.R.inc(471);list.remove(9);
        __CLR4_3_1c7c7jxvvfl5b.R.inc(472);assertEquals("Attempting to remove an element that doesn't occur changes the list.", 4, list.size());
        __CLR4_3_1c7c7jxvvfl5b.R.inc(473);list.remove(5);
        __CLR4_3_1c7c7jxvvfl5b.R.inc(474);assertTrue("The first element of the list wasn't removed.", !list.contains(5));
        __CLR4_3_1c7c7jxvvfl5b.R.inc(475);assertEquals("The list size wasn't updated properly after removal of first element.", 3, list.size());
        __CLR4_3_1c7c7jxvvfl5b.R.inc(476);list.remove(12);
        __CLR4_3_1c7c7jxvvfl5b.R.inc(477);assertTrue("The first element of the list wasn't removed.", !list.contains(12));
        __CLR4_3_1c7c7jxvvfl5b.R.inc(478);assertEquals("The list size wasn't updated properly after removal of last element.", 2, list.size());
    }finally{__CLR4_3_1c7c7jxvvfl5b.R.flushNeeded();}}

    @Test
    public void removeAllTest() {__CLR4_3_1c7c7jxvvfl5b.R.globalSliceStart(getClass().getName(),479);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_3_1ii5n1mdb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_3_1c7c7jxvvfl5b.R.rethrow($CLV_t2$);}finally{__CLR4_3_1c7c7jxvvfl5b.R.globalSliceEnd(getClass().getName(),"tutorials.LinkedListTest.removeAllTest",__CLR4_3_1_TEST_NAME_SNIFFER.getTestName(),479,$CLV_p$,$CLV_t$);}}private void  __CLR4_3_1ii5n1mdb(){try{__CLR4_3_1c7c7jxvvfl5b.R.inc(479);
        __CLR4_3_1c7c7jxvvfl5b.R.inc(480);list.add(5);
        __CLR4_3_1c7c7jxvvfl5b.R.inc(481);list.add(7);
        __CLR4_3_1c7c7jxvvfl5b.R.inc(482);list.add(3);
        __CLR4_3_1c7c7jxvvfl5b.R.inc(483);list.add(7);
        __CLR4_3_1c7c7jxvvfl5b.R.inc(484);list.removeAll(7);
        __CLR4_3_1c7c7jxvvfl5b.R.inc(485);boolean t = list.contains(7);
        __CLR4_3_1c7c7jxvvfl5b.R.inc(486);assertTrue("Not all occurences of the element were removed.", !t);
        __CLR4_3_1c7c7jxvvfl5b.R.inc(487);assertEquals("The list's size wasn't updated properly.", 2, list.size());
    }finally{__CLR4_3_1c7c7jxvvfl5b.R.flushNeeded();}}

    @Test(expected = IndexOutOfBoundsException.class)
    public void getExceptTest() {__CLR4_3_1c7c7jxvvfl5b.R.globalSliceStart(getClass().getName(),488);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_3_1bejonsdk();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,103,101,116,69,120,99,101,112,116,84,101,115,116,58,32,91,73,110,100,101,120,79,117,116,79,102,66,111,117,110,100,115,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IndexOutOfBoundsException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_3_1c7c7jxvvfl5b.R.rethrow($CLV_t2$);}finally{__CLR4_3_1c7c7jxvvfl5b.R.globalSliceEnd(getClass().getName(),"tutorials.LinkedListTest.getExceptTest",__CLR4_3_1_TEST_NAME_SNIFFER.getTestName(),488,$CLV_p$,$CLV_t$);}}private void  __CLR4_3_1bejonsdk(){try{__CLR4_3_1c7c7jxvvfl5b.R.inc(488);
        __CLR4_3_1c7c7jxvvfl5b.R.inc(489);list.add(5);
        __CLR4_3_1c7c7jxvvfl5b.R.inc(490);list.add(7);
        __CLR4_3_1c7c7jxvvfl5b.R.inc(491);list.add(3);
        __CLR4_3_1c7c7jxvvfl5b.R.inc(492);list.get(3);
    }finally{__CLR4_3_1c7c7jxvvfl5b.R.flushNeeded();}}

    @Test
    public void getTest() {__CLR4_3_1c7c7jxvvfl5b.R.globalSliceStart(getClass().getName(),493);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_3_1h0mab5dp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_3_1c7c7jxvvfl5b.R.rethrow($CLV_t2$);}finally{__CLR4_3_1c7c7jxvvfl5b.R.globalSliceEnd(getClass().getName(),"tutorials.LinkedListTest.getTest",__CLR4_3_1_TEST_NAME_SNIFFER.getTestName(),493,$CLV_p$,$CLV_t$);}}private void  __CLR4_3_1h0mab5dp(){try{__CLR4_3_1c7c7jxvvfl5b.R.inc(493);
        __CLR4_3_1c7c7jxvvfl5b.R.inc(494);list.add(5);
        __CLR4_3_1c7c7jxvvfl5b.R.inc(495);list.add(7);
        __CLR4_3_1c7c7jxvvfl5b.R.inc(496);list.add(3);
        __CLR4_3_1c7c7jxvvfl5b.R.inc(497);int t0 = list.get(0);
        __CLR4_3_1c7c7jxvvfl5b.R.inc(498);int t1 = list.get(1);
        __CLR4_3_1c7c7jxvvfl5b.R.inc(499);int t2 = list.get(2);
        __CLR4_3_1c7c7jxvvfl5b.R.inc(500);assertEquals("The first value wasn't properly returned.", 5, t0);
        __CLR4_3_1c7c7jxvvfl5b.R.inc(501);assertEquals("The second value wasn't properly returned.", 7, t1);
        __CLR4_3_1c7c7jxvvfl5b.R.inc(502);assertEquals("The last value wasn't properly returned.", 3, t2);
    }finally{__CLR4_3_1c7c7jxvvfl5b.R.flushNeeded();}}

    @Test(expected = IndexOutOfBoundsException.class)
    public void setExceptTest() {__CLR4_3_1c7c7jxvvfl5b.R.globalSliceStart(getClass().getName(),503);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_3_1x4cky4dz();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,115,101,116,69,120,99,101,112,116,84,101,115,116,58,32,91,73,110,100,101,120,79,117,116,79,102,66,111,117,110,100,115,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IndexOutOfBoundsException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_3_1c7c7jxvvfl5b.R.rethrow($CLV_t2$);}finally{__CLR4_3_1c7c7jxvvfl5b.R.globalSliceEnd(getClass().getName(),"tutorials.LinkedListTest.setExceptTest",__CLR4_3_1_TEST_NAME_SNIFFER.getTestName(),503,$CLV_p$,$CLV_t$);}}private void  __CLR4_3_1x4cky4dz(){try{__CLR4_3_1c7c7jxvvfl5b.R.inc(503);
        __CLR4_3_1c7c7jxvvfl5b.R.inc(504);list.add(5);
        __CLR4_3_1c7c7jxvvfl5b.R.inc(505);list.add(7);
        __CLR4_3_1c7c7jxvvfl5b.R.inc(506);list.add(3);
        __CLR4_3_1c7c7jxvvfl5b.R.inc(507);list.set(3, 7);
    }finally{__CLR4_3_1c7c7jxvvfl5b.R.flushNeeded();}}

    @Test
    public void setTest() {__CLR4_3_1c7c7jxvvfl5b.R.globalSliceStart(getClass().getName(),508);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_3_1d9rw0re4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_3_1c7c7jxvvfl5b.R.rethrow($CLV_t2$);}finally{__CLR4_3_1c7c7jxvvfl5b.R.globalSliceEnd(getClass().getName(),"tutorials.LinkedListTest.setTest",__CLR4_3_1_TEST_NAME_SNIFFER.getTestName(),508,$CLV_p$,$CLV_t$);}}private void  __CLR4_3_1d9rw0re4(){try{__CLR4_3_1c7c7jxvvfl5b.R.inc(508);
        __CLR4_3_1c7c7jxvvfl5b.R.inc(509);list.add(5);
        __CLR4_3_1c7c7jxvvfl5b.R.inc(510);list.add(7);
        __CLR4_3_1c7c7jxvvfl5b.R.inc(511);list.add(3);
        __CLR4_3_1c7c7jxvvfl5b.R.inc(512);list.set(1, 9);
        __CLR4_3_1c7c7jxvvfl5b.R.inc(513);assertEquals("The list size changed although it shouldn't have.", 3, list.size());
        __CLR4_3_1c7c7jxvvfl5b.R.inc(514);assertEquals("The element wasn't properly modified.", 1, list.indexOf(9));
    }finally{__CLR4_3_1c7c7jxvvfl5b.R.flushNeeded();}}

    @Test
    public void indexOfTest() {__CLR4_3_1c7c7jxvvfl5b.R.globalSliceStart(getClass().getName(),515);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_3_19bvli6eb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_3_1c7c7jxvvfl5b.R.rethrow($CLV_t2$);}finally{__CLR4_3_1c7c7jxvvfl5b.R.globalSliceEnd(getClass().getName(),"tutorials.LinkedListTest.indexOfTest",__CLR4_3_1_TEST_NAME_SNIFFER.getTestName(),515,$CLV_p$,$CLV_t$);}}private void  __CLR4_3_19bvli6eb(){try{__CLR4_3_1c7c7jxvvfl5b.R.inc(515);
        __CLR4_3_1c7c7jxvvfl5b.R.inc(516);list.add(5);
        __CLR4_3_1c7c7jxvvfl5b.R.inc(517);list.add(7);
        __CLR4_3_1c7c7jxvvfl5b.R.inc(518);list.add(3);
        __CLR4_3_1c7c7jxvvfl5b.R.inc(519);assertEquals("The first element wasn't found.", 0, list.indexOf(5));
        __CLR4_3_1c7c7jxvvfl5b.R.inc(520);assertEquals("The last element wasn't found.", 2, list.indexOf(3));
        __CLR4_3_1c7c7jxvvfl5b.R.inc(521);assertEquals("An element that isn't in the list was found.", -1, list.indexOf(9));
    }finally{__CLR4_3_1c7c7jxvvfl5b.R.flushNeeded();}}

    @Test
    public void containsTest() {__CLR4_3_1c7c7jxvvfl5b.R.globalSliceStart(getClass().getName(),522);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_3_1t1mb20ei();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_3_1c7c7jxvvfl5b.R.rethrow($CLV_t2$);}finally{__CLR4_3_1c7c7jxvvfl5b.R.globalSliceEnd(getClass().getName(),"tutorials.LinkedListTest.containsTest",__CLR4_3_1_TEST_NAME_SNIFFER.getTestName(),522,$CLV_p$,$CLV_t$);}}private void  __CLR4_3_1t1mb20ei(){try{__CLR4_3_1c7c7jxvvfl5b.R.inc(522);
        __CLR4_3_1c7c7jxvvfl5b.R.inc(523);assertTrue("An empty list returned that it contained something.", !list.contains(9));
        __CLR4_3_1c7c7jxvvfl5b.R.inc(524);list.add(9);
        __CLR4_3_1c7c7jxvvfl5b.R.inc(525);list.add(7);
        __CLR4_3_1c7c7jxvvfl5b.R.inc(526);list.add(43);
        __CLR4_3_1c7c7jxvvfl5b.R.inc(527);assertTrue("An element that occurs in the list wasn't found.", list.contains(7));
        __CLR4_3_1c7c7jxvvfl5b.R.inc(528);assertTrue("An element that doesn't exist in the list was found.", !list.contains(4));
    }finally{__CLR4_3_1c7c7jxvvfl5b.R.flushNeeded();}}

    @Test
    public void isEmptyTest() {__CLR4_3_1c7c7jxvvfl5b.R.globalSliceStart(getClass().getName(),529);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_3_1uqn198ep();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_3_1c7c7jxvvfl5b.R.rethrow($CLV_t2$);}finally{__CLR4_3_1c7c7jxvvfl5b.R.globalSliceEnd(getClass().getName(),"tutorials.LinkedListTest.isEmptyTest",__CLR4_3_1_TEST_NAME_SNIFFER.getTestName(),529,$CLV_p$,$CLV_t$);}}private void  __CLR4_3_1uqn198ep(){try{__CLR4_3_1c7c7jxvvfl5b.R.inc(529);
        __CLR4_3_1c7c7jxvvfl5b.R.inc(530);assertTrue("An empty list was found not empty.", list.isEmpty());
        __CLR4_3_1c7c7jxvvfl5b.R.inc(531);list.add(5);
        __CLR4_3_1c7c7jxvvfl5b.R.inc(532);assertTrue("A list with one element returned that it was empty.", !list.isEmpty());
    }finally{__CLR4_3_1c7c7jxvvfl5b.R.flushNeeded();}}

}