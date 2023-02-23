package com.google.firebase.crashlytics.p112h.p125q;

import java.util.HashMap;
/* compiled from: RemoveRepeatsStrategy.java */
/* renamed from: com.google.firebase.crashlytics.h.q.c */
/* loaded from: classes2.dex */
public class C5601c implements InterfaceC5602d {

    /* renamed from: a */
    private final int f13810a;

    public C5601c(int i) {
        this.f13810a = i;
    }

    /* renamed from: b */
    private static boolean m24351b(StackTraceElement[] stackTraceElementArr, int i, int i2) {
        int i3 = i2 - i;
        if (i2 + i3 > stackTraceElementArr.length) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (!stackTraceElementArr[i + i4].equals(stackTraceElementArr[i2 + i4])) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: c */
    private static StackTraceElement[] m24350c(StackTraceElement[] stackTraceElementArr, int i) {
        int i2;
        HashMap hashMap = new HashMap();
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[stackTraceElementArr.length];
        int i3 = 0;
        int i4 = 0;
        int i5 = 1;
        while (i3 < stackTraceElementArr.length) {
            StackTraceElement stackTraceElement = stackTraceElementArr[i3];
            Integer num = (Integer) hashMap.get(stackTraceElement);
            if (num != null && m24351b(stackTraceElementArr, num.intValue(), i3)) {
                int intValue = i3 - num.intValue();
                if (i5 < i) {
                    System.arraycopy(stackTraceElementArr, i3, stackTraceElementArr2, i4, intValue);
                    i4 += intValue;
                    i5++;
                }
                i2 = (intValue - 1) + i3;
            } else {
                stackTraceElementArr2[i4] = stackTraceElementArr[i3];
                i4++;
                i2 = i3;
                i5 = 1;
            }
            hashMap.put(stackTraceElement, Integer.valueOf(i3));
            i3 = i2 + 1;
        }
        StackTraceElement[] stackTraceElementArr3 = new StackTraceElement[i4];
        System.arraycopy(stackTraceElementArr2, 0, stackTraceElementArr3, 0, i4);
        return stackTraceElementArr3;
    }

    @Override // com.google.firebase.crashlytics.p112h.p125q.InterfaceC5602d
    /* renamed from: a */
    public StackTraceElement[] mo24349a(StackTraceElement[] stackTraceElementArr) {
        StackTraceElement[] m24350c = m24350c(stackTraceElementArr, this.f13810a);
        return m24350c.length < stackTraceElementArr.length ? m24350c : stackTraceElementArr;
    }
}
