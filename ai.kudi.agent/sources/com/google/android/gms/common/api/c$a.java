package com.google.android.gms.common.api;

import android.accounts.Account;
import android.os.Looper;
import com.google.android.gms.common.api.internal.C2751a;
import com.google.android.gms.common.api.internal.InterfaceC2793o;
import com.google.android.gms.common.internal.s;
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes2.dex */
public class c$a {

    /* renamed from: c */
    public static final c$a f7704c = new C2742a().m32086a();

    /* renamed from: a */
    public final InterfaceC2793o f7705a;

    /* renamed from: b */
    public final Looper f7706b;

    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    /* renamed from: com.google.android.gms.common.api.c$a$a */
    /* loaded from: classes2.dex */
    public static class C2742a {

        /* renamed from: a */
        private InterfaceC2793o f7707a;

        /* renamed from: b */
        private Looper f7708b;

        /* renamed from: a */
        public c$a m32086a() {
            if (this.f7707a == null) {
                this.f7707a = new C2751a();
            }
            if (this.f7708b == null) {
                this.f7708b = Looper.getMainLooper();
            }
            return new c$a(this.f7707a, this.f7708b);
        }

        /* renamed from: b */
        public C2742a m32085b(Looper looper) {
            s.k(looper, "Looper must not be null.");
            this.f7708b = looper;
            return this;
        }

        /* renamed from: c */
        public C2742a m32084c(InterfaceC2793o interfaceC2793o) {
            s.k(interfaceC2793o, "StatusExceptionMapper must not be null.");
            this.f7707a = interfaceC2793o;
            return this;
        }
    }

    private c$a(InterfaceC2793o interfaceC2793o, Account account, Looper looper) {
        this.f7705a = interfaceC2793o;
        this.f7706b = looper;
    }
}
