package androidx.activity.p052d;

import android.content.Context;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
/* compiled from: ContextAwareHelper.java */
/* renamed from: androidx.activity.d.a */
/* loaded from: classes2.dex */
public final class C0894a {

    /* renamed from: a */
    private final Set<InterfaceC0895b> f2385a = new CopyOnWriteArraySet();

    /* renamed from: b */
    private volatile Context f2386b;

    /* renamed from: a */
    public void m37877a(InterfaceC0895b interfaceC0895b) {
        if (this.f2386b != null) {
            interfaceC0895b.mo35830a(this.f2386b);
        }
        this.f2385a.add(interfaceC0895b);
    }

    /* renamed from: b */
    public void m37876b() {
        this.f2386b = null;
    }

    /* renamed from: c */
    public void m37875c(Context context) {
        this.f2386b = context;
        for (InterfaceC0895b interfaceC0895b : this.f2385a) {
            interfaceC0895b.mo35830a(context);
        }
    }

    /* renamed from: d */
    public Context m37874d() {
        return this.f2386b;
    }

    /* renamed from: e */
    public void m37873e(InterfaceC0895b interfaceC0895b) {
        this.f2385a.remove(interfaceC0895b);
    }
}
