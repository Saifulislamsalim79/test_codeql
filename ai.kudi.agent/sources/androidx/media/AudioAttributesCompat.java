package androidx.media;

import android.util.SparseIntArray;
import androidx.versionedparcelable.InterfaceC1888b;
/* loaded from: classes2.dex */
public class AudioAttributesCompat implements InterfaceC1888b {

    /* renamed from: b */
    private static final SparseIntArray f4809b;

    /* renamed from: a */
    AudioAttributesImpl f4810a;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f4809b = sparseIntArray;
        sparseIntArray.put(5, 1);
        f4809b.put(6, 2);
        f4809b.put(7, 2);
        f4809b.put(8, 1);
        f4809b.put(9, 1);
        f4809b.put(10, 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static int m35468a(boolean z, int i, int i2) {
        if ((i & 1) == 1) {
            return z ? 1 : 7;
        } else if ((i & 4) == 4) {
            return z ? 0 : 6;
        } else {
            switch (i2) {
                case 0:
                    return z ? Integer.MIN_VALUE : 3;
                case 1:
                case 12:
                case 14:
                case 16:
                    return 3;
                case 2:
                    return 0;
                case 3:
                    return z ? 0 : 8;
                case 4:
                    return 4;
                case 5:
                case 7:
                case 8:
                case 9:
                case 10:
                    return 5;
                case 6:
                    return 2;
                case 11:
                    return 10;
                case 13:
                    return 1;
                case 15:
                default:
                    if (z) {
                        throw new IllegalArgumentException("Unknown usage value " + i2 + " in audio attributes");
                    }
                    return 3;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static String m35467b(int i) {
        switch (i) {
            case 0:
                return "USAGE_UNKNOWN";
            case 1:
                return "USAGE_MEDIA";
            case 2:
                return "USAGE_VOICE_COMMUNICATION";
            case 3:
                return "USAGE_VOICE_COMMUNICATION_SIGNALLING";
            case 4:
                return "USAGE_ALARM";
            case 5:
                return "USAGE_NOTIFICATION";
            case 6:
                return "USAGE_NOTIFICATION_RINGTONE";
            case 7:
                return "USAGE_NOTIFICATION_COMMUNICATION_REQUEST";
            case 8:
                return "USAGE_NOTIFICATION_COMMUNICATION_INSTANT";
            case 9:
                return "USAGE_NOTIFICATION_COMMUNICATION_DELAYED";
            case 10:
                return "USAGE_NOTIFICATION_EVENT";
            case 11:
                return "USAGE_ASSISTANCE_ACCESSIBILITY";
            case 12:
                return "USAGE_ASSISTANCE_NAVIGATION_GUIDANCE";
            case 13:
                return "USAGE_ASSISTANCE_SONIFICATION";
            case 14:
                return "USAGE_GAME";
            case 15:
            default:
                return "unknown usage " + i;
            case 16:
                return "USAGE_ASSISTANT";
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof AudioAttributesCompat) {
            AudioAttributesCompat audioAttributesCompat = (AudioAttributesCompat) obj;
            AudioAttributesImpl audioAttributesImpl = this.f4810a;
            if (audioAttributesImpl == null) {
                return audioAttributesCompat.f4810a == null;
            }
            return audioAttributesImpl.equals(audioAttributesCompat.f4810a);
        }
        return false;
    }

    public int hashCode() {
        return this.f4810a.hashCode();
    }

    public String toString() {
        return this.f4810a.toString();
    }
}
