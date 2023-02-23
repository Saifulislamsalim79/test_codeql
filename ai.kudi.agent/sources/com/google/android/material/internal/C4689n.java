package com.google.android.material.internal;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import java.lang.ref.WeakReference;
import p272h.p286c.p287a.p323c.p342z.AbstractC9326f;
import p272h.p286c.p287a.p323c.p342z.C9322d;
/* compiled from: TextDrawableHelper.java */
/* renamed from: com.google.android.material.internal.n */
/* loaded from: classes2.dex */
public class C4689n {

    /* renamed from: c */
    private float f11770c;

    /* renamed from: f */
    private C9322d f11773f;

    /* renamed from: a */
    private final TextPaint f11768a = new TextPaint(1);

    /* renamed from: b */
    private final AbstractC9326f f11769b = new C4690a();

    /* renamed from: d */
    private boolean f11771d = true;

    /* renamed from: e */
    private WeakReference<InterfaceC4691b> f11772e = new WeakReference<>(null);

    /* compiled from: TextDrawableHelper.java */
    /* renamed from: com.google.android.material.internal.n$a */
    /* loaded from: classes2.dex */
    class C4690a extends AbstractC9326f {
        C4690a() {
        }

        @Override // p272h.p286c.p287a.p323c.p342z.AbstractC9326f
        /* renamed from: a */
        public void mo15030a(int i) {
            C4689n.this.f11771d = true;
            InterfaceC4691b interfaceC4691b = (InterfaceC4691b) C4689n.this.f11772e.get();
            if (interfaceC4691b != null) {
                interfaceC4691b.mo15200a();
            }
        }

        @Override // p272h.p286c.p287a.p323c.p342z.AbstractC9326f
        /* renamed from: b */
        public void mo15029b(Typeface typeface, boolean z) {
            if (z) {
                return;
            }
            C4689n.this.f11771d = true;
            InterfaceC4691b interfaceC4691b = (InterfaceC4691b) C4689n.this.f11772e.get();
            if (interfaceC4691b != null) {
                interfaceC4691b.mo15200a();
            }
        }
    }

    /* compiled from: TextDrawableHelper.java */
    /* renamed from: com.google.android.material.internal.n$b */
    /* loaded from: classes2.dex */
    public interface InterfaceC4691b {
        /* renamed from: a */
        void mo15200a();

        int[] getState();

        boolean onStateChange(int[] iArr);
    }

    public C4689n(InterfaceC4691b interfaceC4691b) {
        m26702g(interfaceC4691b);
    }

    /* renamed from: c */
    private float m26706c(CharSequence charSequence) {
        if (charSequence == null) {
            return 0.0f;
        }
        return this.f11768a.measureText(charSequence, 0, charSequence.length());
    }

    /* renamed from: d */
    public C9322d m26705d() {
        return this.f11773f;
    }

    /* renamed from: e */
    public TextPaint m26704e() {
        return this.f11768a;
    }

    /* renamed from: f */
    public float m26703f(String str) {
        if (!this.f11771d) {
            return this.f11770c;
        }
        float m26706c = m26706c(str);
        this.f11770c = m26706c;
        this.f11771d = false;
        return m26706c;
    }

    /* renamed from: g */
    public void m26702g(InterfaceC4691b interfaceC4691b) {
        this.f11772e = new WeakReference<>(interfaceC4691b);
    }

    /* renamed from: h */
    public void m26701h(C9322d c9322d, Context context) {
        if (this.f11773f != c9322d) {
            this.f11773f = c9322d;
            if (c9322d != null) {
                c9322d.m15035k(context, this.f11768a, this.f11769b);
                InterfaceC4691b interfaceC4691b = this.f11772e.get();
                if (interfaceC4691b != null) {
                    this.f11768a.drawableState = interfaceC4691b.getState();
                }
                c9322d.m15036j(context, this.f11768a, this.f11769b);
                this.f11771d = true;
            }
            InterfaceC4691b interfaceC4691b2 = this.f11772e.get();
            if (interfaceC4691b2 != null) {
                interfaceC4691b2.mo15200a();
                interfaceC4691b2.onStateChange(interfaceC4691b2.getState());
            }
        }
    }

    /* renamed from: i */
    public void m26700i(boolean z) {
        this.f11771d = z;
    }

    /* renamed from: j */
    public void m26699j(Context context) {
        this.f11773f.m15036j(context, this.f11768a, this.f11769b);
    }
}
