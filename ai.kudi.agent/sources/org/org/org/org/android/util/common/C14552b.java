package org.org.org.org.android.util.common;

import android.content.Context;
import android.net.ConnectivityManager;
import kotlin.p483e0.p484c.InterfaceC11756a;
import kotlin.p483e0.p485d.AbstractC11802m;
import org.org.org.org.asm.C14598f;
/* renamed from: org.org.org.org.android.util.common.b */
/* loaded from: classes.dex */
public final class C14552b extends AbstractC11802m implements InterfaceC11756a<ConnectivityManager> {

    /* renamed from: a */
    public static final C14552b f32168a;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    static {
        C14552b $r0 = new C14552b();
        f32168a = $r0;
    }

    public C14552b() {
        super(0);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final ConnectivityManager close() {
        C14598f $r1 = C14598f.f32351c;
        Context $r2 = $r1.getContext();
        Object $r3 = $r2.getSystemService("connectivity");
        if ($r3 != null) {
            ConnectivityManager $r4 = (ConnectivityManager) $r3;
            return $r4;
        }
        NullPointerException $r5 = new NullPointerException("null cannot be cast to non-null type android.net.ConnectivityManager");
        throw $r5;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    @Override // kotlin.p483e0.p484c.InterfaceC11756a
    public /* bridge */ /* synthetic */ ConnectivityManager invoke() {
        ConnectivityManager $r1 = close();
        return $r1;
    }
}
