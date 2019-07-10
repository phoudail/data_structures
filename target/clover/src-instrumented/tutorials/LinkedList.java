/* $$ This file has been instrumented by Clover 4.3.1#20180921211537623 $$ */package tutorials;


public class LinkedList<T> implements List<T> {public static class __CLR4_3_12p2pjxvvfl1l{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_3_1();if(20180921211537623L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.3.1#20180921211537623,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0070\u0068\u006f\u0075\u0064\u0061\u0069\u006c\u002f\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1562680181490L,8589935092L,185,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_3_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    
    private LinkedNode<T> first;
    private int size = 0;


    public LinkedList() {try{__CLR4_3_12p2pjxvvfl1l.R.inc(97);
        __CLR4_3_12p2pjxvvfl1l.R.inc(98);first = null;
        __CLR4_3_12p2pjxvvfl1l.R.inc(99);size = 0;
    }finally{__CLR4_3_12p2pjxvvfl1l.R.flushNeeded();}}


    public void add(T item) {try{__CLR4_3_12p2pjxvvfl1l.R.inc(100);
        __CLR4_3_12p2pjxvvfl1l.R.inc(101);LinkedNode<T> toAdd = new LinkedNode<T>(item);
        __CLR4_3_12p2pjxvvfl1l.R.inc(102);if ((((first == null)&&(__CLR4_3_12p2pjxvvfl1l.R.iget(103)!=0|true))||(__CLR4_3_12p2pjxvvfl1l.R.iget(104)==0&false))) {{
            __CLR4_3_12p2pjxvvfl1l.R.inc(105);first = toAdd;
        } }else {{
            __CLR4_3_12p2pjxvvfl1l.R.inc(106);LinkedNode<T> cursor = first;
            __CLR4_3_12p2pjxvvfl1l.R.inc(107);while((((cursor.next != null)&&(__CLR4_3_12p2pjxvvfl1l.R.iget(108)!=0|true))||(__CLR4_3_12p2pjxvvfl1l.R.iget(109)==0&false))) {{
                __CLR4_3_12p2pjxvvfl1l.R.inc(110);cursor = cursor.next;
            }
            }__CLR4_3_12p2pjxvvfl1l.R.inc(111);cursor.next = toAdd;
        }
        }__CLR4_3_12p2pjxvvfl1l.R.inc(112);size++;
    }finally{__CLR4_3_12p2pjxvvfl1l.R.flushNeeded();}}


    public void remove(T item) {try{__CLR4_3_12p2pjxvvfl1l.R.inc(113);
        __CLR4_3_12p2pjxvvfl1l.R.inc(114);if((((first != null && !first.value.equals(item))&&(__CLR4_3_12p2pjxvvfl1l.R.iget(115)!=0|true))||(__CLR4_3_12p2pjxvvfl1l.R.iget(116)==0&false))) {{
            __CLR4_3_12p2pjxvvfl1l.R.inc(117);LinkedNode<T> cursor = first;
            __CLR4_3_12p2pjxvvfl1l.R.inc(118);LinkedNode<T> previous = cursor;
            __CLR4_3_12p2pjxvvfl1l.R.inc(119);cursor = cursor.next;
            __CLR4_3_12p2pjxvvfl1l.R.inc(120);while((((cursor != null && !cursor.value.equals(item))&&(__CLR4_3_12p2pjxvvfl1l.R.iget(121)!=0|true))||(__CLR4_3_12p2pjxvvfl1l.R.iget(122)==0&false))) {{
                __CLR4_3_12p2pjxvvfl1l.R.inc(123);previous = cursor;
                __CLR4_3_12p2pjxvvfl1l.R.inc(124);cursor = cursor.next;
            }
            }__CLR4_3_12p2pjxvvfl1l.R.inc(125);if((((cursor != null)&&(__CLR4_3_12p2pjxvvfl1l.R.iget(126)!=0|true))||(__CLR4_3_12p2pjxvvfl1l.R.iget(127)==0&false))) {{
                __CLR4_3_12p2pjxvvfl1l.R.inc(128);previous.next = cursor.next;
                __CLR4_3_12p2pjxvvfl1l.R.inc(129);size--;
            }  
        }} }else {__CLR4_3_12p2pjxvvfl1l.R.inc(130);if((((first != null && first.value.equals(item))&&(__CLR4_3_12p2pjxvvfl1l.R.iget(131)!=0|true))||(__CLR4_3_12p2pjxvvfl1l.R.iget(132)==0&false))) {{
            __CLR4_3_12p2pjxvvfl1l.R.inc(133);first = first.next;
            __CLR4_3_12p2pjxvvfl1l.R.inc(134);size--;
        }
    }}}finally{__CLR4_3_12p2pjxvvfl1l.R.flushNeeded();}}


    public void removeAll(T item) {try{__CLR4_3_12p2pjxvvfl1l.R.inc(135);
        __CLR4_3_12p2pjxvvfl1l.R.inc(136);while((((this.contains(item))&&(__CLR4_3_12p2pjxvvfl1l.R.iget(137)!=0|true))||(__CLR4_3_12p2pjxvvfl1l.R.iget(138)==0&false))) {{
            __CLR4_3_12p2pjxvvfl1l.R.inc(139);this.remove(item);
        }
    }}finally{__CLR4_3_12p2pjxvvfl1l.R.flushNeeded();}}


    public T get (int index) {try{__CLR4_3_12p2pjxvvfl1l.R.inc(140);
        __CLR4_3_12p2pjxvvfl1l.R.inc(141);if((((index > size-1 || index < 0)&&(__CLR4_3_12p2pjxvvfl1l.R.iget(142)!=0|true))||(__CLR4_3_12p2pjxvvfl1l.R.iget(143)==0&false))) {{
            __CLR4_3_12p2pjxvvfl1l.R.inc(144);throw new IndexOutOfBoundsException("Index " + index + " is out of bounds (size : " + size + ").");
        }
        }__CLR4_3_12p2pjxvvfl1l.R.inc(145);int counter = 0;
        __CLR4_3_12p2pjxvvfl1l.R.inc(146);LinkedNode<T> cursor = first;
        __CLR4_3_12p2pjxvvfl1l.R.inc(147);while((((counter != index)&&(__CLR4_3_12p2pjxvvfl1l.R.iget(148)!=0|true))||(__CLR4_3_12p2pjxvvfl1l.R.iget(149)==0&false))) {{
            __CLR4_3_12p2pjxvvfl1l.R.inc(150);counter++;
            __CLR4_3_12p2pjxvvfl1l.R.inc(151);cursor = cursor.next;
        }
        }__CLR4_3_12p2pjxvvfl1l.R.inc(152);return cursor.value;
    }finally{__CLR4_3_12p2pjxvvfl1l.R.flushNeeded();}}


    public void set(int index, T item) {try{__CLR4_3_12p2pjxvvfl1l.R.inc(153);
        __CLR4_3_12p2pjxvvfl1l.R.inc(154);if((((index > size-1 || index < 0)&&(__CLR4_3_12p2pjxvvfl1l.R.iget(155)!=0|true))||(__CLR4_3_12p2pjxvvfl1l.R.iget(156)==0&false))) {{
            __CLR4_3_12p2pjxvvfl1l.R.inc(157);throw new IndexOutOfBoundsException("Index " + index + " is out of bounds (size : "+ size + ").");
        }
        }__CLR4_3_12p2pjxvvfl1l.R.inc(158);int counter = 0;
        __CLR4_3_12p2pjxvvfl1l.R.inc(159);LinkedNode<T> cursor = first;
        __CLR4_3_12p2pjxvvfl1l.R.inc(160);while((((counter != index)&&(__CLR4_3_12p2pjxvvfl1l.R.iget(161)!=0|true))||(__CLR4_3_12p2pjxvvfl1l.R.iget(162)==0&false))) {{
            __CLR4_3_12p2pjxvvfl1l.R.inc(163);counter++;
            __CLR4_3_12p2pjxvvfl1l.R.inc(164);cursor = cursor.next;
        }
        }__CLR4_3_12p2pjxvvfl1l.R.inc(165);cursor.value = item;
    }finally{__CLR4_3_12p2pjxvvfl1l.R.flushNeeded();}}

    
    public int indexOf(T item) {try{__CLR4_3_12p2pjxvvfl1l.R.inc(166);
        __CLR4_3_12p2pjxvvfl1l.R.inc(167);int index = 0;
        __CLR4_3_12p2pjxvvfl1l.R.inc(168);LinkedNode<T> cursor = first;
        __CLR4_3_12p2pjxvvfl1l.R.inc(169);while((((cursor != null)&&(__CLR4_3_12p2pjxvvfl1l.R.iget(170)!=0|true))||(__CLR4_3_12p2pjxvvfl1l.R.iget(171)==0&false))) {{
            __CLR4_3_12p2pjxvvfl1l.R.inc(172);if((((cursor.value.equals(item))&&(__CLR4_3_12p2pjxvvfl1l.R.iget(173)!=0|true))||(__CLR4_3_12p2pjxvvfl1l.R.iget(174)==0&false))) {{ __CLR4_3_12p2pjxvvfl1l.R.inc(175);return index; }
            }__CLR4_3_12p2pjxvvfl1l.R.inc(176);index++;
            __CLR4_3_12p2pjxvvfl1l.R.inc(177);cursor = cursor.next;
        }
        }__CLR4_3_12p2pjxvvfl1l.R.inc(178);return -1;
    }finally{__CLR4_3_12p2pjxvvfl1l.R.flushNeeded();}}


    public boolean contains(T item) {try{__CLR4_3_12p2pjxvvfl1l.R.inc(179);
        __CLR4_3_12p2pjxvvfl1l.R.inc(180);return this.indexOf(item) != -1;
    }finally{__CLR4_3_12p2pjxvvfl1l.R.flushNeeded();}}


    public int size() {try{__CLR4_3_12p2pjxvvfl1l.R.inc(181);
        __CLR4_3_12p2pjxvvfl1l.R.inc(182);return size;
    }finally{__CLR4_3_12p2pjxvvfl1l.R.flushNeeded();}}


    public boolean isEmpty() {try{__CLR4_3_12p2pjxvvfl1l.R.inc(183);
        __CLR4_3_12p2pjxvvfl1l.R.inc(184);return first == null;
    }finally{__CLR4_3_12p2pjxvvfl1l.R.flushNeeded();}}

}

class LinkedNode<T> {public static class __CLR4_3_12p55jxvvfl1n{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{if(20180921211537623L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.3.1#20180921211537623,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0070\u0068\u006f\u0075\u0064\u0061\u0069\u006c\u002f\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1562680181490L,8589935092L,191,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_3_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    T value;

    LinkedNode<T> next;

    public LinkedNode(T value) {try{__CLR4_3_12p55jxvvfl1n.R.inc(185); __CLR4_3_12p55jxvvfl1n.R.inc(186);this.value = value; __CLR4_3_12p55jxvvfl1n.R.inc(187);this.next = null; }finally{__CLR4_3_12p55jxvvfl1n.R.flushNeeded();}}

    public LinkedNode(T value, LinkedNode<T> next) {try{__CLR4_3_12p55jxvvfl1n.R.inc(188); __CLR4_3_12p55jxvvfl1n.R.inc(189);this.value = value; __CLR4_3_12p55jxvvfl1n.R.inc(190);this.next = next; }finally{__CLR4_3_12p55jxvvfl1n.R.flushNeeded();}}

}