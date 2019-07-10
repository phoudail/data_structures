/* $$ This file has been instrumented by Clover 4.3.1#20180921211537623 $$ */package tutorials;

public class LinkedListv2<T> implements List<T> {public static class __CLR4_3_15b5bjxvvfl20{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_3_1();if(20180921211537623L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.3.1#20180921211537623,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0070\u0068\u006f\u0075\u0064\u0061\u0069\u006c\u002f\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1562680181490L,8589935092L,278,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_3_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private LinkedNodev2<T> first;
    private LinkedNodev2<T> last;
    private int size = 0;

    public LinkedListv2() {try{__CLR4_3_15b5bjxvvfl20.R.inc(191);
        __CLR4_3_15b5bjxvvfl20.R.inc(192);first = null;
        __CLR4_3_15b5bjxvvfl20.R.inc(193);last = null;
        __CLR4_3_15b5bjxvvfl20.R.inc(194);size = 0;
    }finally{__CLR4_3_15b5bjxvvfl20.R.flushNeeded();}}

    public void add(T item) {try{__CLR4_3_15b5bjxvvfl20.R.inc(195);
        __CLR4_3_15b5bjxvvfl20.R.inc(196);LinkedNodev2<T> toAdd = new LinkedNodev2<T>(item);
        __CLR4_3_15b5bjxvvfl20.R.inc(197);if((((first == null)&&(__CLR4_3_15b5bjxvvfl20.R.iget(198)!=0|true))||(__CLR4_3_15b5bjxvvfl20.R.iget(199)==0&false))) {{
            __CLR4_3_15b5bjxvvfl20.R.inc(200);first = toAdd;
            __CLR4_3_15b5bjxvvfl20.R.inc(201);last = toAdd;
        } }else {{
            __CLR4_3_15b5bjxvvfl20.R.inc(202);toAdd.previous = last;
            __CLR4_3_15b5bjxvvfl20.R.inc(203);last.next = toAdd;
            __CLR4_3_15b5bjxvvfl20.R.inc(204);last = last.next;
        }
        }__CLR4_3_15b5bjxvvfl20.R.inc(205);size++;
    }finally{__CLR4_3_15b5bjxvvfl20.R.flushNeeded();}}

    public void remove(T item) {try{__CLR4_3_15b5bjxvvfl20.R.inc(206);
        __CLR4_3_15b5bjxvvfl20.R.inc(207);LinkedNodev2<T> cursor = first;
        __CLR4_3_15b5bjxvvfl20.R.inc(208);while((((cursor != null && !cursor.value.equals(item))&&(__CLR4_3_15b5bjxvvfl20.R.iget(209)!=0|true))||(__CLR4_3_15b5bjxvvfl20.R.iget(210)==0&false))) {{
            __CLR4_3_15b5bjxvvfl20.R.inc(211);cursor = cursor.next;
        }
        }__CLR4_3_15b5bjxvvfl20.R.inc(212);if((((cursor != null)&&(__CLR4_3_15b5bjxvvfl20.R.iget(213)!=0|true))||(__CLR4_3_15b5bjxvvfl20.R.iget(214)==0&false))) {{
            __CLR4_3_15b5bjxvvfl20.R.inc(215);LinkedNodev2<T> prev = cursor.previous;
            __CLR4_3_15b5bjxvvfl20.R.inc(216);LinkedNodev2<T> nxt = cursor.next;
            __CLR4_3_15b5bjxvvfl20.R.inc(217);if((((prev != null)&&(__CLR4_3_15b5bjxvvfl20.R.iget(218)!=0|true))||(__CLR4_3_15b5bjxvvfl20.R.iget(219)==0&false))) {{ __CLR4_3_15b5bjxvvfl20.R.inc(220);prev.next = nxt; } }else {{ __CLR4_3_15b5bjxvvfl20.R.inc(221);first = nxt; }
            }__CLR4_3_15b5bjxvvfl20.R.inc(222);if((((nxt != null)&&(__CLR4_3_15b5bjxvvfl20.R.iget(223)!=0|true))||(__CLR4_3_15b5bjxvvfl20.R.iget(224)==0&false))) {{ __CLR4_3_15b5bjxvvfl20.R.inc(225);nxt.previous = prev; } }else {{__CLR4_3_15b5bjxvvfl20.R.inc(226);last = prev; }
            }__CLR4_3_15b5bjxvvfl20.R.inc(227);size--;
        }  
    }}finally{__CLR4_3_15b5bjxvvfl20.R.flushNeeded();}}

    public void removeAll(T item)  {try{__CLR4_3_15b5bjxvvfl20.R.inc(228);
        __CLR4_3_15b5bjxvvfl20.R.inc(229);while((((this.contains(item))&&(__CLR4_3_15b5bjxvvfl20.R.iget(230)!=0|true))||(__CLR4_3_15b5bjxvvfl20.R.iget(231)==0&false))) {{
            __CLR4_3_15b5bjxvvfl20.R.inc(232);this.remove(item);
        }
    }}finally{__CLR4_3_15b5bjxvvfl20.R.flushNeeded();}}

    public T get (int index) {try{__CLR4_3_15b5bjxvvfl20.R.inc(233);
        __CLR4_3_15b5bjxvvfl20.R.inc(234);if((((index > size-1 || index < 0)&&(__CLR4_3_15b5bjxvvfl20.R.iget(235)!=0|true))||(__CLR4_3_15b5bjxvvfl20.R.iget(236)==0&false))) {{
            __CLR4_3_15b5bjxvvfl20.R.inc(237);throw new IndexOutOfBoundsException("Index " + index + " is out of bounds (size : " + size + ").");
        }
        }__CLR4_3_15b5bjxvvfl20.R.inc(238);int counter = 0;
        __CLR4_3_15b5bjxvvfl20.R.inc(239);LinkedNodev2<T> cursor = first;
        __CLR4_3_15b5bjxvvfl20.R.inc(240);while((((counter != index)&&(__CLR4_3_15b5bjxvvfl20.R.iget(241)!=0|true))||(__CLR4_3_15b5bjxvvfl20.R.iget(242)==0&false))) {{
            __CLR4_3_15b5bjxvvfl20.R.inc(243);counter++;
            __CLR4_3_15b5bjxvvfl20.R.inc(244);cursor = cursor.next;
        }
        }__CLR4_3_15b5bjxvvfl20.R.inc(245);return cursor.value;
    }finally{__CLR4_3_15b5bjxvvfl20.R.flushNeeded();}}


    public void set(int index, T item) {try{__CLR4_3_15b5bjxvvfl20.R.inc(246);
        __CLR4_3_15b5bjxvvfl20.R.inc(247);if((((index > size-1 || index < 0)&&(__CLR4_3_15b5bjxvvfl20.R.iget(248)!=0|true))||(__CLR4_3_15b5bjxvvfl20.R.iget(249)==0&false))) {{
            __CLR4_3_15b5bjxvvfl20.R.inc(250);throw new IndexOutOfBoundsException("Index " + index + " is out of bounds (size : "+ size + ").");
        }
        }__CLR4_3_15b5bjxvvfl20.R.inc(251);int counter = 0;
        __CLR4_3_15b5bjxvvfl20.R.inc(252);LinkedNodev2<T> cursor = first;
        __CLR4_3_15b5bjxvvfl20.R.inc(253);while((((counter != index)&&(__CLR4_3_15b5bjxvvfl20.R.iget(254)!=0|true))||(__CLR4_3_15b5bjxvvfl20.R.iget(255)==0&false))) {{
            __CLR4_3_15b5bjxvvfl20.R.inc(256);counter++;
            __CLR4_3_15b5bjxvvfl20.R.inc(257);cursor = cursor.next;
        }
        }__CLR4_3_15b5bjxvvfl20.R.inc(258);cursor.value = item;
    }finally{__CLR4_3_15b5bjxvvfl20.R.flushNeeded();}}

    public int indexOf(T item) {try{__CLR4_3_15b5bjxvvfl20.R.inc(259);
        __CLR4_3_15b5bjxvvfl20.R.inc(260);int index = 0;
        __CLR4_3_15b5bjxvvfl20.R.inc(261);LinkedNodev2<T> cursor = first;
        __CLR4_3_15b5bjxvvfl20.R.inc(262);while((((cursor != null)&&(__CLR4_3_15b5bjxvvfl20.R.iget(263)!=0|true))||(__CLR4_3_15b5bjxvvfl20.R.iget(264)==0&false))) {{
            __CLR4_3_15b5bjxvvfl20.R.inc(265);if((((cursor.value.equals(item))&&(__CLR4_3_15b5bjxvvfl20.R.iget(266)!=0|true))||(__CLR4_3_15b5bjxvvfl20.R.iget(267)==0&false))) {{ __CLR4_3_15b5bjxvvfl20.R.inc(268);return index; }
            }__CLR4_3_15b5bjxvvfl20.R.inc(269);index++;
            __CLR4_3_15b5bjxvvfl20.R.inc(270);cursor = cursor.next;
        }
        }__CLR4_3_15b5bjxvvfl20.R.inc(271);return -1;
    }finally{__CLR4_3_15b5bjxvvfl20.R.flushNeeded();}}

    public boolean contains(T item) {try{__CLR4_3_15b5bjxvvfl20.R.inc(272);
        __CLR4_3_15b5bjxvvfl20.R.inc(273);return this.indexOf(item) != -1;
    }finally{__CLR4_3_15b5bjxvvfl20.R.flushNeeded();}}

    public int size() {try{__CLR4_3_15b5bjxvvfl20.R.inc(274);
        __CLR4_3_15b5bjxvvfl20.R.inc(275);return size;
    }finally{__CLR4_3_15b5bjxvvfl20.R.flushNeeded();}}

    public boolean isEmpty() {try{__CLR4_3_15b5bjxvvfl20.R.inc(276);
        __CLR4_3_15b5bjxvvfl20.R.inc(277);return first == null;
    }finally{__CLR4_3_15b5bjxvvfl20.R.flushNeeded();}}

}

class LinkedNodev2<T> {public static class __CLR4_3_15b7qjxvvfl22{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{if(20180921211537623L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.3.1#20180921211537623,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0070\u0068\u006f\u0075\u0064\u0061\u0069\u006c\u002f\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u0073\u002f\u0074\u0075\u0074\u006f\u0072\u0069\u0061\u006c\u0073\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1562680181490L,8589935092L,286,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_3_1_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    T value;

    LinkedNodev2<T> previous;
    LinkedNodev2<T> next;

    public LinkedNodev2(T value) {try{__CLR4_3_15b7qjxvvfl22.R.inc(278); __CLR4_3_15b7qjxvvfl22.R.inc(279);this.value = value; __CLR4_3_15b7qjxvvfl22.R.inc(280);this.next = null; __CLR4_3_15b7qjxvvfl22.R.inc(281);this.previous = null; }finally{__CLR4_3_15b7qjxvvfl22.R.flushNeeded();}}

    public LinkedNodev2(T value, LinkedNodev2<T> previous, LinkedNodev2<T> next) {try{__CLR4_3_15b7qjxvvfl22.R.inc(282); __CLR4_3_15b7qjxvvfl22.R.inc(283);this.value = value; __CLR4_3_15b7qjxvvfl22.R.inc(284);this.next = next; __CLR4_3_15b7qjxvvfl22.R.inc(285);this.previous = previous; }finally{__CLR4_3_15b7qjxvvfl22.R.flushNeeded();}}

}