package com.google.android.gms.location;

import android.app.Activity;
import android.content.Context;
import android.location.Location;
import com.google.android.gms.common.api.C2730a;
import com.google.android.gms.common.api.internal.C2751a;
/* renamed from: com.google.android.gms.location.a */
/* loaded from: classes2.dex */
public class C4107a extends com.google.android.gms.common.api.c<C2730a.InterfaceC2734d.C2737c> {
    public C4107a(Activity activity) {
        super(activity, C4109b.f9900c, (C2730a.InterfaceC2734d) null, new C2751a());
    }

    public C4107a(Context context) {
        super(context, C4109b.f9900c, (C2730a.InterfaceC2734d) null, new C2751a());
    }

    /* renamed from: p */
    public com.google.android.gms.tasks.j<Location> m28505p() {
        return f(new C4135v(this));
    }
}
