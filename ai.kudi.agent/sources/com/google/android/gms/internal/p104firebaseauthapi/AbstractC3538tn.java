package com.google.android.gms.internal.p104firebaseauthapi;

import com.google.android.gms.internal.p104firebaseauthapi.AbstractC3538tn;
import com.google.android.gms.internal.p104firebaseauthapi.AbstractC3564un;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.tn */
/* loaded from: classes2.dex */
public abstract class AbstractC3538tn<MessageType extends AbstractC3564un<MessageType, BuilderType>, BuilderType extends AbstractC3538tn<MessageType, BuilderType>> implements InterfaceC3618x {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3618x
    /* renamed from: E0 */
    public final /* bridge */ /* synthetic */ InterfaceC3618x mo30070E0(InterfaceC3644y interfaceC3644y) {
        if (mo30944u().getClass().isInstance(interfaceC3644y)) {
            mo30211a((AbstractC3564un) interfaceC3644y);
            return this;
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }

    /* renamed from: a */
    protected abstract BuilderType mo30211a(MessageType messagetype);
}
