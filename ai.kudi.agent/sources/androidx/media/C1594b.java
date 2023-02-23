package androidx.media;

import android.media.session.MediaSessionManager;
import android.os.Build;
/* compiled from: MediaSessionManager.java */
/* renamed from: androidx.media.b */
/* loaded from: classes2.dex */
public final class C1594b {

    /* renamed from: a */
    InterfaceC1595c f4817a;

    public C1594b(String str, int i, int i2) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f4817a = new C1596d(str, i, i2);
        } else {
            this.f4817a = new C1597e(str, i, i2);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1594b) {
            return this.f4817a.equals(((C1594b) obj).f4817a);
        }
        return false;
    }

    public int hashCode() {
        return this.f4817a.hashCode();
    }

    public C1594b(MediaSessionManager.RemoteUserInfo remoteUserInfo) {
        this.f4817a = new C1596d(remoteUserInfo);
    }
}
