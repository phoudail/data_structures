/* $$ This file has been instrumented by Clover 4.3.1#20180921211537623 $$ */package tutorials;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.NoSuchElementException;

import org.junit.Test;
import org.junit.Before;

public class HashTableTest {static class __CLR4_3_1b5b5jxvtz8t4{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_3_1();if(20180921211537623L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.3.1#20180921211537623,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0070\u0068\u006f\u0075\u0064\u0061\u0069\u006c\u002f\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1562677739584L,8589935092L,436,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_3_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    HashTable<String, Integer> t;

    @Before
    public void init() {try{__CLR4_3_1b5b5jxvtz8t4.R.inc(401);
        __CLR4_3_1b5b5jxvtz8t4.R.inc(402);t = new HashTable<String, Integer>();
    }finally{__CLR4_3_1b5b5jxvtz8t4.R.flushNeeded();}}

    @Test
    public void putEmptyTest() {__CLR4_3_1b5b5jxvtz8t4.R.globalSliceStart(getClass().getName(),403);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_3_1ihfbljb7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_3_1b5b5jxvtz8t4.R.rethrow($CLV_t2$);}finally{__CLR4_3_1b5b5jxvtz8t4.R.globalSliceEnd(getClass().getName(),"tutorials.HashTableTest.putEmptyTest",__CLR4_3_1_TEST_NAME_SNIFFER.getTestName(),403,$CLV_p$,$CLV_t$);}}private void  __CLR4_3_1ihfbljb7(){try{__CLR4_3_1b5b5jxvtz8t4.R.inc(403);
        __CLR4_3_1b5b5jxvtz8t4.R.inc(404);t.put("Test", 37);
        __CLR4_3_1b5b5jxvtz8t4.R.inc(405);assertTrue("The key wasn't added properly to an empty table.", t.contains("Test"));
        __CLR4_3_1b5b5jxvtz8t4.R.inc(406);int get = t.get("Test");
        __CLR4_3_1b5b5jxvtz8t4.R.inc(407);assertEquals("The function 'get' returned an unexpected value after adding an element to an empty table.", 37, get);
    }finally{__CLR4_3_1b5b5jxvtz8t4.R.flushNeeded();}}

    @Test
    public void putAddTest() {__CLR4_3_1b5b5jxvtz8t4.R.globalSliceStart(getClass().getName(),408);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_3_1odjkp7bc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_3_1b5b5jxvtz8t4.R.rethrow($CLV_t2$);}finally{__CLR4_3_1b5b5jxvtz8t4.R.globalSliceEnd(getClass().getName(),"tutorials.HashTableTest.putAddTest",__CLR4_3_1_TEST_NAME_SNIFFER.getTestName(),408,$CLV_p$,$CLV_t$);}}private void  __CLR4_3_1odjkp7bc(){try{__CLR4_3_1b5b5jxvtz8t4.R.inc(408);
        __CLR4_3_1b5b5jxvtz8t4.R.inc(409);t.put("test1", 37);
        __CLR4_3_1b5b5jxvtz8t4.R.inc(410);t.put("test2", 86);
        __CLR4_3_1b5b5jxvtz8t4.R.inc(411);t.put("test3", 4);
        __CLR4_3_1b5b5jxvtz8t4.R.inc(412);assertTrue("The second element wasn't added.", t.contains("test2"));
        __CLR4_3_1b5b5jxvtz8t4.R.inc(413);assertTrue("The third element wasn't added.", t.contains("test3"));
        __CLR4_3_1b5b5jxvtz8t4.R.inc(414);int get2 = t.get("test2");
        __CLR4_3_1b5b5jxvtz8t4.R.inc(415);int get3 = t.get("test3");
        __CLR4_3_1b5b5jxvtz8t4.R.inc(416);assertEquals("The second element's value isn't properly returned.", 86, get2);
        __CLR4_3_1b5b5jxvtz8t4.R.inc(417);assertEquals("The third element's value isn't properly returned.", 4, get3);
    }finally{__CLR4_3_1b5b5jxvtz8t4.R.flushNeeded();}}

