/* $$ This file has been instrumented by Clover 4.3.1#20180921211537623 $$ */package tutorials;


public class LinkedList<T> implements List<T> {public static class __CLR4_3_122jxejscos{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_3_1();if(20180921211537623L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.3.1#20180921211537623,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0070\u0068\u006f\u0075\u0064\u0061\u0069\u006c\u002f\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1561632696831L,8589935092L,90,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_3_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    
    private LinkedNode<T> first;
    private int size = 0;


    public LinkedList() {try{__CLR4_3_122jxejscos.R.inc(2);
        __CLR4_3_122jxejscos.R.inc(3);first = null;
        __CLR4_3_122jxejscos.R.inc(4);size = 0;
    }finally{__CLR4_3_122jxejscos.R.flushNeeded();}}


    public void add(T item) {try{__CLR4_3_122jxejscos.R.inc(5);
        __CLR4_3_122jxejscos.R.inc(6);LinkedNode<T> toAdd = new LinkedNode<T>(item);
        __CLR4_3_122jxejscos.R.inc(7);if ((((first == null)&&(__CLR4_3_122jxejscos.R.iget(8)!=0|true))||(__CLR4_3_122jxejscos.R.iget(9)==0&false))) {{
            __CLR4_3_122jxejscos.R.inc(10);first = toAdd;
        } }else {{
            __CLR4_3_122jxejscos.R.inc(11);LinkedNode<T> cursor = first;
            __CLR4_3_122jxejscos.R.inc(12);while((((cursor.next != null)&&(__CLR4_3_122jxejscos.R.iget(13)!=0|true))||(__CLR4_3_122jxejscos.R.iget(14)==0&false))) {{
                __CLR4_3_122jxejscos.R.inc(15);cursor = cursor.next;
            }
            }__CLR4_3_122jxejscos.R.inc(16);cursor.next = toAdd;
        }
        }__CLR4_3_122jxejscos.R.inc(17);size++;
    }finally{__CLR4_3_122jxejscos.R.flushNeeded();}}


    public void remove(T item) {try{__CLR4_3_122jxejscos.R.inc(18);
        __CLR4_3_122jxejscos.R.inc(19);if((((first != null && !first.value.equals(item))&&(__CLR4_3_122jxejscos.R.iget(20)!=0|true))||(__CLR4_3_122jxejscos.R.iget(21)==0&false))) {{
            __CLR4_3_122jxejscos.R.inc(22);LinkedNode<T> cursor = first;
            __CLR4_3_122jxejscos.R.inc(23);LinkedNode<T> previous = cursor;
            __CLR4_3_122jxejscos.R.inc(24);cursor = cursor.next;
            __CLR4_3_122jxejscos.R.inc(25);while((((cursor != null && !cursor.value.equals(item))&&(__CLR4_3_122jxejscos.R.iget(26)!=0|true))||(__CLR4_3_122jxejscos.R.iget(27)==0&false))) {{
                __CLR4_3_122jxejscos.R.inc(28);previous = cursor;
                __CLR4_3_122jxejscos.R.inc(29);cursor = cursor.next;
            }
            }__CLR4_3_122jxejscos.R.inc(30);if((((cursor != null)&&(__CLR4_3_122jxejscos.R.iget(31)!=0|true))||(__CLR4_3_122jxejscos.R.iget(32)==0&false))) {{
                __CLR4_3_122jxejscos.R.inc(33);previous.next = cursor.next;
                __CLR4_3_122jxejscos.R.inc(34);size--;
            }  
        }} }else {__CLR4_3_122jxejscos.R.inc(35);if((((first != null && first.value.equals(item))&&(__CLR4_3_122jxejscos.R.iget(36)!=0|true))||(__CLR4_3_122jxejscos.R.iget(37)==0&false))) {{
            __CLR4_3_122jxejscos.R.inc(38);first = first.next;
            __CLR4_3_122jxejscos.R.inc(39);size--;
        }
    }}}finally{__CLR4_3_122jxejscos.R.flushNeeded();}}


    public void removeAll(T item) {try{__CLR4_3_122jxejscos.R.inc(40);
        __CLR4_3_122jxejscos.R.inc(41);while((((this.contains(item))&&(__CLR4_3_122jxejscos.R.iget(42)!=0|true))||(__CLR4_3_122jxejscos.R.iget(43)==0&false))) {{
            __CLR4_3_122jxejscos.R.inc(44);this.remove(item);
        }
    }}finally{__CLR4_3_122jxejscos.R.flushNeeded();}}


    public T get (int index) {try{__CLR4_3_122jxejscos.R.inc(45);
        __CLR4_3_122jxejscos.R.inc(46);if((((index > size-1 || index < 0)&&(__CLR4_3_122jxejscos.R.iget(47)!=0|true))||(__CLR4_3_122jxejscos.R.iget(48)==0&false))) {{
            __CLR4_3_122jxejscos.R.inc(49);throw new IndexOutOfBoundsException("Index " + index + " is out of bounds (size : " + size + ").");
        }
        }__CLR4_3_122jxejscos.R.inc(50);int counter = 0;
        __CLR4_3_122jxejscos.R.inc(51);LinkedNode<T> cursor = first;
        __CLR4_3_122jxejscos.R.inc(52);while((((counter != index)&&(__CLR4_3_122jxejscos.R.iget(53)!=0|true))||(__CLR4_3_122jxejscos.R.iget(54)==0&false))) {{
            __CLR4_3_122jxejscos.R.inc(55);counter++;
            __CLR4_3_122jxejscos.R.inc(56);cursor = cursor.next;
        }
        }__CLR4_3_122jxejscos.R.inc(57);return cursor.value;
    }finally{__CLR4_3_122jxejscos.R.flushNeeded();}}


    public void set(int index, T item) {try{__CLR4_3_122jxejscos.R.inc(58);
        __CLR4_3_122jxejscos.R.inc(59);if((((index > size-1 || index < 0)&&(__CLR4_3_122jxejscos.R.iget(60)!=0|true))||(__CLR4_3_122jxejscos.R.iget(61)==0&false))) {{
            __CLR4_3_122jxejscos.R.inc(62);throw new IndexOutOfBoundsException("Index " + index + " is out of bounds (size : "+ size + ").");
        }
        }__CLR4_3_122jxejscos.R.inc(63);int counter = 0;
        __CLR4_3_122jxejscos.R.inc(64);LinkedNode<T> cursor = first;
        __CLR4_3_122jxejscos.R.inc(65);while((((counter != index)&&(__CLR4_3_122jxejscos.R.iget(66)!=0|true))||(__CLR4_3_122jxejscos.R.iget(67)==0&false))) {{
            __CLR4_3_122jxejscos.R.inc(68);counter++;
            __CLR4_3_122jxejscos.R.inc(69);cursor = cursor.next;
        }
        }__CLR4_3_122jxejscos.R.inc(70);cursor.value = item;
    }finally{__CLR4_3_122jxejscos.R.flushNeeded();}}

    
    public int indexOf(T item) {try{__CLR4_3_122jxejscos.R.inc(71);
        __CLR4_3_122jxejscos.R.inc(72);int index = 0;
        __CLR4_3_122jxejscos.R.inc(73);LinkedNode<T> cursor = first;
        __CLR4_3_122jxejscos.R.inc(74);while((((cursor != null)&&(__CLR4_3_122jxejscos.R.iget(75)!=0|true))||(__CLR4_3_122jxejscos.R.iget(76)==0&false))) {{
            __CLR4_3_122jxejscos.R.inc(77);if((((cursor.value.equals(item))&&(__CLR4_3_122jxejscos.R.iget(78)!=0|true))||(__CLR4_3_122jxejscos.R.iget(79)==0&false))) {{ __CLR4_3_122jxejscos.R.inc(80);return index; }
            }__CLR4_3_122jxejscos.R.inc(81);index++;
            __CLR4_3_122jxejscos.R.inc(82);cursor = cursor.next;
        }
        }__CLR4_3_122jxejscos.R.inc(83);return -1;
    }finally{__CLR4_3_122jxejscos.R.flushNeeded();}}


    public boolean contains(T item) {try{__CLR4_3_122jxejscos.R.inc(84);
        __CLR4_3_122jxejscos.R.inc(85);return this.indexOf(item) != -1;
    }finally{__CLR4_3_122jxejscos.R.flushNeeded();}}


    public int size() {try{__CLR4_3_122jxejscos.R.inc(86);
        __CLR4_3_122jxejscos.R.inc(87);return size;
    }finally{__CLR4_3_122jxejscos.R.flushNeeded();}}


    public boolean isEmpty() {try{__CLR4_3_122jxejscos.R.inc(88);
        __CLR4_3_122jxejscos.R.inc(89);return first == null;
    }finally{__CLR4_3_122jxejscos.R.flushNeeded();}}

}

class LinkedNode<T> {public static class __CLR4_3_122ijxejscou{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{if(20180921211537623L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.3.1#20180921211537623,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0070\u0068\u006f\u0075\u0064\u0061\u0069\u006c\u002f\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1561632696831L,8589935092L,96,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_3_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    T value;

    LinkedNode<T> next;

    public LinkedNode(T value) {try{__CLR4_3_122ijxejscou.R.inc(90); __CLR4_3_122ijxejscou.R.inc(91);this.value = value; __CLR4_3_122ijxejscou.R.inc(92);this.next = null; }finally{__CLR4_3_122ijxejscou.R.flushNeeded();}}

    public LinkedNode(T value, LinkedNode<T> next) {try{__CLR4_3_122ijxejscou.R.inc(93); __CLR4_3_122ijxejscou.R.inc(94);this.value = value; __CLR4_3_122ijxejscou.R.inc(95);this.next = next; }finally{__CLR4_3_122ijxejscou.R.flushNeeded();}}

}