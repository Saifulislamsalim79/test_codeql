package p272h.p286c.p287a.p300b.p320f;

import com.google.android.gms.common.api.C2730a;
import com.google.android.gms.common.api.Scope;
import p272h.p286c.p287a.p300b.p320f.p321b.C9207a;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* renamed from: h.c.a.b.f.f */
/* loaded from: classes2.dex */
public final class C9223f {

    /* renamed from: a */
    public static final C2730a.C2740g<C9207a> f21618a = new C2730a.C2740g<>();

    /* renamed from: b */
    public static final C2730a.C2740g<C9207a> f21619b = new C2730a.C2740g<>();

    /* renamed from: c */
    public static final C2730a.AbstractC2731a<C9207a, C9206a> f21620c = new C9220c();

    /* renamed from: d */
    static final C2730a.AbstractC2731a<C9207a, C9222e> f21621d = new C9221d();

    static {
        new Scope("profile");
        new Scope("email");
        new C2730a("SignIn.API", f21620c, f21618a);
        new C2730a("SignIn.INTERNAL_API", f21621d, f21619b);
    }
}
