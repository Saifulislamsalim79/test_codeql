package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement@@20.0.0 */
/* renamed from: com.google.android.gms.measurement.internal.u9 */
/* loaded from: classes2.dex */
public final class C4389u9 implements InterfaceC4359s3 {

    /* renamed from: a */
    final /* synthetic */ String f10723a;

    /* renamed from: b */
    final /* synthetic */ C4168ba f10724b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4389u9(C4168ba c4168ba, String str) {
        this.f10724b = c4168ba;
        this.f10723a = str;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC4359s3
    /* renamed from: a */
    public final void mo27913a(String str, int i, Throwable th, byte[] bArr, Map<String, List<String>> map) {
        this.f10724b.m28349o(i, th, bArr, this.f10723a);
    }
}
