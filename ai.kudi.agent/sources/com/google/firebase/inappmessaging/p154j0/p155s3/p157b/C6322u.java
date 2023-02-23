package com.google.firebase.inappmessaging.p154j0.p155s3.p157b;

import android.app.Application;
import com.google.firebase.inappmessaging.p154j0.C6337u2;
import p425j.p444e.p449d0.AbstractC11285a;
/* compiled from: ForegroundFlowableModule.java */
/* renamed from: com.google.firebase.inappmessaging.j0.s3.b.u */
/* loaded from: classes2.dex */
public class C6322u {
    /* renamed from: a */
    public AbstractC11285a<String> m22298a(Application application) {
        C6337u2 c6337u2 = new C6337u2();
        AbstractC11285a<String> m22280a = c6337u2.m22280a();
        m22280a.m11201Q();
        application.registerActivityLifecycleCallbacks(c6337u2);
        return m22280a;
    }
}
