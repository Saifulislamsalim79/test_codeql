package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.C3919o1;
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.0.0 */
/* renamed from: com.google.android.gms.measurement.internal.f6 */
/* loaded from: classes2.dex */
public final class C4210f6 {

    /* renamed from: a */
    final Context f10258a;

    /* renamed from: b */
    String f10259b;

    /* renamed from: c */
    String f10260c;

    /* renamed from: d */
    String f10261d;

    /* renamed from: e */
    Boolean f10262e;

    /* renamed from: f */
    long f10263f;

    /* renamed from: g */
    C3919o1 f10264g;

    /* renamed from: h */
    boolean f10265h;

    /* renamed from: i */
    final Long f10266i;

    /* renamed from: j */
    String f10267j;

    public C4210f6(Context context, C3919o1 c3919o1, Long l) {
        this.f10265h = true;
        com.google.android.gms.common.internal.s.j(context);
        Context applicationContext = context.getApplicationContext();
        com.google.android.gms.common.internal.s.j(applicationContext);
        this.f10258a = applicationContext;
        this.f10266i = l;
        if (c3919o1 != null) {
            this.f10264g = c3919o1;
            this.f10259b = c3919o1.f9588x;
            this.f10260c = c3919o1.f9587w;
            this.f10261d = c3919o1.f9586f;
            this.f10265h = c3919o1.f9585e;
            this.f10263f = c3919o1.f9584d;
            this.f10267j = c3919o1.f9590z;
            Bundle bundle = c3919o1.f9589y;
            if (bundle != null) {
                this.f10262e = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}
