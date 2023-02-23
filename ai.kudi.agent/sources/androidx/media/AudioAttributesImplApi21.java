package androidx.media;

import android.media.AudioAttributes;
/* loaded from: classes2.dex */
class AudioAttributesImplApi21 implements AudioAttributesImpl {

    /* renamed from: a */
    AudioAttributes f4811a;

    /* renamed from: b */
    int f4812b = -1;

    public boolean equals(Object obj) {
        if (obj instanceof AudioAttributesImplApi21) {
            return this.f4811a.equals(((AudioAttributesImplApi21) obj).f4811a);
        }
        return false;
    }

    public int hashCode() {
        return this.f4811a.hashCode();
    }

    public String toString() {
        return "AudioAttributesCompat: audioattributes=" + this.f4811a;
    }
}
