package org.org.org.org.asm.util;

import android.webkit.WebView;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import kotlin.C13218k;
import kotlin.InterfaceC11824h;
import kotlin.p483e0.p485d.C11812w;
import kotlin.p483e0.p485d.Log_OC;
import kotlin.p557z.C13726r;
/* renamed from: org.org.org.org.asm.util.c */
/* loaded from: classes.dex */
public final class C14616c {

    /* renamed from: a */
    public static final InterfaceC11824h f32397a;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        InterfaceC11824h $r0;
        CharDirectionality$Companion$directionalityMap$2 $r1 = CharDirectionality$Companion$directionalityMap$2.INSTANCE;
        $r0 = C13218k.m5625b($r1);
        f32397a = $r0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.List, T] */
    /* renamed from: a */
    public static final List m1041a(WebView webView) {
        ?? m3891e;
        Log_OC.getArray(webView, "$this$sensitiveWebViewRectangles");
        C11812w $r2 = new C11812w();
        m3891e = C13726r.m3891e();
        $r2.f26499c = m3891e;
        CountDownLatch $r3 = new CountDownLatch(1);
        RunnableC14615b $r4 = new RunnableC14615b(webView, $r3, $r2);
        webView.post($r4);
        $r3.await();
        Object $r5 = $r2.f26499c;
        List $r0 = (List) $r5;
        return $r0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: b */
    public static final float m1040b() {
        InterfaceC11824h $r0 = f32397a;
        Object $r1 = $r0.getValue();
        Number $r2 = (Number) $r1;
        float $f0 = $r2.floatValue();
        return $f0;
    }
}
