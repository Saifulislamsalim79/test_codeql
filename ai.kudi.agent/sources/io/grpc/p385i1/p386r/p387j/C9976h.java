package io.grpc.p385i1.p386r.p387j;

import ai.kudi.agent.core.util.printer.PrinterCommands;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
/* compiled from: Huffman.java */
/* renamed from: io.grpc.i1.r.j.h */
/* loaded from: classes2.dex */
class C9976h {

    /* renamed from: b */
    private static final int[] f23681b = {8184, 8388568, 268435426, 268435427, 268435428, 268435429, 268435430, 268435431, 268435432, 16777194, 1073741820, 268435433, 268435434, 1073741821, 268435435, 268435436, 268435437, 268435438, 268435439, 268435440, 268435441, 268435442, 1073741822, 268435443, 268435444, 268435445, 268435446, 268435447, 268435448, 268435449, 268435450, 268435451, 20, 1016, 1017, 4090, 8185, 21, 248, 2042, 1018, 1019, 249, 2043, 250, 22, 23, 24, 0, 1, 2, 25, 26, 27, 28, 29, 30, 31, 92, 251, 32764, 32, 4091, 1020, 8186, 33, 93, 94, 95, 96, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 252, 115, 253, 8187, 524272, 8188, 16380, 34, 32765, 3, 35, 4, 36, 5, 37, 38, 39, 6, 116, 117, 40, 41, 42, 7, 43, 118, 44, 8, 9, 45, 119, 120, 121, 122, 123, 32766, 2044, 16381, 8189, 268435452, 1048550, 4194258, 1048551, 1048552, 4194259, 4194260, 4194261, 8388569, 4194262, 8388570, 8388571, 8388572, 8388573, 8388574, 16777195, 8388575, 16777196, 16777197, 4194263, 8388576, 16777198, 8388577, 8388578, 8388579, 8388580, 2097116, 4194264, 8388581, 4194265, 8388582, 8388583, 16777199, 4194266, 2097117, 1048553, 4194267, 4194268, 8388584, 8388585, 2097118, 8388586, 4194269, 4194270, 16777200, 2097119, 4194271, 8388587, 8388588, 2097120, 2097121, 4194272, 2097122, 8388589, 4194273, 8388590, 8388591, 1048554, 4194274, 4194275, 4194276, 8388592, 4194277, 4194278, 8388593, 67108832, 67108833, 1048555, 524273, 4194279, 8388594, 4194280, 33554412, 67108834, 67108835, 67108836, 134217694, 134217695, 67108837, 16777201, 33554413, 524274, 2097123, 67108838, 134217696, 134217697, 67108839, 134217698, 16777202, 2097124, 2097125, 67108840, 67108841, 268435453, 134217699, 134217700, 134217701, 1048556, 16777203, 1048557, 2097126, 4194281, 2097127, 2097128, 8388595, 4194282, 4194283, 33554414, 33554415, 16777204, 16777205, 67108842, 8388596, 67108843, 134217702, 67108844, 67108845, 134217703, 134217704, 134217705, 134217706, 134217707, 268435454, 134217708, 134217709, 134217710, 134217711, 134217712, 67108846};

    /* renamed from: c */
    private static final byte[] f23682c = {PrinterCommands.KING, 23, PrinterCommands.OTHER_SYMBOL, PrinterCommands.OTHER_SYMBOL, PrinterCommands.OTHER_SYMBOL, PrinterCommands.OTHER_SYMBOL, PrinterCommands.OTHER_SYMBOL, PrinterCommands.OTHER_SYMBOL, PrinterCommands.OTHER_SYMBOL, PrinterCommands.COSH, 30, PrinterCommands.OTHER_SYMBOL, PrinterCommands.OTHER_SYMBOL, 30, PrinterCommands.OTHER_SYMBOL, PrinterCommands.OTHER_SYMBOL, PrinterCommands.OTHER_SYMBOL, PrinterCommands.OTHER_SYMBOL, PrinterCommands.OTHER_SYMBOL, PrinterCommands.OTHER_SYMBOL, PrinterCommands.OTHER_SYMBOL, PrinterCommands.OTHER_SYMBOL, 30, PrinterCommands.OTHER_SYMBOL, PrinterCommands.OTHER_SYMBOL, PrinterCommands.OTHER_SYMBOL, PrinterCommands.OTHER_SYMBOL, PrinterCommands.OTHER_SYMBOL, PrinterCommands.OTHER_SYMBOL, PrinterCommands.OTHER_SYMBOL, PrinterCommands.OTHER_SYMBOL, PrinterCommands.OTHER_SYMBOL, 6, 10, 10, PrinterCommands.CONSTANT_NameAndType, PrinterCommands.KING, 6, 8, 11, 10, 10, 8, 11, 8, 6, 6, 6, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 7, 8, 15, 6, PrinterCommands.CONSTANT_NameAndType, 10, PrinterCommands.KING, 6, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 8, 7, 8, PrinterCommands.KING, 19, PrinterCommands.KING, 14, 6, 15, 5, 6, 5, 6, 5, 6, 6, 6, 5, 7, 7, 6, 6, 6, 5, 6, 7, 6, 5, 5, 6, 7, 7, 7, 7, 7, 15, 11, 14, PrinterCommands.KING, PrinterCommands.OTHER_SYMBOL, 20, 22, 20, 20, 22, 22, 22, 23, 22, 23, 23, 23, 23, 23, PrinterCommands.COSH, 23, PrinterCommands.COSH, PrinterCommands.COSH, 22, 23, PrinterCommands.COSH, 23, 23, 23, 23, 21, 22, 23, 22, 23, 23, PrinterCommands.COSH, 22, 21, 20, 22, 22, 23, 23, 21, 23, 22, 22, PrinterCommands.COSH, 21, 22, 23, 23, 21, 21, 22, 21, 23, 22, 23, 23, 20, 22, 22, 22, 23, 22, 22, 23, 26, 26, 20, 19, 22, 23, 22, 25, 26, 26, 26, PrinterCommands.MODIFIER_SYMBOL, PrinterCommands.MODIFIER_SYMBOL, 26, PrinterCommands.COSH, 25, 19, 21, 26, PrinterCommands.MODIFIER_SYMBOL, PrinterCommands.MODIFIER_SYMBOL, 26, PrinterCommands.MODIFIER_SYMBOL, PrinterCommands.COSH, 21, 21, 26, 26, PrinterCommands.OTHER_SYMBOL, PrinterCommands.MODIFIER_SYMBOL, PrinterCommands.MODIFIER_SYMBOL, PrinterCommands.MODIFIER_SYMBOL, 20, PrinterCommands.COSH, 20, 21, 22, 21, 21, 23, 22, 22, 25, 25, PrinterCommands.COSH, PrinterCommands.COSH, 26, 23, 26, PrinterCommands.MODIFIER_SYMBOL, 26, 26, PrinterCommands.MODIFIER_SYMBOL, PrinterCommands.MODIFIER_SYMBOL, PrinterCommands.MODIFIER_SYMBOL, PrinterCommands.MODIFIER_SYMBOL, PrinterCommands.MODIFIER_SYMBOL, PrinterCommands.OTHER_SYMBOL, PrinterCommands.MODIFIER_SYMBOL, PrinterCommands.MODIFIER_SYMBOL, PrinterCommands.MODIFIER_SYMBOL, PrinterCommands.MODIFIER_SYMBOL, PrinterCommands.MODIFIER_SYMBOL, 26};

