package com.google.firebase.database.p138t;

import android.util.Log;
import com.google.firebase.database.p138t.InterfaceC5900d;
import java.util.List;
/* compiled from: AndroidLogger.java */
/* renamed from: com.google.firebase.database.t.a */
/* loaded from: classes2.dex */
public class C5896a extends C5897b {
    public C5896a(InterfaceC5900d.EnumC5901a enumC5901a, List<String> list) {
        super(enumC5901a, list);
    }

    @Override // com.google.firebase.database.p138t.C5897b
    /* renamed from: c */
    protected String mo23373c(InterfaceC5900d.EnumC5901a enumC5901a, String str, String str2, long j) {
        return str2;
    }

    @Override // com.google.firebase.database.p138t.C5897b
    /* renamed from: d */
    protected void mo23372d(String str, String str2) {
        Log.d(str, str2);
    }

    @Override // com.google.firebase.database.p138t.C5897b
    /* renamed from: e */
    protected void mo23371e(String str, String str2) {
        Log.e(str, str2);
    }

    @Override // com.google.firebase.database.p138t.C5897b
    /* renamed from: f */
    protected void mo23370f(String str, String str2) {
        Log.i(str, str2);
    }

    @Override // com.google.firebase.database.p138t.C5897b
    /* renamed from: h */
    protected void mo23368h(String str, String str2) {
        Log.w(str, str2);
    }
}
