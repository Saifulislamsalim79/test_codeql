package com.google.android.gms.internal.p104firebaseauthapi;

import com.google.android.gms.internal.p104firebaseauthapi.AbstractC3251ip;
import com.google.android.gms.internal.p104firebaseauthapi.C3170fp;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.fp */
/* loaded from: classes2.dex */
public class C3170fp<MessageType extends AbstractC3251ip<MessageType, BuilderType>, BuilderType extends C3170fp<MessageType, BuilderType>> extends AbstractC3538tn<MessageType, BuilderType> {

    /* renamed from: c */
    private final MessageType f8494c;

    /* renamed from: d */
    protected MessageType f8495d;

    /* renamed from: e */
    protected boolean f8496e = false;

    /* JADX INFO: Access modifiers changed from: protected */
    public C3170fp(MessageType messagetype) {
        this.f8494c = messagetype;
        this.f8495d = (MessageType) messagetype.mo29964j(4, null, null);
    }

    /* renamed from: b */
    private static final void m31129b(MessageType messagetype, MessageType messagetype2) {
        C3199h0.m31087a().m31086b(messagetype.getClass()).mo30812e(messagetype, messagetype2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.p104firebaseauthapi.AbstractC3538tn
    /* renamed from: a */
    protected final /* bridge */ /* synthetic */ AbstractC3538tn mo30211a(AbstractC3564un abstractC3564un) {
        m31127d((AbstractC3251ip) abstractC3564un);
        return this;
    }

    /* renamed from: c */
    public final BuilderType clone() {
        BuilderType buildertype = (BuilderType) this.f8494c.mo29964j(5, null, null);
        buildertype.m31127d(mo30069m());
        return buildertype;
    }

    /* renamed from: d */
    public final BuilderType m31127d(MessageType messagetype) {
        if (this.f8496e) {
            m31124g();
            this.f8496e = false;
        }
        m31129b(this.f8495d, messagetype);
        return this;
    }

    /* renamed from: e */
    public final MessageType m31126e() {
        MessageType mo30069m = mo30069m();
        if (mo30069m.m30950h()) {
            return mo30069m;
        }
        throw new zzaby(mo30069m);
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3618x
    /* renamed from: f */
    public MessageType mo30069m() {
        if (this.f8496e) {
            return this.f8495d;
        }
        MessageType messagetype = this.f8495d;
        C3199h0.m31087a().m31086b(messagetype.getClass()).mo30814c(messagetype);
        this.f8496e = true;
        return this.f8495d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: g */
    public void m31124g() {
        MessageType messagetype = (MessageType) this.f8495d.mo29964j(4, null, null);
        m31129b(messagetype, this.f8495d);
        this.f8495d = messagetype;
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3010a0
    /* renamed from: u */
    public final /* bridge */ /* synthetic */ InterfaceC3644y mo30944u() {
        return this.f8494c;
    }
}
