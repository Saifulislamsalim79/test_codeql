package com.google.common.util.concurrent;

import java.util.concurrent.locks.LockSupport;
/* compiled from: OverflowAvoidingLockSupport.java */
/* renamed from: com.google.common.util.concurrent.e */
/* loaded from: classes2.dex */
final class C5163e {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m25488a(Object obj, long j) {
        LockSupport.parkNanos(obj, Math.min(j, 2147483647999999999L));
    }
}
