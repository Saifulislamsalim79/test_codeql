package androidx.camera.core.impl.p054n.p055a;

import androidx.camera.core.impl.p054n.p055a.AbstractC1238b;
import com.google.common.util.concurrent.InterfaceFutureC5161c;
/* compiled from: Futures.java */
/* renamed from: androidx.camera.core.impl.n.a.a */
/* loaded from: classes2.dex */
public final class C1237a {
    /* renamed from: a */
    public static <V> InterfaceFutureC5161c<V> m36701a(Throwable th) {
        return new AbstractC1238b.C1239a(th);
    }

    /* renamed from: b */
    public static <V> InterfaceFutureC5161c<V> m36700b(V v) {
        if (v == null) {
            return AbstractC1238b.m36699a();
        }
        return new AbstractC1238b.C1240b(v);
    }
}
