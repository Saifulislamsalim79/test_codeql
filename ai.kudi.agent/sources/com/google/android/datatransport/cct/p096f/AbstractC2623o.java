package com.google.android.datatransport.cct.p096f;

import android.util.SparseArray;
import com.google.android.datatransport.cct.p096f.C2611i;
/* compiled from: NetworkConnectionInfo.java */
/* renamed from: com.google.android.datatransport.cct.f.o */
/* loaded from: classes2.dex */
public abstract class AbstractC2623o {

    /* compiled from: NetworkConnectionInfo.java */
    /* renamed from: com.google.android.datatransport.cct.f.o$a */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC2624a {
        /* renamed from: a */
        public abstract AbstractC2623o mo32483a();

        /* renamed from: b */
        public abstract AbstractC2624a mo32482b(EnumC2625b enumC2625b);

        /* renamed from: c */
        public abstract AbstractC2624a mo32481c(EnumC2626c enumC2626c);
    }

    /* compiled from: NetworkConnectionInfo.java */
    /* renamed from: com.google.android.datatransport.cct.f.o$b */
    /* loaded from: classes2.dex */
    public enum EnumC2625b {
        UNKNOWN_MOBILE_SUBTYPE(0),
        GPRS(1),
        EDGE(2),
        UMTS(3),
        CDMA(4),
        EVDO_0(5),
        EVDO_A(6),
        RTT(7),
        HSDPA(8),
        HSUPA(9),
        HSPA(10),
        IDEN(11),
        EVDO_B(12),
        LTE(13),
        EHRPD(14),
        HSPAP(15),
        GSM(16),
        TD_SCDMA(17),
        IWLAN(18),
        LTE_CA(19),
        COMBINED(100);
        

        /* renamed from: O */
        private static final SparseArray<EnumC2625b> f7353O;

        /* renamed from: c */
        private final int f7362c;

        static {
            SparseArray<EnumC2625b> sparseArray = new SparseArray<>();
            f7353O = sparseArray;
            sparseArray.put(0, UNKNOWN_MOBILE_SUBTYPE);
            f7353O.put(1, GPRS);
            f7353O.put(2, EDGE);
            f7353O.put(3, UMTS);
            f7353O.put(4, CDMA);
            f7353O.put(5, EVDO_0);
            f7353O.put(6, EVDO_A);
            f7353O.put(7, RTT);
            f7353O.put(8, HSDPA);
            f7353O.put(9, HSUPA);
            f7353O.put(10, HSPA);
            f7353O.put(11, IDEN);
            f7353O.put(12, EVDO_B);
            f7353O.put(13, LTE);
            f7353O.put(14, EHRPD);
            f7353O.put(15, HSPAP);
            f7353O.put(16, GSM);
            f7353O.put(17, TD_SCDMA);
            f7353O.put(18, IWLAN);
            f7353O.put(19, LTE_CA);
        }

        EnumC2625b(int i) {
            this.f7362c = i;
        }

        /* renamed from: a */
        public static EnumC2625b m32480a(int i) {
            return f7353O.get(i);
        }

        /* renamed from: b */
        public int m32479b() {
            return this.f7362c;
        }
    }

    /* compiled from: NetworkConnectionInfo.java */
    /* renamed from: com.google.android.datatransport.cct.f.o$c */
    /* loaded from: classes2.dex */
    public enum EnumC2626c {
        MOBILE(0),
        WIFI(1),
        MOBILE_MMS(2),
        MOBILE_SUPL(3),
        MOBILE_DUN(4),
        MOBILE_HIPRI(5),
        WIMAX(6),
        BLUETOOTH(7),
        DUMMY(8),
        ETHERNET(9),
        MOBILE_FOTA(10),
        MOBILE_IMS(11),
        MOBILE_CBS(12),
        WIFI_P2P(13),
        MOBILE_IA(14),
        MOBILE_EMERGENCY(15),
        PROXY(16),
        VPN(17),
        NONE(-1);
        

        /* renamed from: M */
        private static final SparseArray<EnumC2626c> f7375M;

        /* renamed from: c */
        private final int f7384c;

        static {
            SparseArray<EnumC2626c> sparseArray = new SparseArray<>();
            f7375M = sparseArray;
            sparseArray.put(0, MOBILE);
            f7375M.put(1, WIFI);
            f7375M.put(2, MOBILE_MMS);
            f7375M.put(3, MOBILE_SUPL);
            f7375M.put(4, MOBILE_DUN);
            f7375M.put(5, MOBILE_HIPRI);
            f7375M.put(6, WIMAX);
            f7375M.put(7, BLUETOOTH);
            f7375M.put(8, DUMMY);
            f7375M.put(9, ETHERNET);
            f7375M.put(10, MOBILE_FOTA);
            f7375M.put(11, MOBILE_IMS);
            f7375M.put(12, MOBILE_CBS);
            f7375M.put(13, WIFI_P2P);
            f7375M.put(14, MOBILE_IA);
            f7375M.put(15, MOBILE_EMERGENCY);
            f7375M.put(16, PROXY);
            f7375M.put(17, VPN);
            f7375M.put(-1, NONE);
        }

        EnumC2626c(int i) {
            this.f7384c = i;
        }

        /* renamed from: a */
        public static EnumC2626c m32478a(int i) {
            return f7375M.get(i);
        }

        /* renamed from: b */
        public int m32477b() {
            return this.f7384c;
        }
    }

    /* renamed from: a */
    public static AbstractC2624a m32486a() {
        return new C2611i.C2613b();
    }

    /* renamed from: b */
    public abstract EnumC2625b mo32485b();

    /* renamed from: c */
    public abstract EnumC2626c mo32484c();
}
