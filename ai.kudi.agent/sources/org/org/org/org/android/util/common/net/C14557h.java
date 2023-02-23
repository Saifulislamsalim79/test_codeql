package org.org.org.org.android.util.common.net;

import android.os.Looper;
import kotlin.p483e0.p485d.Log_OC;
import org.org.org.org.org.common.Buffer;
/* renamed from: org.org.org.org.android.util.common.net.h */
/* loaded from: classes.dex */
public final class C14557h {

    /* renamed from: f */
    public final Buffer f32187f;

    /* renamed from: r */
    public final org.org.org.org.org.common.Logger f32188r;

    public C14557h(Buffer buffer, org.org.org.org.org.common.Logger logger) {
        Log_OC.getArray(buffer, "sessionHandler");
        Log_OC.getArray(logger, "sessionEventHandler");
        this.f32187f = buffer;
        this.f32188r = logger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: e */
    public final String m1263e() {
        StringBuilder $r1 = new StringBuilder();
        Looper $r2 = Looper.getMainLooper();
        Log_OC.loadImage($r2, "Looper.getMainLooper()");
        Thread $r3 = $r2.getThread();
        Log_OC.loadImage($r3, "Looper.getMainLooper().thread");
        StackTraceElement[] $r4 = $r3.getStackTrace();
        Log_OC.loadImage($r4, "Looper.getMainLooper().thread.stackTrace");
        for (StackTraceElement $r5 : $r4) {
            $r1.append($r5.toString());
            $r1.append("\n");
        }
        String $r6 = $r1.toString();
        Log_OC.loadImage($r6, "StringBuilder().apply {\n…   }\n        }.toString()");
        return $r6;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public final void m1266a() {
        ByteVector $r1 = new ByteVector(this);
        C14556b $r2 = new C14556b($r1, 0L, 2, null);
        $r2.m1267a(true);
        $r2.start();
    }
}
