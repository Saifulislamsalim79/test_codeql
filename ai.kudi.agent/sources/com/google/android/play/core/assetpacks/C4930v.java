package com.google.android.play.core.assetpacks;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.play.core.common.C4951b;
import com.google.android.play.core.internal.C4957a;
import com.google.android.play.core.internal.InterfaceC5005y;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import p272h.p286c.p287a.p343d.p344a.p346b.AbstractC9356c;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.play.core.assetpacks.v */
/* loaded from: classes2.dex */
public final class C4930v extends AbstractC9356c<AbstractC4839b> {

    /* renamed from: g */
    private final C4891l1 f12535g;

    /* renamed from: h */
    private final C4927u0 f12536h;

    /* renamed from: i */
    private final InterfaceC5005y<InterfaceC4883j3> f12537i;

    /* renamed from: j */
    private final C4890l0 f12538j;

    /* renamed from: k */
    private final C4939x0 f12539k;

    /* renamed from: l */
    private final C4951b f12540l;

    /* renamed from: m */
    private final InterfaceC5005y<Executor> f12541m;

    /* renamed from: n */
    private final InterfaceC5005y<Executor> f12542n;

    /* renamed from: o */
    private final Handler f12543o;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4930v(Context context, C4891l1 c4891l1, C4927u0 c4927u0, InterfaceC5005y<InterfaceC4883j3> interfaceC5005y, C4939x0 c4939x0, C4890l0 c4890l0, C4951b c4951b, InterfaceC5005y<Executor> interfaceC5005y2, InterfaceC5005y<Executor> interfaceC5005y3) {
        super(new C4957a("AssetPackServiceListenerRegistry"), new IntentFilter("com.google.android.play.core.assetpacks.receiver.ACTION_SESSION_UPDATE"), context);
        this.f12543o = new Handler(Looper.getMainLooper());
        this.f12535g = c4891l1;
        this.f12536h = c4927u0;
        this.f12537i = interfaceC5005y;
        this.f12539k = c4939x0;
        this.f12538j = c4890l0;
        this.f12540l = c4951b;
        this.f12541m = interfaceC5005y2;
        this.f12542n = interfaceC5005y3;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p272h.p286c.p287a.p343d.p344a.p346b.AbstractC9356c
    /* renamed from: a */
    public final void mo14975a(Context context, Intent intent) {
        final Bundle bundleExtra = intent.getBundleExtra("com.google.android.play.core.assetpacks.receiver.EXTRA_SESSION_STATE");
        if (bundleExtra == null) {
            this.f21982a.m25955e("Empty bundle received from broadcast.", new Object[0]);
            return;
        }
        ArrayList<String> stringArrayList = bundleExtra.getStringArrayList("pack_names");
        if (stringArrayList == null || stringArrayList.size() != 1) {
            this.f21982a.m25955e("Corrupt bundle received from broadcast.", new Object[0]);
            return;
        }
        Bundle bundleExtra2 = intent.getBundleExtra("com.google.android.play.core.FLAGS");
        if (bundleExtra2 != null) {
            this.f12540l.m25971a(bundleExtra2);
        }
        final AbstractC4839b m26169a = AbstractC4839b.m26169a(bundleExtra, stringArrayList.get(0), this.f12539k, C4938x.f12584a);
        this.f21982a.m25957c("ListenerRegistryBroadcastReceiver.onReceive: %s", m26169a);
        PendingIntent pendingIntent = (PendingIntent) bundleExtra.getParcelable("confirmation_intent");
        if (pendingIntent != null) {
            this.f12538j.m26095a(pendingIntent);
        }
        this.f12542n.m25876a().execute(new Runnable(this, bundleExtra, m26169a) { // from class: com.google.android.play.core.assetpacks.t

            /* renamed from: c */
            private final C4930v f12504c;

            /* renamed from: d */
            private final Bundle f12505d;

            /* renamed from: e */
            private final AbstractC4839b f12506e;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f12504c = this;
                this.f12505d = bundleExtra;
                this.f12506e = m26169a;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f12504c.m26001g(this.f12505d, this.f12506e);
            }
        });
        this.f12541m.m25876a().execute(new Runnable(this, bundleExtra) { // from class: com.google.android.play.core.assetpacks.u

            /* renamed from: c */
            private final C4930v f12516c;

            /* renamed from: d */
            private final Bundle f12517d;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f12516c = this;
                this.f12517d = bundleExtra;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f12516c.m26002f(this.f12517d);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public final /* synthetic */ void m26002f(Bundle bundle) {
        if (this.f12535g.m26090e(bundle)) {
            this.f12536h.m26004a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public final /* synthetic */ void m26001g(Bundle bundle, AbstractC4839b abstractC4839b) {
        if (this.f12535g.m26086i(bundle)) {
            m26000h(abstractC4839b);
            this.f12537i.m25876a().mo26018a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public final void m26000h(final AbstractC4839b abstractC4839b) {
        this.f12543o.post(new Runnable(this, abstractC4839b) { // from class: com.google.android.play.core.assetpacks.s

            /* renamed from: c */
            private final C4930v f12495c;

            /* renamed from: d */
            private final AbstractC4839b f12496d;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f12495c = this;
                this.f12496d = abstractC4839b;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f12495c.m14974b(this.f12496d);
            }
        });
    }
}
