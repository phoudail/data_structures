/* $$ This file has been instrumented by Clover 4.3.1#20180921211537623 $$ */package tutorials;

public class LinkedListv2<T> implements List<T> {public static class __CLR4_3_15d5djxvtz8qf{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_3_1();if(20180921211537623L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.3.1#20180921211537623,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0070\u0068\u006f\u0075\u0064\u0061\u0069\u006c\u002f\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1562677739387L,8589935092L,280,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_3_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private LinkedNodev2<T> first;
    private LinkedNodev2<T> last;
    private int size = 0;

    public LinkedListv2() {try{__CLR4_3_15d5djxvtz8qf.R.inc(193);
        __CLR4_3_15d5djxvtz8qf.R.inc(194);first = null;
        __CLR4_3_15d5djxvtz8qf.R.inc(195);last = null;
        __CLR4_3_15d5djxvtz8qf.R.inc(196);size = 0;
    }finally{__CLR4_3_15d5djxvtz8qf.R.flushNeeded();}}

    public void add(T item) {try{__CLR4_3_15d5djxvtz8qf.R.inc(197);
        __CLR4_3_15d5djxvtz8qf.R.inc(198);LinkedNodev2<T> toAdd = new LinkedNodev2<T>(item);
        __CLR4_3_15d5djxvtz8qf.R.inc(199);if((((first == null)&&(__CLR4_3_15d5djxvtz8qf.R.iget(200)!=0|true))||(__CLR4_3_15d5djxvtz8qf.R.iget(201)==0&false))) {{
            __CLR4_3_15d5djxvtz8qf.R.inc(202);first = toAdd;
            __CLR4_3_15d5djxvtz8qf.R.inc(203);last = toAdd;
        } }else {{
            __CLR4_3_15d5djxvtz8qf.R.inc(204);toAdd.previous = last;
            __CLR4_3_15d5djxvtz8qf.R.inc(205);last.next = toAdd;
            __CLR4_3_15d5djxvtz8qf.R.inc(206);last = last.next;
        }
        }__CLR4_3_15d5djxvtz8qf.R.inc(207);size++;
    }finally{__CLR4_3_15d5djxvtz8qf.R.flushNeeded();}}

    public void remove(T item) {try{__CLR4_3_15d5djxvtz8qf.R.inc(208);
        __CLR4_3_15d5djxvtz8qf.R.inc(209);LinkedNodev2<T> cursor = first;
        __CLR4_3_15d5djxvtz8qf.R.inc(210);while((((cursor != null && !cursor.value.equals(item))&&(__CLR4_3_15d5djxvtz8qf.R.iget(211)!=0|true))||(__CLR4_3_15d5djxvtz8qf.R.iget(212)==0&false))) {{
            __CLR4_3_15d5djxvtz8qf.R.inc(213);cursor = cursor.next;
        }
        }__CLR4_3_15d5djxvtz8qf.R.inc(214);if((((cursor != null)&&(__CLR4_3_15d5djxvtz8qf.R.iget(215)!=0|true))||(__CLR4_3_15d5djxvtz8qf.R.iget(216)==0&false))) {{
            __CLR4_3_15d5djxvtz8qf.R.inc(217);LinkedNodev2<T> prev = cursor.previous;
            __CLR4_3_15d5djxvtz8qf.R.inc(218);LinkedNodev2<T> nxt = cursor.next;
            __CLR4_3_15d5djxvtz8qf.R.inc(219);if((((prev != null)&&(__CLR4_3_15d5djxvtz8qf.R.iget(220)!=0|true))||(__CLR4_3_15d5djxvtz8qf.R.iget(221)==0&false))) {{ __CLR4_3_15d5djxvtz8qf.R.inc(222);prev.next = nxt; } }else {{ __CLR4_3_15d5djxvtz8qf.R.inc(223);first = nxt; }
            }__CLR4_3_15d5djxvtz8qf.R.inc(224);if((((nxt != null)&&(__CLR4_3_15d5djxvtz8qf.R.iget(225)!=0|true))||(__CLR4_3_15d5djxvtz8qf.R.iget(226)==0&false))) {{ __CLR4_3_15d5djxvtz8qf.R.inc(227);nxt.previous = prev; } }else {{__CLR4_3_15d5djxvtz8qf.R.inc(228);last = prev; }
            }__CLR4_3_15d5djxvtz8qf.R.inc(229);size--;
        }  
    }}finally{__CLR4_3_15d5djxvtz8qf.R.flushNeeded();}}

    public void removeAll(T item)  {try{__CLR4_3_15d5djxvtz8qf.R.inc(230);
        __CLR4_3_15d5djxvtz8qf.R.inc(231);while((((this.contains(item))&&(__CLR4_3_15d5djxvtz8qf.R.iget(232)!=0|true))||(__CLR4_3_15d5djxvtz8qf.R.iget(233)==0&false))) {{
            __CLR4_3_15d5djxvtz8qf.R.inc(234);this.remove(item);
        }
    }}finally{__CLR4_3_15d5djxvtz8qf.R.flushNeeded();}}

    public T get (int index) {try{__CLR4_3_15d5djxvtz8qf.R.inc(235);
        __CLR4_3_15d5djxvtz8qf.R.inc(236);if((((index > size-1 || index < 0)&&(__CLR4_3_15d5djxvtz8qf.R.iget(237)!=0|true))||(__CLR4_3_15d5djxvtz8qf.R.iget(238)==0&false))) {{
            __CLR4_3_15d5djxvtz8qf.R.inc(239);throw new IndexOutOfBoundsException("Index " + index + " is out of bounds (size : " + size + ").");
        }
        }__CLR4_3_15d5djxvtz8qf.R.inc(240);int counter = 0;
        __CLR4_3_15d5djxvtz8qf.R.inc(241);LinkedNodev2<T> cursor = first;
        __CLR4_3_15d5djxvtz8qf.R.inc(242);while((((counter != index)&&(__CLR4_3_15d5djxvtz8qf.R.iget(243)!=0|true))||(__CLR4_3_15d5djxvtz8qf.R.iget(244)==0&false))) {{
            __CLR4_3_15d5djxvtz8qf.R.inc(245);counter++;
            __CLR4_3_15d5djxvtz8qf.R.inc(246);cursor = cursor.next;
        }
        }__CLR4_3_15d5djxvtz8qf.R.inc(247);return cursor.value;
    }finally{__CLR4_3_15d5djxvtz8qf.R.flushNeeded();}}


    public void set(int index, T item) {try{__CLR4_3_15d5djxvtz8qf.R.inc(248);
        __CLR4_3_15d5djxvtz8qf.R.inc(249);if((((index > size-1 || index < 0)&&(__CLR4_3_15d5djxvtz8qf.R.iget(250)!=0|true))||(__CLR4_3_15d5djxvtz8qf.R.iget(251)==0&false))) {{
            __CLR4_3_15d5djxvtz8qf.R.inc(252);throw new IndexOutOfBoundsException("Index " + index + " is out of bounds (size : "+ size + ").");
        }
        }__CLR4_3_15d5djxvtz8qf.R.inc(253);int counter = 0;
        __CLR4_3_15d5djxvtz8qf.R.inc(254);LinkedNodev2<T> cursor = first;
        __CLR4_3_15d5djxvtz8qf.R.inc(255);while((((counter != index)&&(__CLR4_3_15d5djxvtz8qf.R.iget(256)!=0|true))||(__CLR4_3_15d5djxvtz8qf.R.iget(257)==0&false))) {{
            __CLR4_3_15d5djxvtz8qf.R.inc(258);counter++;
            __CLR4_3_15d5djxvtz8qf.R.inc(259);cursor = cursor.next;
        }
        }__CLR4_3_15d5djxvtz8qf.R.inc(260);cursor.value = item;
    }finally{__CLR4_3_15d5djxvtz8qf.R.flushNeeded();}}

    public int indexOf(T item) {try{__CLR4_3_15d5djxvtz8qf.R.inc(261);
        __CLR4_3_15d5djxvtz8qf.R.inc(262);int index = 0;
        __CLR4_3_15d5djxvtz8qf.R.inc(263);LinkedNodev2<T> cursor = first;
        __CLR4_3_15d5djxvtz8qf.R.inc(264);while((((cursor != null)&&(__CLR4_3_15d5djxvtz8qf.R.iget(265)!=0|true))||(__CLR4_3_15d5djxvtz8qf.R.iget(266)==0&false))) {{
            __CLR4_3_15d5djxvtz8qf.R.inc(267);if((((cursor.value.equals(item))&&(__CLR4_3_15d5djxvtz8qf.R.iget(268)!=0|true))||(__CLR4_3_15d5djxvtz8qf.R.iget(269)==0&false))) {{ __CLR4_3_15d5djxvtz8qf.R.inc(270);return index; }
            }__CLR4_3_15d5djxvtz8qf.R.inc(271);index++;
            __CLR4_3_15d5djxvtz8qf.R.inc(272);cursor = cursor.next;
        }
        }__CLR4_3_15d5djxvtz8qf.R.inc(273);return -1;
    }finally{__CLR4_3_15d5djxvtz8qf.R.flushNeeded();}}

    public boolean contains(T item) {try{__CLR4_3_15d5djxvtz8qf.R.inc(274);
        __CLR4_3_15d5djxvtz8qf.R.inc(275);return this.indexOf(item) != -1;
    }finally{__CLR4_3_15d5djxvtz8qf.R.flushNeeded();}}

    public int size() {try{__CLR4_3_15d5djxvtz8qf.R.inc(276);
        __CLR4_3_15d5djxvtz8qf.R.inc(277);return size;
    }finally{__CLR4_3_15d5djxvtz8qf.R.flushNeeded();}}

    public boolean isEmpty() {try{__CLR4_3_15d5djxvtz8qf.R.inc(278);
        __CLR4_3_15d5djxvtz8qf.R.inc(279);return first == null;
    }finally{__CLR4_3_15d5djxvtz8qf.R.flushNeeded();}}

}

class LinkedNodev2<T> {public static class __CLR4_3_15d7sjxvtz8qg{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{if(20180921211537623L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.3.1#20180921211537623,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0070\u0068\u006f\u0075\u0064\u0061\u0069\u006c\u002f\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1562677739387L,8589935092L,288,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_3_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    T value;

    LinkedNodev2<T> previous;
    LinkedNodev2<T> next;

    public LinkedNodev2(T value) {try{__CLR4_3_15d7sjxvtz8qg.R.inc(280); __CLR4_3_15d7sjxvtz8qg.R.inc(281);this.value = value; __CLR4_3_15d7sjxvtz8qg.R.inc(282);this.next = null; __CLR4_3_15d7sjxvtz8qg.R.inc(283);this.previous = null; }finally{__CLR4_3_15d7sjxvtz8qg.R.flushNeeded();}}

    public LinkedNodev2(T value, LinkedNodev2<T> previous, LinkedNodev2<T> next) {try{__CLR4_3_15d7sjxvtz8qg.R.inc(284); __CLR4_3_15d7sjxvtz8qg.R.inc(285);this.value = value; __CLR4_3_15d7sjxvtz8qg.R.inc(286);this.next = next; __CLR4_3_15d7sjxvtz8qg.R.inc(287);this.previous = previous; }finally{__CLR4_3_15d7sjxvtz8qg.R.flushNeeded();}}

}