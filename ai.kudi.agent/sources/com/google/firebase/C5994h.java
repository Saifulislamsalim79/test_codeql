package com.google.firebase;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.InterfaceC2793o;
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* renamed from: com.google.firebase.h */
/* loaded from: classes2.dex */
public class C5994h implements InterfaceC2793o {
    @Override // com.google.android.gms.common.api.internal.InterfaceC2793o
    /* renamed from: a */
    public final Exception mo23071a(Status status) {
        if (status.m32097h() == 8) {
            return new FirebaseException(status.zza());
        }
        return new FirebaseApiNotAvailableException(status.zza());
    }
}
