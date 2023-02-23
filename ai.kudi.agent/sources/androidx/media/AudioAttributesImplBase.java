package androidx.media;

import java.util.Arrays;
/* loaded from: classes2.dex */
class AudioAttributesImplBase implements AudioAttributesImpl {

    /* renamed from: a */
    int f4813a = 0;

    /* renamed from: b */
    int f4814b = 0;

    /* renamed from: c */
    int f4815c = 0;

    /* renamed from: d */
    int f4816d = -1;

    /* renamed from: a */
    public int m35466a() {
        return this.f4814b;
    }

    /* renamed from: b */
    public int m35465b() {
        int i = this.f4815c;
        int m35464c = m35464c();
        if (m35464c == 6) {
            i |= 4;
        } else if (m35464c == 7) {
            i |= 1;
        }
        return i & 273;
    }

    /* renamed from: c */
    public int m35464c() {
        int i = this.f4816d;
        return i != -1 ? i : AudioAttributesCompat.m35468a(false, this.f4815c, this.f4813a);
    }

    /* renamed from: d */
    public int m35463d() {
        return this.f4813a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof AudioAttributesImplBase) {
            AudioAttributesImplBase audioAttributesImplBase = (AudioAttributesImplBase) obj;
            return this.f4814b == audioAttributesImplBase.m35466a() && this.f4815c == audioAttributesImplBase.m35465b() && this.f4813a == audioAttributesImplBase.m35463d() && this.f4816d == audioAttributesImplBase.f4816d;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f4814b), Integer.valueOf(this.f4815c), Integer.valueOf(this.f4813a), Integer.valueOf(this.f4816d)});
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AudioAttributesCompat:");
        if (this.f4816d != -1) {
            sb.append(" stream=");
            sb.append(this.f4816d);
            sb.append(" derived");
        }
        sb.append(" usage=");
        sb.append(AudioAttributesCompat.m35467b(this.f4813a));
        sb.append(" content=");
        sb.append(this.f4814b);
        sb.append(" flags=0x");
        sb.append(Integer.toHexString(this.f4815c).toUpperCase());
        return sb.toString();
    }
}
