package com.google.android.gms.common.internal.p098a0;

import android.content.Context;
import com.google.android.gms.common.api.C2730a;
import com.google.android.gms.common.api.c;
import com.google.android.gms.common.api.c$a;
import com.google.android.gms.common.api.internal.AbstractC2796p;
import com.google.android.gms.common.api.internal.InterfaceC2790n;
import com.google.android.gms.common.internal.C2929w;
import com.google.android.gms.common.internal.C2938z;
import com.google.android.gms.common.internal.InterfaceC2935y;
import com.google.android.gms.tasks.C4465k;
import com.google.android.gms.tasks.j;
import p272h.p286c.p287a.p300b.p307d.p310c.C8414d;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* renamed from: com.google.android.gms.common.internal.a0.d */
/* loaded from: classes2.dex */
public final class C2846d extends c<C2938z> implements InterfaceC2935y {

    /* renamed from: k */
    private static final C2730a.C2740g<C2847e> f7934k = new C2730a.C2740g<>();

    /* renamed from: l */
    private static final C2730a.AbstractC2731a<C2847e, C2938z> f7935l;

    /* renamed from: m */
    private static final C2730a<C2938z> f7936m;

    /* renamed from: n */
    public static final /* synthetic */ int f7937n = 0;

    static {
        C2845c c2845c = new C2845c();
        f7935l = c2845c;
        f7936m = new C2730a<>("ClientTelemetry.API", c2845c, f7934k);
    }

    public C2846d(Context context, C2938z c2938z) {
        super(context, f7936m, c2938z, c$a.f7704c);
    }

    @Override // com.google.android.gms.common.internal.InterfaceC2935y
    /* renamed from: a */
    public final j<Void> mo31598a(final C2929w c2929w) {
        AbstractC2796p.C2797a m31935a = AbstractC2796p.m31935a();
        m31935a.m31928d(C8414d.f20089a);
        m31935a.m31929c(false);
        m31935a.m31930b(new InterfaceC2790n() { // from class: com.google.android.gms.common.internal.a0.b
            @Override // com.google.android.gms.common.api.internal.InterfaceC2790n
            /* renamed from: a */
            public final void mo16126a(Object obj, Object obj2) {
                C2929w c2929w2 = C2929w.this;
                int i = C2846d.f7937n;
                ((C2843a) ((C2847e) obj).m31814C()).m31818p1(c2929w2);
                ((C4465k) obj2).m27775c(null);
            }
        });
        return d(m31935a.m31931a());
    }
}
