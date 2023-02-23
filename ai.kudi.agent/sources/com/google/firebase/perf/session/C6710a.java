package com.google.firebase.perf.session;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.perf.config.C6569d;
import com.google.firebase.perf.p178j.C6624a;
import com.google.firebase.perf.p178j.C6637h;
import com.google.firebase.perf.p179k.C6675k;
import com.google.firebase.perf.p179k.EnumC6679l;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
/* compiled from: PerfSession.java */
/* renamed from: com.google.firebase.perf.session.a */
/* loaded from: classes2.dex */
public class C6710a implements Parcelable {
    public static final Parcelable.Creator<C6710a> CREATOR = new C6711a();

    /* renamed from: c */
    private final String f16140c;

    /* renamed from: d */
    private final C6637h f16141d;

    /* renamed from: e */
    private boolean f16142e;

    /* compiled from: PerfSession.java */
    /* renamed from: com.google.firebase.perf.session.a$a */
    /* loaded from: classes2.dex */
    class C6711a implements Parcelable.Creator<C6710a> {
        C6711a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public C6710a createFromParcel(Parcel parcel) {
            return new C6710a(parcel, (C6711a) null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public C6710a[] newArray(int i) {
            return new C6710a[i];
        }
    }

    /* synthetic */ C6710a(Parcel parcel, C6711a c6711a) {
        this(parcel);
    }

    /* renamed from: b */
    public static C6675k[] m20988b(List<C6710a> list) {
        if (list.isEmpty()) {
            return null;
        }
        C6675k[] c6675kArr = new C6675k[list.size()];
        C6675k m20989a = list.get(0).m20989a();
        boolean z = false;
        for (int i = 1; i < list.size(); i++) {
            C6675k m20989a2 = list.get(i).m20989a();
            if (!z && list.get(i).m20983g()) {
                c6675kArr[0] = m20989a2;
                c6675kArr[i] = m20989a;
                z = true;
            } else {
                c6675kArr[i] = m20989a2;
            }
        }
        if (!z) {
            c6675kArr[0] = m20989a;
        }
        return c6675kArr;
    }

    /* renamed from: c */
    public static C6710a m20987c() {
        C6710a c6710a = new C6710a(UUID.randomUUID().toString().replaceAll("\\-", ""), new C6624a());
        c6710a.m20981i(m20980j());
        return c6710a;
    }

    /* renamed from: j */
    public static boolean m20980j() {
        C6569d m21605f = C6569d.m21605f();
        return m21605f.m21617I() && Math.random() < ((double) m21605f.m21624B());
    }

    /* renamed from: a */
    public C6675k m20989a() {
        C6675k.C6678c m21191Y = C6675k.m21191Y();
        m21191Y.m21187G(this.f16140c);
        if (this.f16142e) {
            m21191Y.m21188F(EnumC6679l.GAUGES_AND_SYSTEM_EVENTS);
        }
        return m21191Y.build();
    }

    /* renamed from: d */
    public C6637h m20986d() {
        return this.f16141d;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public boolean m20985e() {
        return TimeUnit.MICROSECONDS.toMinutes(this.f16141d.m21401b()) > C6569d.m21605f().m21586y();
    }

    /* renamed from: f */
    public boolean m20984f() {
        return this.f16142e;
    }

    /* renamed from: g */
    public boolean m20983g() {
        return this.f16142e;
    }

    /* renamed from: h */
    public String m20982h() {
        return this.f16140c;
    }

    /* renamed from: i */
    public void m20981i(boolean z) {
        this.f16142e = z;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f16140c);
        parcel.writeByte(this.f16142e ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.f16141d, 0);
    }

    public C6710a(String str, C6624a c6624a) {
        this.f16142e = false;
        this.f16140c = str;
        this.f16141d = c6624a.m21415a();
    }

    private C6710a(Parcel parcel) {
        this.f16142e = false;
        this.f16140c = parcel.readString();
        this.f16142e = parcel.readByte() != 0;
        this.f16141d = (C6637h) parcel.readParcelable(C6637h.class.getClassLoader());
    }
}
