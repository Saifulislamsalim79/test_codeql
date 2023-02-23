package com.google.android.datatransport.cct.p096f;

import android.util.SparseArray;
/* compiled from: QosTier.java */
/* renamed from: com.google.android.datatransport.cct.f.p */
/* loaded from: classes2.dex */
public enum EnumC2627p {
    DEFAULT(0),
    UNMETERED_ONLY(1),
    UNMETERED_OR_DAILY(2),
    FAST_IF_RADIO_AWAKE(3),
    NEVER(4),
    UNRECOGNIZED(-1);
    

    /* renamed from: y */
    private static final SparseArray<EnumC2627p> f7391y;

    static {
        SparseArray<EnumC2627p> sparseArray = new SparseArray<>();
        f7391y = sparseArray;
        sparseArray.put(0, DEFAULT);
        f7391y.put(1, UNMETERED_ONLY);
        f7391y.put(2, UNMETERED_OR_DAILY);
        f7391y.put(3, FAST_IF_RADIO_AWAKE);
        f7391y.put(4, NEVER);
        f7391y.put(-1, UNRECOGNIZED);
    }

    EnumC2627p(int i) {
    }
}
