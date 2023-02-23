package com.google.android.gms.measurement.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
/* renamed from: com.google.android.gms.measurement.internal.y3 */
/* loaded from: classes2.dex */
public final class C4428y3 extends BroadcastReceiver {

    /* renamed from: a */
    private final C4168ba f10820a;

    /* renamed from: b */
    private boolean f10821b;

    /* renamed from: c */
    private boolean f10822c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4428y3(C4168ba c4168ba) {
        com.google.android.gms.common.internal.s.j(c4168ba);
        this.f10820a = c4168ba;
    }

    /* renamed from: b */
    public final void m27830b() {
        this.f10820a.m28361g();
        this.f10820a.m28373a().m27823h();
        if (this.f10821b) {
            return;
        }
        this.f10820a.m28363f().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        this.f10822c = this.f10820a.m28377W().m27905m();
        this.f10820a.m28371b().v().m28013b("Registering connectivity change receiver. Network connected", Boolean.valueOf(this.f10822c));
        this.f10821b = true;
    }

    /* renamed from: c */
    public final void m27829c() {
        this.f10820a.m28361g();
        this.f10820a.m28373a().m27823h();
        this.f10820a.m28373a().m27823h();
        if (this.f10821b) {
            this.f10820a.m28371b().v().m28014a("Unregistering connectivity change receiver");
            this.f10821b = false;
            this.f10822c = false;
            try {
                this.f10820a.m28363f().unregisterReceiver(this);
            } catch (IllegalArgumentException e) {
                this.f10820a.m28371b().r().m28013b("Failed to unregister the network broadcast receiver", e);
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.f10820a.m28361g();
        String action = intent.getAction();
        this.f10820a.m28371b().v().m28013b("NetworkBroadcastReceiver received action", action);
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            boolean m27905m = this.f10820a.m28377W().m27905m();
            if (this.f10822c != m27905m) {
                this.f10822c = m27905m;
                this.f10820a.m28373a().m27810z(new RunnableC4417x3(this, m27905m));
                return;
            }
            return;
        }
        this.f10820a.m28371b().w().m28013b("NetworkBroadcastReceiver received unknown action", action);
    }
}
