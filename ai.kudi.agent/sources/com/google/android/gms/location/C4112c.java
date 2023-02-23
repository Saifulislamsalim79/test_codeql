package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractC2916a;
import com.google.android.gms.common.internal.safeparcel.C2917b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* renamed from: com.google.android.gms.location.c */
/* loaded from: classes2.dex */
public final class C4112c extends AbstractC2916a {
    public static final Parcelable.Creator<C4112c> CREATOR = new C4128o();

    /* renamed from: c */
    private final List<LocationRequest> f9902c;

    /* renamed from: d */
    private final boolean f9903d;

    /* renamed from: e */
    private final boolean f9904e;

    /* renamed from: f */
    private C4126m f9905f;

    /* renamed from: com.google.android.gms.location.c$a */
    /* loaded from: classes2.dex */
    public static final class C4113a {

        /* renamed from: a */
        private final ArrayList<LocationRequest> f9906a = new ArrayList<>();

        /* renamed from: b */
        private boolean f9907b = false;

        /* renamed from: c */
        private boolean f9908c = false;

        /* renamed from: a */
        public final C4113a m28500a(LocationRequest locationRequest) {
            if (locationRequest != null) {
                this.f9906a.add(locationRequest);
            }
            return this;
        }

        /* renamed from: b */
        public final C4112c m28499b() {
            return new C4112c(this.f9906a, this.f9907b, this.f9908c, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4112c(List<LocationRequest> list, boolean z, boolean z2, C4126m c4126m) {
        this.f9902c = list;
        this.f9903d = z;
        this.f9904e = z2;
        this.f9905f = c4126m;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m31665a = C2917b.m31665a(parcel);
        C2917b.m31648r(parcel, 1, Collections.unmodifiableList(this.f9902c), false);
        C2917b.m31663c(parcel, 2, this.f9903d);
        C2917b.m31663c(parcel, 3, this.f9904e);
        C2917b.m31652n(parcel, 5, this.f9905f, i, false);
        C2917b.m31664b(parcel, m31665a);
    }
}
