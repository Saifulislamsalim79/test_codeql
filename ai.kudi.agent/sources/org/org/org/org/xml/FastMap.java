package org.org.org.org.xml;

import java.util.Collection;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p557z.C13722p;
import org.org.org.org.org.Context;
/* loaded from: classes.dex */
public final class FastMap {
    public final ReentrantLock _tailLock;

    /* renamed from: c */
    public final Context f32925c;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public FastMap(Context context) {
        Log_OC.getArray(context, "preferences");
        this.f32925c = context;
        ReentrantLock $r2 = new ReentrantLock();
        this._tailLock = $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final Cache get() {
        Cache $r1 = initialize();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final Cache initialize() {
        Context $r3 = this.f32925c;
        c$a$a $r1 = Cache.TAG;
        Object $r2 = $r3.add("SDK_SETTINGS_SESSION_RECORD_ID_TABLE", $r1);
        Cache $r4 = (Cache) $r2;
        return $r4 != null ? $r4 : new Cache();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void initialize(Cache cache) {
        Context $r2 = this.f32925c;
        $r2.add((Object) cache, "SDK_SETTINGS_SESSION_RECORD_ID_TABLE");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final int get(String str, int i) {
        Log_OC.getArray(str, "sessionId");
        ReentrantLock $r2 = this._tailLock;
        $r2.lock();
        try {
            Cache $r3 = get();
            Collection $r4 = $r3.values();
            Log_OC.loadImage($r4, "map.values");
            Comparable $r5 = C13722p.m3934h0($r4);
            Integer $r6 = (Integer) $r5;
            int $i2 = $r6 != null ? $r6.intValue() : 0;
            String $r7 = toString(str, i);
            Object $r8 = $r3.get((Object) $r7);
            Integer $r62 = (Integer) $r8;
            if ($r62 == null) {
                $r62 = Integer.valueOf($i2 < Integer.MAX_VALUE ? $i2 + 1 : 0);
            }
            Log_OC.loadImage($r62, "map[getKey(sessionId, re…          }\n            }");
            int $i1 = $r62.intValue();
            String $r1 = toString(str, i);
            $r3.put($r1, Integer.valueOf($i1));
            initialize($r3);
            return $i1;
        } finally {
            $r2.unlock();
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void get(String str) {
        Log_OC.getArray(str, "key");
        ReentrantLock $r3 = this._tailLock;
        $r3.lock();
        try {
            Cache $r1 = get();
            $r1.remove((Object) str);
            initialize($r1);
        } finally {
            $r3.unlock();
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Incorrect condition in loop: B:12:0x0050 */
    /* JADX WARN: Incorrect condition in loop: B:5:0x002a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void remove(java.lang.String r17) {
        /*
            r16 = this;
            java.lang.String r1 = "sessionId"
            r0 = r17
            kotlin.p483e0.p485d.Log_OC.getArray(r0, r1)
            r0 = r16
            java.util.concurrent.locks.ReentrantLock r2 = r0._tailLock
            r2.lock()
            r0 = r16
            org.org.org.org.xml.Cache r3 = r0.get()     // Catch: java.lang.Throwable -> L6a
            java.util.Set r4 = r3.keySet()     // Catch: java.lang.Throwable -> L6a
            java.lang.String r1 = "map.keys"
            kotlin.p483e0.p485d.Log_OC.loadImage(r4, r1)     // Catch: java.lang.Throwable -> L6a
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L6a
            r5.<init>()     // Catch: java.lang.Throwable -> L6a
            java.util.Iterator r6 = r4.iterator()     // Catch: java.lang.Throwable -> L6a
        L26:
            boolean r7 = r6.hasNext()     // Catch: java.lang.Throwable -> L6a
            if (r7 == 0) goto L48
            java.lang.Object r8 = r6.next()     // Catch: java.lang.Throwable -> L6a
            r10 = r8
            java.lang.String r10 = (java.lang.String) r10     // Catch: java.lang.Throwable -> L6a
            r9 = r10
            java.lang.String r1 = "it"
            kotlin.p483e0.p485d.Log_OC.loadImage(r9, r1)     // Catch: java.lang.Throwable -> L6a
            r11 = 0
            r12 = 2
            r13 = 0
            r0 = r17
            boolean r7 = kotlin.p549l0.C13265j.m5507E(r9, r0, r11, r12, r13)     // Catch: java.lang.Throwable -> L6a
            if (r7 == 0) goto L26
            r5.add(r8)     // Catch: java.lang.Throwable -> L6a
            goto L26
        L48:
            java.util.Iterator r6 = r5.iterator()     // Catch: java.lang.Throwable -> L6a
        L4c:
            boolean r7 = r6.hasNext()     // Catch: java.lang.Throwable -> L6a
            if (r7 == 0) goto L61
            java.lang.Object r8 = r6.next()     // Catch: java.lang.Throwable -> L6a
            r14 = r8
            java.lang.String r14 = (java.lang.String) r14     // Catch: java.lang.Throwable -> L6a
            r17 = r14
            r0 = r17
            r3.remove(r0)     // Catch: java.lang.Throwable -> L6a
            goto L4c
        L61:
            r0 = r16
            r0.initialize(r3)     // Catch: java.lang.Throwable -> L6a
            r2.unlock()
            return
        L6a:
            r15 = move-exception
            r2.unlock()
            goto L6f
        L6f:
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: org.org.org.org.xml.FastMap.remove(java.lang.String):void");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final String toString(String str, int i) {
        Log_OC.getArray(str, "sessionId");
        String $r1 = str + i;
        return $r1;
    }
}
