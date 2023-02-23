package com.google.android.datatransport.cct.p096f;

import com.google.android.datatransport.cct.p096f.AbstractC2615k;
/* compiled from: AutoValue_ClientInfo.java */
/* renamed from: com.google.android.datatransport.cct.f.e */
/* loaded from: classes2.dex */
final class C2601e extends AbstractC2615k {

    /* renamed from: a */
    private final AbstractC2615k.EnumC2617b f7299a;

    /* renamed from: b */
    private final AbstractC2588a f7300b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AutoValue_ClientInfo.java */
    /* renamed from: com.google.android.datatransport.cct.f.e$b */
    /* loaded from: classes2.dex */
    public static final class C2603b extends AbstractC2615k.AbstractC2616a {

        /* renamed from: a */
        private AbstractC2615k.EnumC2617b f7301a;

        /* renamed from: b */
        private AbstractC2588a f7302b;

        @Override // com.google.android.datatransport.cct.p096f.AbstractC2615k.AbstractC2616a
        /* renamed from: a */
        public AbstractC2615k mo32528a() {
            return new C2601e(this.f7301a, this.f7302b);
        }

        @Override // com.google.android.datatransport.cct.p096f.AbstractC2615k.AbstractC2616a
        /* renamed from: b */
        public AbstractC2615k.AbstractC2616a mo32527b(AbstractC2588a abstractC2588a) {
            this.f7302b = abstractC2588a;
            return this;
        }

        @Override // com.google.android.datatransport.cct.p096f.AbstractC2615k.AbstractC2616a
        /* renamed from: c */
        public AbstractC2615k.AbstractC2616a mo32526c(AbstractC2615k.EnumC2617b enumC2617b) {
            this.f7301a = enumC2617b;
            return this;
        }
    }

    @Override // com.google.android.datatransport.cct.p096f.AbstractC2615k
    /* renamed from: b */
    public AbstractC2588a mo32530b() {
        return this.f7300b;
    }

    @Override // com.google.android.datatransport.cct.p096f.AbstractC2615k
    /* renamed from: c */
    public AbstractC2615k.EnumC2617b mo32529c() {
        return this.f7299a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC2615k) {
            AbstractC2615k abstractC2615k = (AbstractC2615k) obj;
            AbstractC2615k.EnumC2617b enumC2617b = this.f7299a;
            if (enumC2617b != null ? enumC2617b.equals(abstractC2615k.mo32529c()) : abstractC2615k.mo32529c() == null) {
                AbstractC2588a abstractC2588a = this.f7300b;
                if (abstractC2588a == null) {
                    if (abstractC2615k.mo32530b() == null) {
                        return true;
                    }
                } else if (abstractC2588a.equals(abstractC2615k.mo32530b())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        AbstractC2615k.EnumC2617b enumC2617b = this.f7299a;
        int hashCode = ((enumC2617b == null ? 0 : enumC2617b.hashCode()) ^ 1000003) * 1000003;
        AbstractC2588a abstractC2588a = this.f7300b;
        return hashCode ^ (abstractC2588a != null ? abstractC2588a.hashCode() : 0);
    }

    public String toString() {
        return "ClientInfo{clientType=" + this.f7299a + ", androidClientInfo=" + this.f7300b + "}";
    }

    private C2601e(AbstractC2615k.EnumC2617b enumC2617b, AbstractC2588a abstractC2588a) {
        this.f7299a = enumC2617b;
        this.f7300b = abstractC2588a;
    }
}
