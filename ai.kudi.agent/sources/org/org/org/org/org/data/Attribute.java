package org.org.org.org.org.data;

import java.util.concurrent.locks.ReentrantLock;
import kotlin.p483e0.p485d.Log_OC;
import org.org.org.org.org.Context;
import org.org.org.org.org.data.asm.C14694a;
import org.org.org.org.org.data.asm.Cache;
/* loaded from: classes.dex */
public final class Attribute {

    /* renamed from: a */
    public final Context f32719a;
    public final ReentrantLock mLock;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public Attribute(Context context) {
        Log_OC.getArray(context, "preferences");
        this.f32719a = context;
        ReentrantLock $r2 = new ReentrantLock();
        this.mLock = $r2;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final Cache get() {
        Context $r3 = this.f32719a;
        C14694a $r1 = Cache.f32737c;
        Object $r2 = $r3.add("SDK_SETTINGS_SESSION_CONFIGURATION_STORAGE", $r1);
        Cache $r4 = (Cache) $r2;
        return $r4 != null ? $r4 : new Cache();
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    private final void write(Cache cache) {
        Context $r2 = this.f32719a;
        $r2.add((Object) cache, "SDK_SETTINGS_SESSION_CONFIGURATION_STORAGE");
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final Cache read() {
        ReentrantLock $r1 = this.mLock;
        $r1.lock();
        try {
            Cache $r2 = get();
            return $r2;
        } finally {
            $r1.unlock();
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void read(Cache cache) {
        Log_OC.getArray(cache, "configurations");
        ReentrantLock $r2 = this.mLock;
        $r2.lock();
        try {
            write(cache);
        } finally {
            $r2.unlock();
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final org.org.org.org.org.data.asm.Attribute remove(String str) {
        Log_OC.getArray(str, "sessionId");
        ReentrantLock $r2 = this.mLock;
        $r2.lock();
        try {
            Cache $r3 = get();
            Object $r4 = $r3.get((Object) str);
            org.org.org.org.org.data.asm.Attribute $r5 = (org.org.org.org.org.data.asm.Attribute) $r4;
            return $r5;
        } finally {
            $r2.unlock();
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void write(String str) {
        Log_OC.getArray(str, "sessionId");
        ReentrantLock $r3 = this.mLock;
        $r3.lock();
        try {
            Cache $r1 = get();
            $r1.remove(str);
            write($r1);
        } finally {
            $r3.unlock();
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void write(String str, org.org.org.org.org.data.asm.Attribute attribute) {
        Log_OC.getArray(str, "sessionId");
        Log_OC.getArray(attribute, "config");
        ReentrantLock $r4 = this.mLock;
        $r4.lock();
        try {
            Cache $r2 = get();
            $r2.put(str, attribute);
            write($r2);
        } finally {
            $r4.unlock();
        }
    }
}
