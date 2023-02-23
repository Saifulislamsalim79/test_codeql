package tcking.github.com.giraffeplayer2;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashSet;
import java.util.Iterator;
/* compiled from: VideoInfo.java */
/* renamed from: tcking.github.com.giraffeplayer2.p */
/* loaded from: classes3.dex */
public class C14906p implements Parcelable {
    public static final Parcelable.Creator<C14906p> CREATOR = new C14907a();

    /* renamed from: I */
    public static int f33350I = 400;

    /* renamed from: J */
    public static int f33351J = 300;

    /* renamed from: K */
    public static float f33352K = 2.14748365E9f;

    /* renamed from: L */
    public static float f33353L = 2.14748365E9f;

    /* renamed from: A */
    private Uri f33354A;

    /* renamed from: B */
    private int f33355B;

    /* renamed from: C */
    private int f33356C;

    /* renamed from: D */
    private String f33357D;

    /* renamed from: E */
    private boolean f33358E;

    /* renamed from: F */
    private boolean f33359F;

    /* renamed from: G */
    private boolean f33360G;

    /* renamed from: H */
    private boolean f33361H;

    /* renamed from: c */
    private HashSet<C14892h> f33362c;

    /* renamed from: d */
    private boolean f33363d;

    /* renamed from: e */
    private Uri f33364e;

    /* renamed from: f */
    private String f33365f;

    /* renamed from: w */
    private boolean f33366w;

    /* renamed from: x */
    private String f33367x;

    /* renamed from: y */
    private int f33368y;

    /* renamed from: z */
    private String f33369z;

    /* compiled from: VideoInfo.java */
    /* renamed from: tcking.github.com.giraffeplayer2.p$a */
    /* loaded from: classes3.dex */
    static class C14907a implements Parcelable.Creator<C14906p> {
        C14907a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public C14906p createFromParcel(Parcel parcel) {
            return new C14906p(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public C14906p[] newArray(int i) {
            return new C14906p[i];
        }
    }

    public C14906p(C14906p c14906p) {
        this.f33362c = new HashSet<>();
        this.f33363d = false;
        this.f33365f = Integer.toHexString(hashCode());
        this.f33366w = true;
        this.f33368y = 0;
        this.f33355B = 0;
        this.f33356C = -12303292;
        this.f33357D = "ijk";
        this.f33358E = true;
        this.f33359F = false;
        this.f33360G = true;
        this.f33361H = false;
        this.f33367x = c14906p.f33367x;
        this.f33366w = c14906p.f33366w;
        this.f33368y = c14906p.f33368y;
        Iterator<C14892h> it = c14906p.f33362c.iterator();
        while (it.hasNext()) {
            try {
                this.f33362c.add(it.next().clone());
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }
        }
        this.f33363d = c14906p.f33363d;
        this.f33355B = c14906p.f33355B;
        this.f33356C = c14906p.f33356C;
        this.f33357D = c14906p.f33357D;
        this.f33358E = c14906p.f33358E;
        this.f33359F = c14906p.f33359F;
        this.f33360G = c14906p.f33360G;
        this.f33361H = c14906p.f33361H;
    }

    /* renamed from: a */
    public static C14906p m38a() {
        return new C14906p(C14894j.m92g().m93f());
    }

    /* renamed from: b */
    public int m37b() {
        return this.f33368y;
    }

    /* renamed from: c */
    public int m36c() {
        return this.f33356C;
    }

    /* renamed from: d */
    public String m35d() {
        return this.f33365f;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public HashSet<C14892h> m34e() {
        return this.f33362c;
    }

    /* renamed from: f */
    public String m33f() {
        return this.f33357D;
    }

    /* renamed from: g */
    public int m32g() {
        return this.f33355B;
    }

    /* renamed from: h */
    public String m31h() {
        return this.f33367x;
    }

    /* renamed from: i */
    public Uri m30i() {
        return this.f33364e;
    }

    /* renamed from: j */
    public boolean m29j() {
        return this.f33360G;
    }

    /* renamed from: k */
    public boolean m28k() {
        return this.f33358E;
    }

    /* renamed from: l */
    public boolean m27l() {
        return this.f33361H;
    }

    /* renamed from: m */
    public boolean m26m() {
        return this.f33359F;
    }

    /* renamed from: n */
    public boolean m25n() {
        return this.f33366w;
    }

    /* renamed from: o */
    public boolean m24o() {
        return this.f33363d;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f33365f);
        parcel.writeParcelable(this.f33364e, i);
        parcel.writeString(this.f33367x);
        parcel.writeByte(this.f33366w ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f33368y);
        parcel.writeString(this.f33369z);
        parcel.writeParcelable(this.f33354A, i);
        parcel.writeSerializable(this.f33362c);
        parcel.writeByte(this.f33363d ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f33355B);
        parcel.writeInt(this.f33356C);
        parcel.writeString(this.f33357D);
        parcel.writeByte(this.f33358E ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f33359F ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f33360G ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f33361H ? (byte) 1 : (byte) 0);
    }

    public C14906p() {
        this.f33362c = new HashSet<>();
        this.f33363d = false;
        this.f33365f = Integer.toHexString(hashCode());
        this.f33366w = true;
        this.f33368y = 0;
        this.f33355B = 0;
        this.f33356C = -12303292;
        this.f33357D = "ijk";
        this.f33358E = true;
        this.f33359F = false;
        this.f33360G = true;
        this.f33361H = false;
    }

    protected C14906p(Parcel parcel) {
        this.f33362c = new HashSet<>();
        this.f33363d = false;
        this.f33365f = Integer.toHexString(hashCode());
        this.f33366w = true;
        this.f33368y = 0;
        this.f33355B = 0;
        this.f33356C = -12303292;
        this.f33357D = "ijk";
        this.f33358E = true;
        this.f33359F = false;
        this.f33360G = true;
        this.f33361H = false;
        this.f33365f = parcel.readString();
        this.f33364e = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.f33367x = parcel.readString();
        this.f33366w = parcel.readByte() != 0;
        this.f33368y = parcel.readInt();
        this.f33369z = parcel.readString();
        this.f33354A = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.f33362c = (HashSet) parcel.readSerializable();
        this.f33363d = parcel.readByte() != 0;
        this.f33355B = parcel.readInt();
        this.f33356C = parcel.readInt();
        this.f33357D = parcel.readString();
        this.f33358E = parcel.readByte() != 0;
        this.f33359F = parcel.readByte() != 0;
        this.f33360G = parcel.readByte() != 0;
        this.f33361H = parcel.readByte() != 0;
    }
}
