package com.google.android.gms.common.api.internal;

import android.os.Looper;
import com.google.android.gms.common.api.AbstractC2743d;
import com.google.android.gms.common.api.C2730a;
import com.google.android.gms.common.api.C2730a.InterfaceC2734d;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes.dex */
public final class Type<O extends C2730a.InterfaceC2734d> extends x {
    @NotOnlyInitialized

    /* renamed from: b */
    private final com.google.android.gms.common.api.c<O> f7735b;

    public Type(AbstractC2743d abstractC2743d) {
        super("Method is not supported by connectionless client. APIs supporting connectionless client must not call this method.");
        this.f7735b = abstractC2743d;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public final Looper m32053a() {
        Looper $r1 = this.f7735b.m32074c();
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public final AbstractC2761d m32052a(AbstractC2761d abstractC2761d) {
        this.f7735b.m32078a(abstractC2761d);
        return abstractC2761d;
    }
}
