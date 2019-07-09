/* $$ This file has been instrumented by Clover 4.3.1#20180921211537623 $$ */package tutorials;


public class LinkedList<T> implements List<T> {public static class __CLR4_3_12r2rjxvtz8q0{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_3_1();if(20180921211537623L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.3.1#20180921211537623,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0070\u0068\u006f\u0075\u0064\u0061\u0069\u006c\u002f\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1562677739387L,8589935092L,187,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_3_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    
    private LinkedNode<T> first;
    private int size = 0;


    public LinkedList() {try{__CLR4_3_12r2rjxvtz8q0.R.inc(99);
        __CLR4_3_12r2rjxvtz8q0.R.inc(100);first = null;
        __CLR4_3_12r2rjxvtz8q0.R.inc(101);size = 0;
    }finally{__CLR4_3_12r2rjxvtz8q0.R.flushNeeded();}}


    public void add(T item) {try{__CLR4_3_12r2rjxvtz8q0.R.inc(102);
        __CLR4_3_12r2rjxvtz8q0.R.inc(103);LinkedNode<T> toAdd = new LinkedNode<T>(item);
        __CLR4_3_12r2rjxvtz8q0.R.inc(104);if ((((first == null)&&(__CLR4_3_12r2rjxvtz8q0.R.iget(105)!=0|true))||(__CLR4_3_12r2rjxvtz8q0.R.iget(106)==0&false))) {{
            __CLR4_3_12r2rjxvtz8q0.R.inc(107);first = toAdd;
        } }else {{
            __CLR4_3_12r2rjxvtz8q0.R.inc(108);LinkedNode<T> cursor = first;
            __CLR4_3_12r2rjxvtz8q0.R.inc(109);while((((cursor.next != null)&&(__CLR4_3_12r2rjxvtz8q0.R.iget(110)!=0|true))||(__CLR4_3_12r2rjxvtz8q0.R.iget(111)==0&false))) {{
                __CLR4_3_12r2rjxvtz8q0.R.inc(112);cursor = cursor.next;
            }
            }__CLR4_3_12r2rjxvtz8q0.R.inc(113);cursor.next = toAdd;
        }
        }__CLR4_3_12r2rjxvtz8q0.R.inc(114);size++;
    }finally{__CLR4_3_12r2rjxvtz8q0.R.flushNeeded();}}


    public void remove(T item) {try{__CLR4_3_12r2rjxvtz8q0.R.inc(115);
        __CLR4_3_12r2rjxvtz8q0.R.inc(116);if((((first != null && !first.value.equals(item))&&(__CLR4_3_12r2rjxvtz8q0.R.iget(117)!=0|true))||(__CLR4_3_12r2rjxvtz8q0.R.iget(118)==0&false))) {{
            __CLR4_3_12r2rjxvtz8q0.R.inc(119);LinkedNode<T> cursor = first;
            __CLR4_3_12r2rjxvtz8q0.R.inc(120);LinkedNode<T> previous = cursor;
            __CLR4_3_12r2rjxvtz8q0.R.inc(121);cursor = cursor.next;
            __CLR4_3_12r2rjxvtz8q0.R.inc(122);while((((cursor != null && !cursor.value.equals(item))&&(__CLR4_3_12r2rjxvtz8q0.R.iget(123)!=0|true))||(__CLR4_3_12r2rjxvtz8q0.R.iget(124)==0&false))) {{
                __CLR4_3_12r2rjxvtz8q0.R.inc(125);previous = cursor;
                __CLR4_3_12r2rjxvtz8q0.R.inc(126);cursor = cursor.next;
            }
            }__CLR4_3_12r2rjxvtz8q0.R.inc(127);if((((cursor != null)&&(__CLR4_3_12r2rjxvtz8q0.R.iget(128)!=0|true))||(__CLR4_3_12r2rjxvtz8q0.R.iget(129)==0&false))) {{
                __CLR4_3_12r2rjxvtz8q0.R.inc(130);previous.next = cursor.next;
                __CLR4_3_12r2rjxvtz8q0.R.inc(131);size--;
            }  
        }} }else {__CLR4_3_12r2rjxvtz8q0.R.inc(132);if((((first != null && first.value.equals(item))&&(__CLR4_3_12r2rjxvtz8q0.R.iget(133)!=0|true))||(__CLR4_3_12r2rjxvtz8q0.R.iget(134)==0&false))) {{
            __CLR4_3_12r2rjxvtz8q0.R.inc(135);first = first.next;
            __CLR4_3_12r2rjxvtz8q0.R.inc(136);size--;
        }
    }}}finally{__CLR4_3_12r2rjxvtz8q0.R.flushNeeded();}}


    public void removeAll(T item) {try{__CLR4_3_12r2rjxvtz8q0.R.inc(137);
        __CLR4_3_12r2rjxvtz8q0.R.inc(138);while((((this.contains(item))&&(__CLR4_3_12r2rjxvtz8q0.R.iget(139)!=0|true))||(__CLR4_3_12r2rjxvtz8q0.R.iget(140)==0&false))) {{
            __CLR4_3_12r2rjxvtz8q0.R.inc(141);this.remove(item);
        }
    }}finally{__CLR4_3_12r2rjxvtz8q0.R.flushNeeded();}}


    public T get (int index) {try{__CLR4_3_12r2rjxvtz8q0.R.inc(142);
        __CLR4_3_12r2rjxvtz8q0.R.inc(143);if((((index > size-1 || index < 0)&&(__CLR4_3_12r2rjxvtz8q0.R.iget(144)!=0|true))||(__CLR4_3_12r2rjxvtz8q0.R.iget(145)==0&false))) {{
            __CLR4_3_12r2rjxvtz8q0.R.inc(146);throw new IndexOutOfBoundsException("Index " + index + " is out of bounds (size : " + size + ").");
        }
        }__CLR4_3_12r2rjxvtz8q0.R.inc(147);int counter = 0;
        __CLR4_3_12r2rjxvtz8q0.R.inc(148);LinkedNode<T> cursor = first;
        __CLR4_3_12r2rjxvtz8q0.R.inc(149);while((((counter != index)&&(__CLR4_3_12r2rjxvtz8q0.R.iget(150)!=0|true))||(__CLR4_3_12r2rjxvtz8q0.R.iget(151)==0&false))) {{
            __CLR4_3_12r2rjxvtz8q0.R.inc(152);counter++;
            __CLR4_3_12r2rjxvtz8q0.R.inc(153);cursor = cursor.next;
        }
        }__CLR4_3_12r2rjxvtz8q0.R.inc(154);return cursor.value;
    }finally{__CLR4_3_12r2rjxvtz8q0.R.flushNeeded();}}


    public void set(int index, T item) {try{__CLR4_3_12r2rjxvtz8q0.R.inc(155);
        __CLR4_3_12r2rjxvtz8q0.R.inc(156);if((((index > size-1 || index < 0)&&(__CLR4_3_12r2rjxvtz8q0.R.iget(157)!=0|true))||(__CLR4_3_12r2rjxvtz8q0.R.iget(158)==0&false))) {{
            __CLR4_3_12r2rjxvtz8q0.R.inc(159);throw new IndexOutOfBoundsException("Index " + index + " is out of bounds (size : "+ size + ").");
        }
        }__CLR4_3_12r2rjxvtz8q0.R.inc(160);int counter = 0;
        __CLR4_3_12r2rjxvtz8q0.R.inc(161);LinkedNode<T> cursor = first;
        __CLR4_3_12r2rjxvtz8q0.R.inc(162);while((((counter != index)&&(__CLR4_3_12r2rjxvtz8q0.R.iget(163)!=0|true))||(__CLR4_3_12r2rjxvtz8q0.R.iget(164)==0&false))) {{
            __CLR4_3_12r2rjxvtz8q0.R.inc(165);counter++;
            __CLR4_3_12r2rjxvtz8q0.R.inc(166);cursor = cursor.next;
        }
        }__CLR4_3_12r2rjxvtz8q0.R.inc(167);cursor.value = item;
    }finally{__CLR4_3_12r2rjxvtz8q0.R.flushNeeded();}}

    
    public int indexOf(T item) {try{__CLR4_3_12r2rjxvtz8q0.R.inc(168);
        __CLR4_3_12r2rjxvtz8q0.R.inc(169);int index = 0;
        __CLR4_3_12r2rjxvtz8q0.R.inc(170);LinkedNode<T> cursor = first;
        __CLR4_3_12r2rjxvtz8q0.R.inc(171);while((((cursor != null)&&(__CLR4_3_12r2rjxvtz8q0.R.iget(172)!=0|true))||(__CLR4_3_12r2rjxvtz8q0.R.iget(173)==0&false))) {{
            __CLR4_3_12r2rjxvtz8q0.R.inc(174);if((((cursor.value.equals(item))&&(__CLR4_3_12r2rjxvtz8q0.R.iget(175)!=0|true))||(__CLR4_3_12r2rjxvtz8q0.R.iget(176)==0&false))) {{ __CLR4_3_12r2rjxvtz8q0.R.inc(177);return index; }
            }__CLR4_3_12r2rjxvtz8q0.R.inc(178);index++;
            __CLR4_3_12r2rjxvtz8q0.R.inc(179);cursor = cursor.next;
        }
        }__CLR4_3_12r2rjxvtz8q0.R.inc(180);return -1;
    }finally{__CLR4_3_12r2rjxvtz8q0.R.flushNeeded();}}


    public boolean contains(T item) {try{__CLR4_3_12r2rjxvtz8q0.R.inc(181);
        __CLR4_3_12r2rjxvtz8q0.R.inc(182);return this.indexOf(item) != -1;
    }finally{__CLR4_3_12r2rjxvtz8q0.R.flushNeeded();}}


    public int size() {try{__CLR4_3_12r2rjxvtz8q0.R.inc(183);
        __CLR4_3_12r2rjxvtz8q0.R.inc(184);return size;
    }finally{__CLR4_3_12r2rjxvtz8q0.R.flushNeeded();}}


    public boolean isEmpty() {try{__CLR4_3_12r2rjxvtz8q0.R.inc(185);
        __CLR4_3_12r2rjxvtz8q0.R.inc(186);return first == null;
    }finally{__CLR4_3_12r2rjxvtz8q0.R.flushNeeded();}}

}

class LinkedNode<T> {public static class __CLR4_3_12r57jxvtz8q2{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{if(20180921211537623L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.3.1#20180921211537623,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0070\u0068\u006f\u0075\u0064\u0061\u0069\u006c\u002f\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1562677739387L,8589935092L,193,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_3_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    T value;

    LinkedNode<T> next;

    public LinkedNode(T value) {try{__CLR4_3_12r57jxvtz8q2.R.inc(187); __CLR4_3_12r57jxvtz8q2.R.inc(188);this.value = value; __CLR4_3_12r57jxvtz8q2.R.inc(189);this.next = null; }finally{__CLR4_3_12r57jxvtz8q2.R.flushNeeded();}}

    public LinkedNode(T value, LinkedNode<T> next) {try{__CLR4_3_12r57jxvtz8q2.R.inc(190); __CLR4_3_12r57jxvtz8q2.R.inc(191);this.value = value; __CLR4_3_12r57jxvtz8q2.R.inc(192);this.next = next; }finally{__CLR4_3_12r57jxvtz8q2.R.flushNeeded();}}

}