    /* renamed from: d */
    private static final C9976h f23683d = new C9976h();

    /* renamed from: a */
    private final C9977a f23684a = new C9977a();

    private C9976h() {
        m13394b();
    }

    /* renamed from: a */
    private void m13395a(int i, int i2, byte b) {
        C9977a c9977a = new C9977a(i, b);
        C9977a c9977a2 = this.f23684a;
        while (b > 8) {
            b = (byte) (b - 8);
            int i3 = (i2 >>> b) & 255;
            if (c9977a2.f23685a != null) {
                if (c9977a2.f23685a[i3] == null) {
                    c9977a2.f23685a[i3] = new C9977a();
                }
                c9977a2 = c9977a2.f23685a[i3];
            } else {
                throw new IllegalStateException("invalid dictionary: prefix not unique");
            }
        }
        int i4 = 8 - b;
        int i5 = (i2 << i4) & 255;
        int i6 = 1 << i4;
        for (int i7 = i5; i7 < i5 + i6; i7++) {
            c9977a2.f23685a[i7] = c9977a;
        }
    }

    /* renamed from: b */
    private void m13394b() {
        int i = 0;
        while (true) {
            byte[] bArr = f23682c;
            if (i >= bArr.length) {
                return;
            }
            m13395a(i, f23681b[i], bArr[i]);
            i++;
        }
    }

    /* renamed from: f */
    public static C9976h m13390f() {
        return f23683d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public byte[] m13393c(byte[] bArr) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        C9977a c9977a = this.f23684a;
        int i = 0;
        int i2 = 0;
        for (byte b : bArr) {
            i = (i << 8) | (b & 255);
            i2 += 8;
            while (i2 >= 8) {
                c9977a = c9977a.f23685a[(i >>> (i2 - 8)) & 255];
                if (c9977a.f23685a == null) {
                    byteArrayOutputStream.write(c9977a.f23686b);
                    i2 -= c9977a.f23687c;
                    c9977a = this.f23684a;
                } else {
                    i2 -= 8;
                }
            }
        }
        while (i2 > 0) {
            C9977a c9977a2 = c9977a.f23685a[(i << (8 - i2)) & 255];
            if (c9977a2.f23685a != null || c9977a2.f23687c > i2) {
                break;
            }
            byteArrayOutputStream.write(c9977a2.f23686b);
            i2 -= c9977a2.f23687c;
            c9977a = this.f23684a;
        }
        return byteArrayOutputStream.toByteArray();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public void m13392d(byte[] bArr, OutputStream outputStream) throws IOException {
        int i = 0;
        long j = 0;
        byte b = 0;
        while (i < bArr.length) {
            int i2 = bArr[i] & 255;
            int i3 = f23681b[i2];
            byte b2 = f23682c[i2];
            j = (j << b2) | i3;
            int i4 = b + b2;
            while (i4 >= 8) {
                i4 = (i4 == 1 ? 1 : 0) - 8;
                outputStream.write((int) (j >> i4));
            }
            i++;
            b = i4;
        }
        if (b > 0) {
            outputStream.write((int) ((255 >>> b) | (j << (8 - b))));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public int m13391e(byte[] bArr) {
        long j = 0;
        for (byte b : bArr) {
            j += f23682c[b & 255];
        }
        return (int) ((j + 7) >> 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Huffman.java */
    /* renamed from: io.grpc.i1.r.j.h$a */
    /* loaded from: classes2.dex */
    public static final class C9977a {

        /* renamed from: a */
        private final C9977a[] f23685a;

        /* renamed from: b */
        private final int f23686b;

        /* renamed from: c */
        private final int f23687c;

        C9977a() {
            this.f23685a = new C9977a[256];
            this.f23686b = 0;
            this.f23687c = 0;
        }

        C9977a(int i, int i2) {
            this.f23685a = null;
            this.f23686b = i;
            int i3 = i2 & 7;
            this.f23687c = i3 == 0 ? 8 : i3;
        }
    }
}
