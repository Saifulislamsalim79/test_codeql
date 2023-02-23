package com.hwangjr.rxbus.thread;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import p425j.p444e.Item;
import p425j.p444e.p445b0.p447c.ContextUtils;
import p425j.p444e.p470j0.ClassWriter;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class EventThread {
    private static final /* synthetic */ EventThread[] $VALUES;
    public static final EventThread BACKGROUND;
    public static final EventThread COMPUTATION;
    public static final EventThread EXECUTOR;
    public static final EventThread HANDLER;
    public static final EventThread MAIN_THREAD;
    public static final EventThread NEW_THREAD;
    public static final EventThread SINGLE;
    public static final EventThread TRAMPOLINE;

    /* renamed from: com.hwangjr.rxbus.thread.EventThread$1 */
    /* loaded from: classes.dex */
    static /* synthetic */ class C71571 {
        static final /* synthetic */ int[] $SwitchMap$com$hwangjr$rxbus$thread$EventThread;

        /* JADX WARN: Can't parse signature for local variable: 
        java.lang.NullPointerException
        	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
        	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
         */
        static {
            EventThread[] $r8 = EventThread.values();
            int $i0 = $r8.length;
            int[] $r9 = new int[$i0];
            $SwitchMap$com$hwangjr$rxbus$thread$EventThread = $r9;
            try {
                EventThread $r10 = EventThread.MAIN_THREAD;
                int $i02 = $r10.ordinal();
                $r9[$i02] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                int[] $r92 = $SwitchMap$com$hwangjr$rxbus$thread$EventThread;
                EventThread $r102 = EventThread.NEW_THREAD;
                int $i03 = $r102.ordinal();
                $r92[$i03] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                int[] $r93 = $SwitchMap$com$hwangjr$rxbus$thread$EventThread;
                EventThread $r103 = EventThread.BACKGROUND;
                int $i04 = $r103.ordinal();
                $r93[$i04] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                int[] $r94 = $SwitchMap$com$hwangjr$rxbus$thread$EventThread;
                EventThread $r104 = EventThread.COMPUTATION;
                int $i05 = $r104.ordinal();
                $r94[$i05] = 4;
            } catch (NoSuchFieldError e4) {
            }
            try {
                int[] $r95 = $SwitchMap$com$hwangjr$rxbus$thread$EventThread;
                EventThread $r105 = EventThread.TRAMPOLINE;
                int $i06 = $r105.ordinal();
                $r95[$i06] = 5;
            } catch (NoSuchFieldError e5) {
            }
            try {
                int[] $r96 = $SwitchMap$com$hwangjr$rxbus$thread$EventThread;
                EventThread $r106 = EventThread.SINGLE;
                int $i07 = $r106.ordinal();
                $r96[$i07] = 6;
            } catch (NoSuchFieldError e6) {
            }
            try {
                int[] $r97 = $SwitchMap$com$hwangjr$rxbus$thread$EventThread;
                EventThread $r107 = EventThread.EXECUTOR;
                int $i08 = $r107.ordinal();
                $r97[$i08] = 7;
            } catch (NoSuchFieldError e7) {
            }
            try {
                int[] $r98 = $SwitchMap$com$hwangjr$rxbus$thread$EventThread;
                EventThread $r108 = EventThread.HANDLER;
                int $i09 = $r108.ordinal();
                $r98[$i09] = 8;
            } catch (NoSuchFieldError e8) {
            }
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    static {
        EventThread $r1 = new EventThread("MAIN_THREAD", 0);
        MAIN_THREAD = $r1;
        EventThread $r12 = new EventThread("NEW_THREAD", 1);
        NEW_THREAD = $r12;
        EventThread $r13 = new EventThread("IO", 2);
        BACKGROUND = $r13;
        EventThread $r14 = new EventThread("COMPUTATION", 3);
        COMPUTATION = $r14;
        EventThread $r15 = new EventThread("TRAMPOLINE", 4);
        TRAMPOLINE = $r15;
        EventThread $r16 = new EventThread("SINGLE", 5);
        SINGLE = $r16;
        EventThread $r17 = new EventThread("EXECUTOR", 6);
        EXECUTOR = $r17;
        EventThread $r18 = new EventThread("HANDLER", 7);
        HANDLER = $r18;
        EventThread $r0 = MAIN_THREAD;
        EventThread $r02 = NEW_THREAD;
        EventThread $r03 = BACKGROUND;
        EventThread $r04 = COMPUTATION;
        EventThread $r05 = TRAMPOLINE;
        EventThread $r06 = SINGLE;
        EventThread $r07 = EXECUTOR;
        EventThread[] $r2 = {$r0, $r02, $r03, $r04, $r05, $r06, $r07, $r18};
        $VALUES = $r2;
    }

    private EventThread(String str, int i) {
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public static Item getScheduler(EventThread eventThread) {
        int[] $r0 = C71571.$SwitchMap$com$hwangjr$rxbus$thread$EventThread;
        int $i0 = eventThread.ordinal();
        switch ($r0[$i0]) {
            case 1:
                Item $r2 = ContextUtils.LogError();
                return $r2;
            case 2:
                Item $r22 = ClassWriter.m10607d();
                return $r22;
            case 3:
                Item $r23 = ClassWriter.LogError();
                return $r23;
            case 4:
                Item $r24 = ClassWriter.m10609c();
                return $r24;
            case 5:
                Item $r25 = ClassWriter.get();
                return $r25;
            case 6:
                Item $r26 = ClassWriter.m10610a();
                return $r26;
            case 7:
                ThreadHandler $r3 = ThreadHandler.DEFAULT;
                Executor $r6 = $r3.getExecutor();
                Item $r27 = ClassWriter.m10608c($r6);
                return $r27;
            case 8:
                ThreadHandler $r32 = ThreadHandler.DEFAULT;
                Handler $r4 = $r32.getHandler();
                Looper $r5 = $r4.getLooper();
                Item $r28 = ContextUtils.get($r5);
                return $r28;
            default:
                Item $r29 = ContextUtils.LogError();
                return $r29;
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public static EventThread valueOf(String str) {
        Enum $r0 = Enum.valueOf(EventThread.class, str);
        EventThread $r2 = (EventThread) $r0;
        return $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
    	at jadx.core.dex.nodes.utils.TypeUtils.expandTypeVariables(TypeUtils.java:72)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.getVarType(DebugInfoAttachVisitor.java:146)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.attachDebugInfo(DebugInfoAttachVisitor.java:94)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.processDebugInfo(DebugInfoAttachVisitor.java:51)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:41)
     */
    public static EventThread[] values() {
        EventThread[] $r1 = $VALUES;
        Object $r0 = $r1.clone();
        EventThread[] $r12 = (EventThread[]) $r0;
        return $r12;
    }
}
