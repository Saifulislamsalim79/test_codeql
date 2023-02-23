package com.google.android.gms.measurement.internal;
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
/* renamed from: com.google.android.gms.measurement.internal.t5 */
/* loaded from: classes2.dex */
final class RunnableC4373t5 implements Runnable {

    /* renamed from: c */
    final /* synthetic */ String f10680c;

    /* renamed from: d */
    final /* synthetic */ String f10681d;

    /* renamed from: e */
    final /* synthetic */ String f10682e;

    /* renamed from: f */
    final /* synthetic */ long f10683f;

    /* renamed from: w */
    final /* synthetic */ C4385u5 f10684w;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC4373t5(C4385u5 c4385u5, String str, String str2, String str3, long j) {
        this.f10684w = c4385u5;
        this.f10680c = str;
        this.f10681d = str2;
        this.f10682e = str3;
        this.f10683f = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4168ba c4168ba;
        C4168ba c4168ba2;
        String str = this.f10680c;
        if (str == null) {
            c4168ba2 = this.f10684w.f10711a;
            c4168ba2.m28372a0().K().m27898G(this.f10681d, null);
            return;
        }
        C4328p7 c4328p7 = new C4328p7(this.f10682e, str, this.f10683f);
        c4168ba = this.f10684w.f10711a;
        c4168ba.m28372a0().K().m27898G(this.f10681d, c4328p7);
    }
}
