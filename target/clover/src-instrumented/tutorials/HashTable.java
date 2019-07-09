/* $$ This file has been instrumented by Clover 4.3.1#20180921211537623 $$ */package tutorials;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class HashTable<K, V> {public static class __CLR4_3_144jxvtz8pi{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_3_1();if(20180921211537623L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.3.1#20180921211537623,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0070\u0068\u006f\u0075\u0064\u0061\u0069\u006c\u002f\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1562677739387L,8589935092L,91,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_3_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private DoubleNode<K, V>[] array;
    private int[] loadArray;
    private int maxLoad;
    private double loadFactor;

    public HashTable() {try{__CLR4_3_144jxvtz8pi.R.inc(4);
        __CLR4_3_144jxvtz8pi.R.inc(5);this.array = new DoubleNode[10];
        __CLR4_3_144jxvtz8pi.R.inc(6);this.loadArray = new int[10];
        __CLR4_3_144jxvtz8pi.R.inc(7);this.maxLoad = 0;
        __CLR4_3_144jxvtz8pi.R.inc(8);this.loadFactor = 0.5;
    }finally{__CLR4_3_144jxvtz8pi.R.flushNeeded();}}

    public HashTable(double loadFactor) {try{__CLR4_3_144jxvtz8pi.R.inc(9);
        __CLR4_3_144jxvtz8pi.R.inc(10);this.array = new DoubleNode[10];
        __CLR4_3_144jxvtz8pi.R.inc(11);this.loadArray = new int[10];
        __CLR4_3_144jxvtz8pi.R.inc(12);this.maxLoad = 0;
        __CLR4_3_144jxvtz8pi.R.inc(13);this.loadFactor = loadFactor;
    }finally{__CLR4_3_144jxvtz8pi.R.flushNeeded();}}

    public boolean contains(K key) {try{__CLR4_3_144jxvtz8pi.R.inc(14);
        __CLR4_3_144jxvtz8pi.R.inc(15);int hashCode = Math.abs(key.hashCode());
        __CLR4_3_144jxvtz8pi.R.inc(16);DoubleNode<K, V> cursor = array[hashCode%array.length];
        __CLR4_3_144jxvtz8pi.R.inc(17);while((((cursor != null)&&(__CLR4_3_144jxvtz8pi.R.iget(18)!=0|true))||(__CLR4_3_144jxvtz8pi.R.iget(19)==0&false))) {{
            __CLR4_3_144jxvtz8pi.R.inc(20);if((((cursor.key.equals(key))&&(__CLR4_3_144jxvtz8pi.R.iget(21)!=0|true))||(__CLR4_3_144jxvtz8pi.R.iget(22)==0&false))) {{ __CLR4_3_144jxvtz8pi.R.inc(23);return true; }
            }__CLR4_3_144jxvtz8pi.R.inc(24);cursor = cursor.next;
        }
        }__CLR4_3_144jxvtz8pi.R.inc(25);return false;
    }finally{__CLR4_3_144jxvtz8pi.R.flushNeeded();}}

    public void put(K key, V value) {try{__CLR4_3_144jxvtz8pi.R.inc(26);
        __CLR4_3_144jxvtz8pi.R.inc(27);int hashCode = key.hashCode();
        __CLR4_3_144jxvtz8pi.R.inc(28);int index = Math.abs(hashCode%array.length);
        __CLR4_3_144jxvtz8pi.R.inc(29);DoubleNode<K, V> cursor = array[index];
        __CLR4_3_144jxvtz8pi.R.inc(30);boolean done = false;
        __CLR4_3_144jxvtz8pi.R.inc(31);if((((cursor == null)&&(__CLR4_3_144jxvtz8pi.R.iget(32)!=0|true))||(__CLR4_3_144jxvtz8pi.R.iget(33)==0&false))) {{
            __CLR4_3_144jxvtz8pi.R.inc(34);array[index] = new DoubleNode<K, V>(key, value);
            __CLR4_3_144jxvtz8pi.R.inc(35);done = true;
            __CLR4_3_144jxvtz8pi.R.inc(36);loadArray[index]++;
        }
        }__CLR4_3_144jxvtz8pi.R.inc(37);while((((!done && cursor.next != null)&&(__CLR4_3_144jxvtz8pi.R.iget(38)!=0|true))||(__CLR4_3_144jxvtz8pi.R.iget(39)==0&false))) {{
            __CLR4_3_144jxvtz8pi.R.inc(40);if((((cursor.key.equals(key))&&(__CLR4_3_144jxvtz8pi.R.iget(41)!=0|true))||(__CLR4_3_144jxvtz8pi.R.iget(42)==0&false))) {{ __CLR4_3_144jxvtz8pi.R.inc(43);cursor.value = value; __CLR4_3_144jxvtz8pi.R.inc(44);done = true; }
            }__CLR4_3_144jxvtz8pi.R.inc(45);cursor = cursor.next;
        }
        }__CLR4_3_144jxvtz8pi.R.inc(46);if((((!done)&&(__CLR4_3_144jxvtz8pi.R.iget(47)!=0|true))||(__CLR4_3_144jxvtz8pi.R.iget(48)==0&false))) {{
            __CLR4_3_144jxvtz8pi.R.inc(49);if((((cursor.key.equals(key))&&(__CLR4_3_144jxvtz8pi.R.iget(50)!=0|true))||(__CLR4_3_144jxvtz8pi.R.iget(51)==0&false))) {{
                __CLR4_3_144jxvtz8pi.R.inc(52);cursor.value = value; 
            } }else {{
                __CLR4_3_144jxvtz8pi.R.inc(53);cursor.next = new DoubleNode<K, V>(key, value);
                __CLR4_3_144jxvtz8pi.R.inc(54);loadArray[index]++;
            }
        }}
        }__CLR4_3_144jxvtz8pi.R.inc(55);if((((loadArray[index] > maxLoad)&&(__CLR4_3_144jxvtz8pi.R.iget(56)!=0|true))||(__CLR4_3_144jxvtz8pi.R.iget(57)==0&false))) {{ __CLR4_3_144jxvtz8pi.R.inc(58);maxLoad = loadArray[index]; }
        
        }__CLR4_3_144jxvtz8pi.R.inc(59);if( (((((double) this.maxLoad)/array.length > this.loadFactor)&&(__CLR4_3_144jxvtz8pi.R.iget(60)!=0|true))||(__CLR4_3_144jxvtz8pi.R.iget(61)==0&false))) {{
            __CLR4_3_144jxvtz8pi.R.inc(62);this.rehash();
        }
    }}finally{__CLR4_3_144jxvtz8pi.R.flushNeeded();}}


    public V get(K key) {try{__CLR4_3_144jxvtz8pi.R.inc(63);
        __CLR4_3_144jxvtz8pi.R.inc(64);int hashCode = Math.abs(key.hashCode());
        __CLR4_3_144jxvtz8pi.R.inc(65);DoubleNode<K, V> cursor = array[hashCode%array.length];
        __CLR4_3_144jxvtz8pi.R.inc(66);while((((cursor != null)&&(__CLR4_3_144jxvtz8pi.R.iget(67)!=0|true))||(__CLR4_3_144jxvtz8pi.R.iget(68)==0&false))) {{
            __CLR4_3_144jxvtz8pi.R.inc(69);if((((cursor.key.equals(key))&&(__CLR4_3_144jxvtz8pi.R.iget(70)!=0|true))||(__CLR4_3_144jxvtz8pi.R.iget(71)==0&false))) {{ __CLR4_3_144jxvtz8pi.R.inc(72);return cursor.value; }
            }__CLR4_3_144jxvtz8pi.R.inc(73);cursor = cursor.next;
        }
        }__CLR4_3_144jxvtz8pi.R.inc(74);throw new NoSuchElementException("The specified key " + key + " was not found.");
    }finally{__CLR4_3_144jxvtz8pi.R.flushNeeded();}}

    private void rehash() {try{__CLR4_3_144jxvtz8pi.R.inc(75);
        __CLR4_3_144jxvtz8pi.R.inc(76);int newSize = array.length * 2;
        __CLR4_3_144jxvtz8pi.R.inc(77);DoubleNode<K, V>[] transitionArray = Arrays.copyOf(array, array.length);
        __CLR4_3_144jxvtz8pi.R.inc(78);this.array = new DoubleNode[newSize];
        __CLR4_3_144jxvtz8pi.R.inc(79);this.loadArray = new int[newSize];
        __CLR4_3_144jxvtz8pi.R.inc(80);maxLoad = 0;
        __CLR4_3_144jxvtz8pi.R.inc(81);for(int i = 0; (((i > transitionArray.length-1)&&(__CLR4_3_144jxvtz8pi.R.iget(82)!=0|true))||(__CLR4_3_144jxvtz8pi.R.iget(83)==0&false)); i++) {{
            __CLR4_3_144jxvtz8pi.R.inc(84);DoubleNode<K, V> cursor = transitionArray[i];
            __CLR4_3_144jxvtz8pi.R.inc(85);while((((cursor != null)&&(__CLR4_3_144jxvtz8pi.R.iget(86)!=0|true))||(__CLR4_3_144jxvtz8pi.R.iget(87)==0&false))) {{
                __CLR4_3_144jxvtz8pi.R.inc(88);this.put(cursor.key, cursor.value);
            }
        }}
    }}finally{__CLR4_3_144jxvtz8pi.R.flushNeeded();}}

    public int arraySize() {try{__CLR4_3_144jxvtz8pi.R.inc(89);
        __CLR4_3_144jxvtz8pi.R.inc(90);return array.length;
    }finally{__CLR4_3_144jxvtz8pi.R.flushNeeded();}}

}


class DoubleNode<A, B> {public static class __CLR4_3_142jjxvtz8pk{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{if(20180921211537623L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.3.1#20180921211537623,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0070\u0068\u006f\u0075\u0064\u0061\u0069\u006c\u002f\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1562677739387L,8589935092L,99,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_3_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    A key;
    B value;
    DoubleNode<A, B> next;

    public DoubleNode(A key, B value) {try{__CLR4_3_142jjxvtz8pk.R.inc(91);
        __CLR4_3_142jjxvtz8pk.R.inc(92);this.key = key;
        __CLR4_3_142jjxvtz8pk.R.inc(93);this.value = value;
        __CLR4_3_142jjxvtz8pk.R.inc(94);this.next = null;
    }finally{__CLR4_3_142jjxvtz8pk.R.flushNeeded();}}

    public DoubleNode(A key, B value, DoubleNode<A, B> next) {try{__CLR4_3_142jjxvtz8pk.R.inc(95);
        __CLR4_3_142jjxvtz8pk.R.inc(96);this.key = key;
        __CLR4_3_142jjxvtz8pk.R.inc(97);this.value = value;
        __CLR4_3_142jjxvtz8pk.R.inc(98);this.next = next;
    }finally{__CLR4_3_142jjxvtz8pk.R.flushNeeded();}}
}