package com.google.android.datatransport.runtime.backends;

import com.google.android.datatransport.runtime.backends.AbstractC2635f;
import java.util.Arrays;
import p272h.p286c.p287a.p288a.p289i.AbstractC8342j;
/* compiled from: AutoValue_BackendRequest.java */
/* renamed from: com.google.android.datatransport.runtime.backends.a */
/* loaded from: classes2.dex */
final class C2628a extends AbstractC2635f {

    /* renamed from: a */
    private final Iterable<AbstractC8342j> f7393a;

    /* renamed from: b */
    private final byte[] f7394b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AutoValue_BackendRequest.java */
    /* renamed from: com.google.android.datatransport.runtime.backends.a$b */
    /* loaded from: classes2.dex */
    public static final class C2630b extends AbstractC2635f.AbstractC2636a {

        /* renamed from: a */
        private Iterable<AbstractC8342j> f7395a;

        /* renamed from: b */
        private byte[] f7396b;

        @Override // com.google.android.datatransport.runtime.backends.AbstractC2635f.AbstractC2636a
        /* renamed from: a */
        public AbstractC2635f mo32473a() {
            String str = "";
            if (this.f7395a == null) {
                str = " events";
            }
            if (str.isEmpty()) {
                return new C2628a(this.f7395a, this.f7396b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.android.datatransport.runtime.backends.AbstractC2635f.AbstractC2636a
        /* renamed from: b */
        public AbstractC2635f.AbstractC2636a mo32472b(Iterable<AbstractC8342j> iterable) {
            if (iterable != null) {
                this.f7395a = iterable;
                return this;
            }
            throw new NullPointerException("Null events");
        }

        @Override // com.google.android.datatransport.runtime.backends.AbstractC2635f.AbstractC2636a
        /* renamed from: c */
        public AbstractC2635f.AbstractC2636a mo32471c(byte[] bArr) {
            this.f7396b = bArr;
            return this;
        }
    }

    @Override // com.google.android.datatransport.runtime.backends.AbstractC2635f
    /* renamed from: b */
    public Iterable<AbstractC8342j> mo32475b() {
        return this.f7393a;
    }

    @Override // com.google.android.datatransport.runtime.backends.AbstractC2635f
    /* renamed from: c */
    public byte[] mo32474c() {
        return this.f7394b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC2635f) {
            AbstractC2635f abstractC2635f = (AbstractC2635f) obj;
            if (this.f7393a.equals(abstractC2635f.mo32475b())) {
                if (Arrays.equals(this.f7394b, abstractC2635f instanceof C2628a ? ((C2628a) abstractC2635f).f7394b : abstractC2635f.mo32474c())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        return ((this.f7393a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f7394b);
    }

    public String toString() {
        return "BackendRequest{events=" + this.f7393a + ", extras=" + Arrays.toString(this.f7394b) + "}";
    }

    private C2628a(Iterable<AbstractC8342j> iterable, byte[] bArr) {
        this.f7393a = iterable;
        this.f7394b = bArr;
    }
}
