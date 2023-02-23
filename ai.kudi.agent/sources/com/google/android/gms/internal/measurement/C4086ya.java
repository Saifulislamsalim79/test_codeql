package com.google.android.gms.internal.measurement;

import ai.kudi.agent.core.util.printer.PrinterCommands;
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.0.0 */
/* renamed from: com.google.android.gms.internal.measurement.ya */
/* loaded from: classes2.dex */
final class C4086ya {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static /* synthetic */ void m28596a(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) throws zzkh {
        if (!m28592e(b2) && (((b << PrinterCommands.OTHER_SYMBOL) + (b2 + 112)) >> 30) == 0 && !m28592e(b3) && !m28592e(b4)) {
            int i2 = ((b & 7) << 18) | ((b2 & 63) << 12) | ((b3 & 63) << 6) | (b4 & 63);
            cArr[i] = (char) ((i2 >>> 10) + 55232);
            cArr[i + 1] = (char) ((i2 & 1023) + 56320);
            return;
        }
        throw zzkh.m28517c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static /* synthetic */ void m28595b(byte b, byte b2, char[] cArr, int i) throws zzkh {
        if (b >= -62 && !m28592e(b2)) {
            cArr[i] = (char) (((b & PrinterCommands.CEIL) << 6) | (b2 & 63));
            return;
        }
        throw zzkh.m28517c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static /* synthetic */ void m28594c(byte b, byte b2, byte b3, char[] cArr, int i) throws zzkh {
        if (!m28592e(b2)) {
            if (b == -32) {
                if (b2 >= -96) {
                    b = -32;
                }
            }
            if (b == -19) {
                if (b2 < -96) {
                    b = -19;
                }
            }
            if (!m28592e(b3)) {
                cArr[i] = (char) (((b & 15) << 12) | ((b2 & 63) << 6) | (b3 & 63));
                return;
            }
        }
        throw zzkh.m28517c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static /* synthetic */ boolean m28593d(byte b) {
        return b >= 0;
    }

    /* renamed from: e */
    private static boolean m28592e(byte b) {
        return b > -65;
    }
}
