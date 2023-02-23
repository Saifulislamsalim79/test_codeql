package androidx.media;

import androidx.versionedparcelable.VersionedParcel;
/* loaded from: classes2.dex */
public final class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(VersionedParcel versionedParcel) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.f4813a = versionedParcel.m34305p(audioAttributesImplBase.f4813a, 1);
        audioAttributesImplBase.f4814b = versionedParcel.m34305p(audioAttributesImplBase.f4814b, 2);
        audioAttributesImplBase.f4815c = versionedParcel.m34305p(audioAttributesImplBase.f4815c, 3);
        audioAttributesImplBase.f4816d = versionedParcel.m34305p(audioAttributesImplBase.f4816d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, VersionedParcel versionedParcel) {
        versionedParcel.m34300x(false, false);
        versionedParcel.m34320F(audioAttributesImplBase.f4813a, 1);
        versionedParcel.m34320F(audioAttributesImplBase.f4814b, 2);
        versionedParcel.m34320F(audioAttributesImplBase.f4815c, 3);
        versionedParcel.m34320F(audioAttributesImplBase.f4816d, 4);
    }
}
