package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import p272h.p286c.p287a.p288a.p289i.AbstractC8352p;
import p272h.p286c.p287a.p288a.p289i.C8357t;
import p272h.p286c.p287a.p288a.p289i.p293c0.C8329a;
/* loaded from: classes2.dex */
public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static /* synthetic */ void m32445a() {
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter("extras");
        int intValue = Integer.valueOf(intent.getData().getQueryParameter("priority")).intValue();
        int i = intent.getExtras().getInt("attemptNumber");
        C8357t.m16222f(context);
        AbstractC8352p.AbstractC8353a m16242a = AbstractC8352p.m16242a();
        m16242a.mo16235b(queryParameter);
        m16242a.mo16233d(C8329a.m16293b(intValue));
        if (queryParameter2 != null) {
            m16242a.mo16234c(Base64.decode(queryParameter2, 0));
        }
        C8357t.m16225c().m16223e().m32409k(m16242a.mo16236a(), i, RunnableC2648c.f7423c);
    }
}
