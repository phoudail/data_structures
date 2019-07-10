/* $$ This file has been instrumented by Clover 4.3.1#20180921211537623 $$ */package tutorials;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class HashTable<K, V> {public static class __CLR4_3_122jxvvfl14{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_3_1();if(20180921211537623L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.3.1#20180921211537623,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0070\u0068\u006f\u0075\u0064\u0061\u0069\u006c\u002f\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1562680181490L,8589935092L,89,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_3_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private DoubleNode<K, V>[] array;
    private int[] loadArray;
    private int maxLoad;
    private double loadFactor;

    public HashTable() {try{__CLR4_3_122jxvvfl14.R.inc(2);
        __CLR4_3_122jxvvfl14.R.inc(3);this.array = new DoubleNode[10];
        __CLR4_3_122jxvvfl14.R.inc(4);this.loadArray = new int[10];
        __CLR4_3_122jxvvfl14.R.inc(5);this.maxLoad = 0;
        __CLR4_3_122jxvvfl14.R.inc(6);this.loadFactor = 0.5;
    }finally{__CLR4_3_122jxvvfl14.R.flushNeeded();}}

    public HashTable(double loadFactor) {try{__CLR4_3_122jxvvfl14.R.inc(7);
        __CLR4_3_122jxvvfl14.R.inc(8);this.array = new DoubleNode[10];
        __CLR4_3_122jxvvfl14.R.inc(9);this.loadArray = new int[10];
        __CLR4_3_122jxvvfl14.R.inc(10);this.maxLoad = 0;
        __CLR4_3_122jxvvfl14.R.inc(11);this.loadFactor = loadFactor;
    }finally{__CLR4_3_122jxvvfl14.R.flushNeeded();}}

    public boolean contains(K key) {try{__CLR4_3_122jxvvfl14.R.inc(12);
        __CLR4_3_122jxvvfl14.R.inc(13);int hashCode = Math.abs(key.hashCode());
        __CLR4_3_122jxvvfl14.R.inc(14);DoubleNode<K, V> cursor = array[hashCode%array.length];
        __CLR4_3_122jxvvfl14.R.inc(15);while((((cursor != null)&&(__CLR4_3_122jxvvfl14.R.iget(16)!=0|true))||(__CLR4_3_122jxvvfl14.R.iget(17)==0&false))) {{
            __CLR4_3_122jxvvfl14.R.inc(18);if((((cursor.key.equals(key))&&(__CLR4_3_122jxvvfl14.R.iget(19)!=0|true))||(__CLR4_3_122jxvvfl14.R.iget(20)==0&false))) {{ __CLR4_3_122jxvvfl14.R.inc(21);return true; }
            }__CLR4_3_122jxvvfl14.R.inc(22);cursor = cursor.next;
        }
        }__CLR4_3_122jxvvfl14.R.inc(23);return false;
    }finally{__CLR4_3_122jxvvfl14.R.flushNeeded();}}

    public void put(K key, V value) {try{__CLR4_3_122jxvvfl14.R.inc(24);
        __CLR4_3_122jxvvfl14.R.inc(25);int hashCode = key.hashCode();
        __CLR4_3_122jxvvfl14.R.inc(26);int index = Math.abs(hashCode%array.length);
        __CLR4_3_122jxvvfl14.R.inc(27);DoubleNode<K, V> cursor = array[index];
        __CLR4_3_122jxvvfl14.R.inc(28);boolean done = false;
        __CLR4_3_122jxvvfl14.R.inc(29);if((((cursor == null)&&(__CLR4_3_122jxvvfl14.R.iget(30)!=0|true))||(__CLR4_3_122jxvvfl14.R.iget(31)==0&false))) {{
            __CLR4_3_122jxvvfl14.R.inc(32);array[index] = new DoubleNode<K, V>(key, value);
            __CLR4_3_122jxvvfl14.R.inc(33);done = true;
            __CLR4_3_122jxvvfl14.R.inc(34);loadArray[index]++;
        }
        }__CLR4_3_122jxvvfl14.R.inc(35);while((((!done && cursor.next != null)&&(__CLR4_3_122jxvvfl14.R.iget(36)!=0|true))||(__CLR4_3_122jxvvfl14.R.iget(37)==0&false))) {{
            __CLR4_3_122jxvvfl14.R.inc(38);if((((cursor.key.equals(key))&&(__CLR4_3_122jxvvfl14.R.iget(39)!=0|true))||(__CLR4_3_122jxvvfl14.R.iget(40)==0&false))) {{ __CLR4_3_122jxvvfl14.R.inc(41);cursor.value = value; __CLR4_3_122jxvvfl14.R.inc(42);done = true; }
            }__CLR4_3_122jxvvfl14.R.inc(43);cursor = cursor.next;
        }
        }__CLR4_3_122jxvvfl14.R.inc(44);if((((!done)&&(__CLR4_3_122jxvvfl14.R.iget(45)!=0|true))||(__CLR4_3_122jxvvfl14.R.iget(46)==0&false))) {{
            __CLR4_3_122jxvvfl14.R.inc(47);if((((cursor.key.equals(key))&&(__CLR4_3_122jxvvfl14.R.iget(48)!=0|true))||(__CLR4_3_122jxvvfl14.R.iget(49)==0&false))) {{
                __CLR4_3_122jxvvfl14.R.inc(50);cursor.value = value; 
            } }else {{
                __CLR4_3_122jxvvfl14.R.inc(51);cursor.next = new DoubleNode<K, V>(key, value);
                __CLR4_3_122jxvvfl14.R.inc(52);loadArray[index]++;
            }
        }}
        }__CLR4_3_122jxvvfl14.R.inc(53);if((((loadArray[index] > maxLoad)&&(__CLR4_3_122jxvvfl14.R.iget(54)!=0|true))||(__CLR4_3_122jxvvfl14.R.iget(55)==0&false))) {{ __CLR4_3_122jxvvfl14.R.inc(56);maxLoad = loadArray[index]; }
        
        }__CLR4_3_122jxvvfl14.R.inc(57);if( (((((double) this.maxLoad)/array.length > this.loadFactor)&&(__CLR4_3_122jxvvfl14.R.iget(58)!=0|true))||(__CLR4_3_122jxvvfl14.R.iget(59)==0&false))) {{
            __CLR4_3_122jxvvfl14.R.inc(60);this.rehash();
        }
    }}finally{__CLR4_3_122jxvvfl14.R.flushNeeded();}}


    public V get(K key) {try{__CLR4_3_122jxvvfl14.R.inc(61);
        __CLR4_3_122jxvvfl14.R.inc(62);int hashCode = Math.abs(key.hashCode());
        __CLR4_3_122jxvvfl14.R.inc(63);DoubleNode<K, V> cursor = array[hashCode%array.length];
        __CLR4_3_122jxvvfl14.R.inc(64);while((((cursor != null)&&(__CLR4_3_122jxvvfl14.R.iget(65)!=0|true))||(__CLR4_3_122jxvvfl14.R.iget(66)==0&false))) {{
            __CLR4_3_122jxvvfl14.R.inc(67);if((((cursor.key.equals(key))&&(__CLR4_3_122jxvvfl14.R.iget(68)!=0|true))||(__CLR4_3_122jxvvfl14.R.iget(69)==0&false))) {{ __CLR4_3_122jxvvfl14.R.inc(70);return cursor.value; }
            }__CLR4_3_122jxvvfl14.R.inc(71);cursor = cursor.next;
        }
        }__CLR4_3_122jxvvfl14.R.inc(72);throw new NoSuchElementException("The specified key " + key + " was not found.");
    }finally{__CLR4_3_122jxvvfl14.R.flushNeeded();}}

    private void rehash() {try{__CLR4_3_122jxvvfl14.R.inc(73);
        __CLR4_3_122jxvvfl14.R.inc(74);int newSize = array.length * 2;
        __CLR4_3_122jxvvfl14.R.inc(75);DoubleNode<K, V>[] transitionArray = Arrays.copyOf(array, array.length);
        __CLR4_3_122jxvvfl14.R.inc(76);this.array = new DoubleNode[newSize];
        __CLR4_3_122jxvvfl14.R.inc(77);this.loadArray = new int[newSize];
        __CLR4_3_122jxvvfl14.R.inc(78);maxLoad = 0;
        __CLR4_3_122jxvvfl14.R.inc(79);for(int i = 0; (((i > transitionArray.length-1)&&(__CLR4_3_122jxvvfl14.R.iget(80)!=0|true))||(__CLR4_3_122jxvvfl14.R.iget(81)==0&false)); i++) {{
            __CLR4_3_122jxvvfl14.R.inc(82);DoubleNode<K, V> cursor = transitionArray[i];
            __CLR4_3_122jxvvfl14.R.inc(83);while((((cursor != null)&&(__CLR4_3_122jxvvfl14.R.iget(84)!=0|true))||(__CLR4_3_122jxvvfl14.R.iget(85)==0&false))) {{
                __CLR4_3_122jxvvfl14.R.inc(86);this.put(cursor.key, cursor.value);
            }
        }}
    }}finally{__CLR4_3_122jxvvfl14.R.flushNeeded();}}

    public int arraySize() {try{__CLR4_3_122jxvvfl14.R.inc(87);
        __CLR4_3_122jxvvfl14.R.inc(88);return array.length;
    }finally{__CLR4_3_122jxvvfl14.R.flushNeeded();}}

}


class DoubleNode<A, B> {public static class __CLR4_3_122hjxvvfl16{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{if(20180921211537623L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.3.1#20180921211537623,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0070\u0068\u006f\u0075\u0064\u0061\u0069\u006c\u002f\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1562680181490L,8589935092L,97,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_3_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    A key;
    B value;
    DoubleNode<A, B> next;

    public DoubleNode(A key, B value) {try{__CLR4_3_122hjxvvfl16.R.inc(89);
        __CLR4_3_122hjxvvfl16.R.inc(90);this.key = key;
        __CLR4_3_122hjxvvfl16.R.inc(91);this.value = value;
        __CLR4_3_122hjxvvfl16.R.inc(92);this.next = null;
    }finally{__CLR4_3_122hjxvvfl16.R.flushNeeded();}}

    public DoubleNode(A key, B value, DoubleNode<A, B> next) {try{__CLR4_3_122hjxvvfl16.R.inc(93);
        __CLR4_3_122hjxvvfl16.R.inc(94);this.key = key;
        __CLR4_3_122hjxvvfl16.R.inc(95);this.value = value;
        __CLR4_3_122hjxvvfl16.R.inc(96);this.next = next;
    }finally{__CLR4_3_122hjxvvfl16.R.flushNeeded();}}
}