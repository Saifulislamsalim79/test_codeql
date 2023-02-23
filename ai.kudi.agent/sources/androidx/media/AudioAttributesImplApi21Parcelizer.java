package androidx.media;

import android.media.AudioAttributes;
import androidx.versionedparcelable.VersionedParcel;
/* loaded from: classes2.dex */
public final class AudioAttributesImplApi21Parcelizer {
    public static AudioAttributesImplApi21 read(VersionedParcel versionedParcel) {
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        audioAttributesImplApi21.f4811a = (AudioAttributes) versionedParcel.m34304r(audioAttributesImplApi21.f4811a, 1);
        audioAttributesImplApi21.f4812b = versionedParcel.m34305p(audioAttributesImplApi21.f4812b, 2);
        return audioAttributesImplApi21;
    }

    public static void write(AudioAttributesImplApi21 audioAttributesImplApi21, VersionedParcel versionedParcel) {
        versionedParcel.m34300x(false, false);
        versionedParcel.m34319H(audioAttributesImplApi21.f4811a, 1);
        versionedParcel.m34320F(audioAttributesImplApi21.f4812b, 2);
    }
}
