package com.google.android.datatransport.cct.p096f;

import com.google.android.datatransport.cct.p096f.AbstractC2623o;
/* compiled from: AutoValue_NetworkConnectionInfo.java */
/* renamed from: com.google.android.datatransport.cct.f.i */
/* loaded from: classes2.dex */
final class C2611i extends AbstractC2623o {

    /* renamed from: a */
    private final AbstractC2623o.EnumC2626c f7332a;

    /* renamed from: b */
    private final AbstractC2623o.EnumC2625b f7333b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AutoValue_NetworkConnectionInfo.java */
    /* renamed from: com.google.android.datatransport.cct.f.i$b */
    /* loaded from: classes2.dex */
    public static final class C2613b extends AbstractC2623o.AbstractC2624a {

        /* renamed from: a */
        private AbstractC2623o.EnumC2626c f7334a;

        /* renamed from: b */
        private AbstractC2623o.EnumC2625b f7335b;

        @Override // com.google.android.datatransport.cct.p096f.AbstractC2623o.AbstractC2624a
        /* renamed from: a */
        public AbstractC2623o mo32483a() {
            return new C2611i(this.f7334a, this.f7335b);
        }

        @Override // com.google.android.datatransport.cct.p096f.AbstractC2623o.AbstractC2624a
        /* renamed from: b */
        public AbstractC2623o.AbstractC2624a mo32482b(AbstractC2623o.EnumC2625b enumC2625b) {
            this.f7335b = enumC2625b;
            return this;
        }

        @Override // com.google.android.datatransport.cct.p096f.AbstractC2623o.AbstractC2624a
        /* renamed from: c */
        public AbstractC2623o.AbstractC2624a mo32481c(AbstractC2623o.EnumC2626c enumC2626c) {
            this.f7334a = enumC2626c;
            return this;
        }
    }

    @Override // com.google.android.datatransport.cct.p096f.AbstractC2623o
    /* renamed from: b */
    public AbstractC2623o.EnumC2625b mo32485b() {
        return this.f7333b;
    }

    @Override // com.google.android.datatransport.cct.p096f.AbstractC2623o
    /* renamed from: c */
    public AbstractC2623o.EnumC2626c mo32484c() {
        return this.f7332a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC2623o) {
            AbstractC2623o abstractC2623o = (AbstractC2623o) obj;
            AbstractC2623o.EnumC2626c enumC2626c = this.f7332a;
            if (enumC2626c != null ? enumC2626c.equals(abstractC2623o.mo32484c()) : abstractC2623o.mo32484c() == null) {
                AbstractC2623o.EnumC2625b enumC2625b = this.f7333b;
                if (enumC2625b == null) {
                    if (abstractC2623o.mo32485b() == null) {
                        return true;
                    }
                } else if (enumC2625b.equals(abstractC2623o.mo32485b())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        AbstractC2623o.EnumC2626c enumC2626c = this.f7332a;
        int hashCode = ((enumC2626c == null ? 0 : enumC2626c.hashCode()) ^ 1000003) * 1000003;
        AbstractC2623o.EnumC2625b enumC2625b = this.f7333b;
        return hashCode ^ (enumC2625b != null ? enumC2625b.hashCode() : 0);
    }

    public String toString() {
        return "NetworkConnectionInfo{networkType=" + this.f7332a + ", mobileSubtype=" + this.f7333b + "}";
    }

    private C2611i(AbstractC2623o.EnumC2626c enumC2626c, AbstractC2623o.EnumC2625b enumC2625b) {
        this.f7332a = enumC2626c;
        this.f7333b = enumC2625b;
    }
}
