package p272h.p286c.p287a.p300b.p307d.p309b;

import android.content.Context;
import com.google.android.gms.common.api.internal.AbstractC2796p;
import com.google.android.gms.common.api.internal.InterfaceC2790n;
import com.google.android.gms.tasks.C4465k;
import com.google.android.gms.tasks.j;
import p272h.p286c.p287a.p300b.p303b.p304a.p305a.AbstractC8389b;
/* compiled from: com.google.android.gms:play-services-auth-api-phone@@17.4.0 */
/* renamed from: h.c.a.b.d.b.i */
/* loaded from: classes2.dex */
public final class C8407i extends AbstractC8389b {
    public C8407i(Context context) {
        super(context);
    }

    @Override // p272h.p286c.p287a.p300b.p303b.p304a.p305a.AbstractC8389b
    /* renamed from: p */
    public final j<Void> mo16128p() {
        AbstractC2796p.C2797a m31935a = AbstractC2796p.m31935a();
        m31935a.m31930b(new InterfaceC2790n(this) { // from class: h.c.a.b.d.b.k

            /* renamed from: a */
            private final C8407i f20085a;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f20085a = this;
            }

            @Override // com.google.android.gms.common.api.internal.InterfaceC2790n
            /* renamed from: a */
            public final void mo16126a(Object obj, Object obj2) {
                ((InterfaceC8404f) ((C8408j) obj).m31814C()).mo16130G0(new BinderC8410l(this.f20085a, (C4465k) obj2));
            }
        });
        m31935a.m31928d(C8400b.f20080b);
        return g(m31935a.m31931a());
    }
}
