package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.dynamic.BinderC2989b;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.gms.measurement.internal.C4384u4;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@20.0.0 */
/* renamed from: com.google.android.gms.internal.measurement.v1 */
/* loaded from: classes2.dex */
public final class C4029v1 extends AbstractRunnableC3873l2 {

    /* renamed from: A */
    final /* synthetic */ C4046w2 f9787A;

    /* renamed from: w */
    final /* synthetic */ String f9788w;

    /* renamed from: x */
    final /* synthetic */ String f9789x;

    /* renamed from: y */
    final /* synthetic */ Context f9790y;

    /* renamed from: z */
    final /* synthetic */ Bundle f9791z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4029v1(C4046w2 c4046w2, String str, String str2, Context context, Bundle bundle) {
        super(c4046w2, true);
        this.f9787A = c4046w2;
        this.f9788w = str;
        this.f9789x = str2;
        this.f9790y = context;
        this.f9791z = bundle;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC3873l2
    /* renamed from: a */
    public final void mo28583a() {
        boolean m28711n;
        String str;
        String str2;
        String str3;
        f1 f1Var;
        int m31491c;
        f1 f1Var2;
        String str4;
        String str5;
        try {
            C4046w2 c4046w2 = this.f9787A;
            m28711n = C4046w2.m28711n(this.f9788w, this.f9789x);
            if (m28711n) {
                String str6 = this.f9789x;
                String str7 = this.f9788w;
                str5 = this.f9787A.f9807a;
                str2 = str7;
                str3 = str6;
                str = str5;
            } else {
                str = null;
                str2 = null;
                str3 = null;
            }
            com.google.android.gms.common.internal.s.j(this.f9790y);
            C4046w2 c4046w22 = this.f9787A;
            c4046w22.f9814h = c4046w22.m28706s(this.f9790y, true);
            f1Var = this.f9787A.f9814h;
            if (f1Var == null) {
                str4 = this.f9787A.f9807a;
                Log.w(str4, "Failed to connect to measurement client.");
                return;
            }
            int m31493a = DynamiteModule.m31493a(this.f9790y, ModuleDescriptor.MODULE_ID);
            C3919o1 c3919o1 = new C3919o1(46000L, Math.max(m31493a, m31491c), DynamiteModule.m31491c(this.f9790y, ModuleDescriptor.MODULE_ID) < m31493a, str, str2, str3, this.f9791z, C4384u4.m27951a(this.f9790y));
            f1Var2 = this.f9787A.f9814h;
            com.google.android.gms.common.internal.s.j(f1Var2);
            f1Var2.initialize(BinderC2989b.m31494p1(this.f9790y), c3919o1, this.f9458c);
        } catch (Exception e) {
            this.f9787A.m28714k(e, true, false);
        }
    }
}
