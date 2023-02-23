package com.google.common.collect;
/* compiled from: Hashing.java */
/* renamed from: com.google.common.collect.g */
/* loaded from: classes2.dex */
final class C5071g {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static int m25742a(int i) {
        return (int) (Integer.rotateLeft((int) (i * (-862048943)), 15) * 461845907);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static int m25741b(Object obj) {
        return m25742a(obj == null ? 0 : obj.hashCode());
    }
}
