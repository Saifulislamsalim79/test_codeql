package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
/* renamed from: com.google.android.gms.internal.measurement.s3 */
/* loaded from: classes2.dex */
public final class C3983s3 extends C3847j8<C3999t3, C3983s3> implements InterfaceC3942p9 {
    private C3983s3() {
        super(C3999t3.m28929B());
    }

    /* renamed from: r */
    public final int m28985r() {
        return ((C3999t3) this.f9435d).m28917x();
    }

    /* renamed from: s */
    public final C3967r3 m28984s(int i) {
        return ((C3999t3) this.f9435d).m28915z(i);
    }

    /* renamed from: t */
    public final C3983s3 m28983t() {
        if (this.f9436e) {
            m29454n();
            this.f9436e = false;
        }
        C3999t3.m28922I((C3999t3) this.f9435d);
        return this;
    }

    /* renamed from: u */
    public final C3983s3 m28982u(int i, C3936p3 c3936p3) {
        if (this.f9436e) {
            m29454n();
            this.f9436e = false;
        }
        C3999t3.m28923H((C3999t3) this.f9435d, i, c3936p3.m29456k());
        return this;
    }

    /* renamed from: v */
    public final List<C4094z2> m28981v() {
        return Collections.unmodifiableList(((C3999t3) this.f9435d).m28926E());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ C3983s3(C3921o3 c3921o3) {
        super(C3999t3.m28929B());
    }
}
