package org.org.org.org.android.util.common;

import android.net.ConnectivityManager;
import android.os.Build;
import kotlin.C13218k;
import kotlin.InterfaceC11824h;
import kotlin.p483e0.p485d.Log_OC;
import org.org.org.org.android.util.asm.Attribute;
import org.org.org.org.asm.cryptopro.C14595b;
import org.org.org.org.org.common.Logger;
/* renamed from: org.org.org.org.android.util.common.f */
/* loaded from: classes.dex */
public final class C14554f {

    /* renamed from: a */
    public final InterfaceC11824h f32169a;

    /* renamed from: h */
    public ConnectivityManager.NetworkCallback f32170h;

    /* renamed from: l */
    public final Logger f32171l;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public C14554f(Logger logger) {
        InterfaceC11824h $r1;
        Log_OC.getArray(logger, "sessionEventHandler");
        this.f32171l = logger;
        C14552b $r3 = C14552b.f32168a;
        $r1 = C13218k.m5625b($r3);
        this.f32169a = $r1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public final void add() {
        Logger $r1 = this.f32171l;
        C14595b $r4 = C14595b.f32346c;
        String $r3 = $r4.getType();
        Attribute $r2 = new Attribute($r3, null, 2, null);
        $r1.remove($r2);
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: b */
    private final ConnectivityManager m1281b() {
        InterfaceC11824h $r2 = this.f32169a;
        Object $r1 = $r2.getValue();
        ConnectivityManager $r3 = (ConnectivityManager) $r1;
        return $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public final void m1283a() {
        int $i0 = Build.VERSION.SDK_INT;
        if ($i0 >= 24) {
            C14551a $r3 = new C14551a(this);
            this.f32170h = $r3;
            try {
                ConnectivityManager $r1 = m1281b();
                $r1.registerDefaultNetworkCallback($r3);
            } catch (Exception e) {
            }
        }
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: c */
    public final void m1280c() {
        ConnectivityManager.NetworkCallback $r3;
        int $i0 = Build.VERSION.SDK_INT;
        if ($i0 < 24 || ($r3 = this.f32170h) == null) {
            return;
        }
        try {
            ConnectivityManager $r1 = m1281b();
            $r1.unregisterNetworkCallback($r3);
        } catch (Exception e) {
        }
    }
}
