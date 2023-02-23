package p272h.p286c.p287a.p300b.p303b.p304a.p305a;

import android.content.Context;
import com.google.android.gms.common.api.C2730a;
import com.google.android.gms.common.api.c;
import com.google.android.gms.common.api.c$a;
import com.google.android.gms.tasks.j;
import p272h.p286c.p287a.p300b.p307d.p309b.C8408j;
/* compiled from: com.google.android.gms:play-services-auth-api-phone@@17.4.0 */
/* renamed from: h.c.a.b.b.a.a.b */
/* loaded from: classes2.dex */
public abstract class AbstractC8389b extends c<C2730a.InterfaceC2734d.C2737c> {

    /* renamed from: k */
    private static final C2730a.C2740g<C8408j> f20074k = new C2730a.C2740g<>();

    /* renamed from: l */
    private static final C2730a.AbstractC2731a<C8408j, C2730a.InterfaceC2734d.C2737c> f20075l;

    /* renamed from: m */
    private static final C2730a<C2730a.InterfaceC2734d.C2737c> f20076m;

    static {
        C8390c c8390c = new C8390c();
        f20075l = c8390c;
        f20076m = new C2730a<>("SmsRetriever.API", c8390c, f20074k);
    }

    public AbstractC8389b(Context context) {
        super(context, f20076m, (C2730a.InterfaceC2734d) null, c$a.f7704c);
    }

    /* renamed from: p */
    public abstract j<Void> mo16128p();
}
