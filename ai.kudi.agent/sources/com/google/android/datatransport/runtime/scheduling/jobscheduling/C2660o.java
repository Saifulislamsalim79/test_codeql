package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Base64;
import p272h.p286c.p287a.p288a.p289i.AbstractC8352p;
import p272h.p286c.p287a.p288a.p289i.p290a0.p291j.InterfaceC8272i0;
import p272h.p286c.p287a.p288a.p289i.p292b0.InterfaceC8318a;
import p272h.p286c.p287a.p288a.p289i.p293c0.C8329a;
import p272h.p286c.p287a.p288a.p289i.p298y.C8379a;
/* compiled from: AlarmManagerScheduler.java */
/* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.o */
/* loaded from: classes2.dex */
public class C2660o implements InterfaceC2675x {

    /* renamed from: a */
    private final Context f7450a;

    /* renamed from: b */
    private final InterfaceC8272i0 f7451b;

    /* renamed from: c */
    private AlarmManager f7452c;

    /* renamed from: d */
    private final AbstractC2666s f7453d;

    /* renamed from: e */
    private final InterfaceC8318a f7454e;

    public C2660o(Context context, InterfaceC8272i0 interfaceC8272i0, InterfaceC8318a interfaceC8318a, AbstractC2666s abstractC2666s) {
        this(context, interfaceC8272i0, (AlarmManager) context.getSystemService("alarm"), interfaceC8318a, abstractC2666s);
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.InterfaceC2675x
    /* renamed from: a */
    public void mo32399a(AbstractC8352p abstractC8352p, int i) {
        mo32398b(abstractC8352p, i, false);
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.InterfaceC2675x
    /* renamed from: b */
    public void mo32398b(AbstractC8352p abstractC8352p, int i, boolean z) {
        Uri.Builder builder = new Uri.Builder();
        builder.appendQueryParameter("backendName", abstractC8352p.mo16241b());
        builder.appendQueryParameter("priority", String.valueOf(C8329a.m16294a(abstractC8352p.mo16239d())));
        if (abstractC8352p.mo16240c() != null) {
            builder.appendQueryParameter("extras", Base64.encodeToString(abstractC8352p.mo16240c(), 0));
        }
        Intent intent = new Intent(this.f7450a, AlarmManagerSchedulerBroadcastReceiver.class);
        intent.setData(builder.build());
        intent.putExtra("attemptNumber", i);
        if (!z && m32443c(intent)) {
            C8379a.m16167a("AlarmManagerScheduler", "Upload for context %s is already scheduled. Returning...", abstractC8352p);
            return;
        }
        long mo16372M0 = this.f7451b.mo16372M0(abstractC8352p);
        long m32434g = this.f7453d.m32434g(abstractC8352p.mo16239d(), mo16372M0, i);
        C8379a.m16166b("AlarmManagerScheduler", "Scheduling upload for context %s in %dms(Backend next call timestamp %d). Attempt %d", abstractC8352p, Long.valueOf(m32434g), Long.valueOf(mo16372M0), Integer.valueOf(i));
        this.f7452c.set(3, this.f7454e.mo16295a() + m32434g, PendingIntent.getBroadcast(this.f7450a, 0, intent, 0));
    }

    /* renamed from: c */
    boolean m32443c(Intent intent) {
        return PendingIntent.getBroadcast(this.f7450a, 0, intent, 536870912) != null;
    }

    C2660o(Context context, InterfaceC8272i0 interfaceC8272i0, AlarmManager alarmManager, InterfaceC8318a interfaceC8318a, AbstractC2666s abstractC2666s) {
        this.f7450a = context;
        this.f7451b = interfaceC8272i0;
        this.f7452c = alarmManager;
        this.f7454e = interfaceC8318a;
        this.f7453d = abstractC2666s;
    }
}
