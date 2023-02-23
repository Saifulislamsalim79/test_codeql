package com.google.firebase.remoteconfig.internal;

import com.google.firebase.remoteconfig.InterfaceC6770l;
/* compiled from: FirebaseRemoteConfigInfoImpl.java */
/* renamed from: com.google.firebase.remoteconfig.internal.q */
/* loaded from: classes2.dex */
public class C6764q implements InterfaceC6770l {

    /* renamed from: a */
    private final int f16288a;

    /* compiled from: FirebaseRemoteConfigInfoImpl.java */
    /* renamed from: com.google.firebase.remoteconfig.internal.q$b */
    /* loaded from: classes2.dex */
    public static class C6766b {

        /* renamed from: a */
        private long f16289a;

        /* renamed from: b */
        private int f16290b;

        /* renamed from: c */
        private com.google.firebase.remoteconfig.m f16291c;

        /* renamed from: a */
        public C6764q m20807a() {
            return new C6764q(this.f16289a, this.f16290b, this.f16291c);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: b */
        public C6766b m20806b(com.google.firebase.remoteconfig.m mVar) {
            this.f16291c = mVar;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: c */
        public C6766b m20805c(int i) {
            this.f16290b = i;
            return this;
        }

        /* renamed from: d */
        public C6766b m20804d(long j) {
            this.f16289a = j;
            return this;
        }

        private C6766b() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static C6766b m20808b() {
        return new C6766b();
    }

    @Override // com.google.firebase.remoteconfig.InterfaceC6770l
    /* renamed from: a */
    public int mo20800a() {
        return this.f16288a;
    }

    private C6764q(long j, int i, com.google.firebase.remoteconfig.m mVar) {
        this.f16288a = i;
    }
}