    @Test
    public void putUpdateTest() {__CLR4_3_1b5b5jxvtz8t4.R.globalSliceStart(getClass().getName(),418);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_3_1orovbjbm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_3_1b5b5jxvtz8t4.R.rethrow($CLV_t2$);}finally{__CLR4_3_1b5b5jxvtz8t4.R.globalSliceEnd(getClass().getName(),"tutorials.HashTableTest.putUpdateTest",__CLR4_3_1_TEST_NAME_SNIFFER.getTestName(),418,$CLV_p$,$CLV_t$);}}private void  __CLR4_3_1orovbjbm(){try{__CLR4_3_1b5b5jxvtz8t4.R.inc(418);
        __CLR4_3_1b5b5jxvtz8t4.R.inc(419);t.put("test1", 37);
        __CLR4_3_1b5b5jxvtz8t4.R.inc(420);t.put("test2", 86);
        __CLR4_3_1b5b5jxvtz8t4.R.inc(421);t.put("test3", 4);
        __CLR4_3_1b5b5jxvtz8t4.R.inc(422);t.put("test2", 42);
        __CLR4_3_1b5b5jxvtz8t4.R.inc(423);assertTrue("The element disappeared instead of being updated.", t.contains("test2"));
        __CLR4_3_1b5b5jxvtz8t4.R.inc(424);int get = t.get("test2");
        __CLR4_3_1b5b5jxvtz8t4.R.inc(425);assertEquals("The value of the element wasn't properly updated.", 42, get);
    }finally{__CLR4_3_1b5b5jxvtz8t4.R.flushNeeded();}}

    @Test
    public void rehashTest() {__CLR4_3_1b5b5jxvtz8t4.R.globalSliceStart(getClass().getName(),426);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_3_1dazfvqbu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_3_1b5b5jxvtz8t4.R.rethrow($CLV_t2$);}finally{__CLR4_3_1b5b5jxvtz8t4.R.globalSliceEnd(getClass().getName(),"tutorials.HashTableTest.rehashTest",__CLR4_3_1_TEST_NAME_SNIFFER.getTestName(),426,$CLV_p$,$CLV_t$);}}private void  __CLR4_3_1dazfvqbu(){try{__CLR4_3_1b5b5jxvtz8t4.R.inc(426);
        __CLR4_3_1b5b5jxvtz8t4.R.inc(427);for(int i = 0; (((i < 55)&&(__CLR4_3_1b5b5jxvtz8t4.R.iget(428)!=0|true))||(__CLR4_3_1b5b5jxvtz8t4.R.iget(429)==0&false)); i++) {{
            __CLR4_3_1b5b5jxvtz8t4.R.inc(430);t.put("test" + i, i);
        }
        }__CLR4_3_1b5b5jxvtz8t4.R.inc(431);assertEquals("The table didn't rehash properly", 20, t.arraySize());
    }finally{__CLR4_3_1b5b5jxvtz8t4.R.flushNeeded();}}

    @Test(expected = NoSuchElementException.class)
    public void getExceptTest() {__CLR4_3_1b5b5jxvtz8t4.R.globalSliceStart(getClass().getName(),432);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_3_1bejonsc0();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,103,101,116,69,120,99,101,112,116,84,101,115,116,58,32,91,78,111,83,117,99,104,69,108,101,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NoSuchElementException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_3_1b5b5jxvtz8t4.R.rethrow($CLV_t2$);}finally{__CLR4_3_1b5b5jxvtz8t4.R.globalSliceEnd(getClass().getName(),"tutorials.HashTableTest.getExceptTest",__CLR4_3_1_TEST_NAME_SNIFFER.getTestName(),432,$CLV_p$,$CLV_t$);}}private void  __CLR4_3_1bejonsc0(){try{__CLR4_3_1b5b5jxvtz8t4.R.inc(432);
        __CLR4_3_1b5b5jxvtz8t4.R.inc(433);t.get("test");
    }finally{__CLR4_3_1b5b5jxvtz8t4.R.flushNeeded();}}

    @Test
    public void containsEmptyTest() {__CLR4_3_1b5b5jxvtz8t4.R.globalSliceStart(getClass().getName(),434);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_3_1bmmmjdc2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_3_1b5b5jxvtz8t4.R.rethrow($CLV_t2$);}finally{__CLR4_3_1b5b5jxvtz8t4.R.globalSliceEnd(getClass().getName(),"tutorials.HashTableTest.containsEmptyTest",__CLR4_3_1_TEST_NAME_SNIFFER.getTestName(),434,$CLV_p$,$CLV_t$);}}private void  __CLR4_3_1bmmmjdc2(){try{__CLR4_3_1b5b5jxvtz8t4.R.inc(434);
        __CLR4_3_1b5b5jxvtz8t4.R.inc(435);assertTrue("The table returned that it contained something although it is empty.", !t.contains("anothertest"));
    }finally{__CLR4_3_1b5b5jxvtz8t4.R.flushNeeded();}}
}