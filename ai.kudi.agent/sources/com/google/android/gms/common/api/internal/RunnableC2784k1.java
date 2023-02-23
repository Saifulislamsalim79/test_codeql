package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.app.Dialog;
import android.app.PendingIntent;
import com.google.android.gms.common.C2826b;
import com.google.android.gms.common.api.GoogleApiActivity;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* renamed from: com.google.android.gms.common.api.internal.k1 */
/* loaded from: classes2.dex */
public final class RunnableC2784k1 implements Runnable {

    /* renamed from: c */
    private final C2777i1 f7819c;

    /* renamed from: d */
    final /* synthetic */ AbstractDialogInterface$OnCancelListenerC2786l1 f7820d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2784k1(AbstractDialogInterface$OnCancelListenerC2786l1 abstractDialogInterface$OnCancelListenerC2786l1, C2777i1 c2777i1) {
        this.f7820d = abstractDialogInterface$OnCancelListenerC2786l1;
        this.f7819c = c2777i1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f7820d.f7823d) {
            C2826b m31970b = this.f7819c.m31970b();
            if (m31970b.m31880l()) {
                AbstractDialogInterface$OnCancelListenerC2786l1 abstractDialogInterface$OnCancelListenerC2786l1 = this.f7820d;
                InterfaceC2775i interfaceC2775i = abstractDialogInterface$OnCancelListenerC2786l1.f7734c;
                Activity m32057b = abstractDialogInterface$OnCancelListenerC2786l1.m32057b();
                PendingIntent m31881k = m31970b.m31881k();
                com.google.android.gms.common.internal.s.j(m31881k);
                interfaceC2775i.startActivityForResult(GoogleApiActivity.m32102a(m32057b, m31881k, this.f7819c.m31971a(), false), 1);
                return;
            }
            AbstractDialogInterface$OnCancelListenerC2786l1 abstractDialogInterface$OnCancelListenerC2786l12 = this.f7820d;
            if (abstractDialogInterface$OnCancelListenerC2786l12.f7826w.mo31851b(abstractDialogInterface$OnCancelListenerC2786l12.m32057b(), m31970b.m31883f(), null) != null) {
                AbstractDialogInterface$OnCancelListenerC2786l1 abstractDialogInterface$OnCancelListenerC2786l13 = this.f7820d;
                abstractDialogInterface$OnCancelListenerC2786l13.f7826w.m31855x(abstractDialogInterface$OnCancelListenerC2786l13.m32057b(), this.f7820d.f7734c, m31970b.m31883f(), 2, this.f7820d);
            } else if (m31970b.m31883f() == 18) {
                AbstractDialogInterface$OnCancelListenerC2786l1 abstractDialogInterface$OnCancelListenerC2786l14 = this.f7820d;
                Dialog m31860s = abstractDialogInterface$OnCancelListenerC2786l14.f7826w.m31860s(abstractDialogInterface$OnCancelListenerC2786l14.m32057b(), this.f7820d);
                AbstractDialogInterface$OnCancelListenerC2786l1 abstractDialogInterface$OnCancelListenerC2786l15 = this.f7820d;
                abstractDialogInterface$OnCancelListenerC2786l15.f7826w.m31859t(abstractDialogInterface$OnCancelListenerC2786l15.m32057b().getApplicationContext(), new C2781j1(this, m31860s));
            } else {
                this.f7820d.m31949l(m31970b, this.f7819c.m31971a());
            }
        }
    }
}
