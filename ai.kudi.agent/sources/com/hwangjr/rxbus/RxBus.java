package com.hwangjr.rxbus;

import com.hwangjr.rxbus.thread.ThreadEnforcer;
/* loaded from: classes.dex */
public class RxBus {
    private static Bus sBus;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public static synchronized Bus getBus() {
        Bus $r1;
        synchronized (RxBus.class) {
            Bus $r12 = sBus;
            if ($r12 == null) {
                ThreadEnforcer $r0 = ThreadEnforcer.ANY;
                Bus $r13 = new Bus($r0);
                sBus = $r13;
            }
            $r1 = sBus;
        }
        return $r1;
    }
}
