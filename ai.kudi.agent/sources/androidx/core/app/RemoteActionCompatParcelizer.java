package androidx.core.app;

import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;
import androidx.versionedparcelable.VersionedParcel;
/* loaded from: classes2.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(VersionedParcel versionedParcel) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        remoteActionCompat.f4049a = (IconCompat) versionedParcel.m34301v(remoteActionCompat.f4049a, 1);
        remoteActionCompat.f4050b = versionedParcel.m34307l(remoteActionCompat.f4050b, 2);
        remoteActionCompat.f4051c = versionedParcel.m34307l(remoteActionCompat.f4051c, 3);
        remoteActionCompat.f4052d = (PendingIntent) versionedParcel.m34304r(remoteActionCompat.f4052d, 4);
        remoteActionCompat.f4053e = versionedParcel.m34309h(remoteActionCompat.f4053e, 5);
        remoteActionCompat.f4054f = versionedParcel.m34309h(remoteActionCompat.f4054f, 6);
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, VersionedParcel versionedParcel) {
        versionedParcel.m34300x(false, false);
        versionedParcel.m34315M(remoteActionCompat.f4049a, 1);
        versionedParcel.m34321D(remoteActionCompat.f4050b, 2);
        versionedParcel.m34321D(remoteActionCompat.f4051c, 3);
        versionedParcel.m34319H(remoteActionCompat.f4052d, 4);
        versionedParcel.m34299z(remoteActionCompat.f4053e, 5);
        versionedParcel.m34299z(remoteActionCompat.f4054f, 6);
    }
}
