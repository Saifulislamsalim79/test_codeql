package p272h.p286c.p287a.p323c.p342z;

import android.graphics.Typeface;
/* compiled from: CancelableFontCallback.java */
/* renamed from: h.c.a.c.z.a */
/* loaded from: classes2.dex */
public final class C9318a extends AbstractC9326f {

    /* renamed from: a */
    private final Typeface f21901a;

    /* renamed from: b */
    private final InterfaceC9319a f21902b;

    /* renamed from: c */
    private boolean f21903c;

    /* compiled from: CancelableFontCallback.java */
    /* renamed from: h.c.a.c.z.a$a */
    /* loaded from: classes2.dex */
    public interface InterfaceC9319a {
        /* renamed from: a */
        void mo15058a(Typeface typeface);
    }

    public C9318a(InterfaceC9319a interfaceC9319a, Typeface typeface) {
        this.f21901a = typeface;
        this.f21902b = interfaceC9319a;
    }

    /* renamed from: d */
    private void m15059d(Typeface typeface) {
        if (this.f21903c) {
            return;
        }
        this.f21902b.mo15058a(typeface);
    }

    @Override // p272h.p286c.p287a.p323c.p342z.AbstractC9326f
    /* renamed from: a */
    public void mo15030a(int i) {
        m15059d(this.f21901a);
    }

    @Override // p272h.p286c.p287a.p323c.p342z.AbstractC9326f
    /* renamed from: b */
    public void mo15029b(Typeface typeface, boolean z) {
        m15059d(typeface);
    }

    /* renamed from: c */
    public void m15060c() {
        this.f21903c = true;
    }
}
