package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.database.ContentObserver;
import android.util.Log;
import androidx.core.content.C1343c;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
/* renamed from: com.google.android.gms.internal.measurement.z5 */
/* loaded from: classes2.dex */
public final class C4097z5 implements InterfaceC4049w5 {

    /* renamed from: c */
    private static C4097z5 f9872c;

    /* renamed from: a */
    private final Context f9873a;

    /* renamed from: b */
    private final ContentObserver f9874b;

    private C4097z5() {
        this.f9873a = null;
        this.f9874b = null;
    }

    private C4097z5(Context context) {
        this.f9873a = context;
        this.f9874b = new C4081y5(this, null);
        context.getContentResolver().registerContentObserver(C3891m5.f9470a, true, this.f9874b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C4097z5 m28549a(Context context) {
        C4097z5 c4097z5;
        C4097z5 c4097z52;
        synchronized (C4097z5.class) {
            if (f9872c == null) {
                if (C1343c.m36297b(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0) {
                    c4097z52 = new C4097z5(context);
                } else {
                    c4097z52 = new C4097z5();
                }
                f9872c = c4097z52;
            }
            c4097z5 = f9872c;
        }
        return c4097z5;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static synchronized void m28546d() {
        synchronized (C4097z5.class) {
            if (f9872c != null && f9872c.f9873a != null && f9872c.f9874b != null) {
                f9872c.f9873a.getContentResolver().unregisterContentObserver(f9872c.f9874b);
            }
            f9872c = null;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC4049w5
    /* renamed from: b */
    public final String mo28545f(final String str) {
        if (this.f9873a == null) {
            return null;
        }
        try {
            return (String) C4017u5.m28879a(new InterfaceC4033v5() { // from class: com.google.android.gms.internal.measurement.x5
                @Override // com.google.android.gms.internal.measurement.InterfaceC4033v5
                public final Object zza() {
                    return C4097z5.this.m28547c(str);
                }
            });
        } catch (IllegalStateException | NullPointerException | SecurityException e) {
            String valueOf = String.valueOf(str);
            Log.e("GservicesLoader", valueOf.length() != 0 ? "Unable to read GServices for: ".concat(valueOf) : new String("Unable to read GServices for: "), e);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ String m28547c(String str) {
        return C3891m5.m29404a(this.f9873a.getContentResolver(), str, null);
    }
}
