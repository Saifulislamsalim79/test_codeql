package com.google.firebase.crashlytics.p112h.p115j;

import android.os.Process;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicLong;
/* compiled from: CLSUUID.java */
/* renamed from: com.google.firebase.crashlytics.h.j.m */
/* loaded from: classes2.dex */
class C5372m {

    /* renamed from: a */
    private static final AtomicLong f13244a = new AtomicLong(0);

    /* renamed from: b */
    private static String f13245b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5372m(C5347a0 c5347a0) {
        byte[] bArr = new byte[10];
        m25004e(bArr);
        m25005d(bArr);
        m25006c(bArr);
        String m25003A = C5373n.m25003A(c5347a0.mo25073a());
        String m24980v = C5373n.m24980v(bArr);
        f13245b = String.format(Locale.US, "%s%s%s%s", m24980v.substring(0, 12), m24980v.substring(12, 16), m24980v.subSequence(16, 20), m25003A.substring(0, 12)).toUpperCase(Locale.US);
    }

    /* renamed from: a */
    private static byte[] m25008a(long j) {
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.putInt((int) j);
        allocate.order(ByteOrder.BIG_ENDIAN);
        allocate.position(0);
        return allocate.array();
    }

    /* renamed from: b */
    private static byte[] m25007b(long j) {
        ByteBuffer allocate = ByteBuffer.allocate(2);
        allocate.putShort((short) j);
        allocate.order(ByteOrder.BIG_ENDIAN);
        allocate.position(0);
        return allocate.array();
    }

    /* renamed from: c */
    private void m25006c(byte[] bArr) {
        byte[] m25007b = m25007b(Integer.valueOf(Process.myPid()).shortValue());
        bArr[8] = m25007b[0];
        bArr[9] = m25007b[1];
    }

    /* renamed from: d */
    private void m25005d(byte[] bArr) {
        byte[] m25007b = m25007b(f13244a.incrementAndGet());
        bArr[6] = m25007b[0];
        bArr[7] = m25007b[1];
    }

    /* renamed from: e */
    private void m25004e(byte[] bArr) {
        long time = new Date().getTime();
        byte[] m25008a = m25008a(time / 1000);
        bArr[0] = m25008a[0];
        bArr[1] = m25008a[1];
        bArr[2] = m25008a[2];
        bArr[3] = m25008a[3];
        byte[] m25007b = m25007b(time % 1000);
        bArr[4] = m25007b[0];
        bArr[5] = m25007b[1];
    }

    public String toString() {
        return f13245b;
    }
}
