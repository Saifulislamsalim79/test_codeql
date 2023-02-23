package androidx.media;

import android.media.session.MediaSessionManager;
import p201g.p227h.p237k.C7670c;
/* compiled from: MediaSessionManagerImplApi28.java */
/* renamed from: androidx.media.d */
/* loaded from: classes2.dex */
final class C1596d implements InterfaceC1595c {

    /* renamed from: a */
    final MediaSessionManager.RemoteUserInfo f4818a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1596d(String str, int i, int i2) {
        this.f4818a = new MediaSessionManager.RemoteUserInfo(str, i, i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1596d) {
            return this.f4818a.equals(((C1596d) obj).f4818a);
        }
        return false;
    }

    public int hashCode() {
        return C7670c.m17874b(this.f4818a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1596d(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
        this.f4818a = remoteUserInfo;
    }
}
