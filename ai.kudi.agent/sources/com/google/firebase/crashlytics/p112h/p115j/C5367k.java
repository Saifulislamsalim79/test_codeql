package com.google.firebase.crashlytics.p112h.p115j;

import ai.kudi.agent.transactions.p032ui.widget.TransactionField;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.firebase.crashlytics.p112h.C5335f;
/* compiled from: BatteryState.java */
/* renamed from: com.google.firebase.crashlytics.h.j.k */
/* loaded from: classes2.dex */
class C5367k {

    /* renamed from: a */
    private final Float f13235a;

    /* renamed from: b */
    private final boolean f13236b;

    private C5367k(Float f, boolean z) {
        this.f13236b = z;
        this.f13235a = f;
    }

    /* renamed from: a */
    public static C5367k m25023a(Context context) {
        Float f = null;
        boolean z = false;
        try {
            Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (registerReceiver != null) {
                z = m25019e(registerReceiver);
                f = m25020d(registerReceiver);
            }
        } catch (IllegalStateException e) {
            C5335f.m25102f().m25103e("An error occurred getting battery state.", e);
        }
        return new C5367k(f, z);
    }

    /* renamed from: d */
    private static Float m25020d(Intent intent) {
        int intExtra = intent.getIntExtra("level", -1);
        int intExtra2 = intent.getIntExtra("scale", -1);
        if (intExtra == -1 || intExtra2 == -1) {
            return null;
        }
        return Float.valueOf(intExtra / intExtra2);
    }

    /* renamed from: e */
    private static boolean m25019e(Intent intent) {
        int intExtra = intent.getIntExtra(TransactionField.STATUS, -1);
        if (intExtra == -1) {
            return false;
        }
        return intExtra == 2 || intExtra == 5;
    }

    /* renamed from: b */
    public Float m25022b() {
        return this.f13235a;
    }

    /* renamed from: c */
    public int m25021c() {
        Float f;
        if (!this.f13236b || (f = this.f13235a) == null) {
            return 1;
        }
        return ((double) f.floatValue()) < 0.99d ? 2 : 3;
    }
}
