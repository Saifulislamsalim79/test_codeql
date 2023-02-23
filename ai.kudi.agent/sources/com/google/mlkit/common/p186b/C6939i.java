package com.google.mlkit.common.p186b;

import android.content.Context;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.tasks.C4467l;
import com.google.firebase.components.C5296n;
import com.google.firebase.components.C5300p;
import com.google.firebase.components.C5306s;
import com.google.firebase.components.InterfaceC5305r;
import com.google.firebase.p170o.InterfaceC6560b;
import com.google.mlkit.common.internal.MlKitComponentDiscoveryService;
import java.util.List;
/* compiled from: com.google.mlkit:common@@18.0.0 */
/* renamed from: com.google.mlkit.common.b.i */
/* loaded from: classes2.dex */
public class C6939i {

    /* renamed from: b */
    private static final Object f16631b = new Object();

    /* renamed from: c */
    private static C6939i f16632c;

    /* renamed from: a */
    private C5306s f16633a;

    private C6939i() {
    }

    /* renamed from: c */
    public static C6939i m20446c() {
        C6939i c6939i;
        synchronized (f16631b) {
            s.n(f16632c != null, "MlKitContext has not been initialized");
            C6939i c6939i2 = f16632c;
            s.j(c6939i2);
            c6939i = c6939i2;
        }
        return c6939i;
    }

    /* renamed from: d */
    public static C6939i m20445d(Context context) {
        C6939i c6939i;
        synchronized (f16631b) {
            s.n(f16632c == null, "MlKitContext is already initialized");
            C6939i c6939i2 = new C6939i();
            f16632c = c6939i2;
            Context m20444e = m20444e(context);
            List<InterfaceC6560b<InterfaceC5305r>> m25204a = C5300p.m25203b(m20444e, MlKitComponentDiscoveryService.class).m25204a();
            C5306s.C5308b m25194f = C5306s.m25194f(C4467l.f10891a);
            m25194f.m25180c(m25204a);
            m25194f.m25182a(C5296n.m25216n(m20444e, Context.class, new Class[0]));
            m25194f.m25182a(C5296n.m25216n(c6939i2, C6939i.class, new Class[0]));
            C5306s m25179d = m25194f.m25179d();
            c6939i2.f16633a = m25179d;
            m25179d.m25191i(true);
            c6939i = f16632c;
        }
        return c6939i;
    }

    /* renamed from: e */
    private static Context m20444e(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext != null ? applicationContext : context;
    }

    /* renamed from: a */
    public <T> T m20448a(Class<T> cls) {
        s.n(f16632c == this, "MlKitContext has been deleted");
        s.j(this.f16633a);
        return (T) this.f16633a.mo25206a(cls);
    }

    /* renamed from: b */
    public Context m20447b() {
        return (Context) m20448a(Context.class);
    }
}
