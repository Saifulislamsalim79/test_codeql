package com.google.firebase.perf.p178j;

import android.support.p050v4.media.session.PlaybackStateCompat;
import tv.danmaku.ijk.media.player.IjkMediaMeta;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: StorageUnit.java */
/* renamed from: com.google.firebase.perf.j.g */
/* loaded from: classes2.dex */
public abstract class EnumC6631g {

    /* renamed from: d */
    public static final EnumC6631g f16006d = new C6632a("TERABYTES", 0, 1099511627776L);

    /* renamed from: e */
    public static final EnumC6631g f16007e = new EnumC6631g("GIGABYTES", 1, IjkMediaMeta.AV_CH_STEREO_RIGHT) { // from class: com.google.firebase.perf.j.g.b
    };

    /* renamed from: f */
    public static final EnumC6631g f16008f = new EnumC6631g("MEGABYTES", 2, PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) { // from class: com.google.firebase.perf.j.g.c
    };

    /* renamed from: w */
    public static final EnumC6631g f16009w = new EnumC6631g("KILOBYTES", 3, 1024) { // from class: com.google.firebase.perf.j.g.d
    };

    /* renamed from: x */
    public static final EnumC6631g f16010x;

    /* renamed from: y */
    private static final /* synthetic */ EnumC6631g[] f16011y;

    /* renamed from: c */
    long f16012c;

    /* compiled from: StorageUnit.java */
    /* renamed from: com.google.firebase.perf.j.g$a */
    /* loaded from: classes2.dex */
    enum C6632a extends EnumC6631g {
        C6632a(String str, int i, long j) {
            super(str, i, j, null);
        }
    }

    static {
        EnumC6631g enumC6631g = new EnumC6631g("BYTES", 4, 1L) { // from class: com.google.firebase.perf.j.g.e
        };
        f16010x = enumC6631g;
        f16011y = new EnumC6631g[]{f16006d, f16007e, f16008f, f16009w, enumC6631g};
    }

    /* synthetic */ EnumC6631g(String str, int i, long j, C6632a c6632a) {
        this(str, i, j);
    }

    public static EnumC6631g valueOf(String str) {
        return (EnumC6631g) Enum.valueOf(EnumC6631g.class, str);
    }

    public static EnumC6631g[] values() {
        return (EnumC6631g[]) f16011y.clone();
    }

    /* renamed from: a */
    public long m21403a(long j) {
        return (j * this.f16012c) / f16009w.f16012c;
    }

    private EnumC6631g(String str, int i, long j) {
        this.f16012c = j;
    }
}
