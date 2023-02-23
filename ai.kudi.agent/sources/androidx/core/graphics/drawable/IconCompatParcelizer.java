package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.os.Parcelable;
import androidx.versionedparcelable.VersionedParcel;
/* loaded from: classes2.dex */
public class IconCompatParcelizer {
    public static IconCompat read(VersionedParcel versionedParcel) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f4218a = versionedParcel.m34305p(iconCompat.f4218a, 1);
        iconCompat.f4220c = versionedParcel.m34308j(iconCompat.f4220c, 2);
        iconCompat.f4221d = versionedParcel.m34304r(iconCompat.f4221d, 3);
        iconCompat.f4222e = versionedParcel.m34305p(iconCompat.f4222e, 4);
        iconCompat.f4223f = versionedParcel.m34305p(iconCompat.f4223f, 5);
        iconCompat.f4224g = (ColorStateList) versionedParcel.m34304r(iconCompat.f4224g, 6);
        iconCompat.f4226i = versionedParcel.m34303t(iconCompat.f4226i, 7);
        iconCompat.f4227j = versionedParcel.m34303t(iconCompat.f4227j, 8);
        iconCompat.m36206n();
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, VersionedParcel versionedParcel) {
        versionedParcel.m34300x(true, true);
        iconCompat.m36205o(versionedParcel.m34310f());
        int i = iconCompat.f4218a;
        if (-1 != i) {
            versionedParcel.m34320F(i, 1);
        }
        byte[] bArr = iconCompat.f4220c;
        if (bArr != null) {
            versionedParcel.m34322B(bArr, 2);
        }
        Parcelable parcelable = iconCompat.f4221d;
        if (parcelable != null) {
            versionedParcel.m34319H(parcelable, 3);
        }
        int i2 = iconCompat.f4222e;
        if (i2 != 0) {
            versionedParcel.m34320F(i2, 4);
        }
        int i3 = iconCompat.f4223f;
        if (i3 != 0) {
            versionedParcel.m34320F(i3, 5);
        }
        ColorStateList colorStateList = iconCompat.f4224g;
        if (colorStateList != null) {
            versionedParcel.m34319H(colorStateList, 6);
        }
        String str = iconCompat.f4226i;
        if (str != null) {
            versionedParcel.m34318J(str, 7);
        }
        String str2 = iconCompat.f4227j;
        if (str2 != null) {
            versionedParcel.m34318J(str2, 8);
        }
    }
}
