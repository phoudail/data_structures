/* $$ This file has been instrumented by Clover 4.3.1#20180921211537623 $$ */package tutorials;

public class LinkedListv2<T> implements List<T> {public static class __CLR4_3_12o2ojxkaws4p{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_3_1();if(20180921211537623L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.3.1#20180921211537623,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0070\u0068\u006f\u0075\u0064\u0061\u0069\u006c\u002f\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1561980583896L,8589935092L,183,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_3_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private LinkedNodev2<T> first;
    private LinkedNodev2<T> last;
    private int size = 0;

    public LinkedListv2() {try{__CLR4_3_12o2ojxkaws4p.R.inc(96);
        __CLR4_3_12o2ojxkaws4p.R.inc(97);first = null;
        __CLR4_3_12o2ojxkaws4p.R.inc(98);last = null;
        __CLR4_3_12o2ojxkaws4p.R.inc(99);size = 0;
    }finally{__CLR4_3_12o2ojxkaws4p.R.flushNeeded();}}

    public void add(T item) {try{__CLR4_3_12o2ojxkaws4p.R.inc(100);
        __CLR4_3_12o2ojxkaws4p.R.inc(101);LinkedNodev2<T> toAdd = new LinkedNodev2<T>(item);
        __CLR4_3_12o2ojxkaws4p.R.inc(102);if((((first == null)&&(__CLR4_3_12o2ojxkaws4p.R.iget(103)!=0|true))||(__CLR4_3_12o2ojxkaws4p.R.iget(104)==0&false))) {{
            __CLR4_3_12o2ojxkaws4p.R.inc(105);first = toAdd;
            __CLR4_3_12o2ojxkaws4p.R.inc(106);last = toAdd;
        } }else {{
            __CLR4_3_12o2ojxkaws4p.R.inc(107);toAdd.previous = last;
            __CLR4_3_12o2ojxkaws4p.R.inc(108);last.next = toAdd;
            __CLR4_3_12o2ojxkaws4p.R.inc(109);last = last.next;
        }
        }__CLR4_3_12o2ojxkaws4p.R.inc(110);size++;
    }finally{__CLR4_3_12o2ojxkaws4p.R.flushNeeded();}}

    public void remove(T item) {try{__CLR4_3_12o2ojxkaws4p.R.inc(111);
        __CLR4_3_12o2ojxkaws4p.R.inc(112);LinkedNodev2<T> cursor = first;
        __CLR4_3_12o2ojxkaws4p.R.inc(113);while((((cursor != null && !cursor.value.equals(item))&&(__CLR4_3_12o2ojxkaws4p.R.iget(114)!=0|true))||(__CLR4_3_12o2ojxkaws4p.R.iget(115)==0&false))) {{
            __CLR4_3_12o2ojxkaws4p.R.inc(116);cursor = cursor.next;
        }
        }__CLR4_3_12o2ojxkaws4p.R.inc(117);if((((cursor != null)&&(__CLR4_3_12o2ojxkaws4p.R.iget(118)!=0|true))||(__CLR4_3_12o2ojxkaws4p.R.iget(119)==0&false))) {{
            __CLR4_3_12o2ojxkaws4p.R.inc(120);LinkedNodev2<T> prev = cursor.previous;
            __CLR4_3_12o2ojxkaws4p.R.inc(121);LinkedNodev2<T> nxt = cursor.next;
            __CLR4_3_12o2ojxkaws4p.R.inc(122);if((((prev != null)&&(__CLR4_3_12o2ojxkaws4p.R.iget(123)!=0|true))||(__CLR4_3_12o2ojxkaws4p.R.iget(124)==0&false))) {{ __CLR4_3_12o2ojxkaws4p.R.inc(125);prev.next = nxt; } }else {{ __CLR4_3_12o2ojxkaws4p.R.inc(126);first = nxt; }
            }__CLR4_3_12o2ojxkaws4p.R.inc(127);if((((nxt != null)&&(__CLR4_3_12o2ojxkaws4p.R.iget(128)!=0|true))||(__CLR4_3_12o2ojxkaws4p.R.iget(129)==0&false))) {{ __CLR4_3_12o2ojxkaws4p.R.inc(130);nxt.previous = prev; } }else {{__CLR4_3_12o2ojxkaws4p.R.inc(131);last = prev; }
            }__CLR4_3_12o2ojxkaws4p.R.inc(132);size--;
        }  
    }}finally{__CLR4_3_12o2ojxkaws4p.R.flushNeeded();}}

    public void removeAll(T item)  {try{__CLR4_3_12o2ojxkaws4p.R.inc(133);
        __CLR4_3_12o2ojxkaws4p.R.inc(134);while((((this.contains(item))&&(__CLR4_3_12o2ojxkaws4p.R.iget(135)!=0|true))||(__CLR4_3_12o2ojxkaws4p.R.iget(136)==0&false))) {{
            __CLR4_3_12o2ojxkaws4p.R.inc(137);this.remove(item);
        }
    }}finally{__CLR4_3_12o2ojxkaws4p.R.flushNeeded();}}

    public T get (int index) {try{__CLR4_3_12o2ojxkaws4p.R.inc(138);
        __CLR4_3_12o2ojxkaws4p.R.inc(139);if((((index > size-1 || index < 0)&&(__CLR4_3_12o2ojxkaws4p.R.iget(140)!=0|true))||(__CLR4_3_12o2ojxkaws4p.R.iget(141)==0&false))) {{
            __CLR4_3_12o2ojxkaws4p.R.inc(142);throw new IndexOutOfBoundsException("Index " + index + " is out of bounds (size : " + size + ").");
        }
        }__CLR4_3_12o2ojxkaws4p.R.inc(143);int counter = 0;
        __CLR4_3_12o2ojxkaws4p.R.inc(144);LinkedNodev2<T> cursor = first;
        __CLR4_3_12o2ojxkaws4p.R.inc(145);while((((counter != index)&&(__CLR4_3_12o2ojxkaws4p.R.iget(146)!=0|true))||(__CLR4_3_12o2ojxkaws4p.R.iget(147)==0&false))) {{
            __CLR4_3_12o2ojxkaws4p.R.inc(148);counter++;
            __CLR4_3_12o2ojxkaws4p.R.inc(149);cursor = cursor.next;
        }
        }__CLR4_3_12o2ojxkaws4p.R.inc(150);return cursor.value;
    }finally{__CLR4_3_12o2ojxkaws4p.R.flushNeeded();}}


    public void set(int index, T item) {try{__CLR4_3_12o2ojxkaws4p.R.inc(151);
        __CLR4_3_12o2ojxkaws4p.R.inc(152);if((((index > size-1 || index < 0)&&(__CLR4_3_12o2ojxkaws4p.R.iget(153)!=0|true))||(__CLR4_3_12o2ojxkaws4p.R.iget(154)==0&false))) {{
            __CLR4_3_12o2ojxkaws4p.R.inc(155);throw new IndexOutOfBoundsException("Index " + index + " is out of bounds (size : "+ size + ").");
        }
        }__CLR4_3_12o2ojxkaws4p.R.inc(156);int counter = 0;
        __CLR4_3_12o2ojxkaws4p.R.inc(157);LinkedNodev2<T> cursor = first;
        __CLR4_3_12o2ojxkaws4p.R.inc(158);while((((counter != index)&&(__CLR4_3_12o2ojxkaws4p.R.iget(159)!=0|true))||(__CLR4_3_12o2ojxkaws4p.R.iget(160)==0&false))) {{
            __CLR4_3_12o2ojxkaws4p.R.inc(161);counter++;
            __CLR4_3_12o2ojxkaws4p.R.inc(162);cursor = cursor.next;
        }
        }__CLR4_3_12o2ojxkaws4p.R.inc(163);cursor.value = item;
    }finally{__CLR4_3_12o2ojxkaws4p.R.flushNeeded();}}

    public int indexOf(T item) {try{__CLR4_3_12o2ojxkaws4p.R.inc(164);
        __CLR4_3_12o2ojxkaws4p.R.inc(165);int index = 0;
        __CLR4_3_12o2ojxkaws4p.R.inc(166);LinkedNodev2<T> cursor = first;
        __CLR4_3_12o2ojxkaws4p.R.inc(167);while((((cursor != null)&&(__CLR4_3_12o2ojxkaws4p.R.iget(168)!=0|true))||(__CLR4_3_12o2ojxkaws4p.R.iget(169)==0&false))) {{
            __CLR4_3_12o2ojxkaws4p.R.inc(170);if((((cursor.value.equals(item))&&(__CLR4_3_12o2ojxkaws4p.R.iget(171)!=0|true))||(__CLR4_3_12o2ojxkaws4p.R.iget(172)==0&false))) {{ __CLR4_3_12o2ojxkaws4p.R.inc(173);return index; }
            }__CLR4_3_12o2ojxkaws4p.R.inc(174);index++;
            __CLR4_3_12o2ojxkaws4p.R.inc(175);cursor = cursor.next;
        }
        }__CLR4_3_12o2ojxkaws4p.R.inc(176);return -1;
    }finally{__CLR4_3_12o2ojxkaws4p.R.flushNeeded();}}

    public boolean contains(T item) {try{__CLR4_3_12o2ojxkaws4p.R.inc(177);
        __CLR4_3_12o2ojxkaws4p.R.inc(178);return this.indexOf(item) != -1;
    }finally{__CLR4_3_12o2ojxkaws4p.R.flushNeeded();}}

    public int size() {try{__CLR4_3_12o2ojxkaws4p.R.inc(179);
        __CLR4_3_12o2ojxkaws4p.R.inc(180);return size;
    }finally{__CLR4_3_12o2ojxkaws4p.R.flushNeeded();}}

    public boolean isEmpty() {try{__CLR4_3_12o2ojxkaws4p.R.inc(181);
        __CLR4_3_12o2ojxkaws4p.R.inc(182);return first == null;
    }finally{__CLR4_3_12o2ojxkaws4p.R.flushNeeded();}}

}

class LinkedNodev2<T> {public static class __CLR4_3_12o53jxkaws4r{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{if(20180921211537623L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.3.1#20180921211537623,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0070\u0068\u006f\u0075\u0064\u0061\u0069\u006c\u002f\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1561980583896L,8589935092L,191,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_3_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    T value;

    LinkedNodev2<T> previous;
    LinkedNodev2<T> next;

    public LinkedNodev2(T value) {try{__CLR4_3_12o53jxkaws4r.R.inc(183); __CLR4_3_12o53jxkaws4r.R.inc(184);this.value = value; __CLR4_3_12o53jxkaws4r.R.inc(185);this.next = null; __CLR4_3_12o53jxkaws4r.R.inc(186);this.previous = null; }finally{__CLR4_3_12o53jxkaws4r.R.flushNeeded();}}

    public LinkedNodev2(T value, LinkedNodev2<T> previous, LinkedNodev2<T> next) {try{__CLR4_3_12o53jxkaws4r.R.inc(187); __CLR4_3_12o53jxkaws4r.R.inc(188);this.value = value; __CLR4_3_12o53jxkaws4r.R.inc(189);this.next = next; __CLR4_3_12o53jxkaws4r.R.inc(190);this.previous = previous; }finally{__CLR4_3_12o53jxkaws4r.R.flushNeeded();}}

}