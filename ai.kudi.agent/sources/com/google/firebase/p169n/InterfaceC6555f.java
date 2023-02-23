package com.google.firebase.p169n;
/* compiled from: HeartBeatInfo.java */
/* renamed from: com.google.firebase.n.f */
/* loaded from: classes2.dex */
public interface InterfaceC6555f {

    /* compiled from: HeartBeatInfo.java */
    /* renamed from: com.google.firebase.n.f$a */
    /* loaded from: classes2.dex */
    public enum EnumC6556a {
        NONE(0),
        SDK(1),
        GLOBAL(2),
        COMBINED(3);
        

        /* renamed from: c */
        private final int f15829c;

        EnumC6556a(int i) {
            this.f15829c = i;
        }

        /* renamed from: a */
        public int m21644a() {
            return this.f15829c;
        }
    }

    /* renamed from: a */
    EnumC6556a mo21645a(String str);
}
