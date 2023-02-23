package androidx.media;

import androidx.versionedparcelable.VersionedParcel;
/* loaded from: classes2.dex */
public final class AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(VersionedParcel versionedParcel) {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        audioAttributesCompat.f4810a = (AudioAttributesImpl) versionedParcel.m34301v(audioAttributesCompat.f4810a, 1);
        return audioAttributesCompat;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, VersionedParcel versionedParcel) {
        versionedParcel.m34300x(false, false);
        versionedParcel.m34315M(audioAttributesCompat.f4810a, 1);
    }
}
