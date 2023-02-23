package com.google.firebase.remoteconfig;

import com.google.firebase.remoteconfig.internal.C6757l;
/* compiled from: FirebaseRemoteConfigSettings.java */
/* loaded from: classes.dex */
public class Label {

    /* renamed from: b */
    private long f16201b;

    /* renamed from: c */
    private long f16202c = 60;

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public Label() {
        long $l0 = C6757l.f16258j;
        this.f16201b = $l0;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: a */
    public Label m20911a(long j) {
        if (j >= 0) {
            this.f16201b = j;
            return this;
        }
        String $r2 = "Minimum interval between fetches has to be a non-negative number. " + j + " is an invalid argument";
        IllegalArgumentException $r3 = new IllegalArgumentException($r2);
        throw $r3;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    /* renamed from: b */
    public Item m20910b() {
        Item $r1 = new Item(this);
        return $r1;
    }

    /* JADX WARN: Can't parse signature for local variable: 
    java.lang.NullPointerException
     */
    public Label setName(long j) throws IllegalArgumentException {
        if (j >= 0) {
            this.f16202c = j;
            return this;
        }
        Long $r3 = Long.valueOf(j);
        Object[] $r2 = {$r3};
        String $r4 = String.format("Fetch connection timeout has to be a non-negative number. %d is an invalid argument", $r2);
        IllegalArgumentException $r1 = new IllegalArgumentException($r4);
        throw $r1;
    }
}
