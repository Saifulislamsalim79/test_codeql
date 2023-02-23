package p272h.p286c.p287a.p343d.p344a.p345a;

import android.app.Activity;
import android.content.Context;
import android.content.IntentSender;
import android.os.Handler;
import android.os.Looper;
import com.google.android.play.core.common.InterfaceC4950a;
import com.google.android.play.core.tasks.AbstractC5011c;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: h.c.a.d.a.a.h */
/* loaded from: classes2.dex */
public final class C9335h implements InterfaceC9328b {

    /* renamed from: a */
    private final C9344q f21928a;

    /* renamed from: b */
    private final Context f21929b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9335h(C9344q c9344q, C9332e c9332e, Context context) {
        new Handler(Looper.getMainLooper());
        this.f21928a = c9344q;
        this.f21929b = context;
    }

    @Override // p272h.p286c.p287a.p343d.p344a.p345a.InterfaceC9328b
    /* renamed from: a */
    public final AbstractC5011c<AbstractC9327a> mo15019a() {
        return this.f21928a.m15006e(this.f21929b.getPackageName());
    }

    @Override // p272h.p286c.p287a.p343d.p344a.p345a.InterfaceC9328b
    /* renamed from: b */
    public final boolean mo15018b(AbstractC9327a abstractC9327a, int i, Activity activity, int i2) throws IntentSender.SendIntentException {
        return m15017c(abstractC9327a, new C9334g(activity), AbstractC9330d.m15022c(i), i2);
    }

    /* renamed from: c */
    public final boolean m15017c(AbstractC9327a abstractC9327a, InterfaceC4950a interfaceC4950a, AbstractC9330d abstractC9330d, int i) throws IntentSender.SendIntentException {
        if (abstractC9327a.m15024o(abstractC9330d)) {
            interfaceC4950a.mo15020a(abstractC9327a.m15028b(abstractC9330d).getIntentSender(), i, null, 0, 0, 0, null);
            return true;
        }
        return false;
    }
}
