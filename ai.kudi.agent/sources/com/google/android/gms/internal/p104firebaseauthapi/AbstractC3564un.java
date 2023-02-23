package com.google.android.gms.internal.p104firebaseauthapi;

import com.google.android.gms.internal.p104firebaseauthapi.AbstractC3538tn;
import com.google.android.gms.internal.p104firebaseauthapi.AbstractC3564un;
import java.io.IOException;
import java.io.OutputStream;
/* compiled from: com.google.firebase:firebase-auth@@21.0.1 */
/* renamed from: com.google.android.gms.internal.firebase-auth-api.un */
/* loaded from: classes2.dex */
public abstract class AbstractC3564un<MessageType extends AbstractC3564un<MessageType, BuilderType>, BuilderType extends AbstractC3538tn<MessageType, BuilderType>> implements InterfaceC3644y {
    protected int zza = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo30163a() {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo30162b(int i) {
        throw null;
    }

    /* renamed from: c */
    public final void m30161c(OutputStream outputStream) throws IOException {
        AbstractC3487ro m30321i = AbstractC3487ro.m30321i(outputStream, AbstractC3487ro.m30327c(mo29997t()));
        mo29996v(m30321i);
        m30321i.mo30317m();
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3644y
    /* renamed from: k */
    public final AbstractC3223ho mo30001k() {
        try {
            int mo29997t = mo29997t();
            AbstractC3223ho abstractC3223ho = AbstractC3223ho.f8571d;
            byte[] bArr = new byte[mo29997t];
            AbstractC3487ro m30322h = AbstractC3487ro.m30322h(bArr);
            mo29996v(m30322h);
            m30322h.m30320j();
            return new C3196go(bArr);
        } catch (IOException e) {
            String name = getClass().getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 72);
            sb.append("Serializing ");
            sb.append(name);
            sb.append(" to a ByteString threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), e);
        }
    }

    @Override // com.google.android.gms.internal.p104firebaseauthapi.InterfaceC3644y
    /* renamed from: p */
    public final byte[] mo30000p() {
        try {
            byte[] bArr = new byte[mo29997t()];
            AbstractC3487ro m30322h = AbstractC3487ro.m30322h(bArr);
            mo29996v(m30322h);
            m30322h.m30320j();
            return bArr;
        } catch (IOException e) {
            String name = getClass().getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 72);
            sb.append("Serializing ");
            sb.append(name);
            sb.append(" to a byte array threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), e);
        }
    }
}
